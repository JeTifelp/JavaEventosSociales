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
	public partial class PaqueteCtrl : System.Web.UI.UserControl
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
			}
			else if (e.Row.RowType == DataControlRowType.Footer)
			{
			}
		}

		private void BindEmptyRow()
		{
			List<BOPaquete> boPaquetes = new List<BOPaquete>() { new BOPaquete() };
			gridView1.DataSource = boPaquetes;
			gridView1.DataBind();
			
			gridView1.Rows[0].Visible = false;
			gridView1.Rows[0].Controls.Clear();
		}

		public int LoadRecords(bool checkCount)
		{
			BOPaquete searchBO = new BOPaquete();
			try
			{
				if(!string.IsNullOrEmpty(IdSchTxtBx.Text)) searchBO.Id = Int32.Parse(IdSchTxtBx.Text);
				if(!string.IsNullOrEmpty(NombreSchTxtBx.Text)) searchBO.Nombre = NombreSchTxtBx.Text;
				if(!string.IsNullOrEmpty(PrecioSchTxtBx.Text)) searchBO.Precio = decimal.Parse(PrecioSchTxtBx.Text);
				if(!string.IsNullOrEmpty(DescuentoSchTxtBx.Text)) searchBO.Descuento = decimal.Parse(DescuentoSchTxtBx.Text);
				if(!string.IsNullOrEmpty(PrecioTotalSchTxtBx.Text)) searchBO.PrecioTotal = decimal.Parse(PrecioTotalSchTxtBx.Text);
				if(!string.IsNullOrEmpty(GenericoSchTxtBx.Text)) searchBO.Generico = bool.Parse(GenericoSchTxtBx.Text);
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected a parsing error. <br>Possible invalid input format in search fields. Exception details below.<br>" + ex.Message); return -1; }
			
			try
			{
				List<BOPaquete> boPaquetes = null;
				int resultCount = BOPaquete.PaqueteCollectionFromSearchFieldsCount(searchBO);
				if(checkCount && (resultCount > _maxResultsCheck))
				{
					SetUserMessage("Your current filter settings will return " + resultCount.ToString() + " records. <br>Please adjust your filter settings or increase your max search results limit(750).<br>Data has not been refreshed. ");
					BindEmptyRow();
					return -1;
				}
			
				boPaquetes = BOPaquete.PaqueteCollectionFromSearchFields(searchBO);
				if(boPaquetes.Count == 0)
				{ BindEmptyRow(); return 0; }
				
				Session["_boPaquetes"] = boPaquetes;
				gridView1.DataSource = boPaquetes;
				gridView1.DataBind();
				return boPaquetes.Count;
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
			List<BOPaquete> boPaquetes = (List<BOPaquete>)Session["_boPaquetes"];
			gridView1.DataSource = boPaquetes;
			gridView1.DataBind();
		}
		
		protected void gridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
		{
			List<BOPaquete> _boPaquetes = (List<BOPaquete>)Session["_boPaquetes"];
			BOPaquete boPaquete = _boPaquetes[e.RowIndex];
			try
			{
				TextBox txtbxNombre = (TextBox)gridView1.Rows[e.RowIndex].FindControl("NombreGridTxtBx");
				boPaquete.Nombre = string.IsNullOrEmpty(txtbxNombre.Text) ? null : txtbxNombre.Text;
				TextBox txtbxPrecio = (TextBox)gridView1.Rows[e.RowIndex].FindControl("PrecioGridTxtBx");
				boPaquete.Precio = string.IsNullOrEmpty(txtbxPrecio.Text) ? (decimal?)null : decimal.Parse(txtbxPrecio.Text);
				TextBox txtbxDescuento = (TextBox)gridView1.Rows[e.RowIndex].FindControl("DescuentoGridTxtBx");
				boPaquete.Descuento = string.IsNullOrEmpty(txtbxDescuento.Text) ? (decimal?)null : decimal.Parse(txtbxDescuento.Text);
				TextBox txtbxPrecioTotal = (TextBox)gridView1.Rows[e.RowIndex].FindControl("PrecioTotalGridTxtBx");
				boPaquete.PrecioTotal = string.IsNullOrEmpty(txtbxPrecioTotal.Text) ? (decimal?)null : decimal.Parse(txtbxPrecioTotal.Text);
				TextBox txtbxGenerico = (TextBox)gridView1.Rows[e.RowIndex].FindControl("GenericoGridTxtBx");
				boPaquete.Generico = string.IsNullOrEmpty(txtbxGenerico.Text) ? (bool?)null : bool.Parse(txtbxGenerico.Text);
			}
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message);  return; }
			
			try{ boPaquete.Update(); }
			catch(Exception ex)
			{ SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message);  return; }
			finally	{	}
			
			gridView1.EditIndex = -1;
			LoadRecords(false);
			SetUserMessage("Record updated");
		}
		
		protected void gridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
		{
			List<BOPaquete> _boPaquetes = (List<BOPaquete>)Session["_boPaquetes"];
			BOPaquete boPaquete = _boPaquetes[(gridView1.PageIndex*gridView1.PageSize)+e.RowIndex];
		
			try{ boPaquete.Delete(); }
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
				BOPaquete boPaquete = new BOPaquete();
				try
				{
					TextBox txtbxNombre = (TextBox)gridView1.FooterRow.FindControl("NombreGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxNombre.Text)) boPaquete.Nombre = txtbxNombre.Text;
					TextBox txtbxPrecio = (TextBox)gridView1.FooterRow.FindControl("PrecioGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxPrecio.Text)) boPaquete.Precio = decimal.Parse(txtbxPrecio.Text);
					TextBox txtbxDescuento = (TextBox)gridView1.FooterRow.FindControl("DescuentoGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxDescuento.Text)) boPaquete.Descuento = decimal.Parse(txtbxDescuento.Text);
					TextBox txtbxPrecioTotal = (TextBox)gridView1.FooterRow.FindControl("PrecioTotalGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxPrecioTotal.Text)) boPaquete.PrecioTotal = decimal.Parse(txtbxPrecioTotal.Text);
					TextBox txtbxGenerico = (TextBox)gridView1.FooterRow.FindControl("GenericoGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxGenerico.Text)) boPaquete.Generico = bool.Parse(txtbxGenerico.Text);
				}
				catch(Exception ex)
				{ LoadRecords(false);  SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message); return; }
				
				try{ boPaquete.SaveNew(); }
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

