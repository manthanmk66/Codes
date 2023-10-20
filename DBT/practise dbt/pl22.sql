/*
drop procedure if exists pr5;
delimiter $
CREATE procedure pr5(id int)
begin
declare z int;
set z:=0;
set @x:="";
set @n:="";
lb1:LOOP
if z<=10 THEN
set 
 set z:=z+1;
 
	if(id%2!=0) THEN
		set @y:=id;
		set @x:=concat(id," ","is"," odd");
	else 
		set @m:=id;
		set @n:=concat(id," ","is","even");
	end if;
	

ELSE 	
	leave lb1;
end if;	
	end loop lb1;
select  @y as "id" ,@x as "message";
select  @m as "id" ,@n as "message";
end $
delimiter ;
*/

drop procedure if exists pr8;
delimiter $
CREATE PROCEDURE pr8(name varchar(30))
BEGIN
declare z int;
declare len1 int;
set len1:=length(name);
set z:=0;
lb1:LOOP
set z:=z+1;
SELECT substr(name,z,1);

if z=len1 then
leave lb1;
end if;
end loop lb1;

end $
delimiter ;