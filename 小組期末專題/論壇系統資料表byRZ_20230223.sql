use master;
create database Survival;
use Survival;

drop table ThumbUp;
drop table Score;
drop table Msgs;
drop table Bookmarklet;
drop table Posts;

create table Posts (
     id int not null primary key identity(1,1),
     added datetime2(7),
	 classify varchar(255),
	 essay nvarchar(MAX),
	 final_added datetime2(7),
	 name varchar(255),
     fk_player_id int foreign key references Player(id),
     fk_competition_id int foreign key references Competition(id)
)

create table Bookmarklet (
     id int not null primary key identity(1,1),
     added datetime2(7),
     fk_posts_id int foreign key references Posts(id),
     fk_player_id int foreign key references Player(id)
)

create table Msgs (
     id int not null primary key identity(1,1),
     added datetime2(7),
	 essay varchar(MAX),
	 final_added datetime2(7),
     fk_posts_id int foreign key references Posts(id),
     fk_player_id int foreign key references Player(id)
)

create table Score (
     id int not null primary key identity(1,1),
     added datetime2(7),
	 how_much_stars int,
     fk_posts_id int foreign key references Posts(id),
     fk_player_id int foreign key references Player(id)
)

create table ThumbUp (
     id int not null primary key identity(1,1),
     added datetime2(7),
     fk_posts_id int foreign key references Posts(id),
     fk_player_id int foreign key references Player(id)
)

select * from ThumbUp;
select * from Score;
select * from Msgs;
select * from Bookmarklet;
select * from Posts;