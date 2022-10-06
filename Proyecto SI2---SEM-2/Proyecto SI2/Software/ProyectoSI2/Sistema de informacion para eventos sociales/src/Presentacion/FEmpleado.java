
package Presentacion;

import Datos.CargoLaboral;
import Datos.Empleado;
import Datos.Persona;
import Negocio.Msj;
import Negocio.NEmpleado;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

public final class FEmpleado extends javax.swing.JDialog implements INF412{

    private final Empleado empleado;
    private final Persona persona;    
    
    public FEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Init.setImagenLogo(Fondo);
        empleado=new Empleado();
        persona=new Persona();
        empleado.setPersona(persona);   
        empleado.setCargoLaboral(new CargoLaboral());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        pmTabla = new javax.swing.JPopupMenu();
        miBuscar = new javax.swing.JMenuItem();
        miActualizarTabla = new javax.swing.JMenuItem();
        Fondo = new jcMousePanel.jcMousePanel();
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
        lbEdad = new javax.swing.JLabel();
        tfCI = new JAbcFieldWPO.JAbcFieldWPO();
        tfNombre = new JAbcFieldWPO.JAbcFieldWPO();
        tfApellidoP = new JAbcFieldWPO.JAbcFieldWPO();
        tfApellidoM = new JAbcFieldWPO.JAbcFieldWPO();
        tfDireccion = new JAbcFieldWPO.JAbcFieldWPO();
        tfTelefono = new JAbcFieldWPO.JAbcFieldWPO();
        cbSexoH = new javax.swing.JCheckBox();
        cbSexoM = new javax.swing.JCheckBox();
        dcFechaReg = new com.toedter.calendar.JDateChooser();
        dcFechaNac = new com.toedter.calendar.JDateChooser();
        cbCargo = new javax.swing.JComboBox();
        sSueldo = new javax.swing.JSpinner();
        spDatos = new javax.swing.JScrollPane();
        tDatos = new JTableDX.JTableDX();
        btNuevo = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        lb12 = new javax.swing.JLabel();
        tfEmail = new JAbcFieldWPO.JAbcFieldWPO();

        miBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        miBuscar.setText("Buscar");
        miBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarActionPerformed(evt);
            }
        });
        pmTabla.add(miBuscar);

        miActualizarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        miActualizarTabla.setText("Actualizar la tabla");
        miActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActualizarTablaActionPerformed(evt);
            }
        });
        pmTabla.add(miActualizarTabla);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de empleados");

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(4);
        Fondo.setTransparencia(1.0F);
        Fondo.setVisibleLogo(false);

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

        lbEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbEdad.setText("Edad:");

        tfCI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCI.setMessageText("Obligatorio");
        tfCI.setOptionalText(false);

        tfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNombre.setMessageText("Obligatorio");
        tfNombre.setOptionalText(false);

        tfApellidoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfApellidoP.setMessageText("Obligatorio");
        tfApellidoP.setOptionalText(false);

        tfApellidoM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfApellidoM.setMessageText("Opcional");

        tfDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfDireccion.setMessageText("Opcional");

        tfTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfTelefono.setMessageText("Opcional");

        bgSexo.add(cbSexoH);
        cbSexoH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSexoH.setSelected(true);
        cbSexoH.setText("Hombre");

        bgSexo.add(cbSexoM);
        cbSexoM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSexoM.setText("Mujer");

        dcFechaReg.setDate(Init.fechaActual);
        dcFechaReg.setEnabled(false);
        dcFechaReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dcFechaNac.setDate(Init.fechaActual);
        dcFechaNac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sSueldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sSueldo.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(100.0f), Float.valueOf(100.0f), null, Float.valueOf(1.0f)));

        spDatos.setComponentPopupMenu(pmTabla);

        tDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CI", "Nombre y apellidos", "Genero", "Telefono", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDatos.setComponentPopupMenu(pmTabla);
        spDatos.setViewportView(tDatos);

        btNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar.png"))); // NOI18N
        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        btModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eleminar.png"))); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        lb12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb12.setText("Email:");

        tfEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEmail.setMessageText("Opcional");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(FondoLayout.createSequentialGroup()
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(FondoLayout.createSequentialGroup()
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfCI, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(FondoLayout.createSequentialGroup()
                                            .addComponent(lb6)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                                                .addComponent(lb8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dcFechaReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(lb7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(cbSexoH, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbSexoM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                            .addComponent(lb9)
                            .addGap(18, 18, 18)
                            .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lb10)
                            .addGap(18, 18, 18)
                            .addComponent(sSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FondoLayout.createSequentialGroup()
                            .addComponent(spDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))
                        .addComponent(lb12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
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
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb7)
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb8))
                    .addComponent(dcFechaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb9)
                            .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb10)
                            .addComponent(sSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(spDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btModificar)
                    .addComponent(btEliminar)
                    .addComponent(btAgregar)
                    .addComponent(btNuevo))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        clear();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        if(cbCargo.getSelectedIndex()>-1){
            persona.setCi(tfCI.getText());
            persona.setNombre(tfNombre.getText());
            persona.setApellidoP(tfApellidoP.getText());
            persona.setApellidoM(tfApellidoM.getText());
            persona.setSexo(cbSexoH.isSelected());
            persona.setDireccion(tfDireccion.getText());
            persona.setTelefono(tfTelefono.getText());
            persona.setEmail(tfEmail.getText());
            empleado.setCi(tfCI.getText());        
            empleado.setFechaNac(dcFechaNac.getDate());
            empleado.setSueldo(((Number)sSueldo.getValue()).floatValue());        
            empleado.setCargoLaboral((CargoLaboral)cbCargo.getSelectedItem());
            NEmpleado.agregar(empleado);
        }else{
            Msj.showW("Selecione un Cargo Laboral!!!", "Empleado");
        }
    }//GEN-LAST:event_btAgregarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        if(cbCargo.getSelectedIndex()>-1){
            persona.setCi(tfCI.getText());
            persona.setDireccion(tfDireccion.getText());
            persona.setTelefono(tfTelefono.getText());
            persona.setEmail(tfEmail.getText());
            empleado.setCi(tfCI.getText());                 
            empleado.setSueldo(((Number)sSueldo.getValue()).floatValue());        
            empleado.setCargoLaboral((CargoLaboral)cbCargo.getSelectedItem());
            NEmpleado.modificar(empleado);
        }else{
            Msj.showW("Selecione un Cargo Laboral!!!", "Empleado");
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        persona.setCi(tfCI.getText());
        empleado.setCi(tfCI.getText());
        NEmpleado.eliminar(empleado);
    }//GEN-LAST:event_btEliminarActionPerformed

    private void miActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActualizarTablaActionPerformed
        tDatos.updateTabla(empleado.getArray2D());
    }//GEN-LAST:event_miActualizarTablaActionPerformed

    private void miBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarActionPerformed
        empleado.setCi(tfCI.getText());
        persona.setCi(empleado.getCi());
        if(NEmpleado.buscar(empleado)){
            tfNombre.setText(persona.getNombre());
            tfApellidoP.setText(persona.getApellidoP());
            tfApellidoM.setText(persona.getApellidoM());
            tfEmail.setText(persona.getEmail());
            tfDireccion.setText(persona.getDireccion());
            tfTelefono.setText(persona.getTelefono());
            cbSexoH.setSelected(persona.isSexo());
            dcFechaNac.setDate(empleado.getFechaNac());
            dcFechaReg.setDate(empleado.getFechaIng());
            sSueldo.setValue(empleado.getSueldo());
            cbCargo.setSelectedItem(empleado.getCargoLaboral());
        }
    }//GEN-LAST:event_miBuscarActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FEmpleado dialog = new FEmpleado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {                        
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jcMousePanel.jcMousePanel Fondo;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JComboBox cbCargo;
    private javax.swing.JCheckBox cbSexoH;
    private javax.swing.JCheckBox cbSexoM;
    private com.toedter.calendar.JDateChooser dcFechaNac;
    private com.toedter.calendar.JDateChooser dcFechaReg;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JMenuItem miActualizarTabla;
    private javax.swing.JMenuItem miBuscar;
    private javax.swing.JPopupMenu pmTabla;
    private javax.swing.JSpinner sSueldo;
    private javax.swing.JScrollPane spDatos;
    private JTableDX.JTableDX tDatos;
    private JAbcFieldWPO.JAbcFieldWPO tfApellidoM;
    private JAbcFieldWPO.JAbcFieldWPO tfApellidoP;
    private JAbcFieldWPO.JAbcFieldWPO tfCI;
    private JAbcFieldWPO.JAbcFieldWPO tfDireccion;
    private JAbcFieldWPO.JAbcFieldWPO tfEmail;
    private JAbcFieldWPO.JAbcFieldWPO tfNombre;
    private JAbcFieldWPO.JAbcFieldWPO tfTelefono;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clear(){
        tfCI.clear();
        tfNombre.clear();
        tfApellidoP.clear();
        tfApellidoM.clear();
        tfDireccion.clear();        
        tfTelefono.clear();
        cbSexoH.setSelected(true);
        dcFechaReg.setDate(Init.fechaActual);
        cbCargo.setSelectedIndex(-1);
        sSueldo.setValue(0);
        dcFechaNac.setDate(null);
        lbEdad.setText("Edad: ");
        tfEmail.clear();
    } 
    
    @Override
    public void setVisible(boolean b) {
        if(b){
            clear();            
            cbCargo.setModel(new javax.swing.DefaultComboBoxModel(CargoLaboral.toListNombre().toArray()));
        }
        super.setVisible(b);
    }      
    
    @Override
    public void activarPrivilegios(String privilegios){
        btAgregar.setEnabled(privilegios.charAt(1)=='V');
        btModificar.setEnabled(privilegios.charAt(2)=='V');
        btEliminar.setEnabled(privilegios.charAt(3)=='V');
    }    
    
    @Override
    public void repaintAll(Color colorFondo,float transparencia,Color colorFuente,Font font){
        Fondo.setBackground(colorFondo);
        Fondo.setTransparencia(transparencia);
        Component c[]=Fondo.getComponents();
        for (Component ci : c) {
            ci.setForeground(colorFuente);
            ci.setFont(font);
        }
        pmTabla.setFont(font);
        pmTabla.setBackground(colorFondo);
        pmTabla.setForeground(colorFuente);
        cbSexoH.setBackground(colorFondo);
        cbSexoM.setBackground(colorFondo);
    }    
}
