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
------------------------------------2023/2/7-Hibernate執行碼---------------------------
 

    
    create table bookmarklet (
       id int identity not null,
        fk_posts_id int,
        primary key (id)
    )

    
    create table msgs (
       id int identity not null,
        added datetime2,
        essay varchar(255),
        final_added datetime2,
        fk_posts_id int,
        primary key (id)
    )
 
    
    create table posts (
       id int identity not null,
        added datetime2,
        classify varchar(255),
        essay varchar(255),
        final_added datetime2,
        name varchar(255),
        primary key (id)
    )

    
    create table score (
       id int identity not null,
        added datetime2,
        how_much_stars int,
        fk_posts_id int,
        primary key (id)
    )
    
    create table thumbUp (
       id int identity not null,
        added datetime2,
        fk_posts_id int,
        primary key (id)
    )
 
    
    alter table bookmarklet 
       add constraint FKgqau7qyhv2lj35sbiqfhw8ix3 
       foreign key (fk_posts_id) 
       references posts

    
    alter table msgs 
       add constraint FK304o6jqg85sw41pqqprv3msge 
       foreign key (fk_posts_id) 
       references posts

    
    alter table score 
       add constraint FK28hwgqxw4rbnj7k4p9wm11krc 
       foreign key (fk_posts_id) 
       references posts

    
    alter table thumbUp 
       add constraint FK863cxe6sgv79rm2dl7f2l7gmk 
       foreign key (fk_posts_id) 
       references posts

drop table if exists bookmarklet;
drop table if exists msgs;
drop table if exists score;
drop table if exists thumbUp;
drop table if exists posts;
