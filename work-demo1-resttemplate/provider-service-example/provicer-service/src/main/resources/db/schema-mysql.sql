drop table if exists person;
create table user
(
    id          int(11) auto_increment,
    nickname    varchar(20) not null,
    create_time timestamp default CURRENT_TIMESTAMP,
    primary key (id)
) auto_increment = 1;