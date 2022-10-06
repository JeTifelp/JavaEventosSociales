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
	public partial class ComponentePaqueteCtrl : System.Web.UI.UserControl
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
				DropDownList ddlIdCC = ((DropDownList) e.Row.FindControl("IdCCDropDownList"));
				ddlIdCC.DataSource = StaticBindings.StaticBindings.GetCategoriaComponenteList();
				ddlIdCC.DataBind();
				ddlIdCC.SelectedIndex = ((BOComponentePaquete)(e.Row.DataItem)).IdCC == null ? -1 : ddlIdCC.Items.IndexOf(ddlIdCC.Items.FindByValue(((BOComponentePaquete)(e.Row.DataItem)).IdCC.ToString()));
			}
			else if (e.Row.RowType == DataControlRowType.Footer)
			{
				DropDownList ddlIdCC = ((DropDownList) e.Row.FindControl("IdCCDropDownList"));
				ddlIdCC.DataSource = StaticBindings.StaticBindings.GetCategoriaComponenteList();
				ddlIdCC.DataBind();
				ddlIdCC.SelectedIndex = -1;
			}
		}

		private void BindEmptyRow()
		{
			List<BOComponentePaquete> boComponentePaquetes = new List<BOComponentePaquete>() { new BOComponentePaquete() };
			gridView1.DataSource = boComponentePaquetes;
			gridView1.DataBind();
			
			gridView1.Rows[0].Visible = false;
			gridView1.Rows[0].Controls.Clear();
		}

		public int LoadRecords(bool checkCount)
		{
			BOComponentePaquete searchBO = new BOComponentePaquete();
			try
			{
                //if(!string.IsNullOrEmpty(IdSchTxtBx.Text)) searchBO.Id = Int16.Parse(IdSchTxtBx.Text);
                //if(!string.IsNullOrEmpty(NombreSchTxtBx.Text)) searchBO.Nombre = NombreSchTxtBx.Text;
                //if(!string.IsNullOrEmpty(PrecioSchTxtBx.Text)) searchBO.Precio = decimal.Parse(PrecioSchTxtBx.Text);
                //if(!string.IsNullOrEmpty(IconoSchTxtBx.Text)) searchBO.Icono = bool.Parse(IconoSchTxtBx.Text);
                //if(!string.IsNullOrEmpty(IdCCSchTxtBx.Text)) searchBO.IdCC = Int16.Parse(IdCCSchTxtBx.Text);
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected a parsing error. <br>Possible invalid input format in search fields. Exception details below.<br>" + ex.Message); return -1; }
			
			try
			{
				List<BOComponentePaquete> boComponentePaquetes = null;
				int resultCount = BOComponentePaquete.ComponentePaqueteCollectionFromSearchFieldsCount(searchBO);
				if(checkCount && (resultCount > _maxResultsCheck))
				{
					SetUserMessage("Your current filter settings will return " + resultCount.ToString() + " records. <br>Please adjust your filter settings or increase your max search results limit(750).<br>Data has not been refreshed. ");
					BindEmptyRow();
					return -1;
				}
			
				boComponentePaquetes = BOComponentePaquete.ComponentePaqueteCollectionFromSearchFields(searchBO);
				if(boComponentePaquetes.Count == 0)
				{ BindEmptyRow(); return 0; }
				
				Session["_boComponentePaquetes"] = boComponentePaquetes;
				gridView1.DataSource = boComponentePaquetes;
				gridView1.DataBind();
				return boComponentePaquetes.Count;
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
			List<BOComponentePaquete> boComponentePaquetes = (List<BOComponentePaquete>)Session["_boComponentePaquetes"];
			gridView1.DataSource = boComponentePaquetes;
			gridView1.DataBind();
		}
		
		protected void gridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
		{
			List<BOComponentePaquete> _boComponentePaquetes = (List<BOComponentePaquete>)Session["_boComponentePaquetes"];
			BOComponentePaquete boComponentePaquete = _boComponentePaquetes[e.RowIndex];
			try
			{
				TextBox txtbxNombre = (TextBox)gridView1.Rows[e.RowIndex].FindControl("NombreGridTxtBx");
				boComponentePaquete.Nombre = string.IsNullOrEmpty(txtbxNombre.Text) ? null : txtbxNombre.Text;
				TextBox txtbxPrecio = (TextBox)gridView1.Rows[e.RowIndex].FindControl("PrecioGridTxtBx");
				boComponentePaquete.Precio = string.IsNullOrEmpty(txtbxPrecio.Text) ? (decimal?)null : decimal.Parse(txtbxPrecio.Text);
				TextBox txtbxIcono = (TextBox)gridView1.Rows[e.RowIndex].FindControl("IconoGridTxtBx");
				boComponentePaquete.Icono = string.IsNullOrEmpty(txtbxIcono.Text) ? (bool?)null : bool.Parse(txtbxIcono.Text);
				DropDownList ddlIdCC = (DropDownList)gridView1.Rows[e.RowIndex].FindControl("IdCCDropDownList");
				boComponentePaquete.IdCC = string.IsNullOrEmpty(ddlIdCC.SelectedValue) ? (Int16?)null : Int16.Parse(ddlIdCC.SelectedValue);
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message);  return; }
			
			try{ boComponentePaquete.Update(); }
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message);  return; }
			finally	{	}
			
			gridView1.EditIndex = -1;
			LoadRecords(false);
			SetUserMessage("Record updated");
		}
		
		protected void gridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
		{
			List<BOComponentePaquete> _boComponentePaquetes = (List<BOComponentePaquete>)Session["_boComponentePaquetes"];
			BOComponentePaquete boComponentePaquete = _boComponentePaquetes[(gridView1.PageIndex*gridView1.PageSize)+e.RowIndex];
		
			try{ boComponentePaquete.Delete(); }
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
				BOComponentePaquete boComponentePaquete = new BOComponentePaquete();
				try
				{
					TextBox txtbxNombre = (TextBox)gridView1.FooterRow.FindControl("NombreGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxNombre.Text)) boComponentePaquete.Nombre = txtbxNombre.Text;
					TextBox txtbxPrecio = (TextBox)gridView1.FooterRow.FindControl("PrecioGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxPrecio.Text)) boComponentePaquete.Precio = decimal.Parse(txtbxPrecio.Text);
					TextBox txtbxIcono = (TextBox)gridView1.FooterRow.FindControl("IconoGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxIcono.Text)) boComponentePaquete.Icono = bool.Parse(txtbxIcono.Text);
					DropDownList ddlIdCC = (DropDownList)gridView1.FooterRow.FindControl("IdCCDropDownList");
					if(!string.IsNullOrEmpty(ddlIdCC.SelectedValue)) boComponentePaquete.IdCC = Int16.Parse(ddlIdCC.SelectedValue);
				}
				catch(Exception ex)
				{ LoadRecords(false);  SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message); return; }
				
				try{ boComponentePaquete.SaveNew(); }
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

