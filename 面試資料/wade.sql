use wade;

drop table if exists Store_Information;
drop table if exists Geography;

create table Store_Information(
	Store_Name varchar(50),
	Sales int,
	Txn_Date date,
);

insert into Store_Information values ('Los Angeles', 1500, '19990105');
insert into Store_Information values ('San Diego', 250, '19990107');
insert into Store_Information values ('Los Angeles', 300, '19990108');
insert into Store_Information values ('Boston', 700, '19990108');

create table Geography(
	Region_Name varchar(10),
	Store_Name varchar(50),
);

insert into Geography values('East', 'Boston');
insert into Geography values('East', 'New York');
insert into Geography values('West', 'Los Angeles');
insert into Geography values('West', 'San Diego');

select Store_Name, Sales, format(Txn_Date, 'dd-MMM-yyyy') as Txn_Date from Store_Information;
select Region_Name, count(Store_Name) as [Store_Count] from Geography group by Region_Name;
select s.Store_Name, s.Sales, format(s.Txn_Date, 'dd-MMM-yyyy') as Txn_Date, g.Region_Name from Store_Information as s left join Geography as g on s.Store_Name = g.Store_Name;