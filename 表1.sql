use master;
create database Survival;

use Survival;

drop table if exists SignUp;
drop table if exists Player;
drop table if exists Competition;
drop table if exists Product;
drop table if exists Crew;
drop table if exists Site;

create table Product(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	price int not null,
	category nvarchar(50) not null
);

create table Site(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	address nvarchar(100) not null,
	capacity int not null
);

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

create table Crew(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
);

create table Player(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	stage_name nvarchar(50) not null,
	crew_id int foreign key references Crew(id),
);

create table SignUp(
	id int primary key identity(1, 1) not null,
	fk_competition_id int foreign key references Competition(id),
	fk_player_id int  foreign key references Player(id),
);

select * from Competition;
select * from Crew;
select * from Player;
select * from Product;
select * from SignUp;
select * from Site;

--塞完資料再執行
insert into Competition
	(name_mandarin, name_english, held_datetime, announced_datetime, fk_site_id, content, rules, budget, fee, fk_prize_id, single_or_crew, capacity, participation)
	values
	('抵抗統一最前線', 'Fight To The Last', '2027-1-1', CURRENT_TIMESTAMP, 0, '暫無', '沒有規則', 0, 2147483647, 0, 's', 1400000000, 0);