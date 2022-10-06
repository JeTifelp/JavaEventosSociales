<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="Reserva.ascx.cs" Inherits="studio.ClassicSample.Reserva" %>
<table width="100%" style="background: aquamarine; border-style: none" border="0" cellpadding="2">
	<tr>
		<td colspan="2" align="left" valign="top" style="border-bottom: 1px solid red">
			<h1>Realizar reserva</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="left" >
			<asp:Label ID="ErrorLbl" runat="server" Text="" ForeColor="Red"></asp:Label>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="left" style="font-size: 14px">
			<h3>Registro</h3>
		</td>
	</tr>
	<tr style="height: 500px">
		
		<td style="width: 400px; background-color:lightgray" valign="top">
			<table >
				<tr>
					<td colspan="2">
						<h3>Datos reserva</h3>
					</td>
				</tr>
				
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="FechaESchLbl">FechaE</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="txtreservafechaevento" Height="24" Width="98%" 
                            BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="DiasEsperaSchLbl">DiasEspera</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="txtreservadiaespera" Height="24" Width="98%" 
                            BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="InterasadoSchLbl">Interasado</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="txtreservainteresado" Height="24" Width="98%" 
                            BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="DescripcionSchLbl">Descripcion</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="txtreservadescripcion" Height="24" Width="98%" 
                            BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						&nbsp;</td>
				</tr>
			</table>
		    <br />
            <br />
            <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
                Text="Registrar Reserva" />
		</td>
	</tr>
</table>


