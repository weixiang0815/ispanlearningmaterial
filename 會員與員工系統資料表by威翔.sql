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