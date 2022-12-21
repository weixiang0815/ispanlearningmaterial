use master;
create database Survival;
use Survival;

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

insert into Users (name, account, password, sex, address, email, age)
			values('jack', 'jack', 'jack123', 'M', 'Taipei', 'jack@email.com', 20);
insert into Users (name, account, password, sex, address, email, age)
			values('henry', 'henry', 'henry123', 'M', 'New Taipei', 'henry@email.com', 30);
insert into Users (name, account, password, sex, address, email, age)
			values('jane', 'jane', 'jane123', 'F', 'Hsinchu', 'jane@email.com', 40);
insert into Users (name, account, password, sex, address, email, age)
			values('jenny', 'jenny', 'jenny123', 'F', 'Seoul', 'jenny@email.com', 50);
insert into Users (name, account, password, sex, address, email, age)
			values('kevin', 'kevin', 'kevin123', 'M', 'Kaohsiung', 'kevin@email.com', 60);