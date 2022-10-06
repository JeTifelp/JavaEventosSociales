using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using studio.BusinessObjects;

namespace studio.ClassicSample
{
    public partial class Reserva : System.Web.UI.UserControl
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
				BOReserva boReserva = new BOReserva();
				try
				{
					
					TextBox txtbxFechaE = txtreservafechaevento;//(TextBox)gridView1.FooterRow.FindControl("FechaEGridNewTxtBx");
                    if (!string.IsNullOrEmpty(txtbxFechaE.Text)) boReserva.FechaE = DateTime.Parse(txtbxFechaE.Text).Date;
					TextBox txtbxDiasEspera =txtreservadiaespera;// (TextBox)gridView1.FooterRow.FindControl("DiasEsperaGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxDiasEspera.Text)) boReserva.DiasEspera = Int16.Parse(txtbxDiasEspera.Text);
					TextBox txtbxInterasado = txtreservainteresado;//(TextBox)gridView1.FooterRow.FindControl("InterasadoGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxInterasado.Text)) boReserva.Interasado = txtbxInterasado.Text;
					TextBox txtbxDescripcion =txtreservadescripcion;// (TextBox)gridView1.FooterRow.FindControl("DescripcionGridNewTxtBx");
					if(!string.IsNullOrEmpty(txtbxDescripcion.Text)) boReserva.Descripcion = txtbxDescripcion.Text;
				}
				catch(Exception ex)
				{ //LoadRecords(false);
                   // SetUserMessage("CodeTrigger has detected an error while parsing user input. Possible invalid data format. Detailed error message below:<br>" + ex.Message); 
                    return; }
				
				try{ 
                    boReserva.SaveNew();
                    Response.Write("<script>alert('Se relizado la reserva ');</script>");
                
                }
				catch(Exception ex)
				{// LoadRecords(false); SetUserMessage("CodeTrigger has detected an error while inserting new record. Possible foreign key violation. Detailed error message below:<br>" + ex.Message);
                    ErrorLbl.Text = "ya existe un evento en esa fecha";
                    return; }
				finally	{	}
			
				
		}
		
        

        
    }
}