using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using studio.BusinessObjects;

namespace studio.ClassicSample
{
    public partial class avancecontratous : System.Web.UI.UserControl
    {
        private int _maxResultsCheck = 750;
        protected void Page_Load(object sender, EventArgs e)
        {

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
                //if (!string.IsNullOrEmpty(IdSchTxtBx.Text)) searchBO.Id = Int32.Parse(IdSchTxtBx.Text);
                //if (!string.IsNullOrEmpty(CostoTotalSchTxtBx.Text)) searchBO.CostoTotal = decimal.Parse(CostoTotalSchTxtBx.Text);
                //if (!string.IsNullOrEmpty(ACuentaSchTxtBx.Text)) searchBO.ACuenta = decimal.Parse(ACuentaSchTxtBx.Text);
                //if (!string.IsNullOrEmpty(SaldoSchTxtBx.Text)) searchBO.Saldo = decimal.Parse(SaldoSchTxtBx.Text);
                //if (!string.IsNullOrEmpty(FechaContSchTxtBx.Text)) searchBO.FechaCont = DateTime.Parse(FechaContSchTxtBx.Text);
                //if (!string.IsNullOrEmpty(ObsSchTxtBx.Text)) searchBO.Obs = ObsSchTxtBx.Text;
                //if (!string.IsNullOrEmpty(CieSchTxtBx.Text)) searchBO.Cie = CieSchTxtBx.Text;
                if (!string.IsNullOrEmpty(CicSchTxtBx.Text)) searchBO.Cic = CicSchTxtBx.Text;
                //if (!string.IsNullOrEmpty(IdPaqSchTxtBx.Text)) searchBO.IdPaq = Int32.Parse(IdPaqSchTxtBx.Text);
                //if (!string.IsNullOrEmpty(IdEvenSchTxtBx.Text)) searchBO.IdEven = Int32.Parse(IdEvenSchTxtBx.Text);
            }
            catch (Exception ex)
            { SetUserMessage("CodeTrigger has detected a parsing error. <br>Possible invalid input format in search fields. Exception details below.<br>" + ex.Message); return -1; }

            try
            {
                List<BOContrato> boContratos = null;
                int resultCount = BOContrato.ContratoCollectionFromSearchFieldsCount(searchBO);
                if (checkCount && (resultCount > _maxResultsCheck))
                {
                    SetUserMessage("Your current filter settings will return " + resultCount.ToString() + " records. <br>Please adjust your filter settings or increase your max search results limit(750).<br>Data has not been refreshed. ");
                    BindEmptyRow();
                    return -1;
                }

                boContratos = BOContrato.avancecontrato(searchBO);
                if (boContratos.Count == 0)
                { BindEmptyRow(); return 0; }

                Session["_boContratos"] = boContratos;
                gridView1.DataSource = boContratos;
                gridView1.DataBind();
                return boContratos.Count;
            }
            catch (Exception ex)
            { SetUserMessage("CodeTrigger has detected an error while loading records from data store. Detailed error message below:<br>" + ex.Message); return -1; }
            finally { }
        }
        private void SetUserMessage(string msg)
        { ErrorLbl.Text = msg; }

        private void ClearUserMessage()
        { ErrorLbl.Text = ""; }

        protected void Button1_Click(object sender, EventArgs e)
        {
            BOPersona cliente = new BOPersona();
            cliente.Ci = CicSchTxtBx.Text;
            List<BOPersona> clientes = BOPersona.PersonaCollectionFromSearchFields(cliente);
            if (clientes.Count > 0)
            {
                if (emailTXTbx.Text != clientes.ElementAtOrDefault(0).Email)
                {
                    SetUserMessage("email incorrecto");
                    return;
                }
            }
            int count = LoadRecords(true);
            if (count > -1) SetUserMessage(count.ToString() + " record(s) loaded from data store");
        }
    }
}