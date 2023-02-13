/*
use master;
create database Survival;
*/
use Survival;

-- 商品表
create table Product(
	id int primary key identity(1,1) not null,
	name nvarchar(50) not null,
	img varbinary(max),
	class nvarchar(50) not null,
	context nvarchar(255) not null,
	rent_fee int not null,
	price int not null,
);

-- 員工權限表
create table empPermission(
	id int primary key identity(1, 1) not null,
	schedule char(1) not null,
	player_management char(1) not null,
	arrange_competition char(1) not null,
	human_resource char(1) not null,
	inventory char(1) not null
);

-- 員工資料表
create table Employee(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	account nvarchar(50) not null,
	password nvarchar(50)not null,
	age int not null,	--不太可能給使用者自己填？
	region nvarchar(3) not null,
	address nvarchar(50) not null,
	salary int not null,
	thumbnail varbinary(max),
	sex char(1) not null,
	birthday date not null,
	title nvarchar(50) not null,
	hire_date date not null,
	status nvarchar(10) not null,
	fk_permission int foreign key references empPermission(id) not null,
	fk_boss_id int foreign key references Employee(id) not null,
);

-- 會員權限表
create table playerPermission(
	id int primary key identity(1, 1) not null,
	join_single_competition char(1) not null,
	shopping char(1) not null,
	rent char(1) not null,
	join_crew char(1) not null,
);

-- 戰隊權限表
create table crewPermission(
	id int primary key identity(1, 1) not null,
	join_crew_competition char(1) not null,
	kickout char(1) not null,
	modify_member_permission char(1) not null,
	on_behalf_of_crew char(1) not null,
	disband char(1) not null,
);

-- 會員資料表
create table Player(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	account nvarchar(50) not null,
	password nvarchar(50)not null,
	nickname nvarchar(50),
	region nvarchar(3) not null,
	address nvarchar(50) not null,
	thumbnail varbinary(max),
	sex char(1) not null,
	birthday date not null,
	age int not null,
	join_date date not null,
	info nvarchar(200),
	cellphone varchar(10) not null,
	fk_player_permission int foreign key references playerPermission(id) not null,
	fk_crew_permission int foreign key references crewPermission(id) not null,
	banned char(1) not null,
	banned_reason nvarchar(50),
);

-- 戰隊資料表
create table Crew(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	founder int foreign key references Player(id),
	manager int foreign key references Player(id),
);

alter table Crew add fk_crew_id int foreign key references Crew(id);

-- 徽章（頭銜）資料表
create table Badge(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	level int not null,
	condition nvarchar(50) not null
);

-- 徽章會員中介表
create table Badge_Player(
	fk_user_id int foreign key references Player(id) not null,
	fk_badge_id int foreign key references Badge(id) not null,
);

-- 戰隊會員中介表
create table Crew_Member(
	fk_group_id int foreign key references Crew(id) not null,
	fk_player_id int foreign key references Player(id)not null,
	primary key(fk_group_id, fk_player_id)
);

-- 場地登記表
create table PlaceOrder(
	id int primary key identity(1,1) not null,
	use_timespan nvarchar(50) not null,
	order_status nvarchar(50),
	fk_employee_id int foreign key references Employee(id),
	fk_player_id int foreign key references Player(id),
);

-- 場地資料表
create table Place(
	id int primary key identity(1,1) not null,
	place_name nvarchar(50) not null,
	place_address nvarchar(50) not null,
	place_photo varbinary(max),
	place_fee int not null,
	place_capacity int not null,
	fk_employee_id int foreign key references Employee(id),
	fk_product_id int foreign key references Product(id),
	fk_placeorder_id int foreign key references PlaceOrder(id),
);

alter table Employee add fk_workplace_id int foreign key references Place(id) not null;

-- 倉庫資料表
create table Warehouse(
	id int primary key identity(1,1) not null,
	warehouse_name nvarchar(50) not null,
	fk_place_id int foreign key references Place(id),
);

alter table Place add fk_warehouse_id int foreign key references Warehouse(id);

-- 倉儲資料表
create table Inventory(
	id int primary key identity(1,1) not null,
	inventory_sellamount int ,
	inventory_rentamount int ,
	fk_warehouse_id int foreign key references Warehouse(id)
);

alter table Warehouse add fk_inventory_id int foreign key references Inventory(id);

-- 場地時程表
create table Schedule(
	id int primary key identity(1,1) not null,
	schedule_name nvarchar(50) not null,
	schedule_timespan nvarchar(50) not null,
	schedule_status nvarchar(10) not null,
	schedule_datetime date not null,
	fk_place_id int foreign key references Place(id),
);

alter table Place add fk_schedule_id int foreign key references Schedule(id);

-- 貼文表
create table Posts (
	id int identity not null,
	added datetime2,
	classify varchar(255),
	essay varchar(255),
	final_added datetime2,
	name varchar(255),
	primary key (id)
);

-- 評分表
create table Score (
	id int identity not null,
	added datetime2,
	how_much_stars int,
	fk_posts_id int,
	primary key (id)
)

-- 活動
create table Competition(
	id int primary key identity(1, 1) not null,
	name_mandarin nvarchar(50) not null,
	name_english nvarchar(50) not null,
	start_date date not null,
	start_timespan nvarchar(5) not null,
	end_date date not null,
	end_timespan nvarchar(5) not null,
	announced_datetime datetime2 not null,
	fk_place_id int foreign key references Place(id),
	content nvarchar(max) not null,
	rules nvarchar(max) not null,
	budget int not null,
	fee int not null,
	single_or_crew char(1) not null,
	capacity int not null,
	fk_post_id int foreign key references Posts(id),
	status nvarchar(10) not null,
);

alter table Schedule add fk_competition_id int foreign key references Competition(id);

-- 活動獎品
create table Competition_Prize(
	fk_competition_id int primary key foreign key references Competition(id) not null,
	fk_1ts_prize_id int foreign key references Product(id),
	fk_2nd_prize_id int foreign key references Product(id),
	fk_3rd_prize_id int foreign key references Product(id),
	fk_single_prize_id int foreign key references Product(id),
	fk_crew_prize_id int foreign key references Product(id),
	fk_comfort_prize_id int foreign key references Product(id),
);

alter table Competition add fk_competition_prize_id int foreign key references Competition(id);

-- 報名情況
create table Participation(
	fk_competition_id int foreign key references Competition(id),
	fk_player_id int foreign key references Player(id),
	fk_crew_id int foreign key references Crew(id),
);

-- 活動報名表
create table SignUp(
	id int primary key identity(1, 1) not null,
	fk_competition_id int foreign key references Competition(id),
	fk_player_id int foreign key references Player(id),
	signup_date date not null,
	status nvarchar(50) not null
);

-- 書籤表
create table Bookmarklet(
    id int identity not null,
    fk_posts_id int,
    primary key (id)
);

-- 留言表
create table Msgs(
    id int identity not null,
    added datetime2,
    essay varchar(255),
    final_added datetime2,
    fk_posts_id int,
    primary key (id)
);

-- 按讚表
create table ThumbUp(
	id int identity not null,
	added datetime2,
	fk_posts_id int,
	primary key (id)
);

alter table Bookmarklet 
    add constraint FKgqau7qyhv2lj35sbiqfhw8ix3 
    foreign key (fk_posts_id) 
    references posts;

alter table msgs 
    add constraint FK304o6jqg85sw41pqqprv3msge 
    foreign key (fk_posts_id) 
    references posts;
    
alter table score 
    add constraint FK28hwgqxw4rbnj7k4p9wm11krc 
    foreign key (fk_posts_id) 
    references posts;
    
alter table thumbUp 
    add constraint FK863cxe6sgv79rm2dl7f2l7gmk 
    foreign key (fk_posts_id) 
    references posts;