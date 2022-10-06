<%@ Control Language="C#" AutoEventWireup="true" CodeBehind="EmpleadoCtrl.ascx.cs" Inherits="studio.ClassicSample.EmpleadoCtrl" %>
<table width="100%" style="background: aquamarine; border-style: none" border="0" cellpadding="2">
	<tr>
		<td colspan="2" align="left" valign="top" style="border-bottom: 1px solid red">
			<h1>Empleados</h1>
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
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="false" BackColor="White" DataValueField="Ci" DataTextField="Nombre" ID="CiDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%" />
						</ItemTemplate>
						<ItemStyle BackColor="LightYellow" Height="26px"></ItemStyle>
						<FooterStyle BackColor="LightYellow" Height="26px" />
						<EditItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Ci" DataTextField="Nombre" ID="CiDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%"/>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Ci" DataTextField="Nombre" ID="CiDropDownList" Font-Size="X-Small" BorderStyle="None" Width="100%" />
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="IdCL" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="false" BackColor="White" DataValueField="Id" DataTextField="Nombre" ID="IdCLDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%" />
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Id" DataTextField="Nombre" ID="IdCLDropDownList" Font-Size="X-Small" BorderStyle="None"  Width="100%"/>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:DropDownList runat="server" AutoPostBack="false" Enabled="true" BackColor="White" ForeColor="Green" DataValueField="Id" DataTextField="Nombre" ID="IdCLDropDownList" Font-Size="X-Small" BorderStyle="None" Width="100%" />
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="FechaNac" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="FechaNacGridLbl" Text='<%# Bind("FechaNac") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="FechaNacGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("FechaNac") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="FechaNacGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("FechaNac") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="Sueldo" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="SueldoGridLbl" Text='<%# Bind("Sueldo") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="SueldoGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Sueldo") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="SueldoGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("Sueldo") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</FooterTemplate>
					</asp:TemplateField>
					<asp:TemplateField HeaderText="FechaIng" >
						<HeaderStyle BackColor="#4b6c9e" ForeColor="White" Height="30" Font-Size="X-Small"/>
						<ItemTemplate>
							<asp:Label runat="server" ID="FechaIngGridLbl" Text='<%# Bind("FechaIng") %>'  Font-Size="X-Small" ForeColor="Black"></asp:Label>
						</ItemTemplate>
						<ItemStyle BackColor="White" Height="26px"></ItemStyle>
						<FooterStyle BackColor="White" Height="26px" />
						<EditItemTemplate>
							<asp:TextBox runat="server" ID="FechaIngGridTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("FechaIng") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
						</EditItemTemplate>
						<FooterStyle BackColor="White" Height="26px" />
						<FooterTemplate>
							<asp:TextBox runat="server" ID="FechaIngGridNewTxtBx" BackColor="White" ForeColor="Green" Text='<%# Bind("FechaIng") %>' Width="98%" BorderStyle="None"  Font-Size="X-Small"></asp:TextBox>
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
						<asp:Label runat="server" ID="IdCLSchLbl">IdCL</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="IdCLSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="FechaNacSchLbl">FechaNac</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="FechaNacSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="SueldoSchLbl">Sueldo</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="SueldoSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
					</td>
				</tr>
				<tr>
					<td style="width: 200px">
						<asp:Label runat="server" ID="FechaIngSchLbl">FechaIng</asp:Label>
					</td>
					<td style="width: 200px">
						<asp:TextBox runat="server" ID="FechaIngSchTxtBx" Height="24" Width="98%" BorderStyle="None"></asp:TextBox>
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
