

drop procedure if exists adduser;
delimiter $
CREATE PROCEDURE adduser(username varchar (20),password int,emailid varchar(35))
BEGIN
   create table login(username varchar (20),password int,emailid varchar(35));
   insert into login values(username,password,emailid);
end $
delimiter ;
/*

drop procedure if exists pro2;
delimiter $
create procedure pro2(id int,firstname varchar(30),lastname varchar(30))
BEGIN
     declare exit handler for 1062 select "data alredy present" as "error window";
	 insert into c1 values(id,firstname,lastname);
end $
delimiter ;


*/