drop trigger if exists tr1;
delimiter $
create trigger tr1 before insert on d for each ROW
begin 
insert into d1 values(new.empno,new.ename,new.loc)  ;
end $


create trigger tr2 before delete on d for each ROW
begin 
insert into d2 values(old.empno,old.ename,old.loc)  ;




end $
delimiter ;