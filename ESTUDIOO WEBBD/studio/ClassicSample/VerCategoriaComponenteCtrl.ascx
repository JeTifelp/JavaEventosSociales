<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="VerCategoriaComponenteCtrl.ascx.cs" Inherits="studio.ClassicSample.VerCategoriaComponenteCtrl" %>
<table width="100%" style="background: aquamarine; border-style: none" border="0" cellpadding="2">
	<tr>
		<td colspan="2" align="left" valign="top" style="border-bottom: 1px solid red">
			<h1>VerCategoriaComponentes</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="left" >
			<asp:Label runat="server" Text="No primary key is defined in data store, therefore no add/edit/update functionality generated in sample client"></asp:Label>
			<br>
			<asp:Label ID="ErrorLbl" runat="server" Text="" ForeColor="Red"></asp:Label>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="left" style="font-size: 14px">
			<h3><asp:Label runat="server" Text="Search Results"></asp:Label></h3>
		</td>
	</tr>
	<tr style="height: 500px">
		<td valign="top" style="background: lightblue;" width="70%">
			<asp:GridView ID="gridView1" runat="server" Width="100%" AutoGenerateColumns="False" ShowFooter="true" AllowPaging="True" PageSize="15" BorderStyle="None">
				<Columns>
					<asp:TemplateField HeaderText="Id" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="IdGridLbl" Text='<%# Bind("Id") %>'  Font-Size="X-Small" ></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="LightYellow" Height="26px"></ItemStyle>
						<FooterStyle BackColor="LightYellow" Height="26px" />
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Nombre" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="NombreGridLbl" Text='<%# Bind("Nombre") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
					</asp:TemplateField>
				</Columns>
			</asp:GridView>
		</td>
		<td style="width: 400px; background-color:lightgray" valign="top">
			<table style="width: 100%; padding-right:8px; padding-left:8px" >
				<tr>
					<td colspan="2">
						<h3><asp:Label ID="Label1" runat="server" Text="Search Filter [wildcard '%']"></asp:Label></h3>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="IdSchLbl">Id</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="IdSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="NombreSchLbl">Nombre</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="NombreSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<asp:LinkButton ID="resultsBtn" runat="server" CausesValidation="False" Text="Search records"></asp:LinkButton>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
