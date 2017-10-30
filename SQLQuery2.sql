CREATE PROCEDURE SP_Prueba1
--Determina bajo que contexto se creara dicho procedimiento
as 
print 'Hola Mundo'

EXECUTE SP_Prueba1

CREATE PROCEDURE SP_Consulta
AS
select * from Producto
where idproducto = '2'

EXECUTE SP_Consulta