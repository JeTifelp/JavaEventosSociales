<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="ContratoCtrl.ascx.cs" Inherits="studio.ClassicSample.ContratoCtrl" %>
<table width="100%" style="background: aquamarine; border-style: none" border="0" cellpadding="2">
	<tr>
		<td colspan="2" align="left" valign="top" style="border-bottom: 1px solid red">
			<h1>Contratos</h1>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="left" >
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
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="IdGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Id") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="IdGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Id") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="CostoTotal" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="CostoTotalGridLbl" Text='<%# Bind("CostoTotal") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="CostoTotalGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("CostoTotal") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="CostoTotalGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("CostoTotal") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="ACuenta" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="ACuentaGridLbl" Text='<%# Bind("ACuenta") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="ACuentaGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("ACuenta") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="ACuentaGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("ACuenta") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Saldo" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="SaldoGridLbl" Text='<%# Bind("Saldo") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="SaldoGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Saldo") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="SaldoGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Saldo") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="FechaCont" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="FechaContGridLbl" Text='<%# Bind("FechaCont") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="FechaContGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("FechaCont") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="FechaContGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("FechaCont") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Obs" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="ObsGridLbl" Text='<%# Bind("Obs") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="ObsGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Obs") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="ObsGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Obs") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Cie" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="false" BackColor="White" DataValueField="Ci" DataTextField="Ci" ID="CieDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%" />
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Ci" DataTextField="Ci" ID="CieDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%"/>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Ci" DataTextField="Ci" ID="CieDropDownList" Font-Size="X-Small" BorderStyle="None" Width="100%" />
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Cic" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="false" BackColor="White" DataValueField="Ci" DataTextField="Ci" ID="CicDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%" />
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Ci" DataTextField="Ci" ID="CicDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%"/>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Ci" DataTextField="Ci" ID="CicDropDownList" Font-Size="X-Small" BorderStyle="None" Width="100%" />
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="IdPaq" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="false" BackColor="White" DataValueField="Id" DataTextField="Nombre" ID="IdPaqDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%" />
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Id" DataTextField="Nombre" ID="IdPaqDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%"/>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Id" DataTextField="Nombre" ID="IdPaqDropDownList" Font-Size="X-Small" BorderStyle="None" Width="100%" />
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="IdEven" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="false" BackColor="White" DataValueField="Id" DataTextField="Descripcion" ID="IdEvenDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%" />
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Id" DataTextField="Descripcion" ID="IdEvenDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%"/>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Id" DataTextField="Descripcion" ID="IdEvenDropDownList" Font-Size="X-Small" BorderStyle="None" Width="100%" />
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="" ShowHeader="False" HeaderStyle-HorizontalAlign="Left">
						<ItemStyle BackColor="White" Width="110px"></ItemStyle>
						<FooterStyle BackColor="White" Width="110px"></FooterStyle>
						<EditItemTemplate>
							<asp:LinkButton ID="updateLnk" runat="server" CausesValidation="True" CommandName="Update" Text="Update"  Font-Size="X-Small"></asp:LinkButton>
							<asp:LinkButton ID="cancelInk" runat="server" CausesValidation="False" CommandName="Cancel" Text="Cancel"  Font-Size="X-Small"></asp:LinkButton>
						</EditItemTemplate>
						<FooterTemplate>
							<asp:LinkButton ID="insertLnk" runat="server" CausesValidation="False" CommandName="Insert" Text="Insert"  Font-Size="X-Small"></asp:LinkButton>
						</FooterTemplate>
						<ItemTemplate>
							<asp:LinkButton ID="editLnk" runat="server" CausesValidation="False" CommandName="Edit" Text="Edit"  Font-Size="X-Small"></asp:LinkButton>
						</ItemTemplate>
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" />
					</asp:TemplateField>
					<asp:CommandField ShowDeleteButton="True" HeaderStyle-BackColor="#4b6c9e" HeaderStyle-ForeColor="White" HeaderStyle-Height="30" ItemStyle-BackColor="White" FooterStyle-BackColor="White" ItemStyle-Font-Size="X-Small"/>
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
						<asp:Label runat="server" ID="CostoTotalSchLbl">CostoTotal</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="CostoTotalSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="ACuentaSchLbl">ACuenta</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="ACuentaSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="SaldoSchLbl">Saldo</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="SaldoSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="FechaContSchLbl">FechaCont</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="FechaContSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="ObsSchLbl">Obs</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="ObsSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="CieSchLbl">Cie</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="CieSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="CicSchLbl">Cic</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="CicSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="IdPaqSchLbl">IdPaq</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="IdPaqSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="IdEvenSchLbl">IdEven</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="IdEvenSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
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
