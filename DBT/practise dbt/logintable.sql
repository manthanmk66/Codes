/*Create a LOGIN table (username, password, and email). Write a procedure (named addUser) to pass the username, 
#password, and  
#email-ID through the procedure and store the data in the LOGIN table.*/
/*drop PROCEDURE if exists addUser;
delimiter $
create PROCEDURE addUser(Username varchar(40),password VARCHAR(50),email VARCHAR(60))
BEGIN
INSERT into login VALUES(Username,password,email);
end $
delimiter ;*/
drop procedure if exists addUser;
delimiter %
create procedure addUser(username varchar(20), password varchar(20), email varchar(20))
begin
	insert into login values('username', 'password', 'email');
end %
delimiter ;
