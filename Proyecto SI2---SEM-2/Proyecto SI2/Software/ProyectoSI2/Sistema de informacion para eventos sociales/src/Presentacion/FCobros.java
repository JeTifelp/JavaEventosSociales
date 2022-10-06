
package Presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

public class FCobros extends javax.swing.JDialog implements INF412{

    public FCobros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        titulo.setVisible(false);
        panel.setVisible(false);
        Init.setImagenLogo(Fondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmTabla = new javax.swing.JPopupMenu();
        miBuscar = new javax.swing.JMenuItem();
        miActualizarTabla = new javax.swing.JMenuItem();
        Fondo = new jcMousePanel.jcMousePanel();
        spDatos = new javax.swing.JScrollPane();
        tDatos = new JTableDX.JTableDX();
        btNuevo = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        spList = new javax.swing.JScrollPane();
        listContratos = new jclist.jcList();
        cbFiltro = new javax.swing.JComboBox();
        panel = new javax.swing.JPanel();
        tfCI = new JAbcFieldWPO.JAbcFieldWPO();
        cbPaquetes = new javax.swing.JComboBox();
        dcFechaEvento = new com.toedter.calendar.JDateChooser();
        tfNombreA = new JAbcFieldWPO.JAbcFieldWPO();
        tfCosto = new J123FieldWPO.J123FieldWPO();
        tfCIE = new JAbcFieldWPO.JAbcFieldWPO();

        miBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        miBuscar.setText("Buscar");
        pmTabla.add(miBuscar);

        miActualizarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        miActualizarTabla.setText("Actualizar la tabla");
        pmTabla.add(miActualizarTabla);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cobros de contratos realizados");

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(4);
        Fondo.setTransparencia(1.0F);
        Fondo.setVisibleLogo(false);

        spDatos.setComponentPopupMenu(pmTabla);

        tDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Entregado por", "Monto", "Fecha y Hora", "CI del Empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDatos.setComponentPopupMenu(pmTabla);
        spDatos.setViewportView(tDatos);

        btNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevo.png"))); // NOI18N
        btNuevo.setText("Nuevo cobro");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar.png"))); // NOI18N
        btAgregar.setText("Realizar cobro");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titulo.setText("Titulo:");

        lb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb1.setText("Filtrar busqueda de contratos por:");

        lb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setText("Contratos");

        lb3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb3.setText("Entregador por:");

        lb4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb4.setText("Monto:");

        lb5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb5.setText("CI Empleado:");

        spList.setViewportView(listContratos);

        cbFiltro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Cliente", "Empleado", "Paquete", "Fecha de Elavoracion" }));
        cbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFiltroItemStateChanged(evt);
            }
        });

        panel.setLayout(new javax.swing.OverlayLayout(panel));

        tfCI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCI.setMessageText("Obligatorio");
        tfCI.setOptionalText(false);
        panel.add(tfCI);

        cbPaquetes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panel.add(cbPaquetes);

        dcFechaEvento.setDate(Init.fechaActual);
        dcFechaEvento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panel.add(dcFechaEvento);

        tfNombreA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNombreA.setMaxLength(49);
        tfNombreA.setMessageText("Dato Obligatorio");
        tfNombreA.setModo(((byte)1));
        tfNombreA.setOptionalText(false);
        tfNombreA.setTipo(((byte)2));

        tfCosto.setEditable(false);
        tfCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCosto.setTipo(((byte)4));

        tfCIE.setEditable(false);
        tfCIE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCIE.setMessageText("Obligatorio");
        tfCIE.setOptionalText(false);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(FondoLayout.createSequentialGroup()
                            .addComponent(lb1)
                            .addGap(18, 18, 18)
                            .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FondoLayout.createSequentialGroup()
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spList, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(lb2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(FondoLayout.createSequentialGroup()
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lb4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lb3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfNombreA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(FondoLayout.createSequentialGroup()
                                            .addComponent(tfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lb5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfCIE, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                    .addComponent(btNuevo)
                                    .addGap(18, 18, 18)
                                    .addComponent(btAgregar)
                                    .addGap(132, 132, 132))))))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(spDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spList, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAgregar)
                            .addComponent(btNuevo))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        clear();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed

    }//GEN-LAST:event_btAgregarActionPerformed

    private void cbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFiltroItemStateChanged
        int opcion=cbFiltro.getSelectedIndex();
        switch(opcion){
            case 0:  
                panel.setVisible(false); titulo.setVisible(false);
            break;
            case 1:  
                panel.setVisible(true); titulo.setVisible(true);
                titulo.setText("CI del Cliente:"); tfCI.setVisible(true);
                dcFechaEvento.setVisible(false); cbPaquetes.setVisible(false);
            break;
            case 2:  
                panel.setVisible(true); titulo.setVisible(true);
                titulo.setText("CI del Empleado:"); tfCI.setVisible(true);
                dcFechaEvento.setVisible(false); cbPaquetes.setVisible(false);
            break;
            case 3:  
                panel.setVisible(true); titulo.setVisible(true);
                titulo.setText("Paquete:"); tfCI.setVisible(false);
                dcFechaEvento.setVisible(false); cbPaquetes.setVisible(true);                
            break;
            case 4:  
                panel.setVisible(true); titulo.setVisible(true);
                titulo.setText("Fecha de elavoracion:"); tfCI.setVisible(false);
                dcFechaEvento.setVisible(true); cbPaquetes.setVisible(false);
            break;                
        }                
    }//GEN-LAST:event_cbFiltroItemStateChanged

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
            java.util.logging.Logger.getLogger(FCobros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FCobros dialog = new FCobros(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JComboBox cbFiltro;
    private javax.swing.JComboBox cbPaquetes;
    private com.toedter.calendar.JDateChooser dcFechaEvento;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private jclist.jcList listContratos;
    private javax.swing.JMenuItem miActualizarTabla;
    private javax.swing.JMenuItem miBuscar;
    private javax.swing.JPanel panel;
    private javax.swing.JPopupMenu pmTabla;
    private javax.swing.JScrollPane spDatos;
    private javax.swing.JScrollPane spList;
    private JTableDX.JTableDX tDatos;
    private JAbcFieldWPO.JAbcFieldWPO tfCI;
    private JAbcFieldWPO.JAbcFieldWPO tfCIE;
    private J123FieldWPO.J123FieldWPO tfCosto;
    private JAbcFieldWPO.JAbcFieldWPO tfNombreA;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clear() {
     
    } 
    
    @Override
    public void activarPrivilegios(String privilegios){
        btAgregar.setEnabled(privilegios.charAt(1)=='V');
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
    }    
}
