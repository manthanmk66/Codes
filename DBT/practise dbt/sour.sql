drop function if exists f2;
delimiter $
create function f2(x int, y int) returns int
deterministic
BEGIN
	declare z int;
	set z:= ifnull(x,0)+ifnull(y,0);
    return z;
end $
delimiter ;
