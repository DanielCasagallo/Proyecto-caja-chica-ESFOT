use FACTURACION2

/*********************************************
****CREACION LOGIN ADMINISTRADOR**************
*********************************************/

create login administrador
with password = 'esfot',
default_database=FACTURACION2


/**********************************************
****CREACION USUARIO ADMINISTRADOR*************
**********************************************/


create user administrador
for login administrador
with default_schema = mi_esquema


/***********************************************
****CREACION DE ESQUEMA PARA ADMINISTRADOR******
***********************************************/


create schema mi_esquema authorization administrador;


/***************************************************
****CREACION DE PRIVILEGIOS PARA ADMINISTRADOR******
***************************************************/


GRANT CREATE PROC,EXECUTE,CREATE TABLE,CREATE ROLE, SELECT, INSERT, UPDATE, DELETE TO administrador;



/*********************************************
****CREACION LOGIN DIRECTOR**************
*********************************************/

create login director
with password = 'esfot',
default_database = FACTURACION2


/**********************************************
****CREACION USUARIO DIRECTOR*************
**********************************************/


create user director
for login director
with default_schema = mi_esquema2


/***********************************************
****CREACION DE ESQUEMA PARA DIRECTOR******
***********************************************/


create schema mi_esquema2 authorization director;


/***************************************************
****CREACION DE PRIVILEGIOS PARA DIRECTOR******
***************************************************/


GRANT CREATE PROC,EXECUTE,CREATE TABLE,CREATE ROLE, SELECT, INSERT, UPDATE, DELETE TO director;