drop procedure if exists checkuser;
delimiter $
create procedure checkuser(_emailid varchar(30),message varchar(30))
BEGIN
declare x BOOLEAN;
SELECT true into x from login WHERE emailid=_emailid;
if (x=true)
THEN

SELECT username,passward from login WHERE emailid =_emailid;

ELSE
 insert into log(CURR_DATE,CURR_time,message) VALUES(CURRENT_DATE() , current_time(), 'message');
end if ;
end $
delimiter ;

		