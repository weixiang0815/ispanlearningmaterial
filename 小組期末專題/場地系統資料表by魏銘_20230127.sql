create table Place(
id int primary key identity(1,1) not null,
place_name nvarchar(50) not null,
place_address nvarchar(50) not null,
place_photo varbinary(max),
place_fee int not null,
place_capacity int not null,
fk_employee_id int foreign key references Employee(id),
fk_product_id int foreign key references Product(id),
fk_warehouse_id int foreign key references Warehouse(id),
fk_placeorder_id int foreign key references PlaceOrder(id),
fk_schedule_id int foreign key references Schedule(id),
);

create table Warehouse(
id int primary key identity(1,1) not null,
warehouse_name nvarchar(50) not null,
fk_place_id int foreign key references Place(id),
fk_inventory_id int foreign key references Inventory(id)
);

create table Inventory(
id int primary key identity(1,1) not null,
inventory_sellamount int ,
inventory_rentamount int ,
fk_warehouse_id int foreign key references Warehouse(id)
);

create table PlaceOrder(
id int primary key identity(1,1) not null,
use_timespan nvarchar(50) not null,
order_status nvarchar(50),
fk_employee_id int foreign key references Employee(id),
fk_player_id int foreign key references Player(id),
);

create table Schedule(
id int primary key identity(1,1) not null,
schedule_name nvarchar(50) not null,
schedule_timespan nvarchar(50) not null,
schedule_status nvarchar(10) not null,
schedule_datetime date not null,
fk_place_id int foreign key references Place(id),
fk_competition_id int foreign key references Competition(id)
);
