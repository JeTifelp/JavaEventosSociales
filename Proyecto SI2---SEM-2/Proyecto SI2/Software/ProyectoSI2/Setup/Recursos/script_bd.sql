IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Agenda_Evento]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Agenda] DROP CONSTRAINT [FK_Agenda_Evento];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Agenda_Reserva]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Agenda] DROP CONSTRAINT [FK_Agenda_Reserva];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Cliente_Persona]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [Cliente] DROP CONSTRAINT [FK_Cliente_Persona];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Cobros_Empleado]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Cobros] DROP CONSTRAINT [FK_Cobros_Empleado];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Pagos_Contrato]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Cobros] DROP CONSTRAINT [FK_Pagos_Contrato];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_ComponentePaquete_CategoriaComponente]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [ComponentePaquete] DROP CONSTRAINT [FK_ComponentePaquete_CategoriaComponente];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Contrato_Cliente]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Contrato] DROP CONSTRAINT [FK_Contrato_Cliente];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Contrato_Empleado]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Contrato] DROP CONSTRAINT [FK_Contrato_Empleado];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Contrato_Evento]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Contrato] DROP CONSTRAINT [FK_Contrato_Evento];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Contrato_Paquete]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Contrato] DROP CONSTRAINT [FK_Contrato_Paquete];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Direcciones_Evento]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [Direcciones] DROP CONSTRAINT [FK_Direcciones_Evento];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Empleado_Persona]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Empleado] DROP CONSTRAINT [FK_Empleado_Persona];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Empleado_CargoLaboral]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Empleado] DROP CONSTRAINT [FK_Empleado_CargoLaboral];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Equipo_TE]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Equipo] DROP CONSTRAINT [FK_Equipo_TE];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_Evento_TipoEvento]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [dbo].[Evento] DROP CONSTRAINT [FK_Evento_TipoEvento];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_FichaDatos_Evento]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [FichaDatos] DROP CONSTRAINT [FK_FichaDatos_Evento];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_IncluyePC_ComponentePaquete]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [IncluyePC] DROP CONSTRAINT [FK_IncluyePC_ComponentePaquete];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_IncluyePC_Paquete]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [IncluyePC] DROP CONSTRAINT [FK_IncluyePC_Paquete];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_OrdenTrabajo_Empleado]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [OrdenTrabajo] DROP CONSTRAINT [FK_OrdenTrabajo_Empleado];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_OrdenTrabajo_Evento]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [OrdenTrabajo] DROP CONSTRAINT [FK_OrdenTrabajo_Evento];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_UtilizaEE_Equipo]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [UtilizaEE] DROP CONSTRAINT [FK_UtilizaEE_Equipo];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FK_UtilizaEE_Evento]') AND OBJECTPROPERTY(id, 'IsForeignKey') = 1)
ALTER TABLE [UtilizaEE] DROP CONSTRAINT [FK_UtilizaEE_Evento];



IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[dbo].[Agenda]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [dbo].[Agenda];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[CargoLaboral]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [CargoLaboral];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[CategoriaComponente]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [CategoriaComponente];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[Cliente]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [Cliente];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[dbo].[Cobros]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [dbo].[Cobros];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[ComponentePaquete]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [ComponentePaquete];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[dbo].[Contrato]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [dbo].[Contrato];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[Direcciones]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [Direcciones];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[dbo].[Empleado]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [dbo].[Empleado];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[dbo].[Equipo]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [dbo].[Equipo];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[dbo].[Evento]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [dbo].[Evento];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[FichaDatos]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [FichaDatos];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[IncluyePC]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [IncluyePC];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[OrdenTrabajo]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [OrdenTrabajo];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[dbo].[Paquete]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [dbo].[Paquete];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[dbo].[Persona]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [dbo].[Persona];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[Reserva]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [Reserva];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[dbo].[TipoEquipo]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [dbo].[TipoEquipo];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[TipoEvento]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [TipoEvento];

IF EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id('[UtilizaEE]') AND  OBJECTPROPERTY(id, 'IsUserTable') = 1)
DROP TABLE [UtilizaEE];


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
	[Hora] time(7) NOT NULL,
	[CIE] varchar(10) NOT NULL
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
	PRIMARY KEY CLUSTERED ([Id]);

ALTER TABLE [CargoLaboral] ADD CONSTRAINT [PK_CargoLaboral] 
	PRIMARY KEY CLUSTERED ([Id]);

ALTER TABLE [CategoriaComponente] ADD CONSTRAINT [PK_CategoriaComponente] 
	PRIMARY KEY CLUSTERED ([Id]);

ALTER TABLE [Cliente] ADD CONSTRAINT [PK_Cliente] 
	PRIMARY KEY CLUSTERED ([CI]);

ALTER TABLE [dbo].[Cobros] ADD CONSTRAINT [PK_Pagos] 
	PRIMARY KEY CLUSTERED ([Nro]);

ALTER TABLE [ComponentePaquete] ADD CONSTRAINT [PK_ComponentePaquete] 
	PRIMARY KEY CLUSTERED ([Id]);

ALTER TABLE [dbo].[Contrato] ADD CONSTRAINT [PK_Contrato] 
	PRIMARY KEY CLUSTERED ([Id]);

ALTER TABLE [Direcciones] ADD CONSTRAINT [PK_Direcciones] 
	PRIMARY KEY CLUSTERED ([IdEven], [Descripcion]);

ALTER TABLE [dbo].[Empleado] ADD CONSTRAINT [PK_Empleado] 
	PRIMARY KEY CLUSTERED ([CI]);

ALTER TABLE [dbo].[Equipo] ADD CONSTRAINT [PK_Equipo] 
	PRIMARY KEY CLUSTERED ([Id]);

ALTER TABLE [dbo].[Evento] ADD CONSTRAINT [PK_Evento] 
	PRIMARY KEY CLUSTERED ([Id]);

ALTER TABLE [FichaDatos] ADD CONSTRAINT [PK_FichaDatos] 
	PRIMARY KEY CLUSTERED ([IdEven], [Id]);

ALTER TABLE [IncluyePC] ADD CONSTRAINT [PK_IncluyePC] 
	PRIMARY KEY CLUSTERED ([IdPaq], [IdCP]);

ALTER TABLE [OrdenTrabajo] ADD CONSTRAINT [PK_OrdenTrabajo] 
	PRIMARY KEY CLUSTERED ([CIE], [IdEven]);

ALTER TABLE [dbo].[Paquete] ADD CONSTRAINT [PK_Paquete] 
	PRIMARY KEY CLUSTERED ([Id]);

ALTER TABLE [dbo].[Persona] ADD CONSTRAINT [PK_Persona] 
	PRIMARY KEY CLUSTERED ([CI]);

ALTER TABLE [Reserva] ADD CONSTRAINT [PK_Reserva] 
	PRIMARY KEY CLUSTERED ([Id]);

ALTER TABLE [dbo].[TipoEquipo] ADD CONSTRAINT [PK_TipoEquipo] 
	PRIMARY KEY CLUSTERED ([Id]);

ALTER TABLE [TipoEvento] ADD CONSTRAINT [PK_TipoEvento] 
	PRIMARY KEY CLUSTERED ([Id]);

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

ALTER TABLE [dbo].[TipoEquipo]
	ADD CONSTRAINT [UQ_TipoEquipo] UNIQUE ([Nombre]);

ALTER TABLE [TipoEvento]
	ADD CONSTRAINT [UQ_TipoEvento_Nombre] UNIQUE ([Nombre]);


ALTER TABLE [dbo].[Agenda] ADD CONSTRAINT [FK_Agenda_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Agenda] ADD CONSTRAINT [FK_Agenda_Reserva] 
	FOREIGN KEY ([IdRes]) REFERENCES [Reserva] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [Cliente] ADD CONSTRAINT [FK_Cliente_Persona] 
	FOREIGN KEY ([CI]) REFERENCES [dbo].[Persona] ([CI])
	ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE [dbo].[Cobros] ADD CONSTRAINT [FK_Cobros_Empleado] 
	FOREIGN KEY ([CIE]) REFERENCES [dbo].[Empleado] ([CI])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Cobros] ADD CONSTRAINT [FK_Pagos_Contrato] 
	FOREIGN KEY ([IdCont]) REFERENCES [dbo].[Contrato] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [ComponentePaquete] ADD CONSTRAINT [FK_ComponentePaquete_CategoriaComponente] 
	FOREIGN KEY ([IdCC]) REFERENCES [CategoriaComponente] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Contrato] ADD CONSTRAINT [FK_Contrato_Cliente] 
	FOREIGN KEY ([CIC]) REFERENCES [Cliente] ([CI])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Contrato] ADD CONSTRAINT [FK_Contrato_Empleado] 
	FOREIGN KEY ([CIE]) REFERENCES [dbo].[Empleado] ([CI])
	ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE [dbo].[Contrato] ADD CONSTRAINT [FK_Contrato_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Contrato] ADD CONSTRAINT [FK_Contrato_Paquete] 
	FOREIGN KEY ([IdPaq]) REFERENCES [dbo].[Paquete] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [Direcciones] ADD CONSTRAINT [FK_Direcciones_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Empleado] ADD CONSTRAINT [FK_Empleado_Persona] 
	FOREIGN KEY ([CI]) REFERENCES [dbo].[Persona] ([CI])
	ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE [dbo].[Empleado] ADD CONSTRAINT [FK_Empleado_CargoLaboral] 
	FOREIGN KEY ([IdCL]) REFERENCES [CargoLaboral] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Equipo] ADD CONSTRAINT [FK_Equipo_TE] 
	FOREIGN KEY ([IdTE]) REFERENCES [dbo].[TipoEquipo] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [dbo].[Evento] ADD CONSTRAINT [FK_Evento_TipoEvento] 
	FOREIGN KEY ([IdTE]) REFERENCES [TipoEvento] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [FichaDatos] ADD CONSTRAINT [FK_FichaDatos_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [IncluyePC] ADD CONSTRAINT [FK_IncluyePC_ComponentePaquete] 
	FOREIGN KEY ([IdCP]) REFERENCES [ComponentePaquete] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [IncluyePC] ADD CONSTRAINT [FK_IncluyePC_Paquete] 
	FOREIGN KEY ([IdPaq]) REFERENCES [dbo].[Paquete] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [OrdenTrabajo] ADD CONSTRAINT [FK_OrdenTrabajo_Empleado] 
	FOREIGN KEY ([CIE]) REFERENCES [dbo].[Empleado] ([CI])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [OrdenTrabajo] ADD CONSTRAINT [FK_OrdenTrabajo_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [UtilizaEE] ADD CONSTRAINT [FK_UtilizaEE_Equipo] 
	FOREIGN KEY ([IdEq]) REFERENCES [dbo].[Equipo] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE [UtilizaEE] ADD CONSTRAINT [FK_UtilizaEE_Evento] 
	FOREIGN KEY ([IdEven]) REFERENCES [dbo].[Evento] ([Id])
	ON DELETE CASCADE ON UPDATE CASCADE;
