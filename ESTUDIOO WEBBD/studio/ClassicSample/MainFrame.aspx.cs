/*************************************************************
** Class generated by CodeTrigger, Version 4.3.0.6
** CodeTrigger is an Exotechnic Corporation (UK) Ltd Product 
** This class was generated on 08/06/2014 17:05:12
** Changes to this file may cause incorrect behaviour and will be lost if the code is regenerated
**************************************************************/
using System;
using System.Collections.Generic;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace studio.ClassicSample
{
	/* To demonstrate this sample functionality, copy the following lines 
	*  into the Page_Load method of the Default.aspx.cs class in your WebForms application
	*  Response.Redirect("ClassicSample/MainFrame.aspx");
	*  
	*  (Also, if you have not selected 'AutoScripting', remember to run the generated SQL Stored Procedure script against the database)
	*  (For help with the samples, please see http://www.codetrigger.com/samples/)
	***************************************************************************************/
	public partial class MainFrame : System.Web.UI.Page
	{
		protected void Page_Load(object sender, EventArgs e)
		{
			NavigationMenu.MenuItemClick += new MenuEventHandler(NavigationMenu_OnMenuItemClick);
			
			if(!this.IsPostBack)
			{
				MultiView1.ActiveViewIndex = 16;
				
				_AgendaCtrl.LoadRecords(false);
				//_CargoLaboralCtrl.LoadRecords(false);
				//_CategoriaComponenteCtrl.LoadRecords(false);
				//_ClienteCtrl.LoadRecords(false);
				//_CobrosCtrl.LoadRecords(false);
				//_ComponentePaqueteCtrl.LoadRecords(false);
				//_ContratoCtrl.LoadRecords(false);
				//_DireccionesCtrl.LoadRecords(false);
				//_EmpleadoCtrl.LoadRecords(false);
				//_EquipoCtrl.LoadRecords(false);
				//_EventoCtrl.LoadRecords(false);
				//_FichaDatosCtrl.LoadRecords(false);
				//_IncluyePCCtrl.LoadRecords(false);
				//_OrdenTrabajoCtrl.LoadRecords(false);
				//_PaqueteCtrl.LoadRecords(false);
				//_PersonaCtrl.LoadRecords(false);
				//_ReservaCtrl.LoadRecords(false);
				//_TipoEquipoCtrl.LoadRecords(false);
				//_TipoEventoCtrl.LoadRecords(false);
				//_UtilizaEECtrl.LoadRecords(false);
				//_EmpleadoPersonaCtrl.LoadRecords(false);
				//_VerCategoriaComponenteCtrl.LoadRecords(false);
			}
		}

		protected void NavigationMenu_OnMenuItemClick(object sender, MenuEventArgs e)
		{
			if(e.Item.Text == "Agenda")
			{
				MultiView1.ActiveViewIndex = 0;
				_AgendaCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "CargoLaboral")
			{
				MultiView1.ActiveViewIndex = 1;
				//_CargoLaboralCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "CategoriaComponente")
			{
				MultiView1.ActiveViewIndex = 2;
				//_CategoriaComponenteCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "Cliente")
			{
				MultiView1.ActiveViewIndex = 3;
				//_ClienteCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "Cobros")
			{
				MultiView1.ActiveViewIndex = 4;
				//_CobrosCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "ComponentePaquete")
			{
				MultiView1.ActiveViewIndex = 5;
				//_ComponentePaqueteCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "Contrato")
			{
				MultiView1.ActiveViewIndex = 6;
				//_ContratoCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "Direcciones")
			{
				MultiView1.ActiveViewIndex = 7;
				//_DireccionesCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "Empleado")
			{
				MultiView1.ActiveViewIndex = 8;
				//_EmpleadoCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "Equipo")
			{
				MultiView1.ActiveViewIndex = 9;
				//_EquipoCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "Evento")
			{
				MultiView1.ActiveViewIndex = 10;
				//_EventoCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "FichaDatos")
			{
				MultiView1.ActiveViewIndex = 11;
				//_FichaDatosCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "IncluyePC")
			{
				MultiView1.ActiveViewIndex = 12;
				//_IncluyePCCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "OrdenTrabajo")
			{
				MultiView1.ActiveViewIndex = 13;
				//_OrdenTrabajoCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "Paquete")
			{
				MultiView1.ActiveViewIndex = 14;
				//_PaqueteCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "Persona")
			{
				MultiView1.ActiveViewIndex = 15;
				//_PersonaCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "Reserva")
			{
				MultiView1.ActiveViewIndex = 16;
				//_ReservaCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "TipoEquipo")
			{
				MultiView1.ActiveViewIndex = 17;
				//_TipoEquipoCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "TipoEvento")
			{
				MultiView1.ActiveViewIndex = 18;
				//_TipoEventoCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "UtilizaEE")
			{
				MultiView1.ActiveViewIndex = 19;
				//_UtilizaEECtrl.LoadRecords(false);
			}
			if(e.Item.Text == "EmpleadoPersona")
			{
				MultiView1.ActiveViewIndex = 20;
				//_EmpleadoPersonaCtrl.LoadRecords(false);
			}
			if(e.Item.Text == "VerCategoriaComponente")
			{
				MultiView1.ActiveViewIndex = 21;
				//_VerCategoriaComponenteCtrl.LoadRecords(false);
			}
		}
	}
}
