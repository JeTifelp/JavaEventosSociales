
package Presentacion;

import Negocio.NBitacora;
import Negocio.NUsuario;
import java.awt.event.KeyEvent;

public class FBitacora extends javax.swing.JDialog {

    public FBitacora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);        
        if(Init.config.getProperty("imagen")!=null){
           Fondo.setTransparencia((float)0.5);
        }
        Init.setImagenLogo(Fondo);        
        cambiarOpcion(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new jcMousePanel.jcMousePanel();
        spUsuarios = new javax.swing.JScrollPane();
        tUsuarios = new JTableDX.JTableDX();
        spBitacoras = new javax.swing.JScrollPane();
        tBitacoras = new JTableDX.JTableDX();
        btImprimir = new javax.swing.JButton();
        fechaI = new com.toedter.calendar.JDateChooser();
        fechaF = new com.toedter.calendar.JDateChooser();
        cbOpcion = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bitacora de Usuarios");

        Fondo.setBackground(new java.awt.Color(0, 153, 153));
        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(4);
        Fondo.setTransparencia(1.0F);
        Fondo.setVisibleLogo(false);

        spUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        tUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tUsuarios.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        tUsuarios.setGridColor(new java.awt.Color(0, 0, 0));
        tUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tUsuariosMousePressed(evt);
            }
        });
        tUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tUsuariosKeyReleased(evt);
            }
        });
        spUsuarios.setViewportView(tUsuarios);

        spBitacoras.setBackground(new java.awt.Color(255, 255, 255));

        tBitacoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Descripcion", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tBitacoras.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        tBitacoras.setGridColor(new java.awt.Color(0, 0, 0));
        spBitacoras.setViewportView(tBitacoras);

        btImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btImprimir.setText("Imprimir");

        fechaI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fechaF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbOpcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbOpcion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Fecha Actual", "En la fecha", "Desde la fecha", "Antes de la fecha", "Todas la fechas excepto", "Entre las fechas" }));
        cbOpcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOpcionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(spUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(btImprimir)
                        .addGap(20, 20, 20)
                        .addComponent(cbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(fechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(fechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spBitacoras, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addComponent(spBitacoras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbOpcion)
                    .addComponent(fechaI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tUsuariosMousePressed
        int f=tUsuarios.getSelectedRow();
        if(f>-1){
            tBitacoras.updateTabla(NBitacora.getTablaUsuario(tUsuarios.getValueAt(f, 0).toString()));
        }        
    }//GEN-LAST:event_tUsuariosMousePressed

    private void cbOpcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOpcionItemStateChanged
        cambiarOpcion(cbOpcion.getSelectedIndex());
        this.repaint();
    }//GEN-LAST:event_cbOpcionItemStateChanged

    private void tUsuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tUsuariosKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_UP||evt.getKeyCode()==KeyEvent.VK_DOWN){
            tUsuariosMousePressed(null);
        }        
    }//GEN-LAST:event_tUsuariosKeyReleased

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
            java.util.logging.Logger.getLogger(FBitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FBitacora dialog = new FBitacora(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btImprimir;
    private javax.swing.JComboBox cbOpcion;
    private com.toedter.calendar.JDateChooser fechaF;
    private com.toedter.calendar.JDateChooser fechaI;
    private javax.swing.JScrollPane spBitacoras;
    private javax.swing.JScrollPane spUsuarios;
    private JTableDX.JTableDX tBitacoras;
    private JTableDX.JTableDX tUsuarios;
    // End of variables declaration//GEN-END:variables

    private void cambiarOpcion(int item){
        switch(item){
            case 0: fechaI.setVisible(false); fechaF.setVisible(false); break;
            case 1: fechaI.setVisible(false); fechaF.setVisible(false); break;
            case 2: fechaI.setVisible(true); fechaF.setVisible(false); break;
            case 3: fechaI.setVisible(true); fechaF.setVisible(false); break;
            case 4: fechaI.setVisible(true); fechaF.setVisible(false); break;
            case 5: fechaI.setVisible(true); fechaF.setVisible(false); break;
            case 6: fechaI.setVisible(true); fechaF.setVisible(true); break;
        }
    }

//    @Override
//    public void show(){
//        tUsuarios.updateTabla(NUsuario.getTablaBitacora());
//        this.setVisible(true);
//    }    
    
    @Override
    public void setVisible(boolean b){
        if(b){
            tUsuarios.updateTabla(NUsuario.getTablaBitacora());        
        }
        super.setVisible(b);
    }
}
