use HenryPower;
create table Account(
	id int primary key identity(1, 1) not null,
	username nvarchar(50) not null,
	userpwd nvarchar(50) not null
);
insert into Account (username, userpwd) values ('dusty', 'test123');
insert into Account (username, userpwd) values ('rabbit', '123test');
select * from Account;