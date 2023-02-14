-- 活動
create table Competition(
	id int primary key identity(1, 1),
	name_mandarin nvarchar(50),
	name_english nvarchar(50),
	start_date date,
	start_timespan nvarchar(5),
	end_date date,
	end_timespan nvarchar(5),
	announced_datetime datetime2,
	fk_place_id int foreign key references Place(id),
	content nvarchar(max),
	budget int,
	fee int,
	single_or_crew char(1),
	capacity int,
	fk_post_id int foreign key references Posts(id),
	status nvarchar(10),
);

-- 活動獎品
create table Competition_Prize(
	fk_competition_id int primary key foreign key references Competition(id),
	fk_1ts_prize_id int foreign key references Product(id),
	fk_2nd_prize_id int foreign key references Product(id),
	fk_3rd_prize_id int foreign key references Product(id),
	fk_single_prize_id int foreign key references Product(id),
	fk_crew_prize_id int foreign key references Product(id),
	fk_comfort_prize_id int foreign key references Product(id),
);

-- 報名情況
create table Participation(
	fk_competition_id int foreign key references Competition(id),
	fk_player_id int foreign key references Player(id),
	fk_crew_id int foreign key references Crew(id),
);

-- 活動報名表
create table SignUp(
	id int primary key identity(1, 1),
	fk_competition_id int foreign key references Competition(id),
	fk_player_id int foreign key references Users(id),
	signup_date date,
	status nvarchar(50)
);

-- 活動照片表
create table Competition_Picture(
	id int primary key identity(1, 1),
	fk_competition_id int foreign key references Competition(id),
	file_location nvarchar(255),
);

-- 競賽紀錄表
create table Competition_History(
	fk_competition_id int primary key foreign key references Competition(id),
	single_or_crew char(1),
	top_1 int,
	top_2 int,
	top_3 int,
	top_4 int,
	top_5 int,
	top_6 int,
	top_7 int,
	top_8 int,
	top_9 int,
	top_10 int,
	top_11 int,
	top_12 int,
	top_13 int,
	top_14 int,
	top_15 int,
	top_16 int,
);

-- 活動排程中介表
create table Competition_To_Schedule(
	id int primary key identity(1, 1) not null,
	fk_schedule_id int foreign key references Schedule(id),
	fk_competition_id int foreign key references Competition(id),
);