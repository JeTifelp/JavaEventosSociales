Use NotasV2

--Ejecutar las Siguiente consultas sobre las tablas de la Base de datos Notas.
select *from est
select *from mat
select *from his

            
    
1. (30 ptos)
-- Mostar los estudiantes que aprobaron una o mas materias sin antes haberlas reprobado.
select est.*
from est
where code in (	select code
				from his,mat
				where his.code=est.code and mat.codm=his.codm and
						nota>50 and stad=2 and mat.codm not in(select codm
															from his
															where est.code = his.code and mat.codm=his.codm and
																	nota<51 and stad=2))
																	
select est.*
from est
where code in (	select code
				from his
				where his.code=est.code and
					  nota>50 and stad=2 and his.codm not in(select codm
															from his
															where est.code = his.code  and
																	nota<51 and stad=2))
--alumnos q nunca reprobaron

/*PRUEBA
*/
select est.*
from est
where code in (select code
				from his,mat
				where  his.codm=mat.codm and his.code=est.code and nota>50 and stad=2  and mat.codm not in(select mat.codm
																											from his,mat
																										where  his.codm=mat.codm and his.code=est.code and nota<51 and stad=2)) 


2. (40 ptos) 
--Hacer una Consulta para obtener las materias que debe incribir un estudiante. Las materias que debe
-- inscribir un estudiante son aquellas que cumplen con las siguientes caracteristicas:
--1.	No estan aprobadas y 
--2.	Tienen aprobadas todas sus materias prerequisitos. 
--Por ejemplo: las materias que debe inscribir el estudiante con code=4 son las materias 3 y 4.
-- APPE
select nsem	,sigla,nomb,nota
from mat left outer join his on his.codm=mat.codm and  stad=2 and code=3 and nota >50
--APPE ALUMNO
select est.nomb,est.code,nota
from est,mat left outer join his on his.codm=mat.codm and  stad=2 and (nota <=50 or nota is null)
where his.code=est.code
group by est.nomb,est.code,nota
/*PRUEBA DOS*/
select est.nomb,mat.nomb
from est,mat
where codm not in(select codm
				  from his
				  where est.code=his.code and stad=2 and nota>50)
	 and 
	 codm in(	select codm
				from pre
				where pre.codp in (	select codm
									from his
									where his.code=est.code and stad=2 and nota>50))
select *from est
select *from mat
select *from his
select *from pre

select est.nomb,mat.nomb
from est,mat
where codm not in(select codm
				  from his
				  where est.code=his.code and stad=2 and nota>50)
	 and 
	 codm in(	select codm
				from mat
				where (	select COUNT(*)
						from pre
						where pre.codm=mat.codm  )=(select COUNT(*)
													from his,pre
													where his.code=est.code and
													 mat.codm = pre.codm and
													 his.codm=pre.codp												 
													 and stad=2 and nota>50))							
												  
3. (30 ptos)
-- Mostar los estudiantes que vencieron todas las materias obligatorias del 1ro y 2do Semtrestre.
-- se debe mostrar del estudiante: Codigo, Nombre, Ciudad, 
-- ademas debe estar ordenado por el Nombre
select est.*
from est
where	(select COUNT(*)from mat where tmat=1 and nsem=1)=(select COUNT(*)from his,mat where his.codm=mat.codm and est.code = his.code and nota>50 and tmat=1 and stad=2 and nsem=1 )and
		(select COUNT(*)from mat where tmat=1 and nsem=2)=(select COUNT(*)from his,mat where his.codm=mat.codm and est.code = his.code and nota>50 and tmat=1 and stad=2 and nsem=2 )
	










