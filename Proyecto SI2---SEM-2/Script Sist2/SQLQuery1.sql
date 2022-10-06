
-----------------------------------------------------------------------------------------------------------------------------
create procedure InsertarCategoriaComponente1( @nombre varchar(50) )
as
begin
  insert into CategoriaComponente1 values(@nombre)     

end

exec  InsertarCategoriaComponente1 'eventos sociales'
select*from CategoriaComponente1

-------------------------------------------------------------------------------------------------------------------------------

go
create procedure ModificarCategoriaComponente1(@nombre varchar(50),@nombre1 varchar(50))
as
begin
 update CategoriaComponente1 set nombre=@nombre where nombre=@nombre1
end
go

exec ModificarCategoriaComponente1 'eventos recreativos','eventos sociales'

select*from CategoriaComponente1

select*from ComponentePaquete1
--------------------------------------------------------------------------------------------------------------------------------
go
create procedure BuscarCategoriaComponente(@nombre varchar(50) )
as



declare @b  varchar(50 )set @b= 'false'
declare @cant int set @cant =( select count(Id)from CategoriaComponente)
declare @dato varchar(50) set @dato='' 
  while(@cant>0 and @b='false')
  begin
 
 set @dato= (select Nombre from  CategoriaComponente where Id=@cant)  
   if(@nombre=@dato)
   begin
   set  @b='true'
   end
   else
  begin 
  set @cant=@cant-1
  end
 return @b 
  end
  go
  
-------------------------------------------------------------------------------------------------------------------------------
create procedure buscarCategoriaComponente1(@nombre varchar(50))
as
begin
 select* from CategoriaComponente1 where Nombre like   @nombre + '%' 
 
end
  

exec buscarCategoriaComponente1 'eventos corporativos'

select*from CategoriaComponente

--------------------------------------------- eliminar --------------------------------------------------------------------------------
go
create proc  EliminarCategoriaComponente1 (@nombre varchar(50))
as
begin
delete from CategoriaComponente1 where Nombre=@nombre
end

go

exec EliminarCategoriaComponente1 'eventos recreativos'
select *from CategoriaComponente1
---------------------------------------------fin de categoria eventos----------------------------------------------------------------------------------
  
  
-----------------------------------------------incio de componente  paquete-----------------------------------------------------
go
create procedure InsertarComponentePaquete1( @nombre varchar(50),@precio decimal(10,2),@tipo int ,@idcc int ) 
as
begin
  insert into CategoriaComponente1 values(@nombre,@precio,@tipo,@idcc)     

end
go
exec  InsertarComponentePaquete1 'corporativos',100,1,1 
drop proc InsertarComponentePaquete
select*from ComponentePaquete
-----------------------------------------------------------------------------------------------------------------------------
go
create procedure InsertarCategoriaComponente( @nombre varchar(50),@precio decimal(10,2),@tipo bit )
as
begin
  insert into CategoriaComponente values(@nombre,@precio,@tipo)   
  
end

exec  InsertarCategoriaComponente 'corporativos',100,1
select*from CategoriaComponente

-------------------------------------------------------------------------------------------------------------------------------

go
create procedure ModificarCategoriaComponente(@nombre varchar(50),@nombre1 varchar(50))
as
begin
 update CategoriaComponente set Nombre=@nombre where Nombre=@nombre1
end
go

exec ModificarCategoriaComponente 'muscia','boda'
--------------------------------------------------------------------------------------------------------------------------------
go
create procedure BuscarCategoriaComponente(@nombre varchar(50) )
as



declare @b  varchar(50 )set @b= 'false'
declare @cant int set @cant =( select count(Id)from CategoriaComponente)
declare @dato varchar(50) set @dato='' 
  while(@cant>0 and @b='false')
  begin
 
 set @dato= (select Nombre from  CategoriaComponente where Id=@cant)  
   if(@nombre=@dato)
   begin
   set  @b='true'
   end
   else
  begin 
  set @cant=@cant-1
  end
 return @b 
  end
  go
  
-------------------------------------------------------------------------------------------------------------------------------
create procedure buscarCategoriaComponente(@nombre varchar(50))
as
begin
 select* from CategoriaComponente where Nombre like   @nombre + '%' 
 
end
  
drop proc buscar   
exec buscar 'eventos corporativos'

select*from CategoriaComponente

--------------------------------------------- eliminar --------------------------------------------------------------------------------
go
create proc  EliminarCategoriaComponente (@nombre varchar(50))
as
begin
delete from CategoriaComponente where Nombre=@nombre
end

go

exec EliminarCategoriaComponente 'videos'
select *from CategoriaComponente
  
  
  ------------------------------------------------- consultas sql  --------------------------------------------------------------------------
 
  
  
  
  
  