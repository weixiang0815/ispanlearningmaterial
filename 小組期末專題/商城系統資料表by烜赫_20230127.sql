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

--	�q��
create table OrderItem(
id int primary key identity(1,1) not null,
order_create_date date not null,
status nvarchar(10) ,
fk_player_id int foreign key references Player(id) ,
);

--	�q��P�ӫ~ �h��h
create table OrderItemDetail(
fk_orderitem_id int foreign key references OrderItem(id) ,
fk_product_id int foreign key references Product(id) ,
);

--	���y�]�@�x�d���^
create table Logistics(
id int primary key identity(1,1) not null,
start_date date not null,
arrive_date date not null,
status nvarchar(10) ,
fk_inventory_id int foreign key references Inventory(id) ,
fk_receiver_id int foreign key references Player(id) ,
fk_orderitem_id int foreign key references orderitem(id) ,
);

--	�d���P�q�� �@��h
create table logisticsdetail(
fk_logistics_id int foreign key references Logistics(id) ,
fk_orderitem_id int foreign key references OrderItem(id) ,
);
