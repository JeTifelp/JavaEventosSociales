
------------------------------------TipoEquipo-----------------------------------------------
create procedure InsertarTipoEquipo( @nombre varchar(50) )
as
begin
  insert into TipoEquipo values(@nombre)     

end
delete from TipoEquipo where id=2 
select *from TipoEquipo
exec  InsertarTipoEquipo 'Camara_Filmadora'
select*from TipoEquipo

-------------------------------------------------------------------------------------------------------------------------------


create procedure BuscarTipoEquipo (@nombre varchar(50))
as
begin
 select* from TipoEquipo where Nombre like   @nombre + '%' 
 
end
  

exec BuscarTipoEquipo 'Luces'

select*from TipoEquipo
--drop procedure BuscarTipoEquipo1

-------------------------------------------------------------------------------------------------------------------------------
go


create procedure ModificarTipoEquipo(@nombre varchar(50),@nombre1 varchar(50))
as
begin
 update TipoEquipo set nombre=@nombre where nombre=@nombre1
end
go

exec ModificarTipoEquipo 'Luces','LUCES'

select*from TipoEquipo









--------------------------------------------- Equipo --------------------------------------------------------------------------------
  
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
  