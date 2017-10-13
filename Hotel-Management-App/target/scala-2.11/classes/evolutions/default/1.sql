# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table app_user (
  id                        bigint,
  first_name                varchar(255),
  last_name                 varchar(255),
  password                  varchar(255),
  gender                    varchar(255),
  mobile_number             bigint,
  date                      datetime(6))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table app_user;

SET FOREIGN_KEY_CHECKS=1;

