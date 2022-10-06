CREATE DATABASE ESTUDIOOO
USE ESTUDIOOO
CREATE TABLE [dbo].[Agenda] ( 
	[Id] int identity(1000,1)  NOT NULL,
	[IdRes] int NULL,
	[IdEven] int NULL,
	[Fecha] date NOT NULL
);

CREATE TABLE [CargoLaboral] ( 
	[Id] smallint identity(1,1)  NOT NULL,
	[Nombre] varchar(30) NOT NULL
);

CREATE TABLE [CategoriaComponente] ( 
	[Id] smallint identity(1,1)  NOT NULL,
	[Nombre] varchar(50) NOT NULL
);

CREATE TABLE [Cliente] ( 
	[CI] varchar(10) NOT NULL,
	[FechaReg] date NOT NULL
);

CREATE TABLE [dbo].[Cobros] ( 
	[Nro] int NOT NULL,
	[IdCont] int NOT NULL,
	[NombreApellido] varchar(max) NOT NULL,
	[Monto] decimal(10,2) NOT NULL,
	[Fecha] date NOT NULL,
	[Hora] time(7) NOT NULL
);

CREATE TABLE [ComponentePaquete] ( 
	[Id] smallint identity(1,1)  NOT NULL,
	[Nombre] varchar(50) NOT NULL,
	[Precio] decimal(10,2) NOT NULL,
	[Icono] bit NOT NULL,
	[IdCC] smallint NOT NULL
);

CREATE TABLE [dbo].[Contrato] ( 
	[Id] int NOT NULL,
	[CostoTotal] decimal(10,2) NOT NULL,
	[ACuenta] decimal(10,2) NOT NULL,
	[Saldo] decimal(10,2) NOT NULL,
	[FechaCont] date NOT NULL,
	[Obs] varchar(100) NULL,
	[CIE] varchar(10) NOT NULL,
	[CIC] varchar(10) NOT NULL,
	[IdPaq] int NOT NULL,
	[IdEven] int NOT NULL
);

CREATE TABLE [Direcciones] ( 
	[IdEven] int NOT NULL,
	[Descripcion] varchar(30) NOT NULL,
	[Direccion] varchar(max) NOT NULL
);

CREATE TABLE [dbo].[Empleado] ( 
	[CI] varchar(10) NOT NULL,
	[IdCL] smallint NOT NULL,
	[FechaNac] date NOT NULL,
	[Sueldo] decimal(10,2) NOT NULL,
	[FechaIng] date NOT NULL
);

CREATE TABLE [dbo].[Equipo] ( 
	[Id] smallint identity(1,1)  NOT NULL,
	[Nombre] varchar(50) NOT NULL,
	[Descripcion] varchar(50) NULL,
	[Disponible] bit NOT NULL,
	[IdTE] smallint NOT NULL
);

CREATE TABLE [dbo].[Evento] ( 
	[Id] int NOT NULL,
	[Fecha] date NULL,
	[Descripcion] varchar(max) NOT NULL,
	[Hora] time(7) NOT NULL,
	[IdTE] smallint NOT NULL,
	[Latitud] decimal(15,2) NULL,
	[Longitud] decimal(15,2) NULL
);

CREATE TABLE [FichaDatos] ( 
	[Id] smallint NOT NULL,
	[IdEven] int NOT NULL,
	[Descripcion] varchar(max) NOT NULL
);

CREATE TABLE [IncluyePC] ( 
	[IdPaq] int NOT NULL,
	[IdCP] smallint NOT NULL,
	[Cantidad] smallint NOT NULL
);

CREATE TABLE [OrdenTrabajo] ( 
	[CIE] varchar(10) NOT NULL,
	[IdEven] int NOT NULL,
	[Descripcion] varchar(max) NOT NULL,
	[FechaO] date NOT NULL,
	[FechaE] date NOT NULL,
	[Nro] bigint identity(1,1)  NOT NULL,
	[Estado] varchar(max) NOT NULL,
	[Porcentaje] smallint NOT NULL
);

CREATE TABLE [dbo].[Paquete] ( 
	[Id] int identity(1,1)  NOT NULL,
	[Nombre] varchar(50) NOT NULL,
	[Precio] decimal(10,2) NOT NULL,
	[Descuento] decimal(10,2) NOT NULL,
	[PrecioTotal] decimal(10,2) NOT NULL,
	[Generico] bit NOT NULL
);

CREATE TABLE [dbo].[Persona] ( 
	[CI] varchar(10) NOT NULL,
	[Nombre] varchar(30) NOT NULL,
	[APellidoP] varchar(20) NOT NULL,
	[APellidoM] varchar(20) NULL,
	[Direccion] varchar(max) NULL,
	[Sexo] bit NOT NULL,
	[Telefono] varchar(15) NULL,
	[Email] varchar(100) NULL
);

CREATE TABLE [Reserva] ( 
	[Id] int NOT NULL,
	[FechaR] date NOT NULL,
	[FechaE] date NOT NULL,
	[DiasEspera] smallint NULL,
	[Interasado] varchar(max) NOT NULL,
	[Descripcion] varchar(max) NOT NULL
);

CREATE TABLE [dbo].[TipoEquipo] ( 
	[Id] smallint identity(1,1)  NOT NULL,
	[Nombre] varchar(30) NOT NULL
);

CREATE TABLE [TipoEvento] ( 
	[Id] smallint identity(1,1)  NOT NULL,
	[Nombre] varchar(20) NOT NULL
);

CREATE TABLE [UtilizaEE] ( 
	[IdEven] int NOT NULL,
	[IdEq] smallint NOT NULL
);


ALTER TABLE [dbo].[Agenda] ADD CONSTRAINT [PK_TareaAgenda] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [CargoLaboral] ADD CONSTRAINT [PK_CargoLaboral] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [CategoriaComponente] ADD CONSTRAINT [PK_CategoriaComponente] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [Cliente] ADD CONSTRAINT [PK_Cliente] 
	PRIMARY KEY CLUSTERED ([CI]);

ALTER TABLE [dbo].[Cobros] ADD CONSTRAINT [PK_Pagos] 
	PRIMARY KEY CLUSTERED ([Nro]);

ALTER TABLE [ComponentePaquete] ADD CONSTRAINT [PK_ComponentePaquete] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [dbo].[Contrato] ADD CONSTRAINT [PK_Contrato] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [Direcciones] ADD CONSTRAINT [PK_Direcciones] 
	PRIMARY KEY CLUSTERED (;

ALTER TABLE [dbo].[Empleado] ADD CONSTRAINT [PK_Empleado] 
	PRIMARY KEY CLUSTERED ([CI]);

ALTER TABLE [dbo].[Equipo] ADD CONSTRAINT [PK_Equipo] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [dbo].[Evento] ADD CONSTRAINT [PK_Evento] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [FichaDatos] ADD CONSTRAINT [PK_FichaDatos] 
	PRIMARY KEY CLUSTERED ([IdEven], [Id]);

ALTER TABLE [IncluyePC] ADD CONSTRAINT [PK_IncluyePC] 
	PRIMARY KEY CLUSTERED ([IdPaq], [IdCP]);

ALTER TABLE [OrdenTrabajo] ADD CONSTRAINT [PK_OrdenTrabajo] 
	PRIMARY KEY CLUSTERED ([CIE], [IdEven]);

ALTER TABLE [dbo].[Paquete] ADD CONSTRAINT [PK_Paquete] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [dbo].[Persona] ADD CONSTRAINT [PK_Persona] 
	PRIMARY KEY CLUSTERED ([CI]);

ALTER TABLE [Reserva] ADD CONSTRAINT [PK_Reserva] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [dbo].[TipoEquipo] ADD CONSTRAINT [PK_TipoEquipo] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [TipoEvento] ADD CONSTRAINT [PK_TipoEvento] 
	PRIMARY KEY CLUSTERED );

ALTER TABLE [UtilizaEE] ADD CONSTRAINT [PK_UtilizaEE] 
	PRIMARY KEY CLUSTERED ([IdEven], [IdEq]);


ALTER TABLE [CargoLaboral]
	ADD CONSTRAINT [UQ_CargoLaboral_Nombre] UNIQUE ([Nombre]);

ALTER TABLE [CategoriaComponente]
	ADD CONSTRAINT [UQ_CategoriaComponente_Nombre] UNIQUE ([Nombre]);

ALTER TABLE [ComponentePaquete]
	ADD CONSTRAINT [UQ_ComponentePaquete_Nombre] UNIQUE ([Nombre]);

ALTER TABLE [dbo].[Equipo]
	ADD CONSTRAINT [UQ_Equipo] UNIQUE ([Nombre], [IdTE]);

ALTER TABLE [OrdenTrabajo]
	ADD CONSTRAINT [UQ_OrdenTrabajo_Nro] UNIQUE ([Nro]);

ALTER TABLE [dbo].[Paquete]
	ADD CONSTRAINT [UQ_Paquete_Nombre] UNIQUE ([Nombre]);

ALTER TABLE [dbo].[Persona]
	ADD CONSTRAINT [UQ_Persona_Email] UNIQUE ([Email]);

ALTER TABLE [dbo].[TipoEquipo]
	ADD CONSTRAINT [UQ_TipoEquipo] UNIQUE ([Nombre]);

ALTER TABLE [TipoEvento]
	ADD CONSTRAINT [UQ_TipoEvento_Nombre] UNIQUE ([Nombre]);


ALTER TABLE [dbo].[Agenda] ADD CONSTRAINT [FK_Agenda_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Agenda] ADD CONSTRAINT [FK_Agenda_Reserva] 
	FOREIGN KEY ([IdRes]) REFERENCES [Reserva] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [Cliente] ADD CONSTRAINT [FK_Cliente_Persona] 
	FOREIGN KEY ([CI]) REFERENCES [dbo].[Persona] ([CI])
	ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE [dbo].[Cobros] ADD CONSTRAINT [FK_Pagos_Contrato] 
	FOREIGN KEY ([IdCont]) REFERENCES [dbo].[Contrato] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [ComponentePaquete] ADD CONSTRAINT [FK_ComponentePaquete_CategoriaComponente] 
	FOREIGN KEY ([IdCC]) REFERENCES [CategoriaComponente] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Contrato] ADD CONSTRAINT [FK_Contrato_Cliente] 
	FOREIGN KEY ([CIC]) REFERENCES [Cliente] ([CI])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Contrato] ADD CONSTRAINT [FK_Contrato_Empleado] 
	FOREIGN KEY ([CIE]) REFERENCES [dbo].[Empleado] ([CI])
	ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE [dbo].[Contrato] ADD CONSTRAINT [FK_Contrato_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Contrato] ADD CONSTRAINT [FK_Contrato_Paquete] 
	FOREIGN KEY ([IdPaq]) REFERENCES [dbo].[Paquete] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [Direcciones] ADD CONSTRAINT [FK_Direcciones_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Empleado] ADD CONSTRAINT [FK_Empleado_Persona] 
	FOREIGN KEY ([CI]) REFERENCES [dbo].[Persona] ([CI])
	ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE [dbo].[Empleado] ADD CONSTRAINT [FK_Empleado_CargoLaboral] 
	FOREIGN KEY ([IdCL]) REFERENCES [CargoLaboral] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Equipo] ADD CONSTRAINT [FK_Equipo_TE] 
	FOREIGN KEY ([IdTE]) REFERENCES [dbo].[TipoEquipo] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Evento] ADD CONSTRAINT [FK_Evento_TipoEvento] 
	FOREIGN KEY ([IdTE]) REFERENCES [TipoEvento] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [FichaDatos] ADD CONSTRAINT [FK_FichaDatos_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [IncluyePC] ADD CONSTRAINT [FK_IncluyePC_ComponentePaquete] 
	FOREIGN KEY ([IdCP]) REFERENCES [ComponentePaquete] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [IncluyePC] ADD CONSTRAINT [FK_IncluyePC_Paquete] 
	FOREIGN KEY ([IdPaq]) REFERENCES [dbo].[Paquete] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [OrdenTrabajo] ADD CONSTRAINT [FK_OrdenTrabajo_Empleado] 
	FOREIGN KEY ([CIE]) REFERENCES [dbo].[Empleado] ([CI])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [OrdenTrabajo] ADD CONSTRAINT [FK_OrdenTrabajo_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [UtilizaEE] ADD CONSTRAINT [FK_UtilizaEE_Equipo] 
	FOREIGN KEY ([IdEq]) REFERENCES [dbo].[Equipo] )
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [UtilizaEE] ADD CONSTRAINT [FK_UtilizaEE_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] )
	ON DELETE CASCADE ON UPDATE CASCADE;




INSERT INTO CargoLaboral VALUES('GERENTE')
INSERT INTO CargoLaboral VALUES('ADMINISTRADOR')
INSERT INTO CargoLaboral VALUES('SECRETARIA')

SELECT *FROM CargoLaboral

INSERT [TipoEvento]  VALUES ( N'Evento_15_años')
INSERT [TipoEvento]  VALUES ( N'Evento_Bautiso')
INSERT [TipoEvento]  VALUES ( N'Evento_corporativo')
INSERT [TipoEvento]  VALUES ( N'Evento_Matrimonio')
SELECT *FROM TipoEvento


INSERT [TipoEquipo]  VALUES ( N'Camara_Filmadora')
INSERT [TipoEquipo]  VALUES ( N'Camara_Fotografica')
INSERT [TipoEquipo]  VALUES ( N'Luces')
SELECT *FROM TipoEquipo
SELECT *FROM TipoEvento




INSERT [Reserva]   VALUES (123, CAST(0xF3360B00 AS Date), CAST(0xF9360B00 AS Date), NULL, N'JUAN', N'15_años')
INSERT [Reserva]   VALUES (124, CAST(0x14370B00 AS Date), CAST(0x15370B00 AS Date), NULL, N'LORENA', N'Bautiso')
INSERT [Reserva]   VALUES (147, CAST(0x6C370B00 AS Date), CAST(0x6E370B00 AS Date), NULL, N'CLAUDIA', N'Matrimonio_Civil')
INSERT [Reserva]   VALUES (155, CAST(0x9C360B00 AS Date), CAST(0x9F360B00 AS Date), NULL, N'LEONEL', N'Bautiso')
--INSERT [Reserva]   VALUES (123, CAST (15-04-2013 AS DATE),CAST( 20-04-2013 AS DATE), NULL, N'JUAN', N'15_años')

SELECT *FROM Reserva

INSERT [Persona]  VALUES (N'10000', N'DIANE', N'LOPEZ', N'FLAMAND', N'IRALA 41', 1, N'3444444', N'DIANE@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10001', N'PEDRO', N'ARDAYA', N'FLORES', N'AV.MOSCU', 0, N'3557896', N'PEDRO@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10002', N'JESUS', N'MOTAÑO', N'MANSILLA', N'AV.PALMAR', 0, N'3584217', N'JESUS@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10003', N'KEVIN', N'CHOQUE', N'SAUSEDO', N'CAÑOTO 145', 0, N'3555555', N'KEVIN@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10004', N'JENNIFER', N'VILLARUEL', N'NAVARRO', N'SEOANE 200', 1, N'3666666', N'JENNIFER@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10005', N'ROSARIO', N'PAÑAGUA', N'KALAMBAY', N'AV.PARAGUAY 27', 1, N'3777777', N'ROSARIO@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10006', N'JUAN', N'BURROWS', N'MELGAR', N'AV.RAFAEL PEÑA 17', 0, N'3888888', N'JUAN@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10007', N'ROBERT', N'AGUILERA', N'RAMIRES', N'AV.CUMAVI', 0, N'3858587', N'ROBET@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10008', N'LORENA', N'YAPIRE', N'AKUÑA', N'B/LOS LOTES', 1, N'3979641', N'AKUÑA@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10009', N'LUIS', N'SALVATIERA', N'SALAS', N'AV.EQUIPETROL', 0, N'3875269', N'LUIS@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10010', N'ANA', N'GOSALES', N'PEREDO', N'B/LOS ANGLES', 1, N'3546789', N'ANA@HOTMAIL.COM')
INSERT [Persona]  VALUES (N'10011', N'JOSE', N'FERNANDEZ', N'TROPET', N'AV.PARAISO', 0, N'3584217', N'JOSE@HOTMAIL.COM')

SELECT *FROM Persona





--INSERT [Evento] ([Id], [Fecha], [Descripcion], [Hora], [IdTE], [Latitub], [Longitud]) VALUES (21, CAST(0xF9360B00 AS Date), N'Filmacion', CAST(0x07002058A3A70000 AS Time), 111, NULL, NULL)
--INSERT [Evento] ([Id], [Fecha], [Descripcion], [Hora], [IdTE], [Latitub], [Longitud]) VALUES (22, CAST(0x15370B00 AS Date), N'Fototografia', CAST(0x0700E80A7E8E0000 AS Time), 222, NULL, NULL)
--INSERT [Evento] ([Id], [Fecha], [Descripcion], [Hora], [IdTE], [Latitub], [Longitud]) VALUES (23, CAST(0x6E370B00 AS Date), N'Fotografia', CAST(0x0700B893419F0000 AS Time), 333, NULL, NULL)
--INSERT [Evento] ([Id], [Fecha], [Descripcion], [Hora], [IdTE], [Latitub], [Longitud]) VALUES (24, CAST(0x9F360B00 AS Date), N'Filmacion', CAST(0x0700881C05B00000 AS Time), 444, NULL, NULL)

INSERT [Paquete]   VALUES ( N'Plata',1500,0,1500, 0)
INSERT [Paquete]   VALUES ( N'Oro', 2100,0,2100,0)
INSERT [Paquete]   VALUES ( N'Platino',2500,0,2500, 0)

select * from Paquete
--delete from Paquete where Id=5



INSERT [CategoriaComponente]  VALUES ( N'Edicion')
INSERT [CategoriaComponente]  VALUES ( N'Filmacion')
INSERT [CategoriaComponente]  VALUES ( N'Fotografia')
select * from CategoriaComponente
select * from Paquete






INSERT [Cliente]  VALUES (N'10006', CAST(0xF3360B00 AS Date))
INSERT [Cliente]  VALUES (N'10007', CAST(0x14370B00 AS Date))
INSERT [Cliente]  VALUES (N'10008', CAST(0x6C370B00 AS Date))
INSERT [Cliente]  VALUES (N'10010', CAST(0x9C360B00 AS Date))
INSERT [Cliente]  VALUES (N'10011', CAST(0x45370B00 AS Date))
INSERT [Cliente]  VALUES (N'10002',02-06-2013)
select *from Cliente




INSERT [ComponentePaquete]   VALUES ( N'Plata', 1500, 0,4)
INSERT [ComponentePaquete]   VALUES ( N'Oro', 2100, 0,3)
INSERT [ComponentePaquete]   VALUES ( N'Platino',2500, 0,4 )

--DELETE FROM ComponentePaquete WHERE Id=25
SELECT *FROM  ComponentePaquete


--NODA
INSERT [Evento]   VALUES (21, CAST(0xF9360B00 AS Date), N'Filmacion', CAST(0x07002058A3A70000 AS Time),1, NULL, NULL)
INSERT [Evento]   VALUES (22, CAST(0x15370B00 AS Date), N'Fototografia', CAST(0x0700E80A7E8E0000 AS Time),3, NULL, NULL)
INSERT [Evento]   VALUES (23, CAST(0x6E370B00 AS Date), N'Fotografia', CAST(0x0700B893419F0000 AS Time), 4,NULL, NULL)
INSERT [Evento]   VALUES (24, CAST(0x9F360B00 AS Date), N'Filmacion', CAST(0x0700881C05B00000 AS Time), 5,NULL, NULL)
--INSERT Evento VALUES (21,01-05-2013,'FILMACION',14,1,NULL)

--DELETE FROM Evento WHERE Id=21
SELECT *FROM Evento
SELECT *FROM Equipo


INSERT [Equipo]  VALUES ( N'CAMARA_FILMADORA', N'SONY', 0,1)
INSERT [Equipo]  VALUES ( N'TRIPO', N'SHURE', 0,2)
SELECT *FROM Equipo



INSERT [Empleado]  VALUES (N'10000', 1, CAST(0xF3060B00 AS Date), 2000, CAST(0xC8320B00 AS Date))
INSERT [Empleado]  VALUES (N'10003', 2, CAST(0xF6F90A00 AS Date), 2500, CAST(0xE6320B00 AS Date))
INSERT [Empleado]  VALUES (N'10004', 3, CAST(0x32FA0A00 AS Date), 2100, CAST(0xCB370B00 AS Date))
INSERT [Empleado]  VALUES (N'10005', 2, CAST(0x1A080B00 AS Date), 2500, CAST(0x99360B00 AS Date))
--INSERT Empleado VALUES('10002',2,08-04-1999,2000,20-05-2005)

SELECT *FROM Empleado



INSERT [UtilizaEE]  VALUES (21, 1)
INSERT [UtilizaEE]  VALUES (22, 2)
INSERT [UtilizaEE]  VALUES (23, 1)
INSERT [UtilizaEE]  VALUES (24, 2)
SELECT *FROM UtilizaEE




INSERT [OrdenTrabajo]  VALUES (N'10000', 21, N'FILAMCION', CAST(0xF9360B00 AS Date), CAST(0x01370B00 AS Date),  N'Inicio', 0)
INSERT [OrdenTrabajo]  VALUES (N'10003', 22, N'Fotografia', CAST(0x15370B00 AS Date), CAST(0x19370B00 AS Date), N'terminado', 100)
INSERT [OrdenTrabajo]  VALUES (N'10004', 23, N'Fotografia', CAST(0x6E370B00 AS Date), CAST(0x71370B00 AS Date), N'proceso', 60)
INSERT [OrdenTrabajo]  VALUES (N'10005', 24, N'Filmacion', CAST(0x9F360B00 AS Date), CAST(0x6C370B00 AS Date),  N'Terminado', 100)
select *from OrdenTrabajo




INSERT [IncluyePC]  VALUES (4, 32,1)
INSERT [IncluyePC]  VALUES (6, 36,4)
INSERT [IncluyePC]  VALUES (14, 37,8)
select * from IncluyePC



INSERT [FichaDatos]   VALUES (201, 21, N'15_años')
INSERT [FichaDatos]   VALUES (202, 22, N'Bautiso')
INSERT [FichaDatos]   VALUES (203, 23, N'Matrimonio_Civil')
INSERT [FichaDatos]   VALUES (204, 24, N'Bautiso')
select *from FichaDatos 


INSERT [Direcciones]  VALUES (21, N'Edifico_Oquidia', N'av.montero y seguane#100')
INSERT [Direcciones]  VALUES (22, N'Salon _Evento _Telchi', N'av.santigo #98')
INSERT [Direcciones]  VALUES (23, N'Salon_Evento_Lopez', N'barrio cañoto #133')
INSERT [Direcciones]  VALUES (24, N'Edificon_Salina', N'av.general#450')
select * from Direcciones


INSERT [Contrato]  VALUES (101,  900, 400, 500, CAST(0xF3360B00 AS Date), N'Ninguna', N'10000', N'10010', 4, 21)
INSERT [Contrato]  VALUES (102,  700, 300, 400, CAST(0x14370B00 AS Date), N'Ninguna', N'10003', N'10008', 6, 22)
INSERT [Contrato]  VALUES (103,  1500, 700, 800, CAST(0x6C370B00 AS Date), N'Ninguna', N'10004', N'10007', 14, 23)
select * from Contrato





INSERT [Agenda]   VALUES ( 123,21, CAST(0xF9360B00 AS Date))
INSERT [Agenda]   VALUES ( 124,22, CAST(0x15370B00 AS Date))
INSERT [Agenda]   VALUES ( 147,23, CAST(0x6E370B00 AS Date))
INSERT [Agenda]   VALUES ( 155,24, CAST(0x9F360B00 AS Date))

SELECT * FROM Agenda



INSERT [Cobros]  VALUES (1, 101, N'BURROWS', CAST(900.00 AS Decimal(10, 2)), CAST(0xF7360B00 AS Date), CAST(0x070080461C860000 AS Time))
INSERT [Cobros]  VALUES (2, 102, N'AGUILERA', CAST(700.00 AS Decimal(10, 2)), CAST(0x14370B00 AS Date), CAST(0x07007870335C0000 AS Time))
INSERT [Cobros]  VALUES (3, 103, N'YAPIRE', CAST(1500.00 AS Decimal(10, 2)), CAST(0x6D370B00 AS Date), CAST(0x0700448E02580000 AS Time))
SELECT *FROM Cobros
