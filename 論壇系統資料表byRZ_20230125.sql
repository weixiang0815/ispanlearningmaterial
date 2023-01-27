use master;
create database Survival;

use Survival;

drop table if exists Images;
drop table if exists ThumbUp;
drop table if exists Bookmarklet;
drop table if exists Msg;
drop table if exists Posts;
drop table if exists Player;
drop table if exists Pmss;

create table Users(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
);

create table Posts(
	id int primary key identity(1, 1) not null,
	name nvarchar(50) not null,
	classify nvarchar(50) not null,
	essay nvarchar(max) not null,
	Player_id int foreign key references Users(id),
);

create table Bookmarklet(
	id int primary key identity(1, 1) not null,
	Player_id int foreign key references Users(id),
	Posts_id int foreign key references Posts(id),
);

create table Msg(
	id int primary key identity(1, 1) not null,
	Player_id int foreign key references Users(id),
	Posts_id int foreign key references Posts(id), 
);

create table ThumbUp(
	id int primary key identity(1, 1) not null,
	Player_id int foreign key references Users(id),
	Msg_id int  foreign key references Msg(id),
);

create table Images(
	id int primary key identity(1, 1) not null,
	Posts_id int foreign key references Posts(id),
	Msg_id int  foreign key references Msg(id),
);

select * from Users;
select * from Posts;
select * from Bookmarklet;
select * from Msg;
select * from ThumbUp;
select * from Images;