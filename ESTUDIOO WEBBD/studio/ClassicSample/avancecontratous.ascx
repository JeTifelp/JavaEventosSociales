<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="avancecontratous.ascx.cs" Inherits="studio.ClassicSample.avancecontratous" %>
<table width="100%" style="background: aquamarine; border-style: none" border="0" cellpadding="2">
	<tr>
		<td colspan="3" align="left" valign="top" style="border-bottom: 1px solid red">
			<h1>Reservas</h1>
		</td>
	</tr>
	<tr>
		<td colspan="3" align="left" >
			<asp:Label ID="ErrorLbl" runat="server" Text="" ForeColor="Red"></asp:Label>
		</td>
	</tr>
	<tr>
		<td colspan="3" align="left" style="font-size: 14px">
			<h3>
			<table style="width: 34%; padding-right:8px; padding-left:8px" >
				<tr>
					<td style="width: 200px">
						E-mail</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="emailTXTbx" Height="24" Width="98%" 
                            BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						Contraseña</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="CicSchTxtBx" Height="24" Width="98%" 
                            BorderStyle="None" TextMode="Password"></asp:TextBox>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="right">
						<asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
                            Text="Ver avance de contrato" />
					</td>
				</tr>
			</table>
		    </h3>
		</td>
	</tr>
	<tr style="height: 500px">
		<td valign="top" style="background: lightblue;" width="70%">
			<asp:GridView ID="gridView1" runat="server" Width="100%" 
                AutoGenerateColumns="False" ShowFooter="True" AllowPaging="True" PageSize="15" 
                BorderStyle="None">
				<Columns>
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
					<asp:TemplateField HeaderText="Nombre" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterStyle BackColor="White" Height="26px" />
					</asp:TemplateField>
					<asp:TemplateField HeaderText="ApellidoP" >
						<FooterStyle BackColor="White" Height="26px" />
						<ItemTemplate>
                            <asp:Label ID="Label2" runat="server" Text="Label"></asp:Label>
                        </ItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="apellidoM" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<ItemTemplate>
                            <asp:Label ID="Label3" runat="server" Text="Label"></asp:Label>
                        </ItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterStyle BackColor="White" Height="26px" />
					</asp:TemplateField>
				</Columns>
			</asp:GridView>
		</td>
		<td valign="top" style="background: lightblue;" width="70%">
			&nbsp;</td>
		<td style="width: 400px; background-color:lightgray" valign="top">
			&nbsp;</td>
	</tr>
</table>

