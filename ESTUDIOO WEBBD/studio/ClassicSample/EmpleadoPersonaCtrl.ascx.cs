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
using studio.BusinessObjects;

namespace studio.ClassicSample
{
	public partial class EmpleadoPersonaCtrl : System.Web.UI.UserControl
	{
		/*This class contains basic sample UI code, to illustrate usage of the CodeTrigger generated domain objects. Replace this UI layer with your own code*/
		/*WARNING - This class was generated by CodeTrigger. Changes to this file may cause incorrect behaviour and will be lost when the code is regenerated*/
		private int _maxResultsCheck = 750;
		protected void Page_Load(object sender, EventArgs e)
		{
			ClearUserMessage();
		}

		protected override void OnInit(EventArgs e)
		{
			resultsBtn.Click += new EventHandler(resultsBtn_Click);
			gridView1.PageIndexChanging += new GridViewPageEventHandler(gridView1_PageIndexChanging);
			gridView1.RowDataBound += new GridViewRowEventHandler(gridView1_RowDataBound);
		}

		void gridView1_RowDataBound(object sender, GridViewRowEventArgs e)
		{
			if (e.Row.RowType == DataControlRowType.DataRow)
			{
			}
		}

		public int LoadRecords(bool checkCount)
		{
			BOEmpleadoPersona searchBO = new BOEmpleadoPersona();
			try
			{
				if(!string.IsNullOrEmpty(CiSchTxtBx.Text)) searchBO.Ci = CiSchTxtBx.Text;
				if(!string.IsNullOrEmpty(PmnSchTxtBx.Text)) searchBO.Pmn = PmnSchTxtBx.Text;
				if(!string.IsNullOrEmpty(SexoSchTxtBx.Text)) searchBO.Sexo = bool.Parse(SexoSchTxtBx.Text);
				if(!string.IsNullOrEmpty(TelefonoSchTxtBx.Text)) searchBO.Telefono = TelefonoSchTxtBx.Text;
				if(!string.IsNullOrEmpty(NombreSchTxtBx.Text)) searchBO.Nombre = NombreSchTxtBx.Text;
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected a parsing error. <br>Possible invalid input format in search fields. Exception details below.<br>" + ex.Message); return -1; }
			
			try
			{
				List<BOEmpleadoPersona> boEmpleadoPersonas = null;
				int resultCount = BOEmpleadoPersona.EmpleadoPersonaCollectionFromSearchFieldsCount(searchBO);
				if(checkCount && (resultCount > _maxResultsCheck))
				{
					SetUserMessage("Your current filter settings will return " + resultCount.ToString() + " records. <br>Please adjust your filter settings or increase your max search results limit(750).<br>Data has not been refreshed. ");
					return -1;
				}
			
				boEmpleadoPersonas = BOEmpleadoPersona.EmpleadoPersonaCollectionFromSearchFields(searchBO);
				Session["_boEmpleadoPersonas"] = boEmpleadoPersonas;
				gridView1.DataSource = boEmpleadoPersonas;
				gridView1.DataBind();
				return boEmpleadoPersonas.Count;
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while loading records from data store. Detailed error message below:<br>" + ex.Message); return -1; }
			finally	{	}
		}

		private void resultsBtn_Click(object sender, EventArgs e)
		{
			int count = LoadRecords(true);
			if(count > -1) SetUserMessage(count.ToString() + " record(s) loaded from data store");
		}

		protected void gridView1_PageIndexChanging(object sender, GridViewPageEventArgs e)
		{
			gridView1.PageIndex = e.NewPageIndex;
			LoadRecords(false);
		}

		private void SetUserMessage(string msg)
		{  ErrorLbl.Text = msg; }

		private void ClearUserMessage()
		{  ErrorLbl.Text = ""; }

	}
}

