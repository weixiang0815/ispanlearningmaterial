create table empPermission(
	id int primary key identity(1, 1) not null,
	schedule char(1) not null,
	player_management char(1) not null,
	arrange_competition char(1) not null,
	human_resource char(1) not null,
	inventory char(1) not null
);

create table Employee(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	account nvarchar(50) not null,
	password nvarchar(50)not null,
	age int not null,	--不太可能給使用者自己填？
	region nvarchar(3) not null,
	identity_number nvarchar(50) not null,
	email nvarchar(50) not null,
	address nvarchar(50) not null,
	salary int not null,
	thumbnail varbinary(max),
	sex char(1) not null,
	birthday date not null,
	title nvarchar(50) not null,
	hire_date date not null,
	status nvarchar(10) not null,
	fk_permission int foreign key references empPermission(id) not null,
	fk_boss_id int foreign key references Employee(id),
	fk_workplace_id int foreign key references Place(id) not null 
);

create table playerPermission(
	id int primary key identity(1, 1) not null,
	join_single_competition char(1) not null,
	shopping char(1) not null,
	rent char(1) not null,
	join_crew char(1) not null,
);

create table crewPermission(
	id int primary key identity(1, 1) not null,
	join_crew_competition char(1) not null,
	kickout char(1) not null,
	modify_member_permission char(1) not null,
	on_behalf_of_crew char(1) not null,
	disband char(1) not null,
);

create table Player(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	account nvarchar(50) not null,
	password nvarchar(50)not null,
	identity_number nvarchar(50)　not null,
	email nvarchar(50) not null,
	nickname nvarchar(50),
	region nvarchar(3) not null,
	address nvarchar(50) not null,
	thumbnail varbinary(max),
	sex char(1) not null,
	birthday date not null,
	age int not null,
	join_date date not null,
	fk_crew_id int foreign key references Crew(id),
	info nvarchar(max),
	cellphone varchar(10) not null,
	fk_player_permission int foreign key references playerPermission(id) not null,
	fk_crew_permission int foreign key references crewPermission(id) not null,
	banned char(1) not null,
	banned_reason nvarchar(50),
);

create table Crew(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	founder int foreign key references Player(id),
	manager int foreign key references Player(id),

);

create table Badge(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	level int not null,
	condition nvarchar(50) not null
);

create table Badge_Player(
	fk_user_id int foreign key references Player(id) not null,
	fk_badge_id int foreign key references Badge(id) not null,
);

create table Crew_Member(
fk_group_id int foreign key references Crew(id) not null,
fk_player_id int foreign key references Player(id)not null
,primary key(fk_group_id,fk_player_id)
);