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
	public partial class FichaDatosCtrl : System.Web.UI.UserControl
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
				DropDownList ddlIdEven = ((DropDownList) e.Row.FindControl("IdEvenDropDownList"));
				ddlIdEven.DataSource = StaticBindings.StaticBindings.GetEventoList();
				ddlIdEven.DataBind();
				ddlIdEven.SelectedIndex = ((BOFichaDatos)(e.Row.DataItem)).IdEven == null ? -1 : ddlIdEven.Items.IndexOf(ddlIdEven.Items.FindByValue(((BOFichaDatos)(e.Row.DataItem)).IdEven.ToString()));
			}
			else if (e.Row.RowType == DataControlRowType.Footer)
			{
				DropDownList ddlIdEven = ((DropDownList) e.Row.FindControl("IdEvenDropDownList"));
				ddlIdEven.DataSource = StaticBindings.StaticBindings.GetEventoList();
				ddlIdEven.DataBind();
				ddlIdEven.SelectedIndex = -1;
			}
		}

		private void BindEmptyRow()
		{
			List<BOFichaDatos> boFichaDatoss = new List<BOFichaDatos>() { new BOFichaDatos() };
			gridView1.DataSource = boFichaDatoss;
			gridView1.DataBind();
			
			gridView1.Rows[0].Visible = false;
			gridView1.Rows[0].Controls.Clear();
		}

		public int LoadRecords(bool checkCount)
		{
			BOFichaDatos searchBO = new BOFichaDatos();
			try
			{
				if(!string.IsNullOrEmpty(IdSchTxtBx.Text)) searchBO.Id = Int16.Parse(IdSchTxtBx.Text);
				if(!string.IsNullOrEmpty(IdEvenSchTxtBx.Text)) searchBO.IdEven = Int32.Parse(IdEvenSchTxtBx.Text);
				if(!string.IsNullOrEmpty(DescripcionSchTxtBx.Text)) searchBO.Descripcion = DescripcionSchTxtBx.Text;
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected a parsing error. <br>Possible invalid input format in search fields. Exception details below.<br>" + ex.Message); return -1; }
			
			try
			{
				List<BOFichaDatos> boFichaDatoss = null;
				int resultCount = BOFichaDatos.FichaDatosCollectionFromSearchFieldsCount(searchBO);
				if(checkCount && (resultCount > _maxResultsCheck))
				{
					SetUserMessage("Your current filter settings will return " + resultCount.ToString() + " records. <br>Please adjust your filter settings or increase your max search results limit(750).<br>Data has not been refreshed. ");
					BindEmptyRow();
					return -1;
				}
			
				boFichaDatoss = BOFichaDatos.FichaDatosCollectionFromSearchFields(searchBO);
				if(boFichaDatoss.Count == 0)
				{ BindEmptyRow(); return 0; }
				
				Session["_boFichaDatoss"] = boFichaDatoss;
				gridView1.DataSource = boFichaDatoss;
				gridView1.DataBind();
				return boFichaDatoss.Count;
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
			List<BOFichaDatos> boFichaDatoss = (List<BOFichaDatos>)Session["_boFichaDatoss"];
			gridView1.DataSource = boFichaDatoss;
			gridView1.DataBind();
		}
		
		protected void gridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
		{
			List<BOFichaDatos> _boFichaDatoss = (List<BOFichaDatos>)Session["_boFichaDatoss"];
			BOFichaDatos boFichaDatos = _boFichaDatoss[e.RowIndex];
			try
			{
				TextBox txtbxDescripcion = (TextBox)gridView1.Rows[e.RowIndex].FindControl("DescripcionGridTxtBx");
				boFichaDatos.Descripcion = string.IsNullOrEmpty(txtbxDescripcion.Text) ? null : txtbxDescripcion.Text;
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message);  return; }
			
			try{ boFichaDatos.Update(); }
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message);  return; }
			finally	{	}
			
			gridView1.EditIndex = -1;
			LoadRecords(false);
			SetUserMessage("Record updated");
		}
		
		protected void gridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
		{
			List<BOFichaDatos> _boFichaDatoss = (List<BOFichaDatos>)Session["_boFichaDatoss"];
			BOFichaDatos boFichaDatos = _boFichaDatoss[(gridView1.PageIndex*gridView1.PageSize)+e.RowIndex];
		
			try{ boFichaDatos.Delete(); }
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
				BOFichaDatos boFichaDatos = new BOFichaDatos();
				try
				{
					TextBox txtbxId = (TextBox)gridView1.FooterRow.FindControl("IdGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxId.Text)) boFichaDatos.Id = Int16.Parse(txtbxId.Text);
					DropDownList ddlIdEven = (DropDownList)gridView1.FooterRow.FindControl("IdEvenDropDownList");
					if(!string.IsNullOrEmpty(ddlIdEven.SelectedValue)) boFichaDatos.IdEven = Int32.Parse(ddlIdEven.SelectedValue);
					TextBox txtbxDescripcion = (TextBox)gridView1.FooterRow.FindControl("DescripcionGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxDescripcion.Text)) boFichaDatos.Descripcion = txtbxDescripcion.Text;
				}
				catch(Exception ex)
				{ LoadRecords(false);  SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message); return; }
				
				try{ boFichaDatos.SaveNew(); }
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

