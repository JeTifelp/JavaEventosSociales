<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="CobrosCtrl.ascx.cs" Inherits="studio.ClassicSample.CobrosCtrl" %>
<table width="100%" style="background: aquamarine; border-style: none" border="0" cellpadding="2">
	<tr>
		<td colspan="2" align="left" valign="top" style="border-bottom: 1px solid red">
			<h1>Cobross</h1>
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
					<asp:TemplateField HeaderText="Nro" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="NroGridLbl" Text='<%# Bind("Nro") %>'  Font-Size="X-Small" ></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="LightYellow" Height="26px"></ItemStyle>
						<FooterStyle BackColor="LightYellow" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="NroGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Nro") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="NroGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Nro") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="IdCont" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="false" BackColor="White" DataValueField="Id" DataTextField="Cie" ID="IdContDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%" />
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Id" DataTextField="Cie" ID="IdContDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%"/>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Id" DataTextField="Cie" ID="IdContDropDownList" Font-Size="X-Small" BorderStyle="None" Width="100%" />
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="NombreApellido" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="NombreApellidoGridLbl" Text='<%# Bind("NombreApellido") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="NombreApellidoGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("NombreApellido") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="NombreApellidoGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("NombreApellido") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Monto" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="MontoGridLbl" Text='<%# Bind("Monto") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="MontoGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Monto") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="MontoGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Monto") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Fecha" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="FechaGridLbl" Text='<%# Bind("Fecha") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="FechaGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Fecha") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="FechaGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Fecha") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Hora" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="HoraGridLbl" Text='<%# Bind("Hora") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="HoraGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Hora") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="HoraGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Hora") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
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
						<asp:Label runat="server" ID="NroSchLbl">Nro</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="NroSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="IdContSchLbl">IdCont</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="IdContSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="NombreApellidoSchLbl">NombreApellido</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="NombreApellidoSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="MontoSchLbl">Monto</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="MontoSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="FechaSchLbl">Fecha</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="FechaSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="HoraSchLbl">Hora</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="HoraSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
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
					<td colspan="2" align="right">
						<asp:LinkButton ID="resultsBtn" runat="server" CausesValidation="False" Text="Search records"></asp:LinkButton>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
