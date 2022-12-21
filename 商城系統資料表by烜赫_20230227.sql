use Survival;

create table Product(
id int primary key identity(1,1) not null,
name nvarchar(50) not null,
img varbinary(max),
class nvarchar(50) not null,
context nvarchar(255) not null,
rent_fee int not null,
price int not null,
);