use master;
create database Survival;
use Survival;

drop table if exists SignUp;
drop table if exists Users;
drop table if exists Competition;
drop table if exists Product;
drop table if exists Crew;
drop table if exists Site;
drop table if exists Permission;

-- 權限
create table Permission(
	id int primary key identity(1, 1),
	id_level nvarchar(50),
);

-- 商品（此處做為活動獎品）
create table Product(
	id int primary key identity(1, 1),
	name nvarchar(50),
	price int,
	category nvarchar(50)
);

-- 活動場地
create table Site(
	id int primary key identity(1, 1),
	name nvarchar(50),
	address nvarchar(100),
	capacity int
);

-- 活動
create table Competition(
	id int primary key identity(1, 1),
	name_mandarin nvarchar(50),
	name_english nvarchar(50),
	start_date date,
	start_timespan nvarchar(5),
	end_date date,
	end_timespan nvarchar(5),
	announced_datetime datetime2,
	fk_place_id int foreign key references Site(id),
	content nvarchar(max),
	rules nvarchar(max),
	budget int,
	fee int,
	single_or_crew char(1),
	capacity int,
	fk_post_id int foreign key references Post(id),
	status nvarchar(10),
);

create table Schedule(
	id int primary key identity(1, 1),
);

create table Competition_Schedule(
	fk_competition_id int foreign key references Competition(id),
	fk_schedule_id int foreign key references Schedule(id)
);

-- 活動獎品
create table Competition_Prize(
	fk_competition_id int foreign key references Competition(id),
	fk_1ts_prize_id int foreign key references Product(id),
	fk_2nd_prize_id int foreign key references Product(id),
	fk_3rd_prize_id int foreign key references Product(id),
	fk_single_prize_id int foreign key references Product(id),
	fk_crew_prize_id int foreign key references Product(id),
	fk_comfort_prize_id int foreign key references Product(id),
);

-- 戰隊
create table Crew(
	id int primary key identity(1, 1),
	name nvarchar(50),
	fk_manager_id int foreign key references Player(id)
);

-- 使用者基本資料（包含管理員、玩家、員工）
create table Users(
	id int primary key identity(1, 1),
	name nvarchar(50),
	sex char(1),
	address nvarchar(50),
	email nvarchar(50),
	age int,
	thumbnail varbinary(max),
	fk_permission_id int foreign key references Permission(id),
);

-- 會員（玩家）獨立資料
create table Player(
	id int primary key foreign key (id) references Users(id),
	stage_name nvarchar(50),
	crew_id int foreign key references Crew(id),
	joined_date date
	-- 感覺還能再加很多東西，但一時想不到😥
);

-- 報名情況
create table Participation(
	fk_competition_id int foreign key references Competition(id),
	fk_player_id int foreign key references Player(id),
	fk_crew_id int foreign key references Crew(id),
);

-- 營長（管理員）獨立資料
create table Boss(
	id int primary key foreign key (id) references Users(id),
	fk_workplace_id int foreign key references Site(id)
);

-- 員工獨立資料
create table Employee(
	id int primary key foreign key references Users(id),
	title nvarchar(50),
	hired_date date,
	salary int,
	fk_workplace_id int foreign key references Site(id),
	fk_supervisor_id int foreign key references Boss(id)
);

-- 活動報名表
create table SignUp(
	id int primary key identity(1, 1),
	fk_competition_id int foreign key references Competition(id),
	fk_player_id int foreign key references Users(id),
	signup_date date,
	status nvarchar(50)
);

-- 活動照片表
create table CompetitionPicture(
	id int primary key identity(1, 1),
	fk_competition_id int foreign key references Competition(id),
	file_location nvarchar(255),
);

-- 查詢各資料表
select * from Permission;
select * from Competition;
select * from Crew;
select * from Users;
select * from Product;
select * from SignUp;
select * from Site;

--塞完資料再執行
/*insert into Competition
	(name_mandarin, name_english, held_datetime, announced_datetime, fk_site_id, content, rules, budget, fee, fk_prize_id, single_or_crew, capacity, participation)
	values
	('抵抗統一最前線', 'Fight To The Last', '2027-1-1', CURRENT_TIMESTAMP, 0, '暫無', '沒有規則', 0, 2147483647, 0, 's', 1400000000, 0);
*/