use master;

create database Survival;

use Survival;

drop table orderitem;
drop table membershipnumber;
drop table logistics;
drop table product;
drop table product_class;
drop table product_inventory;
drop table borrow_inventory;


--會員
create table membershipnumber (
membership_number_id	int primary key identity(1, 1) not null,
membership_name nvarchar(50) not null,
password nvarchar(50) not null,
address nvarchar(50) not null,
phone nvarchar(50) not null,
);	

--新品庫存
create table product_inventory(
product_inventory_id int primary key identity(1, 1) not null,
product_number int not null,
product_price nvarchar(50) not null,
);

--租借庫存
create table borrow_inventory (
borrow_id int primary key identity(1, 1) not null,
borrow_number int not null,
borrow_price nvarchar(50) not null,
);

--新品租借分類
create table product_class(
product_class_id int primary key identity(1, 1) not null,
fk_product_inventory_id int references product_inventory(product_inventory_id),
fk_borrow_id int references borrow_inventory (borrow_id),
);

--商品
create table product(
product_id int primary key identity(1, 1) not null,
product_name nvarchar(50) not null,
product_img varbinary(max) not null,
product_context nvarchar(50) not null,
product_local nvarchar(50) not null,
fk_product_class_id int references product_class (product_class_id),
);

--訂單
create table orderitem(	
orderitem_id int primary key identity(1, 1) not null,
createDate date default convert(date,getDate()),
fk_membership_numberid int references membershipnumber (membership_number_id),
fk_product_id int references product (product_id),
product_amount nvarchar(50) not null,
total_price nvarchar(50) not null,
);

--物流(庫存) 配送時間都14:00到貨 到貨後改變庫存數量
create table logistics(
logisticsid int primary key identity(1, 1) not null,
fk_product_id int references product (product_id),
product_price nvarchar(50) not null,
product_state nvarchar(20) not null,
time date not null,
);

--場地

select * from membershipnumber;
select * from product_inventory;
select * from borrow_inventory;
select * from product_class;
select * from product;
select * from orderitem;
select * from logistics;
