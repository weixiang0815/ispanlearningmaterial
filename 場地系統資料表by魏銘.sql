-- 會員（玩家）獨立資料
create table Player(
	id int primary key identity(1, 1) not null,
	fk_crew_id int foreign key references Crew(id),
	joined_date date not null,
	-- 感覺還能再加很多東西，但一時想不到😥
);

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