create database todoapp;
use todoapp;
create table projects (
	id int not null primary key auto_increment,
    name varchar(50) not null,
    description varchar(255) not null,
    createdAt datetime not null,
    updatedAt datetime not null
);
create table tasks (
	id int not null primary key auto_increment,
    idProject int not null,
    name varchar(50) not null,
    description varchar(255),
    completed boolean not null,
    notes varchar(255),
    deadline date not null,
    createdAt datetime not null,
    updatedAt datetime not null
);
alter table tasks add constraint fk_projects foreign key (idProject) references projects(id)
on delete cascade on update cascade;