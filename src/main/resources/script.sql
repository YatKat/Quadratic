create database equation;
create table results
(
  id      int auto_increment
    primary key,
  a       int    not null,
  b       int    not null,
  c       int    not null,
  result1 double null,
  result2 double null
);


