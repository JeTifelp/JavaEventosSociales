
package IG;

import java.awt.Frame;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class RegistrarSuperUsuario extends javax.swing.JDialog {

    private String ruta;
    public RegistrarSuperUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);        
        sSueldo.setValue((short)10000);
        dcFechaReg.setDate(new Date());
        dcFechaNac.setDate(new Date("September 28, 1991"));  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        Fondo = new jcMousePanel.jcMousePanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        tfCI = new JAbcFieldWPO.JAbcFieldWPO();
        tfNombre = new JAbcFieldWPO.JAbcFieldWPO();
        tfApellidoP = new JAbcFieldWPO.JAbcFieldWPO();
        tfApellidoM = new JAbcFieldWPO.JAbcFieldWPO();
        tfDireccion = new JAbcFieldWPO.JAbcFieldWPO();
        tfTelefono = new JAbcFieldWPO.JAbcFieldWPO();
        cbSexoH = new javax.swing.JCheckBox();
        cbSexoM = new javax.swing.JCheckBox();
        cbCargo = new javax.swing.JComboBox();
        sSueldo = new javax.swing.JSpinner();
        lbDU = new javax.swing.JLabel();
        lbDE1 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        tfLogin = new JAbcFieldWPO.JAbcFieldWPO();
        lb13 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        lb14 = new javax.swing.JLabel();
        tfConfirmarP = new javax.swing.JPasswordField();
        btAceptar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        dcFechaReg = new com.toedter.calendar.JDateChooser();
        dcFechaNac = new com.toedter.calendar.JDateChooser();
        lb15 = new javax.swing.JLabel();
        tfEmail = new JAbcFieldWPO.JAbcFieldWPO();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(2);
        Fondo.setVisibleLogo(false);

        lb1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("Administrador de Sistemas");

        lb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb2.setText("CI:");

        lb3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb3.setText("Nombre:");

        lb4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb4.setText("Apellido Paterno:");

        lb5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb5.setText("Apellido Materno:");

        lb6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb6.setText("Direccion:");

        lb7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb7.setText("Telefono:");

        lb8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb8.setText("Fecha de Registro:");

        lb9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb9.setText("Cargo :");

        lb11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb11.setText("Nacido el:");

        lb10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb10.setText("Sueldo:");

        tfCI.setText("4604257");
        tfCI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCI.setMaxLength(10);
        tfCI.setMessageText("Obligatorio");
        tfCI.setOptionalText(false);
        tfCI.setTipo(((byte)2));

        tfNombre.setText("Wilber");
        tfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNombre.setMaxLength(30);
        tfNombre.setMessageText("Obligatorio");
        tfNombre.setOptionalText(false);
        tfNombre.setTipo(((byte)2));

        tfApellidoP.setText("Padilla");
        tfApellidoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfApellidoP.setMaxLength(20);
        tfApellidoP.setMessageText("Obligatorio");
        tfApellidoP.setOptionalText(false);
        tfApellidoP.setTipo(((byte)2));

        tfApellidoM.setText("Orellana");
        tfApellidoM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfApellidoM.setMaxLength(20);
        tfApellidoM.setMessageText("Opcional");
        tfApellidoM.setTipo(((byte)2));

        tfDireccion.setText("SCZ - Andres Ibañes - El Torno - B/Villa Norte - Calle Santa Cruz #30");
        tfDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfDireccion.setMessageText("Opcional");
        tfDireccion.setTipo(((byte)2));

        tfTelefono.setText("77011049");
        tfTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfTelefono.setMaxLength(15);
        tfTelefono.setMessageText("Opcional");
        tfTelefono.setTipo(((byte)2));

        bgSexo.add(cbSexoH);
        cbSexoH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSexoH.setSelected(true);
        cbSexoH.setText("Hombre");

        bgSexo.add(cbSexoM);
        cbSexoM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSexoM.setText("Mujer");

        cbCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gerente", "Administrador", "Secretaria" }));

        sSueldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sSueldo.setModel(new javax.swing.SpinnerNumberModel(Short.valueOf((short)0), Short.valueOf((short)0), null, Short.valueOf((short)1)));
        sSueldo.setVerifyInputWhenFocusTarget(false);

        lbDU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDU.setText("Datos del Empleado");

        lbDE1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDE1.setText("Datos del Empleado");

        lb12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb12.setText("Usuario:");

        tfLogin.setText("ADMIN");
        tfLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfLogin.setMessageText("Obligatorio");
        tfLogin.setOptionalText(false);
        tfLogin.setTipo(((byte)2));

        lb13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb13.setText("Contraseña:");

        tfPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfPassword.setText("ADMIN");

        lb14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb14.setText("Confirmar Contraseña:");

        tfConfirmarP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfConfirmarP.setText("ADMIN");

        btAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });

        btNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        dcFechaReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dcFechaNac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lb15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb15.setText("Email:");

        tfEmail.setText("wilb928_@hotmail.com");
        tfEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEmail.setMaxLength(100);
        tfEmail.setMessageText("Obligatorio");
        tfEmail.setOptionalText(false);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lb15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lb5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(FondoLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lb2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lb3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(FondoLayout.createSequentialGroup()
                                                    .addComponent(lb7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(FondoLayout.createSequentialGroup()
                                                    .addComponent(cbSexoH, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cbSexoM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(FondoLayout.createSequentialGroup()
                                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(tfApellidoP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                    .addComponent(tfApellidoM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                    .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                    .addComponent(tfCI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                    .addComponent(cbCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(FondoLayout.createSequentialGroup()
                                                        .addComponent(lb6)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lb8)
                                                            .addComponent(lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lb10))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(sSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(dcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(dcFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(8, 8, 8))))))
                                    .addComponent(lbDE1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(lb12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                                                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lb13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb14))
                                        .addGap(18, 18, 18)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfConfirmarP, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lb9, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb1)
                .addGap(18, 18, 18)
                .addComponent(lbDE1)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(tfCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSexoH)
                    .addComponent(cbSexoM))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb7)
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb15)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb8))
                    .addComponent(dcFechaReg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb9)
                        .addComponent(lb10))
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lbDU)
                .addGap(27, 27, 27)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfConfirmarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb12)
                            .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAceptar)
                            .addComponent(btNuevo))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        if(tfCI.isValueOk()&&tfNombre.isValueOk()&&tfApellidoP.isValueOk()&&sSueldo.getValue()!=null&&
        (cbSexoH.isSelected()||cbSexoM.isSelected())&&dcFechaNac.getDate()!=null&&tfEmail.isValueOk()
         &&tfLogin.isValueOk()){
            if(!tfPassword.getText().equals(tfConfirmarP.getText())){
                JOptionPane.showMessageDialog(null, "Verifique que los password sean iguales!!!", 
                        "Setup", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String apm=(tfApellidoM.getText().isEmpty())?"null":"'"+tfApellidoM.getText()+"'";
            String dir=(tfDireccion.getText().isEmpty())?"null":"'"+tfDireccion.getText()+"'";
            String telf=(tfTelefono.getText().isEmpty())?"null":"'"+tfTelefono.getText()+"'";            
            String datosP="'"+tfCI.getText()+"','"+tfNombre.getText()+"','"+tfApellidoP.getText()+"',"+
                   apm+","+dir+","+((cbSexoH.isSelected())?1:0)+","+telf+",'"+tfEmail.getText()+"'";
            String fechNac=Sql.castDate(dcFechaNac.getDate());
            String datosE="'"+tfCI.getText()+"',"+(cbCargo.getSelectedIndex()+1)+","+fechNac+","+
                   (short)sSueldo.getValue()+",GETDATE()";
            try {
                Sql.ejecutarComando("INSERT INTO PERSONA VALUES("+datosP+")");
                Sql.ejecutarComando("INSERT INTO EMPLEADO VALUES("+datosE+")");
                Sql.commit();
                String grupo="ADMINISTRADOR DE SISTEMAS|VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*VVVV*V*V*V*";
                String usuario=tfLogin.getText()+"|"+tfPassword.getText()+"|ADMINISTRADOR DE SISTEMAS"+
                               "|"+tfCI.getText()+"|";
                Persistencia.insertar(grupo,ruta,"Grupo");
                Persistencia.insertar(usuario,ruta, "Usuario");                                
                JOptionPane.showMessageDialog(null, "Super usuario del sistema\n Agregado exitosamente!!!", 
                                            "Setup", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch (SQLException ex) {
                Sql.rollback();
                Sql.logCat("RegistrarSuperUsuario.btAceptarActionPerformed\n"+ex);
                JOptionPane.showMessageDialog(null, "Error: vuelva a intentarlo!!!", 
                        "Setup", JOptionPane.ERROR_MESSAGE);
            }            
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos!!!", 
                    "Setup", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        clear();
    }//GEN-LAST:event_btNuevoActionPerformed

    public static String getADM(final Frame parent,final String BDUP) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarSuperUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */ final String[] ADM={""};
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override            
            public void run() {
                Sql.conectarSQLServer(BDUP, BDUP, BDUP);
                RegistrarSuperUsuario RSU=new RegistrarSuperUsuario(parent, true);
                RSU.setVisible(true);
                Sql.desconectar();
                ADM[0]=RSU.tfLogin.getText();
            }
        });
        return ADM[0];
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jcMousePanel.jcMousePanel Fondo;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JComboBox cbCargo;
    private javax.swing.JCheckBox cbSexoH;
    private javax.swing.JCheckBox cbSexoM;
    private com.toedter.calendar.JDateChooser dcFechaNac;
    private com.toedter.calendar.JDateChooser dcFechaReg;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lbDE1;
    private javax.swing.JLabel lbDU;
    private javax.swing.JSpinner sSueldo;
    private JAbcFieldWPO.JAbcFieldWPO tfApellidoM;
    private JAbcFieldWPO.JAbcFieldWPO tfApellidoP;
    private JAbcFieldWPO.JAbcFieldWPO tfCI;
    private javax.swing.JPasswordField tfConfirmarP;
    private JAbcFieldWPO.JAbcFieldWPO tfDireccion;
    private JAbcFieldWPO.JAbcFieldWPO tfEmail;
    private JAbcFieldWPO.JAbcFieldWPO tfLogin;
    private JAbcFieldWPO.JAbcFieldWPO tfNombre;
    private javax.swing.JPasswordField tfPassword;
    private JAbcFieldWPO.JAbcFieldWPO tfTelefono;
    // End of variables declaration//GEN-END:variables

    public void clear(){
        tfCI.clear();
        tfNombre.clear();
        tfApellidoP.clear();
        tfApellidoM.clear();
        tfDireccion.clear();
        bgSexo.clearSelection();
        tfTelefono.clear();        
        cbCargo.setSelectedIndex(0);
        sSueldo.setValue(0);
        dcFechaNac.setDate(null);
        tfLogin.clear();
        tfPassword.setText("");
        tfConfirmarP.setText("");
        tfEmail.clear();
    }     
    
    public String getADM(String ruta) {        
        this.ruta=ruta;
        this.setVisible(true);
        Sql.desconectar();
        return tfLogin.getText();
    }    
}
