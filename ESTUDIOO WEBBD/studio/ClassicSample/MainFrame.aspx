<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="MainFrame.aspx.cs" Inherits="studio.ClassicSample.MainFrame" %>
<%@ Register src="AgendaCtrl.ascx" tagname="AgendaCtrl" tagprefix="ucAgenda" %>
<%@ Register src="CargoLaboralCtrl.ascx" tagname="CargoLaboralCtrl" tagprefix="ucCargoLaboral" %>
<%@ Register src="CategoriaComponenteCtrl.ascx" tagname="CategoriaComponenteCtrl" tagprefix="ucCategoriaComponente" %>
<%@ Register src="ClienteCtrl.ascx" tagname="ClienteCtrl" tagprefix="ucCliente" %>
<%@ Register src="CobrosCtrl.ascx" tagname="CobrosCtrl" tagprefix="ucCobros" %>
<%@ Register src="ComponentePaqueteCtrl.ascx" tagname="ComponentePaqueteCtrl" tagprefix="ucComponentePaquete" %>
<%--<%@ Register src="ContratoCtrl.ascx" tagname="ContratoCtrl" tagprefix="ucContrato" %>--%>
<%@ Register src="avancecontratous.ascx" tagname="ContratoCtrl" tagprefix="ucContrato" %>
<%@ Register src="DireccionesCtrl.ascx" tagname="DireccionesCtrl" tagprefix="ucDirecciones" %>
<%@ Register src="EmpleadoCtrl.ascx" tagname="EmpleadoCtrl" tagprefix="ucEmpleado" %>
<%@ Register src="EquipoCtrl.ascx" tagname="EquipoCtrl" tagprefix="ucEquipo" %>
<%@ Register src="EventoCtrl.ascx" tagname="EventoCtrl" tagprefix="ucEvento" %>
<%@ Register src="FichaDatosCtrl.ascx" tagname="FichaDatosCtrl" tagprefix="ucFichaDatos" %>
<%@ Register src="IncluyePCCtrl.ascx" tagname="IncluyePCCtrl" tagprefix="ucIncluyePC" %>
<%@ Register src="OrdenTrabajoCtrl.ascx" tagname="OrdenTrabajoCtrl" tagprefix="ucOrdenTrabajo" %>
<%@ Register src="PaqueteCtrl.ascx" tagname="PaqueteCtrl" tagprefix="ucPaquete" %>
<%@ Register src="PersonaCtrl.ascx" tagname="PersonaCtrl" tagprefix="ucPersona" %>
<%--<%@ Register src="ReservaCtrl.ascx" tagname="ReservaCtrl" tagprefix="ucReserva" %>--%>
<%@ Register src="Reserva.ascx" tagname="ReservaCtrl" tagprefix="ucReserva" %>
<%@ Register src="TipoEquipoCtrl.ascx" tagname="TipoEquipoCtrl" tagprefix="ucTipoEquipo" %>
<%@ Register src="TipoEventoCtrl.ascx" tagname="TipoEventoCtrl" tagprefix="ucTipoEvento" %>
<%@ Register src="UtilizaEECtrl.ascx" tagname="UtilizaEECtrl" tagprefix="ucUtilizaEE" %>
<%@ Register src="EmpleadoPersonaCtrl.ascx" tagname="EmpleadoPersonaCtrl" tagprefix="ucEmpleadoPersona" %>
<%@ Register src="VerCategoriaComponenteCtrl.ascx" tagname="VerCategoriaComponenteCtrl" tagprefix="ucVerCategoriaComponente" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
	<title>CodeTrigger Sample Form - CodeTrigger Code Generation Tools</title>
	<link href="~/Styles/CodeTriggerStyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<form id="form1" runat="server">
	<div class="page">
		<div class="header">
			<div class="title">
				<h1>CodeTrigger Sample - ASP.NET</h1>
			</div>
			<div>
				<asp:Menu ID="NavigationMenu" runat="server" CssClass="menu" EnableViewState="false" IncludeStyleBlock="false" Orientation="Horizontal" >
					<Items>
						<asp:MenuItem Text="Agenda" />
						<asp:MenuItem Text="CargoLaboral" />
						<asp:MenuItem Text="CategoriaComponente" />
						<asp:MenuItem Text="Cliente" />
						<asp:MenuItem Text="Cobros" />
						<asp:MenuItem Text="ComponentePaquete" />
						<asp:MenuItem Text="Contrato" />
						<asp:MenuItem Text="Direcciones" />
						<asp:MenuItem Text="Empleado" />
						<asp:MenuItem Text="Equipo" />
						<asp:MenuItem Text="Evento" />
						<asp:MenuItem Text="FichaDatos" />
						<asp:MenuItem Text="IncluyePC" />
						<asp:MenuItem Text="OrdenTrabajo" />
						<asp:MenuItem Text="Paquete" />
						<asp:MenuItem Text="Persona" />
						<asp:MenuItem Text="Reserva" />
						<asp:MenuItem Text="TipoEquipo" />
						<asp:MenuItem Text="TipoEvento" />
						<asp:MenuItem Text="UtilizaEE" />
						<asp:MenuItem Text="EmpleadoPersona" />
						<asp:MenuItem Text="VerCategoriaComponente" />
					</Items>
				</asp:Menu>
			</div>
		</div>
		<div>
			<asp:MultiView ID="MultiView1" runat="server">
				<asp:View ID="tabAgenda" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucAgenda:AgendaCtrl ID="_AgendaCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabCargoLaboral" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucCargoLaboral:CargoLaboralCtrl ID="_CargoLaboralCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabCategoriaComponente" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucCategoriaComponente:CategoriaComponenteCtrl ID="_CategoriaComponenteCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabCliente" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucCliente:ClienteCtrl ID="_ClienteCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabCobros" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucCobros:CobrosCtrl ID="_CobrosCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabComponentePaquete" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucComponentePaquete:ComponentePaqueteCtrl ID="_ComponentePaqueteCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabContrato" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucContrato:ContratoCtrl ID="_ContratoCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabDirecciones" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucDirecciones:DireccionesCtrl ID="_DireccionesCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabEmpleado" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucEmpleado:EmpleadoCtrl ID="_EmpleadoCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabEquipo" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucEquipo:EquipoCtrl ID="_EquipoCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabEvento" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucEvento:EventoCtrl ID="_EventoCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabFichaDatos" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucFichaDatos:FichaDatosCtrl ID="_FichaDatosCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabIncluyePC" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucIncluyePC:IncluyePCCtrl ID="_IncluyePCCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabOrdenTrabajo" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucOrdenTrabajo:OrdenTrabajoCtrl ID="_OrdenTrabajoCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabPaquete" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucPaquete:PaqueteCtrl ID="_PaqueteCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabPersona" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucPersona:PersonaCtrl ID="_PersonaCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabReserva" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucReserva:ReservaCtrl ID="_ReservaCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabTipoEquipo" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucTipoEquipo:TipoEquipoCtrl ID="_TipoEquipoCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabTipoEvento" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucTipoEvento:TipoEventoCtrl ID="_TipoEventoCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabUtilizaEE" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucUtilizaEE:UtilizaEECtrl ID="_UtilizaEECtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabEmpleadoPersona" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucEmpleadoPersona:EmpleadoPersonaCtrl ID="_EmpleadoPersonaCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
				<asp:View ID="tabVerCategoriaComponente" runat="server">
					<table width="100%" style="background-color: aquamarine; font-family: Verdana; font-size: 10pt" border="0" cellspacing="0" cellpadding="5">
						<tr>
							<td valign="top">
								<ucVerCategoriaComponente:VerCategoriaComponenteCtrl ID="_VerCategoriaComponenteCtrl" runat="server" />
							</td>
						</tr>
					</table>
				</asp:View>
			</asp:MultiView>
		</div>
	</div>
	</form>
</body>
</html>
