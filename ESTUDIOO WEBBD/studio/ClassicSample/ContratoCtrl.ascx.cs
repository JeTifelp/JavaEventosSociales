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
	public partial class ContratoCtrl : System.Web.UI.UserControl
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
			gridView1.RowUpdating += new GridViewUpdateEventHandler(gridView1_RowUpdating);
			gridView1.RowDeleting += new GridViewDeleteEventHandler(gridView1_RowDeleting);
			gridView1.RowEditing += new GridViewEditEventHandler(gridView1_RowEditing);
			gridView1.RowCancelingEdit += new GridViewCancelEditEventHandler(gridView1_RowCancelingEdit);
			gridView1.RowCommand += new GridViewCommandEventHandler(gridView1_RowCommand);
		}

		void gridView1_RowDataBound(object sender, GridViewRowEventArgs e)
		{
			if (e.Row.RowType == DataControlRowType.DataRow)
			{
				DropDownList ddlCie = ((DropDownList) e.Row.FindControl("CieDropDownList"));
				ddlCie.DataSource = StaticBindings.StaticBindings.GetEmpleadoList();
				ddlCie.DataBind();
				ddlCie.SelectedIndex = ((BOContrato)(e.Row.DataItem)).Cie == null ? -1 : ddlCie.Items.IndexOf(ddlCie.Items.FindByValue(((BOContrato)(e.Row.DataItem)).Cie.ToString()));
				DropDownList ddlCic = ((DropDownList) e.Row.FindControl("CicDropDownList"));
				ddlCic.DataSource = StaticBindings.StaticBindings.GetClienteList();
				ddlCic.DataBind();
				ddlCic.SelectedIndex = ((BOContrato)(e.Row.DataItem)).Cic == null ? -1 : ddlCic.Items.IndexOf(ddlCic.Items.FindByValue(((BOContrato)(e.Row.DataItem)).Cic.ToString()));
				DropDownList ddlIdPaq = ((DropDownList) e.Row.FindControl("IdPaqDropDownList"));
				ddlIdPaq.DataSource = StaticBindings.StaticBindings.GetPaqueteList();
				ddlIdPaq.DataBind();
				ddlIdPaq.SelectedIndex = ((BOContrato)(e.Row.DataItem)).IdPaq == null ? -1 : ddlIdPaq.Items.IndexOf(ddlIdPaq.Items.FindByValue(((BOContrato)(e.Row.DataItem)).IdPaq.ToString()));
				DropDownList ddlIdEven = ((DropDownList) e.Row.FindControl("IdEvenDropDownList"));
				ddlIdEven.DataSource = StaticBindings.StaticBindings.GetEventoList();
				ddlIdEven.DataBind();
				ddlIdEven.SelectedIndex = ((BOContrato)(e.Row.DataItem)).IdEven == null ? -1 : ddlIdEven.Items.IndexOf(ddlIdEven.Items.FindByValue(((BOContrato)(e.Row.DataItem)).IdEven.ToString()));
			}
			else if (e.Row.RowType == DataControlRowType.Footer)
			{
				DropDownList ddlCie = ((DropDownList) e.Row.FindControl("CieDropDownList"));
				ddlCie.DataSource = StaticBindings.StaticBindings.GetEmpleadoList();
				ddlCie.DataBind();
				ddlCie.SelectedIndex = -1;
				DropDownList ddlCic = ((DropDownList) e.Row.FindControl("CicDropDownList"));
				ddlCic.DataSource = StaticBindings.StaticBindings.GetClienteList();
				ddlCic.DataBind();
				ddlCic.SelectedIndex = -1;
				DropDownList ddlIdPaq = ((DropDownList) e.Row.FindControl("IdPaqDropDownList"));
				ddlIdPaq.DataSource = StaticBindings.StaticBindings.GetPaqueteList();
				ddlIdPaq.DataBind();
				ddlIdPaq.SelectedIndex = -1;
				DropDownList ddlIdEven = ((DropDownList) e.Row.FindControl("IdEvenDropDownList"));
				ddlIdEven.DataSource = StaticBindings.StaticBindings.GetEventoList();
				ddlIdEven.DataBind();
				ddlIdEven.SelectedIndex = -1;
			}
		}

		private void BindEmptyRow()
		{
			List<BOContrato> boContratos = new List<BOContrato>() { new BOContrato() };
			gridView1.DataSource = boContratos;
			gridView1.DataBind();
			
			gridView1.Rows[0].Visible = false;
			gridView1.Rows[0].Controls.Clear();
		}

		public int LoadRecords(bool checkCount)
		{
			BOContrato searchBO = new BOContrato();
			try
			{
				if(!string.IsNullOrEmpty(IdSchTxtBx.Text)) searchBO.Id = Int32.Parse(IdSchTxtBx.Text);
				if(!string.IsNullOrEmpty(CostoTotalSchTxtBx.Text)) searchBO.CostoTotal = decimal.Parse(CostoTotalSchTxtBx.Text);
				if(!string.IsNullOrEmpty(ACuentaSchTxtBx.Text)) searchBO.ACuenta = decimal.Parse(ACuentaSchTxtBx.Text);
				if(!string.IsNullOrEmpty(SaldoSchTxtBx.Text)) searchBO.Saldo = decimal.Parse(SaldoSchTxtBx.Text);
				if(!string.IsNullOrEmpty(FechaContSchTxtBx.Text)) searchBO.FechaCont = DateTime.Parse(FechaContSchTxtBx.Text);
				if(!string.IsNullOrEmpty(ObsSchTxtBx.Text)) searchBO.Obs = ObsSchTxtBx.Text;
				if(!string.IsNullOrEmpty(CieSchTxtBx.Text)) searchBO.Cie = CieSchTxtBx.Text;
				if(!string.IsNullOrEmpty(CicSchTxtBx.Text)) searchBO.Cic = CicSchTxtBx.Text;
				if(!string.IsNullOrEmpty(IdPaqSchTxtBx.Text)) searchBO.IdPaq = Int32.Parse(IdPaqSchTxtBx.Text);
				if(!string.IsNullOrEmpty(IdEvenSchTxtBx.Text)) searchBO.IdEven = Int32.Parse(IdEvenSchTxtBx.Text);
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected a parsing error. <br>Possible invalid input format in search fields. Exception details below.<br>" + ex.Message); return -1; }
			
			try
			{
				List<BOContrato> boContratos = null;
				int resultCount = BOContrato.ContratoCollectionFromSearchFieldsCount(searchBO);
				if(checkCount && (resultCount > _maxResultsCheck))
				{
					SetUserMessage("Your current filter settings will return " + resultCount.ToString() + " records. <br>Please adjust your filter settings or increase your max search results limit(750).<br>Data has not been refreshed. ");
					BindEmptyRow();
					return -1;
				}
			
				boContratos = BOContrato.ContratoCollectionFromSearchFields(searchBO);
				if(boContratos.Count == 0)
				{ BindEmptyRow(); return 0; }
				
				Session["_boContratos"] = boContratos;
				gridView1.DataSource = boContratos;
				gridView1.DataBind();
				return boContratos.Count;
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

		protected void gridView1_RowEditing(object sender, GridViewEditEventArgs e)
		{
			gridView1.EditIndex = e.NewEditIndex;
			List<BOContrato> boContratos = (List<BOContrato>)Session["_boContratos"];
			gridView1.DataSource = boContratos;
			gridView1.DataBind();
		}
		
		protected void gridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
		{
			List<BOContrato> _boContratos = (List<BOContrato>)Session["_boContratos"];
			BOContrato boContrato = _boContratos[e.RowIndex];
			try
			{
				TextBox txtbxCostoTotal = (TextBox)gridView1.Rows[e.RowIndex].FindControl("CostoTotalGridTxtBx");
				boContrato.CostoTotal = string.IsNullOrEmpty(txtbxCostoTotal.Text) ? (decimal?)null : decimal.Parse(txtbxCostoTotal.Text);
				TextBox txtbxACuenta = (TextBox)gridView1.Rows[e.RowIndex].FindControl("ACuentaGridTxtBx");
				boContrato.ACuenta = string.IsNullOrEmpty(txtbxACuenta.Text) ? (decimal?)null : decimal.Parse(txtbxACuenta.Text);
				TextBox txtbxSaldo = (TextBox)gridView1.Rows[e.RowIndex].FindControl("SaldoGridTxtBx");
				boContrato.Saldo = string.IsNullOrEmpty(txtbxSaldo.Text) ? (decimal?)null : decimal.Parse(txtbxSaldo.Text);
				TextBox txtbxFechaCont = (TextBox)gridView1.Rows[e.RowIndex].FindControl("FechaContGridTxtBx");
				boContrato.FechaCont = string.IsNullOrEmpty(txtbxFechaCont.Text) ? (DateTime?)null : DateTime.Parse(txtbxFechaCont.Text);
				TextBox txtbxObs = (TextBox)gridView1.Rows[e.RowIndex].FindControl("ObsGridTxtBx");
				boContrato.Obs = string.IsNullOrEmpty(txtbxObs.Text) ? null : txtbxObs.Text;
				DropDownList ddlCie = (DropDownList)gridView1.Rows[e.RowIndex].FindControl("CieDropDownList");
				boContrato.Cie = string.IsNullOrEmpty(ddlCie.SelectedValue) ? null : (string)ddlCie.SelectedValue;
				DropDownList ddlCic = (DropDownList)gridView1.Rows[e.RowIndex].FindControl("CicDropDownList");
				boContrato.Cic = string.IsNullOrEmpty(ddlCic.SelectedValue) ? null : (string)ddlCic.SelectedValue;
				DropDownList ddlIdPaq = (DropDownList)gridView1.Rows[e.RowIndex].FindControl("IdPaqDropDownList");
				boContrato.IdPaq = string.IsNullOrEmpty(ddlIdPaq.SelectedValue) ? (Int32?)null : Int32.Parse(ddlIdPaq.SelectedValue);
				DropDownList ddlIdEven = (DropDownList)gridView1.Rows[e.RowIndex].FindControl("IdEvenDropDownList");
				boContrato.IdEven = string.IsNullOrEmpty(ddlIdEven.SelectedValue) ? (Int32?)null : Int32.Parse(ddlIdEven.SelectedValue);
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message);  return; }
			
			try{ boContrato.Update(); }
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message);  return; }
			finally	{	}
			
			gridView1.EditIndex = -1;
			LoadRecords(false);
			SetUserMessage("Record updated");
		}
		
		protected void gridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
		{
			List<BOContrato> _boContratos = (List<BOContrato>)Session["_boContratos"];
			BOContrato boContrato = _boContratos[(gridView1.PageIndex*gridView1.PageSize)+e.RowIndex];
		
			try{ boContrato.Delete(); }
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while deleting record. Possible foreign key issue. Detailed error message below:<br>" + ex.Message); return; }
			finally	{	}
			
			LoadRecords(false);
			SetUserMessage("Record deleted");
		}
		
		protected void gridView1_RowCommand(object sender, GridViewCommandEventArgs e)
		{
			if(e.CommandName.Equals("Insert"))
			{
				BOContrato boContrato = new BOContrato();
				try
				{
					TextBox txtbxId = (TextBox)gridView1.FooterRow.FindControl("IdGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxId.Text)) boContrato.Id = Int32.Parse(txtbxId.Text);
					TextBox txtbxCostoTotal = (TextBox)gridView1.FooterRow.FindControl("CostoTotalGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxCostoTotal.Text)) boContrato.CostoTotal = decimal.Parse(txtbxCostoTotal.Text);
					TextBox txtbxACuenta = (TextBox)gridView1.FooterRow.FindControl("ACuentaGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxACuenta.Text)) boContrato.ACuenta = decimal.Parse(txtbxACuenta.Text);
					TextBox txtbxSaldo = (TextBox)gridView1.FooterRow.FindControl("SaldoGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxSaldo.Text)) boContrato.Saldo = decimal.Parse(txtbxSaldo.Text);
					TextBox txtbxFechaCont = (TextBox)gridView1.FooterRow.FindControl("FechaContGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxFechaCont.Text)) boContrato.FechaCont = DateTime.Parse(txtbxFechaCont.Text);
					TextBox txtbxObs = (TextBox)gridView1.FooterRow.FindControl("ObsGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxObs.Text)) boContrato.Obs = txtbxObs.Text;
					DropDownList ddlCie = (DropDownList)gridView1.FooterRow.FindControl("CieDropDownList");
					if(!string.IsNullOrEmpty(ddlCie.SelectedValue)) boContrato.Cie = (string)ddlCie.SelectedValue;
					DropDownList ddlCic = (DropDownList)gridView1.FooterRow.FindControl("CicDropDownList");
					if(!string.IsNullOrEmpty(ddlCic.SelectedValue)) boContrato.Cic = (string)ddlCic.SelectedValue;
					DropDownList ddlIdPaq = (DropDownList)gridView1.FooterRow.FindControl("IdPaqDropDownList");
					if(!string.IsNullOrEmpty(ddlIdPaq.SelectedValue)) boContrato.IdPaq = Int32.Parse(ddlIdPaq.SelectedValue);
					DropDownList ddlIdEven = (DropDownList)gridView1.FooterRow.FindControl("IdEvenDropDownList");
					if(!string.IsNullOrEmpty(ddlIdEven.SelectedValue)) boContrato.IdEven = Int32.Parse(ddlIdEven.SelectedValue);
				}
				catch(Exception ex)
				{ LoadRecords(false);  SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message); return; }
				
				try{ boContrato.SaveNew(); }
				catch(Exception ex)
				{ LoadRecords(false); SetUserMessage("CodeTrigger has detected an error while inserting new record. Possible foreign key violation. Detailed error message below:<br>" + ex.Message); return; }
				finally	{	}
			
				LoadRecords(false);
				SetUserMessage("New record inserted");
			}
		}
			
		protected void gridView1_RowCancelingEdit(object sender, GridViewCancelEditEventArgs e)
		{
			gridView1.EditIndex = -1;
			LoadRecords(false);
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

