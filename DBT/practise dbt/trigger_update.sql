drop trigger if exists tr1;
delimiter $

create trigger tr1 before update on stud for each row 
begin 


insert into newdata values(new.id,new.name,new.marks,old.oldid,old.oldname,old.oldmarks);
end $
delimiter ;	