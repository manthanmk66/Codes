drop PROCEDURE if EXISTS adduser;
delimiter $
CREATE PROCEDURE adduser(username varchar(30) ,password varchar(30),emailid varchar(30))
BEGIN
CREATE table login(username varchar(30) ,password varchar(30),emailid varchar(30));
insert into login VALUES(username,password,emailid);
end $
delimiter ;
