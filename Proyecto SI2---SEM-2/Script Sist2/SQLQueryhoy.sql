USE [ESTUDIO1]
GO
/****** Object:  Table [dbo].[TipoEvento]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TipoEvento](
	[Id] [smallint] NOT NULL,
	[Nombre] [varchar](20) NOT NULL,
 CONSTRAINT [PK_TipoEvento] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [UQ_TipoEvento_Nombre] UNIQUE NONCLUSTERED 
(
	[Nombre] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[TipoEvento] ([Id], [Nombre]) VALUES (333, N'Evento_15_años')
INSERT [dbo].[TipoEvento] ([Id], [Nombre]) VALUES (222, N'Evento_Bautiso')
INSERT [dbo].[TipoEvento] ([Id], [Nombre]) VALUES (444, N'Evento_corporativo')
INSERT [dbo].[TipoEvento] ([Id], [Nombre]) VALUES (111, N'Evento_Matrimonio')

SELECT *FROM TipoEvento
/****** Object:  Table [dbo].[TipoEquipo]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TipoEquipo](
	[Id] [smallint] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](30) NOT NULL,
 CONSTRAINT [PK_TipoEquipo] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [UQ_TipoEquipo] UNIQUE NONCLUSTERED 
(
	[Nombre] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[TipoEquipo] ON
INSERT [dbo].[TipoEquipo] ([Id], [Nombre]) VALUES (5, N'Camara_Filmadora')
INSERT [dbo].[TipoEquipo] ([Id], [Nombre]) VALUES (3, N'Camara_Fotografica')
INSERT [dbo].[TipoEquipo] ([Id], [Nombre]) VALUES (4, N'Luces')
SET IDENTITY_INSERT [dbo].[TipoEquipo] OFF
SELECT * FROM TipoEquipo 
/****** Object:  Table [dbo].[Reserva]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Reserva](
	[Id] [int] NOT NULL,
	[FechaR] [date] NOT NULL,
	[FechaE] [date] NOT NULL,
	[DiasEspera] [smallint] NULL,
	[Interasado] [varchar](max) NOT NULL,
	[Descripcion] [varchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Reserva] ([Id], [FechaR], [FechaE], [DiasEspera], [Interasado], [Descripcion]) VALUES (123, CAST(0xF3360B00 AS Date), CAST(0xF9360B00 AS Date), NULL, N'JUAN', N'15_años')
INSERT [dbo].[Reserva] ([Id], [FechaR], [FechaE], [DiasEspera], [Interasado], [Descripcion]) VALUES (124, CAST(0x14370B00 AS Date), CAST(0x15370B00 AS Date), NULL, N'LORENA', N'Bautiso')
INSERT [dbo].[Reserva] ([Id], [FechaR], [FechaE], [DiasEspera], [Interasado], [Descripcion]) VALUES (147, CAST(0x6C370B00 AS Date), CAST(0x6E370B00 AS Date), NULL, N'CLAUDIA', N'Matrimonio_Civil')
INSERT [dbo].[Reserva] ([Id], [FechaR], [FechaE], [DiasEspera], [Interasado], [Descripcion]) VALUES (155, CAST(0x9C360B00 AS Date), CAST(0x9F360B00 AS Date), NULL, N'LEONEL', N'Bautiso')
/****** Object:  Table [dbo].[Persona]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
SELECT *FROM Reserva
CREATE TABLE [dbo].[Persona](
	[CI] [varchar](10) NOT NULL,
	[Nombre] [varchar](30) NOT NULL,
	[APellidoP] [varchar](20) NOT NULL,
	[APellidoM] [varchar](20) NULL,
	[Direccion] [varchar](max) NULL,
	[Sexo] [bit] NOT NULL,
	[Telefono] [varchar](15) NULL,
	[Email] [varchar](100) NOT NULL,
 CONSTRAINT [PK_Persona] PRIMARY KEY CLUSTERED 
(
	[CI] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [UQ_Persona_Email] UNIQUE NONCLUSTERED 
(
	[Email] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10000', N'DIANE', N'LOPEZ', N'FLAMAND', N'IRALA 41', 1, N'3444444', N'DIANE@HOTMAIL.COM')
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10001', N'PEDRO', N'ARDAYA', N'FLORES', N'AV.MOSCU', 0, N'3557896', N'PEDRO@HOTMAIL.COM')
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10003', N'KEVIN', N'CHOQUE', N'SAUSEDO', N'CAÑOTO 145', 0, N'3555555', N'KEVIN@HOTMAIL.COM')
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10004', N'JENNIFER', N'VILLARUEL', N'NAVARRO', N'SEOANE 200', 1, N'3666666', N'JENNIFER@HOTMAIL.COM')
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10005', N'ROSARIO', N'PAÑAGUA', N'KALAMBAY', N'AV.PARAGUAY 27', 1, N'3777777', N'ROSARIO@HOTMAIL.COM')
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10006', N'JUAN', N'BURROWS', N'MELGAR', N'AV.RAFAEL PEÑA 17', 0, N'3888888', N'JUAN@HOTMAIL.COM')
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10007', N'ROBERT', N'AGUILERA', N'RAMIRES', N'AV.CUMAVI', 0, N'3858587', N'ROBET@HOTMAIL.COM')
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10008', N'LORENA', N'YAPIRE', N'AKUÑA', N'B/LOS LOTES', 1, N'3979641', N'AKUÑA@HOTMAIL.COM')
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10009', N'LUIS', N'SALVATIERA', N'SALAS', N'AV.EQUIPETROL', 0, N'3875269', N'LUIS@HOTMAIL.COM')
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10010', N'ANA', N'GOSALES', N'PEREDO', N'B/LOS ANGLES', 1, N'3546789', N'ANA@HOTMAIL.COM')
INSERT [dbo].[Persona] ([CI], [Nombre], [APellidoP], [APellidoM], [Direccion], [Sexo], [Telefono], [Email]) VALUES (N'10011', N'JOSE', N'FERNANDEZ', N'TROPET', N'AV.PARAISO', 0, N'3584217', N'JOSE@HOTMAIL.COM')
/****** Object:  Table [dbo].[Paquete]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
SELECT *FROM Persona
CREATE TABLE [dbo].[Paquete](
	[Id] [int] NOT NULL,
	[Nombre] [varchar](50) NOT NULL,
	[Precio] [decimal](10, 2) NOT NULL,
	[Descuento] [decimal](10, 2) NOT NULL,
	[PrecioTotal] [decimal](10, 2) NOT NULL,
	[TipoPaquete] [bit] NOT NULL,
 CONSTRAINT [PK_Paquete] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Paquete] ([Id], [Nombre], [Precio], [Descuento], [PrecioTotal], [TipoPaquete]) VALUES (200, N'Plata', CAST(1500.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(10, 2)), CAST(1500.00 AS Decimal(10, 2)), 0)
INSERT [dbo].[Paquete] ([Id], [Nombre], [Precio], [Descuento], [PrecioTotal], [TipoPaquete]) VALUES (201, N'Oro', CAST(2100.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(10, 2)), CAST(2100.00 AS Decimal(10, 2)), 0)
INSERT [dbo].[Paquete] ([Id], [Nombre], [Precio], [Descuento], [PrecioTotal], [TipoPaquete]) VALUES (203, N'Platino', CAST(2500.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(10, 2)), CAST(2500.00 AS Decimal(10, 2)), 0)
INSERT [dbo].[Paquete] ([Id], [Nombre], [Precio], [Descuento], [PrecioTotal], [TipoPaquete]) VALUES (204, N'Plata', CAST(1500.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(10, 2)), CAST(1500.00 AS Decimal(10, 2)), 0)
INSERT [dbo].[Paquete] ([Id], [Nombre], [Precio], [Descuento], [PrecioTotal], [TipoPaquete]) VALUES (205, N'Oro', CAST(2100.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(10, 2)), CAST(2100.00 AS Decimal(10, 2)), 0)
INSERT [dbo].[Paquete] ([Id], [Nombre], [Precio], [Descuento], [PrecioTotal], [TipoPaquete]) VALUES (206, N'Platino', CAST(2500.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(10, 2)), CAST(2500.00 AS Decimal(10, 2)), 0)
/****** Object:  Table [dbo].[CategoriaComponente]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
SELECT *FROM Paquete
CREATE TABLE [dbo].[CategoriaComponente](
	[Id] [smallint] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](50) NOT NULL,
 CONSTRAINT [PK_CategoriaComponente] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [UQ_CategoriaComponente_Nombre] UNIQUE NONCLUSTERED 
(
	[Nombre] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[CategoriaComponente] ON
INSERT [dbo].[CategoriaComponente] ([Id], [Nombre]) VALUES (22, N'Edicion')
INSERT [dbo].[CategoriaComponente] ([Id], [Nombre]) VALUES (17, N'Filmacion')
INSERT [dbo].[CategoriaComponente] ([Id], [Nombre]) VALUES (18, N'Fotografia')
SET IDENTITY_INSERT [dbo].[CategoriaComponente] OFF


SELECT *FROM CategoriaComponente
/****** Object:  Table [dbo].[CargoLaboral]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[CargoLaboral](
	[Id] [smallint] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](30) NOT NULL,
 CONSTRAINT [PK_CargoLaboral] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [UQ_CargoLaboral_Nombre] UNIQUE NONCLUSTERED 
(
	[Nombre] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[CargoLaboral] ON
INSERT [dbo].[CargoLaboral] ([Id], [Nombre]) VALUES (2, N'ADMINISTRADOR')
INSERT [dbo].[CargoLaboral] ([Id], [Nombre]) VALUES (1, N'GERENTE')
INSERT [dbo].[CargoLaboral] ([Id], [Nombre]) VALUES (3, N'SECRETARIA')
SET IDENTITY_INSERT [dbo].[CargoLaboral] OFF

SELECT *FROM CargoLaboral


/****** Object:  Table [dbo].[Cliente]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Cliente](
	[CI] [varchar](10) NOT NULL,
	[FechaReg] [date] NOT NULL,
 CONSTRAINT [PK_Cliente] PRIMARY KEY CLUSTERED 
(
	[CI] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Cliente] ([CI], [FechaReg]) VALUES (N'10006', CAST(0xF3360B00 AS Date))
INSERT [dbo].[Cliente] ([CI], [FechaReg]) VALUES (N'10007', CAST(0x14370B00 AS Date))
INSERT [dbo].[Cliente] ([CI], [FechaReg]) VALUES (N'10008', CAST(0x6C370B00 AS Date))
INSERT [dbo].[Cliente] ([CI], [FechaReg]) VALUES (N'10010', CAST(0x9C360B00 AS Date))
INSERT [dbo].[Cliente] ([CI], [FechaReg]) VALUES (N'10011', CAST(0x45370B00 AS Date))



SELECT *FROM Cliente



/****** Object:  Table [dbo].[ComponentePaquete]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ComponentePaquete](
	[Id] [smallint] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](50) NOT NULL,
	[Precio] [decimal](10, 2) NOT NULL,
	[Tipo] [bit] NOT NULL,
	[IdCC] [smallint] NOT NULL,
 CONSTRAINT [PK_ComponentePaquete] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [UQ_ComponentePaquete_Nombre] UNIQUE NONCLUSTERED 
(
	[Nombre] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[ComponentePaquete] ON
INSERT [dbo].[ComponentePaquete] ([Id], [Nombre], [Precio], [Tipo], [IdCC]) VALUES (1, N'Plata', CAST(1500.00 AS Decimal(10, 2)), 0, 22)
INSERT [dbo].[ComponentePaquete] ([Id], [Nombre], [Precio], [Tipo], [IdCC]) VALUES (2, N'Oro', CAST(2100.00 AS Decimal(10, 2)), 0, 17)
INSERT [dbo].[ComponentePaquete] ([Id], [Nombre], [Precio], [Tipo], [IdCC]) VALUES (3, N'Platino', CAST(2500.00 AS Decimal(10, 2)), 0, 18)
SET IDENTITY_INSERT [dbo].[ComponentePaquete] OFF


SELECT *FROM ComponentePaquete

/****** Object:  Table [dbo].[Evento]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Evento](
	[Id] [int] NOT NULL,
	[Fecha] [date] NULL,
	[Descripcion] [varchar](max) NOT NULL,
	[Hora] [time](7) NOT NULL,
	[IdTE] [smallint] NOT NULL,
	[Latitub] [decimal](15, 3) NULL,
	[Longitud] [decimal](15, 3) NULL,
 CONSTRAINT [PK_Evento] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Evento] ([Id], [Fecha], [Descripcion], [Hora], [IdTE], [Latitub], [Longitud]) VALUES (21, CAST(0xF9360B00 AS Date), N'Filmacion', CAST(0x07002058A3A70000 AS Time), 111, NULL, NULL)
INSERT [dbo].[Evento] ([Id], [Fecha], [Descripcion], [Hora], [IdTE], [Latitub], [Longitud]) VALUES (22, CAST(0x15370B00 AS Date), N'Fototografia', CAST(0x0700E80A7E8E0000 AS Time), 222, NULL, NULL)
INSERT [dbo].[Evento] ([Id], [Fecha], [Descripcion], [Hora], [IdTE], [Latitub], [Longitud]) VALUES (23, CAST(0x6E370B00 AS Date), N'Fotografia', CAST(0x0700B893419F0000 AS Time), 333, NULL, NULL)
INSERT [dbo].[Evento] ([Id], [Fecha], [Descripcion], [Hora], [IdTE], [Latitub], [Longitud]) VALUES (24, CAST(0x9F360B00 AS Date), N'Filmacion', CAST(0x0700881C05B00000 AS Time), 444, NULL, NULL)


SELECT *FROM Evento


/****** Object:  Table [dbo].[Equipo]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Equipo](
	[Id] [smallint] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](50) NOT NULL,
	[Descripcion] [varchar](50) NULL,
	[Estado] [bit] NOT NULL,
	[IdTE] [smallint] NOT NULL,
 CONSTRAINT [PK_Equipo] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [UQ_Equipo] UNIQUE NONCLUSTERED 
(
	[Nombre] ASC,
	[IdTE] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Equipo] ON
INSERT [dbo].[Equipo] ([Id], [Nombre], [Descripcion], [Estado], [IdTE]) VALUES (6, N'CAMARA_FILMADORA', N'SONY', 0, 3)
INSERT [dbo].[Equipo] ([Id], [Nombre], [Descripcion], [Estado], [IdTE]) VALUES (11, N'TRIPO', N'SHURE', 0, 4)
SET IDENTITY_INSERT [dbo].[Equipo] OFF


SELECT *FROM Equipo


/****** Object:  Table [dbo].[Empleado]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Empleado](
	[CI] [varchar](10) NOT NULL,
	[IdCL] [smallint] NOT NULL,
	[FechaNac] [date] NOT NULL,
	[Sueldo] [smallint] NOT NULL,
	[FechaIng] [date] NOT NULL,
 CONSTRAINT [PK_Empleado] PRIMARY KEY CLUSTERED 
(
	[CI] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Empleado] ([CI], [IdCL], [FechaNac], [Sueldo], [FechaIng]) VALUES (N'10000', 1, CAST(0xF3060B00 AS Date), 2000, CAST(0xC8320B00 AS Date))
INSERT [dbo].[Empleado] ([CI], [IdCL], [FechaNac], [Sueldo], [FechaIng]) VALUES (N'10003', 2, CAST(0xF6F90A00 AS Date), 2500, CAST(0xE6320B00 AS Date))
INSERT [dbo].[Empleado] ([CI], [IdCL], [FechaNac], [Sueldo], [FechaIng]) VALUES (N'10004', 3, CAST(0x32FA0A00 AS Date), 2100, CAST(0xCB370B00 AS Date))
INSERT [dbo].[Empleado] ([CI], [IdCL], [FechaNac], [Sueldo], [FechaIng]) VALUES (N'10005', 2, CAST(0x1A080B00 AS Date), 2500, CAST(0x99360B00 AS Date))



SELECT *FROM Empleado

/****** Object:  Table [dbo].[UtilizaEE]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[UtilizaEE](
	[IdEven] [int] NOT NULL,
	[IdEq] [smallint] NOT NULL,
 CONSTRAINT [PK_UtilizaEE] PRIMARY KEY CLUSTERED 
(
	[IdEven] ASC,
	[IdEq] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[UtilizaEE] ([IdEven], [IdEq]) VALUES (22, 6)
INSERT [dbo].[UtilizaEE] ([IdEven], [IdEq]) VALUES (23, 11)


SELECT *FROM UtilizaEE



/****** Object:  Table [dbo].[OrdenTrabajo]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[OrdenTrabajo](
	[CIE] [varchar](10) NOT NULL,
	[IdEven] [int] NOT NULL,
	[Descripcion] [varchar](max) NOT NULL,
	[FechaO] [date] NOT NULL,
	[FechaE] [date] NOT NULL,
	[Nro] [bigint] IDENTITY(1,1) NOT NULL,
	[Estado] [varchar](max) NOT NULL,
	[Porcentaje] [smallint] NOT NULL,
 CONSTRAINT [PK_OrdenTrabajo] PRIMARY KEY CLUSTERED 
(
	[CIE] ASC,
	[IdEven] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [UQ_OrdenTrabajo_Nro] UNIQUE NONCLUSTERED 
(
	[Nro] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[OrdenTrabajo] ON
INSERT [dbo].[OrdenTrabajo] ([CIE], [IdEven], [Descripcion], [FechaO], [FechaE], [Nro], [Estado], [Porcentaje]) VALUES (N'10000', 21, N'FILAMCION', CAST(0xF9360B00 AS Date), CAST(0x01370B00 AS Date), 11, N'INICIAl', 0)
INSERT [dbo].[OrdenTrabajo] ([CIE], [IdEven], [Descripcion], [FechaO], [FechaE], [Nro], [Estado], [Porcentaje]) VALUES (N'10003', 22, N'Fotografia', CAST(0x15370B00 AS Date), CAST(0x19370B00 AS Date), 18, N'terminado', 100)
INSERT [dbo].[OrdenTrabajo] ([CIE], [IdEven], [Descripcion], [FechaO], [FechaE], [Nro], [Estado], [Porcentaje]) VALUES (N'10004', 23, N'Fotografia', CAST(0x6E370B00 AS Date), CAST(0x71370B00 AS Date), 19, N'proceso', 60)
INSERT [dbo].[OrdenTrabajo] ([CIE], [IdEven], [Descripcion], [FechaO], [FechaE], [Nro], [Estado], [Porcentaje]) VALUES (N'10005', 24, N'Filmacion', CAST(0x9F360B00 AS Date), CAST(0x6C370B00 AS Date), 20, N'Terminado', 100)
SET IDENTITY_INSERT [dbo].[OrdenTrabajo] OFF


SELECT *FROM OrdenTrabajo


/****** Object:  Table [dbo].[IncluyePC]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[IncluyePC](
	[IdPaq] [int] NOT NULL,
	[IdCP] [smallint] NOT NULL,
	[Cantidad] [smallint] NOT NULL,
 CONSTRAINT [PK_IncluyePC] PRIMARY KEY CLUSTERED 
(
	[IdPaq] ASC,
	[IdCP] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[IncluyePC] ([IdPaq], [IdCP], [Cantidad]) VALUES (200, 1, 4)
INSERT [dbo].[IncluyePC] ([IdPaq], [IdCP], [Cantidad]) VALUES (201, 2, 6)
INSERT [dbo].[IncluyePC] ([IdPaq], [IdCP], [Cantidad]) VALUES (203, 3, 3)


SELECT *FROM IncluyePC

/****** Object:  Table [dbo].[FichaDatos]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FichaDatos](
	[Id] [smallint] NOT NULL,
	[IdEven] [int] NOT NULL,
	[Descripcion] [varchar](max) NOT NULL,
 CONSTRAINT [PK_FichaDatos] PRIMARY KEY CLUSTERED 
(
	[IdEven] ASC,
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[FichaDatos] ([Id], [IdEven], [Descripcion]) VALUES (201, 21, N'15_años')
INSERT [dbo].[FichaDatos] ([Id], [IdEven], [Descripcion]) VALUES (202, 22, N'Bautiso')
INSERT [dbo].[FichaDatos] ([Id], [IdEven], [Descripcion]) VALUES (203, 23, N'Matrimonio_Civil')
INSERT [dbo].[FichaDatos] ([Id], [IdEven], [Descripcion]) VALUES (204, 24, N'Bautiso')


SELECT *FROM FichaDatos


/****** Object:  Table [dbo].[Direcciones]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Direcciones](
	[IdEven] [int] NOT NULL,
	[Descripcion] [varchar](30) NOT NULL,
	[Direccion] [varchar](max) NOT NULL,
 CONSTRAINT [PK_Direcciones] PRIMARY KEY CLUSTERED 
(
	[IdEven] ASC,
	[Descripcion] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Direcciones] ([IdEven], [Descripcion], [Direccion]) VALUES (21, N'Edifico_Oquidia', N'av.montero y seguane#100')
INSERT [dbo].[Direcciones] ([IdEven], [Descripcion], [Direccion]) VALUES (22, N'Salon _Evento _Telchi', N'av.santigo #98')
INSERT [dbo].[Direcciones] ([IdEven], [Descripcion], [Direccion]) VALUES (23, N'Salon_Evento_Lopez', N'barrio cañoto #133')
INSERT [dbo].[Direcciones] ([IdEven], [Descripcion], [Direccion]) VALUES (24, N'Edificon_Salina', N'av.general#450')



SELECT *FROM Direcciones

/****** Object:  Table [dbo].[Contrato]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Contrato](
	[Id] [int] NOT NULL,
	[TipoCont] [bit] NOT NULL,
	[CostoTotal] [int] NOT NULL,
	[ACuenta] [int] NOT NULL,
	[Saldo] [int] NOT NULL,
	[FechaCont] [date] NOT NULL,
	[Obs] [varchar](100) NULL,
	[CIE] [varchar](10) NOT NULL,
	[CIC] [varchar](10) NOT NULL,
	[IdPaq] [int] NOT NULL,
	[IdEven] [int] NOT NULL,
 CONSTRAINT [PK_Contrato] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Contrato] ([Id], [TipoCont], [CostoTotal], [ACuenta], [Saldo], [FechaCont], [Obs], [CIE], [CIC], [IdPaq], [IdEven]) VALUES (101, 0, 900, 400, 500, CAST(0xF3360B00 AS Date), N'Ninguna', N'10000', N'10010', 200, 21)
INSERT [dbo].[Contrato] ([Id], [TipoCont], [CostoTotal], [ACuenta], [Saldo], [FechaCont], [Obs], [CIE], [CIC], [IdPaq], [IdEven]) VALUES (102, 0, 700, 300, 400, CAST(0x14370B00 AS Date), N'Ninguna', N'10003', N'10008', 201, 22)
INSERT [dbo].[Contrato] ([Id], [TipoCont], [CostoTotal], [ACuenta], [Saldo], [FechaCont], [Obs], [CIE], [CIC], [IdPaq], [IdEven]) VALUES (103, 0, 1500, 700, 800, CAST(0x6C370B00 AS Date), N'Ninguna', N'10004', N'10007', 203, 23)
INSERT [dbo].[Contrato] ([Id], [TipoCont], [CostoTotal], [ACuenta], [Saldo], [FechaCont], [Obs], [CIE], [CIC], [IdPaq], [IdEven]) VALUES (104, 0, 1000, 500, 500, CAST(0x9C360B00 AS Date), N'Ninguna', N'10005', N'10011', 204, 24)


SELECT *FROM Contrato

/****** Object:  Table [dbo].[Agenda]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Agenda](
	[Id] [int] IDENTITY(1000,1) NOT NULL,
	[IdRes] [int] NULL,
	[IdEven] [int] NULL,
	[Fecha] [date] NOT NULL,
 CONSTRAINT [PK_TareaAgenda] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Agenda] ON
INSERT [dbo].[Agenda] ([Id], [IdRes], [IdEven], [Fecha]) VALUES (1004, 123, 21, CAST(0xF9360B00 AS Date))
INSERT [dbo].[Agenda] ([Id], [IdRes], [IdEven], [Fecha]) VALUES (1009, 124, 22, CAST(0x15370B00 AS Date))
INSERT [dbo].[Agenda] ([Id], [IdRes], [IdEven], [Fecha]) VALUES (1010, 147, 23, CAST(0x6E370B00 AS Date))
INSERT [dbo].[Agenda] ([Id], [IdRes], [IdEven], [Fecha]) VALUES (1011, 155, 24, CAST(0x9F360B00 AS Date))
SET IDENTITY_INSERT [dbo].[Agenda] OFF


SELECT *FROM Agenda

/****** Object:  Table [dbo].[Cobros]    Script Date: 05/12/2014 14:48:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Cobros](
	[Nro] [int] NOT NULL,
	[IdCont] [int] NOT NULL,
	[NombreApellido] [varchar](max) NOT NULL,
	[Monto] [decimal](10, 2) NOT NULL,
	[Fecha] [date] NOT NULL,
	[Hora] [time](7) NOT NULL,
 CONSTRAINT [PK_Pagos] PRIMARY KEY CLUSTERED 
(
	[Nro] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Cobros] ([Nro], [IdCont], [NombreApellido], [Monto], [Fecha], [Hora]) VALUES (1, 101, N'BURROWS', CAST(900.00 AS Decimal(10, 2)), CAST(0xF7360B00 AS Date), CAST(0x070080461C860000 AS Time))
INSERT [dbo].[Cobros] ([Nro], [IdCont], [NombreApellido], [Monto], [Fecha], [Hora]) VALUES (2, 102, N'AGUILERA', CAST(700.00 AS Decimal(10, 2)), CAST(0x14370B00 AS Date), CAST(0x07007870335C0000 AS Time))
INSERT [dbo].[Cobros] ([Nro], [IdCont], [NombreApellido], [Monto], [Fecha], [Hora]) VALUES (3, 103, N'YAPIRE', CAST(1500.00 AS Decimal(10, 2)), CAST(0x6D370B00 AS Date), CAST(0x0700448E02580000 AS Time))
INSERT [dbo].[Cobros] ([Nro], [IdCont], [NombreApellido], [Monto], [Fecha], [Hora]) VALUES (4, 104, N'SALVATIERA', CAST(1000.00 AS Decimal(10, 2)), CAST(0x9E360B00 AS Date), CAST(0x070080461C860000 AS Time))



SELECT *FROM Cobros

/****** Object:  ForeignKey [FK_Agenda_Evento]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Agenda]  WITH CHECK ADD  CONSTRAINT [FK_Agenda_Evento] FOREIGN KEY([IdEven])
REFERENCES [dbo].[Evento] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Agenda] CHECK CONSTRAINT [FK_Agenda_Evento]
GO
/****** Object:  ForeignKey [FK_Cliente_Persona]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Cliente]  WITH CHECK ADD  CONSTRAINT [FK_Cliente_Persona] FOREIGN KEY([CI])
REFERENCES [dbo].[Persona] ([CI])
GO
ALTER TABLE [dbo].[Cliente] CHECK CONSTRAINT [FK_Cliente_Persona]
GO
/****** Object:  ForeignKey [FK_Pagos_Contrato]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Cobros]  WITH CHECK ADD  CONSTRAINT [FK_Pagos_Contrato] FOREIGN KEY([IdCont])
REFERENCES [dbo].[Contrato] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Cobros] CHECK CONSTRAINT [FK_Pagos_Contrato]
GO
/****** Object:  ForeignKey [FK_ComponentePaquete_CategoriaComponente]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[ComponentePaquete]  WITH CHECK ADD  CONSTRAINT [FK_ComponentePaquete_CategoriaComponente] FOREIGN KEY([IdCC])
REFERENCES [dbo].[CategoriaComponente] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[ComponentePaquete] CHECK CONSTRAINT [FK_ComponentePaquete_CategoriaComponente]
GO
/****** Object:  ForeignKey [FK_Contrato_Cliente]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Contrato]  WITH CHECK ADD  CONSTRAINT [FK_Contrato_Cliente] FOREIGN KEY([CIC])
REFERENCES [dbo].[Cliente] ([CI])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Contrato] CHECK CONSTRAINT [FK_Contrato_Cliente]
GO
/****** Object:  ForeignKey [FK_Contrato_Empleado]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Contrato]  WITH CHECK ADD  CONSTRAINT [FK_Contrato_Empleado] FOREIGN KEY([CIE])
REFERENCES [dbo].[Empleado] ([CI])
GO
ALTER TABLE [dbo].[Contrato] CHECK CONSTRAINT [FK_Contrato_Empleado]
GO
/****** Object:  ForeignKey [FK_Contrato_Evento]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Contrato]  WITH CHECK ADD  CONSTRAINT [FK_Contrato_Evento] FOREIGN KEY([IdEven])
REFERENCES [dbo].[Evento] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Contrato] CHECK CONSTRAINT [FK_Contrato_Evento]
GO
/****** Object:  ForeignKey [FK_Contrato_Paquete]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Contrato]  WITH CHECK ADD  CONSTRAINT [FK_Contrato_Paquete] FOREIGN KEY([IdPaq])
REFERENCES [dbo].[Paquete] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Contrato] CHECK CONSTRAINT [FK_Contrato_Paquete]
GO
/****** Object:  ForeignKey [FK_Direcciones_Evento]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Direcciones]  WITH CHECK ADD  CONSTRAINT [FK_Direcciones_Evento] FOREIGN KEY([IdEven])
REFERENCES [dbo].[Evento] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Direcciones] CHECK CONSTRAINT [FK_Direcciones_Evento]
GO
/****** Object:  ForeignKey [FK_Empleado_CargoLaboral]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Empleado]  WITH CHECK ADD  CONSTRAINT [FK_Empleado_CargoLaboral] FOREIGN KEY([IdCL])
REFERENCES [dbo].[CargoLaboral] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Empleado] CHECK CONSTRAINT [FK_Empleado_CargoLaboral]
GO
/****** Object:  ForeignKey [FK_Empleado_Persona]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Empleado]  WITH CHECK ADD  CONSTRAINT [FK_Empleado_Persona] FOREIGN KEY([CI])
REFERENCES [dbo].[Persona] ([CI])
GO
ALTER TABLE [dbo].[Empleado] CHECK CONSTRAINT [FK_Empleado_Persona]
GO
/****** Object:  ForeignKey [FK_Equipo_TE]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Equipo]  WITH CHECK ADD  CONSTRAINT [FK_Equipo_TE] FOREIGN KEY([IdTE])
REFERENCES [dbo].[TipoEquipo] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Equipo] CHECK CONSTRAINT [FK_Equipo_TE]
GO
/****** Object:  ForeignKey [FK_Evento_TipoEvento]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[Evento]  WITH CHECK ADD  CONSTRAINT [FK_Evento_TipoEvento] FOREIGN KEY([IdTE])
REFERENCES [dbo].[TipoEvento] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Evento] CHECK CONSTRAINT [FK_Evento_TipoEvento]
GO
/****** Object:  ForeignKey [FK_FichaDatos_Evento]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[FichaDatos]  WITH CHECK ADD  CONSTRAINT [FK_FichaDatos_Evento] FOREIGN KEY([IdEven])
REFERENCES [dbo].[Evento] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[FichaDatos] CHECK CONSTRAINT [FK_FichaDatos_Evento]
GO
/****** Object:  ForeignKey [FK_IncluyePC_ComponentePaquete]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[IncluyePC]  WITH CHECK ADD  CONSTRAINT [FK_IncluyePC_ComponentePaquete] FOREIGN KEY([IdCP])
REFERENCES [dbo].[ComponentePaquete] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[IncluyePC] CHECK CONSTRAINT [FK_IncluyePC_ComponentePaquete]
GO
/****** Object:  ForeignKey [FK_IncluyePC_Paquete]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[IncluyePC]  WITH CHECK ADD  CONSTRAINT [FK_IncluyePC_Paquete] FOREIGN KEY([IdPaq])
REFERENCES [dbo].[Paquete] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[IncluyePC] CHECK CONSTRAINT [FK_IncluyePC_Paquete]
GO
/****** Object:  ForeignKey [FK_OrdenTrabajo_Empleado]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[OrdenTrabajo]  WITH CHECK ADD  CONSTRAINT [FK_OrdenTrabajo_Empleado] FOREIGN KEY([CIE])
REFERENCES [dbo].[Empleado] ([CI])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[OrdenTrabajo] CHECK CONSTRAINT [FK_OrdenTrabajo_Empleado]
GO
/****** Object:  ForeignKey [FK_OrdenTrabajo_Evento]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[OrdenTrabajo]  WITH CHECK ADD  CONSTRAINT [FK_OrdenTrabajo_Evento] FOREIGN KEY([IdEven])
REFERENCES [dbo].[Evento] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[OrdenTrabajo] CHECK CONSTRAINT [FK_OrdenTrabajo_Evento]
GO
/****** Object:  ForeignKey [FK_UtilizaEE_Equipo]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[UtilizaEE]  WITH CHECK ADD  CONSTRAINT [FK_UtilizaEE_Equipo] FOREIGN KEY([IdEq])
REFERENCES [dbo].[Equipo] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[UtilizaEE] CHECK CONSTRAINT [FK_UtilizaEE_Equipo]
GO
/****** Object:  ForeignKey [FK_UtilizaEE_Evento]    Script Date: 05/12/2014 14:48:38 ******/
ALTER TABLE [dbo].[UtilizaEE]  WITH CHECK ADD  CONSTRAINT [FK_UtilizaEE_Evento] FOREIGN KEY([IdEven])
REFERENCES [dbo].[Evento] ([Id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[UtilizaEE] CHECK CONSTRAINT [FK_UtilizaEE_Evento]
GO
