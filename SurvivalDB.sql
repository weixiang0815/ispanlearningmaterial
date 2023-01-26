/*
use master;
create database Survival;
*/
use Survival;

-- 活動場地
create table Site(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	address nvarchar(100) not null,
	capacity int not null
);

-- 戰隊
create table Crew(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
);

-- 會員（玩家）獨立資料
create table Player(
	id int primary key identity(1, 1) not null,
	fk_crew_id int foreign key references Crew(id),
	joined_date date not null,
	-- 感覺還能再加很多東西，但一時想不到😥
);

alter table Crew add fk_manager_id int foreign key references Player(id);

-- 營長（管理員）獨立資料
create table Boss(
	id int primary key identity(1, 1) not null,
	fk_workplace_id int foreign key references Site(id)
);

-- 員工獨立資料
create table Employee(
	id int primary key identity(1, 1) not null,
	title nvarchar(50) not null,
	hired_date date not null,
	salary int not null,
	fk_workplace_id int foreign key references Site(id),
	fk_supervisor_id int foreign key references Boss(id)
);

-- 使用者基本資料（包含管理員、玩家、員工）
create table Users(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	account nvarchar(50) not null,
	password nvarchar(50) not null,
	nickname nvarchar(50),
	sex char(1) not null,
	address nvarchar(50) not null,
	email nvarchar(50) not null,
	age int not null,
	thumbnail varbinary(max),
);

-- 權限
create table Permission(
	id int primary key foreign key references Users(id),
	fk_player_id int foreign key references Player(id),
	fk_boss_id int foreign key references Boss(id),
	fk_employee_id int foreign key references Employee(id),
);

-- 榮譽頭銜種類
create table Badge(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	thumbnail varbinary(max) not null,
);

-- 頭銜與會員歸屬
create table Badge_To_Player(
	id int primary key identity(1, 1) not null,
	fk_badge_id int foreign key references Badge(id) not null,
	fk_player_id int foreign key references Player(id) not null,
);

-- 場地
create table Place(
	id int primary key not null identity(1,1),
	place_name nvarchar(50) not null,
	place_address nvarchar(50) not null,
	place_photo varbinary(max),
	place_fee int not null,
	place_capacity int not null,
	fk_manager_id int references Boss(id)
);

-- 場地登記
create table PlaceOrder(
	id int primary key not null identity(1,1),
	fk_place_id int references place(id),
	order_date datetime2 default getDate() not null,
	use_date date not null,
	use_timespan nvarchar(10), -- '早上'、'下午'、'晚上'、'半夜'; 
	fk_player_id int references Player(id),
	order_status nvarchar(50) not null,
);

--新品庫存
create table ProductInventory(
	id int primary key identity(1, 1) not null,
	amount int not null,
	price nvarchar(50) not null,
);

--租借庫存
create table BorrowInventory (
	id int primary key identity(1, 1) not null,
	amount int not null,
	fee nvarchar(50) not null,
);

--新品租借分類
create table ProductClass(
	id int primary key identity(1, 1) not null,
	fk_product_inventory_id int references ProductInventory(id),
	fk_borrow_id int references BorrowInventory(id),
);

--商品
create table Product(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	img varbinary(max) not null,
	context nvarchar(50) not null,
	local nvarchar(50) not null,
	fk_product_class_id int references ProductClass (id),
);

--訂單
create table OrderItem(	
	id int primary key identity(1, 1) not null,
	create_date date default convert(date,getDate()),
	fk_user_id int references Users(id),
	fk_product_id int references product (id),
	amount nvarchar(50) not null,
	total_price nvarchar(50) not null,
);

--物流(庫存) 配送時間都14:00到貨 到貨後改變庫存數量
create table Logistics(
	id int primary key identity(1, 1) not null,
	fk_product_id int references product (id),
	price nvarchar(50) not null,
	state nvarchar(20) not null,
	time date not null,
);

-- 活動
create table Competition(
	id int primary key identity(1, 1) not null,
	name_mandarin nvarchar(50) not null,
	name_english nvarchar(50) not null,
	held_datetime datetime2 not null,
	announced_datetime datetime2 not null,
	fk_site_id int foreign key references Site(id),
	content nvarchar(max) not null,
	rules nvarchar(max) not null,
	budget int not null,
	fee int not null,
	fk_prize_id int foreign key references Product(id),
	single_or_crew char(1) not null,
	capacity int not null,
	participation int not null,
);

-- 活動報名表
create table SignUp(
	id int primary key identity(1, 1) not null,
	fk_competition_id int foreign key references Competition(id),
	fk_player_id int foreign key references Users(id),
);