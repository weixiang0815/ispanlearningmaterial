use Survival;

drop table if exists New_Competition_Form;
drop table if exists New_Competition_Form_Part_1;
drop table if exists New_Competition_Form_Part_2;
drop table if exists New_Competition_Form_Part_3;

create table New_Competition_Form_Part_1(
	id int primary key identity(1, 1) not null,
	name_mandarin nvarchar(50),
	name_english nvarchar(50),
	start_date date,
	start_timespan nvarchar(5),
	end_date date,
	end_timespan nvarchar(5),
);
create table New_Competition_Form_Part_2(
	id int primary key identity(1, 1) not null,
	status nvarchar(10),
	single_or_crew char(1),
	fk_place_id int,
	capacity int,
	budget int,
	fee int,
);
create table New_Competition_Form_Part_3(
	id int primary key identity(1, 1) not null,
	content_file_location nvarchar(max),
);
create table New_Competition_Form(
	id int primary key identity(1, 1) not null,
	creator_id int,
	creator_type int,
	last_edited datetime2,
	fk_part1_id int foreign key references New_Competition_Form_Part_1(id),
	fk_part2_id int foreign key references New_Competition_Form_Part_2(id),
	fk_part3_id int foreign key references New_Competition_Form_Part_3(id),
);

select * from New_Competition_Form;
select * from New_Competition_Form_Part_1;
select * from New_Competition_Form_Part_2;
select * from New_Competition_Form_Part_3;

update New_Competition_Form_Part_3 set content_file_location = 'C:\Survival\Competition\Competition\temp_content\temp_1.txt';