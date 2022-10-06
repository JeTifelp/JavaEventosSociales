<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="PersonaCtrl.ascx.cs" Inherits="studio.ClassicSample.PersonaCtrl" %>
<table width="100%" style="background: aquamarine; border-style: none" border="0" cellpadding="2">
	<tr>
		<td colspan="2" align="left" valign="top" style="border-bottom: 1px solid red">
			<h1>Personas</h1>
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
					<asp:TemplateField HeaderText="Ci" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="CiGridLbl" Text='<%# Bind("Ci") %>'  Font-Size="X-Small" ></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="LightYellow" Height="26px"></ItemStyle>
						<FooterStyle BackColor="LightYellow" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="CiGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Ci") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="CiGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Ci") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Nombre" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="NombreGridLbl" Text='<%# Bind("Nombre") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="NombreGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Nombre") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="NombreGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Nombre") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="APellidoP" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="APellidoPGridLbl" Text='<%# Bind("APellidoP") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="APellidoPGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("APellidoP") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="APellidoPGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("APellidoP") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="APellidoM" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="APellidoMGridLbl" Text='<%# Bind("APellidoM") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="APellidoMGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("APellidoM") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="APellidoMGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("APellidoM") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Direccion" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="DireccionGridLbl" Text='<%# Bind("Direccion") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="DireccionGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Direccion") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="DireccionGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Direccion") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Sexo" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="SexoGridLbl" Text='<%# Bind("Sexo") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="SexoGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Sexo") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="SexoGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Sexo") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Telefono" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="TelefonoGridLbl" Text='<%# Bind("Telefono") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="TelefonoGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Telefono") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="TelefonoGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Telefono") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Email" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="EmailGridLbl" Text='<%# Bind("Email") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="EmailGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Email") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="EmailGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Email") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
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
						<asp:Label runat="server" ID="CiSchLbl">Ci</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="CiSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
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
					<td style="width: 200px">
						<asp:Label runat="server" ID="APellidoPSchLbl">APellidoP</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="APellidoPSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="APellidoMSchLbl">APellidoM</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="APellidoMSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="DireccionSchLbl">Direccion</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="DireccionSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="SexoSchLbl">Sexo</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="SexoSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="TelefonoSchLbl">Telefono</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="TelefonoSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="EmailSchLbl">Email</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="EmailSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
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
