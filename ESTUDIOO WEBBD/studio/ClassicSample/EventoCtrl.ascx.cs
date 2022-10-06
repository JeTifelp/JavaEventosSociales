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
	public partial class EventoCtrl : System.Web.UI.UserControl
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
				DropDownList ddlIdTE = ((DropDownList) e.Row.FindControl("IdTEDropDownList"));
				ddlIdTE.DataSource = StaticBindings.StaticBindings.GetTipoEventoList();
				ddlIdTE.DataBind();
				ddlIdTE.SelectedIndex = ((BOEvento)(e.Row.DataItem)).IdTE == null ? -1 : ddlIdTE.Items.IndexOf(ddlIdTE.Items.FindByValue(((BOEvento)(e.Row.DataItem)).IdTE.ToString()));
			}
			else if (e.Row.RowType == DataControlRowType.Footer)
			{
				DropDownList ddlIdTE = ((DropDownList) e.Row.FindControl("IdTEDropDownList"));
				ddlIdTE.DataSource = StaticBindings.StaticBindings.GetTipoEventoList();
				ddlIdTE.DataBind();
				ddlIdTE.SelectedIndex = -1;
			}
		}

		private void BindEmptyRow()
		{
			List<BOEvento> boEventos = new List<BOEvento>() { new BOEvento() };
			gridView1.DataSource = boEventos;
			gridView1.DataBind();
			
			gridView1.Rows[0].Visible = false;
			gridView1.Rows[0].Controls.Clear();
		}

		public int LoadRecords(bool checkCount)
		{
			BOEvento searchBO = new BOEvento();
			try
			{
				if(!string.IsNullOrEmpty(IdSchTxtBx.Text)) searchBO.Id = Int32.Parse(IdSchTxtBx.Text);
				if(!string.IsNullOrEmpty(FechaSchTxtBx.Text)) searchBO.Fecha = DateTime.Parse(FechaSchTxtBx.Text);
				if(!string.IsNullOrEmpty(DescripcionSchTxtBx.Text)) searchBO.Descripcion = DescripcionSchTxtBx.Text;
				if(!string.IsNullOrEmpty(HoraSchTxtBx.Text)) searchBO.Hora = TimeSpan.Parse(HoraSchTxtBx.Text);
				if(!string.IsNullOrEmpty(IdTESchTxtBx.Text)) searchBO.IdTE = Int16.Parse(IdTESchTxtBx.Text);
				if(!string.IsNullOrEmpty(LatitudSchTxtBx.Text)) searchBO.Latitud = decimal.Parse(LatitudSchTxtBx.Text);
				if(!string.IsNullOrEmpty(LongitudSchTxtBx.Text)) searchBO.Longitud = decimal.Parse(LongitudSchTxtBx.Text);
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected a parsing error. <br>Possible invalid input format in search fields. Exception details below.<br>" + ex.Message); return -1; }
			
			try
			{
				List<BOEvento> boEventos = null;
				int resultCount = BOEvento.EventoCollectionFromSearchFieldsCount(searchBO);
				if(checkCount && (resultCount > _maxResultsCheck))
				{
					SetUserMessage("Your current filter settings will return " + resultCount.ToString() + " records. <br>Please adjust your filter settings or increase your max search results limit(750).<br>Data has not been refreshed. ");
					BindEmptyRow();
					return -1;
				}
			
				boEventos = BOEvento.EventoCollectionFromSearchFields(searchBO);
				if(boEventos.Count == 0)
				{ BindEmptyRow(); return 0; }
				
				Session["_boEventos"] = boEventos;
				gridView1.DataSource = boEventos;
				gridView1.DataBind();
				return boEventos.Count;
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
			List<BOEvento> boEventos = (List<BOEvento>)Session["_boEventos"];
			gridView1.DataSource = boEventos;
			gridView1.DataBind();
		}
		
		protected void gridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
		{
			List<BOEvento> _boEventos = (List<BOEvento>)Session["_boEventos"];
			BOEvento boEvento = _boEventos[e.RowIndex];
			try
			{
				TextBox txtbxFecha = (TextBox)gridView1.Rows[e.RowIndex].FindControl("FechaGridTxtBx");
				boEvento.Fecha = string.IsNullOrEmpty(txtbxFecha.Text) ? (DateTime?)null : DateTime.Parse(txtbxFecha.Text);
				TextBox txtbxDescripcion = (TextBox)gridView1.Rows[e.RowIndex].FindControl("DescripcionGridTxtBx");
				boEvento.Descripcion = string.IsNullOrEmpty(txtbxDescripcion.Text) ? null : txtbxDescripcion.Text;
				TextBox txtbxHora = (TextBox)gridView1.Rows[e.RowIndex].FindControl("HoraGridTxtBx");
				boEvento.Hora = string.IsNullOrEmpty(txtbxHora.Text) ? (TimeSpan?)null : TimeSpan.Parse(txtbxHora.Text);
				DropDownList ddlIdTE = (DropDownList)gridView1.Rows[e.RowIndex].FindControl("IdTEDropDownList");
				boEvento.IdTE = string.IsNullOrEmpty(ddlIdTE.SelectedValue) ? (Int16?)null : Int16.Parse(ddlIdTE.SelectedValue);
				TextBox txtbxLatitud = (TextBox)gridView1.Rows[e.RowIndex].FindControl("LatitudGridTxtBx");
				boEvento.Latitud = string.IsNullOrEmpty(txtbxLatitud.Text) ? (decimal?)null : decimal.Parse(txtbxLatitud.Text);
				TextBox txtbxLongitud = (TextBox)gridView1.Rows[e.RowIndex].FindControl("LongitudGridTxtBx");
				boEvento.Longitud = string.IsNullOrEmpty(txtbxLongitud.Text) ? (decimal?)null : decimal.Parse(txtbxLongitud.Text);
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message);  return; }
			
			try{ boEvento.Update(); }
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message);  return; }
			finally	{	}
			
			gridView1.EditIndex = -1;
			LoadRecords(false);
			SetUserMessage("Record updated");
		}
		
		protected void gridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
		{
			List<BOEvento> _boEventos = (List<BOEvento>)Session["_boEventos"];
			BOEvento boEvento = _boEventos[(gridView1.PageIndex*gridView1.PageSize)+e.RowIndex];
		
			try{ boEvento.Delete(); }
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
				BOEvento boEvento = new BOEvento();
				try
				{
					TextBox txtbxId = (TextBox)gridView1.FooterRow.FindControl("IdGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxId.Text)) boEvento.Id = Int32.Parse(txtbxId.Text);
					TextBox txtbxFecha = (TextBox)gridView1.FooterRow.FindControl("FechaGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxFecha.Text)) boEvento.Fecha = DateTime.Parse(txtbxFecha.Text);
					TextBox txtbxDescripcion = (TextBox)gridView1.FooterRow.FindControl("DescripcionGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxDescripcion.Text)) boEvento.Descripcion = txtbxDescripcion.Text;
					TextBox txtbxHora = (TextBox)gridView1.FooterRow.FindControl("HoraGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxHora.Text)) boEvento.Hora = TimeSpan.Parse(txtbxHora.Text);
					DropDownList ddlIdTE = (DropDownList)gridView1.FooterRow.FindControl("IdTEDropDownList");
					if(!string.IsNullOrEmpty(ddlIdTE.SelectedValue)) boEvento.IdTE = Int16.Parse(ddlIdTE.SelectedValue);
					TextBox txtbxLatitud = (TextBox)gridView1.FooterRow.FindControl("LatitudGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxLatitud.Text)) boEvento.Latitud = decimal.Parse(txtbxLatitud.Text);
					TextBox txtbxLongitud = (TextBox)gridView1.FooterRow.FindControl("LongitudGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxLongitud.Text)) boEvento.Longitud = decimal.Parse(txtbxLongitud.Text);
				}
				catch(Exception ex)
				{ LoadRecords(false);  SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message); return; }
				
				try{ boEvento.SaveNew(); }
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

