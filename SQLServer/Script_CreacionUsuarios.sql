use CajaChicaESFOT

/*********************************************
****CREACION LOGIN ADMINISTRADOR**************
*********************************************/

create login administrador
with password = 'esfot',
default_database=CajaChicaESFOT
GO


/**********************************************
****CREACION USUARIO ADMINISTRADOR*************
**********************************************/


create user administrador
for login administrador
with default_schema = mi_esquema
GO


/***********************************************
****CREACION DE ESQUEMA PARA ADMINISTRADOR******
***********************************************/


create schema mi_esquema authorization administrador;
GO


/***************************************************
****CREACION DE PRIVILEGIOS PARA ADMINISTRADOR******
***************************************************/


GRANT CREATE PROC,EXECUTE,CREATE TABLE,CREATE ROLE, SELECT, INSERT, UPDATE, DELETE TO administrador;
GO



/*********************************************
****CREACION LOGIN DIRECTOR**************
*********************************************/

create login director
with password = 'esfot',
default_database = CajaChicaESFOT
GO


/**********************************************
****CREACION USUARIO DIRECTOR*************
**********************************************/


create user director
for login director
with default_schema = mi_esquema2
GO


/***********************************************
****CREACION DE ESQUEMA PARA DIRECTOR******
***********************************************/


create schema mi_esquema2 authorization director;
GO

/***************************************************
****CREACION DE PRIVILEGIOS PARA DIRECTOR******
***************************************************/


GRANT CREATE PROC,EXECUTE,CREATE TABLE,CREATE ROLE, SELECT, INSERT, UPDATE, DELETE TO director;
GO