use CajaChicaESFOT;

go
create proc EntradaCabeceraFactura(@CODCABFACT numeric(5,0), @CODCABSOL numeric(5,0), @FECCABFACT datetime, @RUCCABFACT numeric(13,0), @BINFACT binary(1))
as begin
insert into CAB_FACTURA values(@CODCABFACT, @CODCABSOL, @FECCABFACT, @RUCCABFACT, @BINFACT)
end
go

go
create proc EntradaDetalleFactura(@IDDETFACT numeric(5,0), @CODCABFACT numeric(5,0), @CODPRODDETFACT numeric(5,0), @CANPRODDETFACT numeric(5,0), @TOTALDETFACT real, @PREUNIPRODDETFACT real, @SUBTOTALDETFACT real, @IVADETFACT real)
as begin
insert into DET_FACTURA values(@IDDETFACT, @CODCABFACT, @CODPRODDETFACT, @CANPRODDETFACT, @TOTALDETFACT, @PREUNIPRODDETFACT, @SUBTOTALDETFACT, @IVADETFACT)
end
go


go
create proc EntradaCabeceraRetencion(@CODCABRET numeric(5,0), @FECCABRET datetime, @NOMCOMCABRET varchar(25), @NOMEMICABRET varchar(25), @BINRET binary(1))
as begin
insert into CAB_RETENCION values(@CODCABRET, @FECCABRET, @NOMCOMCABRET, @NOMEMICABRET, @BINRET)
end
go


go
create proc EntradaDetalleRetencion(@IDDETRET numeric(5,0), @COCABRET numeric(5,0), @TIPOCOMDETRET varchar(25), @PERIODOFISDETRET numeric(4,0), @IMPDETRET varchar(25), @PORDETRET real, @VALORDETRET real, @FECDOCDETRET datetime, @CODDOCDETRET numeric(10,0), @BASEDETRET real)
as begin
insert into DET_RETENCION values(@IDDETRET, @COCABRET, @TIPOCOMDETRET, @PERIODOFISDETRET, @IMPDETRET, @PORDETRET, @VALORDETRET, @FECDOCDETRET, @CODDOCDETRET, @BASEDETRET)
end
go


go
create proc EntradaCabeceraReposicion(@CODREPO numeric(5,0), @CODCACHI numeric(5,0), @ENTICABREPO varchar(25), @FECCABREPO varchar(25), @BINRET binary(1))
as begin
insert into CAB_REPOSICION values(@CODREPO, @CODCACHI, @ENTICABREPO, @FECCABREPO, @BINRET)
end
go


go
create proc EntradaDetalleReposicion(@CODDETREPO numeric(5,0), @CODREPO numeric(5,0), @CANTREPO real)
as begin
insert into DET_REPOSICION values(@CODDETREPO, @CODREPO, @CANTREPO)
end
go


go
create proc EntradaCabeceraSolicitud(@CODCABSOL numeric(5,0), @CODDIRC int, @CODDGIP int, @CODUSU numeric(5,0), @FECCABSOL datetime, @NOMCABSOL varchar(25), @ESTADOCABSOL varchar(25), @RUCCABSOL numeric (10,0), @BINSOL binary(1))
as begin
insert into CAB_SOLICITUD values(@CODCABSOL, @CODDIRC, @CODDGIP, @CODUSU, @FECCABSOL, @NOMCABSOL, @ESTADOCABSOL, @RUCCABSOL, @BINSOL)
end
go


go
create proc EntradaDetalleSolicitud(@CODDETSOL numeric(5,0), @CODDGIP int, @CODCABSOL numeric(5,0), @CODDIRC int, @PRODETSOL varchar(25), @CANDETSOL varchar(25))
as begin
insert into DET_SOLICITUD values(@CODDETSOL, @CODDGIP, @CODCABSOL, @CODDIRC, @PRODETSOL, @CANDETSOL)
end
go
