/*
use master;
create database Survival;
*/
use Survival;

-- 商品表
create table Product(
	id int primary key identity(1,1),
	name nvarchar(50),
	img varbinary(max),
	class nvarchar(50),
	context nvarchar(255),
	rent_fee int,
	price int,
);

-- 員工權限表
create table empPermission(
	id int primary key identity(1, 1),
	schedule char(1),
	player_management char(1),
	arrange_competition char(1),
	human_resource char(1),
	inventory char(1)
);

-- 員工資料表
create table Employee(
	id int primary key identity(1, 1),
	name nvarchar(50),
	account nvarchar(50),
	password nvarchar(50)not null,
	age int,	--不太可能給使用者自己填？
	region nvarchar(3),
	identity_number nvarchar(50),
	email nvarchar(50),
	address nvarchar(50),
	salary int,
	thumbnail varbinary(max),
	sex char(1),
	birthday date,
	title nvarchar(50),
	hire_date date,
	status nvarchar(10),
	fk_permission int foreign key references empPermission(id),
	fk_boss_id int foreign key references Employee(id)
);

-- 會員權限表
create table playerPermission(
	id int primary key identity(1, 1),
	join_single_competition char(1),
	shopping char(1),
	rent char(1),
	join_crew char(1),
);

-- 戰隊權限表
create table crewPermission(
	id int primary key identity(1, 1),
	join_crew_competition char(1),
	kickout char(1),
	modify_member_permission char(1),
	on_behalf_of_crew char(1),
	disband char(1),
);

-- 會員資料表
create table Player(
	id int primary key identity(1, 1),
	name nvarchar(50),
	account nvarchar(50),
	password nvarchar(50)not null,
	identity_number nvarchar(50)　not null,
	email nvarchar(50),
	nickname nvarchar(50),
	region nvarchar(3),
	address nvarchar(50),
	thumbnail varbinary(max),
	sex char(1),
	birthday date,
	age int,
	join_date date,
	info nvarchar(max),
	cellphone varchar(10),
	fk_player_permission int foreign key references playerPermission(id),
	fk_crew_permission int foreign key references crewPermission(id),
	banned char(1),
	banned_reason nvarchar(50),
);

-- 戰隊資料表
create table Crew(
	id int primary key identity(1, 1),
	name nvarchar(50),
	founder int foreign key references Player(id),
	manager int foreign key references Player(id),
);

alter table Crew add fk_crew_id int foreign key references Crew(id);

-- 徽章（頭銜）資料表
create table Badge(
	id int primary key identity(1, 1),
	name nvarchar(50),
	level int,
	condition nvarchar(50)
);

-- 徽章會員中介表
create table Badge_Player(
	fk_user_id int foreign key references Player(id),
	fk_badge_id int foreign key references Badge(id),
);

-- 戰隊會員中介表
create table Crew_Member(
	fk_group_id int foreign key references Crew(id),
	fk_player_id int foreign key references Player(id)not null,
	primary key(fk_group_id, fk_player_id)
);

-- 場地登記表
create table PlaceOrder(
	id int primary key identity(1,1),
	use_timespan nvarchar(50),
	order_status nvarchar(50),
	fk_employee_id int foreign key references Employee(id),
	fk_player_id int foreign key references Player(id),
);

-- 場地資料表
create table Place(
	id int primary key identity(1,1),
	place_name nvarchar(50),
	place_address nvarchar(50),
	place_photo varbinary(max),
	place_fee int,
	place_capacity int,
	fk_employee_id int foreign key references Employee(id),
	fk_product_id int foreign key references Product(id),
	fk_placeorder_id int foreign key references PlaceOrder(id),
);

alter table Employee add fk_workplace_id int foreign key references Place(id);

-- 倉庫資料表
create table Warehouse(
	id int primary key identity(1,1),
	warehouse_name nvarchar(50),
	fk_place_id int foreign key references Place(id),
);

alter table Place add fk_warehouse_id int foreign key references Warehouse(id);

-- 倉儲資料表
create table Inventory(
	id int primary key identity(1,1),
	inventory_sellamount int ,
	inventory_rentamount int ,
	fk_warehouse_id int foreign key references Warehouse(id)
);

alter table Warehouse add fk_inventory_id int foreign key references Inventory(id);

-- 場地時程表
create table Schedule(
	id int primary key identity(1,1),
	schedule_timespan int,
	schedule_datetime date,
	fk_place_id int foreign key references Place(id),
);

alter table Place add fk_schedule_id int foreign key references Schedule(id);

-- 貼文表
create table Posts (
	id int identity,
	added datetime2,
	classify varchar(255),
	essay varchar(255),
	final_added datetime2,
	name varchar(255),
	primary key (id)
);

-- 評分表
create table Score (
	id int identity,
	added datetime2,
	how_much_stars int,
	fk_posts_id int,
	primary key (id)
)

-- 活動
create table Competition(
	id int primary key identity(1, 1),
	public_or_private char(1),
	founder_player int foreign key references Player(id),
	founder_employee int foreign key references Employee(id),
	name_mandarin nvarchar(50),
	name_english nvarchar(50),
	start_date date,
	start_timespan int,
	end_date date,
	end_timespan int,
	announced_datetime datetime2,
	fk_place_id int foreign key references Place(id),
	content nvarchar(max),
	budget int,
	fee int,
	single_or_crew char(1),
	capacity int,
	fk_post_id int foreign key references Posts(id),
	status nvarchar(10),
);

--	活動排程查詢表
create table Competition_To_Schedule(
	id int primary key identity(1, 1),
	fk_schedule_id int foreign key references Schedule(id),
	fk_competition_id int foreign key references Competition(id),
);

-- 活動照片表
create table Competition_Picture(
	id int primary key identity(1, 1),
	fk_competition_id int foreign key references Competition(id),
	file_location nvarchar(255),
);

-- 活動獎品
create table Competition_Prize(
	fk_competition_id int primary key foreign key references Competition(id),
	fk_1ts_prize_id int foreign key references Product(id),
	fk_2nd_prize_id int foreign key references Product(id),
	fk_3rd_prize_id int foreign key references Product(id),
	fk_single_prize_id int foreign key references Product(id),
	fk_crew_prize_id int foreign key references Product(id),
	fk_comfort_prize_id int foreign key references Product(id),
);

-- 報名情況
create table Participation(
	fk_competition_id int foreign key references Competition(id),
	fk_player_id int foreign key references Player(id),
	fk_crew_id int foreign key references Crew(id),
);

-- 活動報名表
create table SignUp(
	id int primary key identity(1, 1),
	fk_competition_id int foreign key references Competition(id),
	fk_player_id int foreign key references Player(id),
	signup_date date,
	status nvarchar(50)
);

-- 競賽紀錄表
create table Competition_History(
	fk_competition_id int primary key foreign key references Competition(id),
	single_or_crew char(1),
	top_1 int,
	top_2 int,
	top_3 int,
	top_4 int,
	top_5 int,
	top_6 int,
	top_7 int,
	top_8 int,
	top_9 int,
	top_10 int,
	top_11 int,
	top_12 int,
	top_13 int,
	top_14 int,
	top_15 int,
	top_16 int,
);

create table Competition_Rule(
	id int primary key identity(1, 1),
	context nvarchar(10),
);

create table Competition_To_Rule(
	fk_competition_id int foreign key references Competition(id),
	fk_rule_id int foreign key references Competition_Rule(id),
);

-- 書籤表
create table Bookmarklet(
    id int identity,
    fk_posts_id int,
    primary key (id)
);

-- 留言表
create table Msgs(
    id int identity,
    added datetime2,
    essay varchar(255),
    final_added datetime2,
    fk_posts_id int,
    primary key (id)
);

-- 按讚表
create table ThumbUp(
	id int identity,
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