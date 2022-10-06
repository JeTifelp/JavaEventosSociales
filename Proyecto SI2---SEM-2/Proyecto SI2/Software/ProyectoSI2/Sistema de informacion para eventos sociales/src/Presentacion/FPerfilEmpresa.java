
package Presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FPerfilEmpresa extends javax.swing.JDialog implements INF412{

    public FPerfilEmpresa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Init.setImagenLogo(Fondo);
        mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        Fondo = new jcMousePanel.jcMousePanel();
        PI = new jcMousePanel.jcMousePanel();
        LB2 = new javax.swing.JLabel();
        LBI = new javax.swing.JLabel();
        LB5 = new javax.swing.JLabel();
        LB8 = new javax.swing.JLabel();
        LB7 = new javax.swing.JLabel();
        LB3 = new javax.swing.JLabel();
        LB4 = new javax.swing.JLabel();
        TFN = new JAbcFieldWPO.JAbcFieldWPO();
        TFRS = new JAbcFieldWPO.JAbcFieldWPO();
        TFP = new JAbcFieldWPO.JAbcFieldWPO();
        TFNE = new JAbcFieldWPO.JAbcFieldWPO();
        TFD = new JAbcFieldWPO.JAbcFieldWPO();
        TFL = new JAbcFieldWPO.JAbcFieldWPO();
        TFIF = new JAbcFieldWPO.JAbcFieldWPO();
        BBI = new javax.swing.JButton();
        BTC = new javax.swing.JButton();
        BTA = new javax.swing.JButton();
        BBL = new javax.swing.JButton();
        BQL = new javax.swing.JButton();
        BQI = new javax.swing.JButton();
        LB6 = new javax.swing.JLabel();
        sMaxEve = new javax.swing.JSpinner();
        LB9 = new javax.swing.JLabel();
        sDiasR = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(4);
        Fondo.setTransparencia(1.0F);
        Fondo.setVisibleLogo(false);

        PI.setMinimumSize(new java.awt.Dimension(210, 150));

        javax.swing.GroupLayout PILayout = new javax.swing.GroupLayout(PI);
        PI.setLayout(PILayout);
        PILayout.setHorizontalGroup(
            PILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );
        PILayout.setVerticalGroup(
            PILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );

        LB2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB2.setText("Nombre de la Empresa:");

        LBI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBI.setText("Logo:");

        LB5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB5.setText("Imagen de Fondo:");

        LB8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB8.setText("NIT:");

        LB7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB7.setText("Razon Social:");

        LB3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB3.setText("Dirección:");

        LB4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB4.setText("Propietario:");

        TFN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFN.setMessageText("No Valido");
        TFN.setModo(((byte)1));
        TFN.setTipo(((byte)2));

        TFRS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFRS.setMessageText("No Valido");
        TFRS.setModo(((byte)1));
        TFRS.setTipo(((byte)2));

        TFP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFP.setMessageText("No Valido");
        TFP.setModo(((byte)1));
        TFP.setTipo(((byte)2));

        TFNE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFNE.setMessageText("Dato Obligatorio");
        TFNE.setModo(((byte)1));
        TFNE.setOptionalText(false);
        TFNE.setTipo(((byte)2));

        TFD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFD.setMessageText("No Valido");
        TFD.setModo(((byte)1));
        TFD.setTipo(((byte)2));

        TFL.setEditable(false);
        TFL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFL.setModo(((byte)1));

        TFIF.setEditable(false);
        TFIF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFIF.setModo(((byte)1));

        BBI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BBI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        BBI.setText("...");
        BBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBIActionPerformed(evt);
            }
        });

        BTC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        BTC.setText("Cancelar");
        BTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCActionPerformed(evt);
            }
        });

        BTA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        BTA.setText("Aceptar");
        BTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAActionPerformed(evt);
            }
        });

        BBL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        BBL.setText("...");
        BBL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBLActionPerformed(evt);
            }
        });

        BQL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eleminar.png"))); // NOI18N
        BQL.setText("Quitar");
        BQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQLActionPerformed(evt);
            }
        });

        BQI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BQI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eleminar.png"))); // NOI18N
        BQI.setText("Quitar");
        BQI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQIActionPerformed(evt);
            }
        });

        LB6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB6.setText("Cantidad maxima de eventos por fechas:");

        sMaxEve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sMaxEve.setModel(new javax.swing.SpinnerNumberModel(5, 1, 100, 1));

        LB9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB9.setText("Dias de espera para reservas por defecto:");

        sDiasR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sDiasR.setModel(new javax.swing.SpinnerNumberModel(15, 1, 100, 1));

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(LBI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(BBL)
                        .addGap(18, 18, 18)
                        .addComponent(BQL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LB3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LB4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LB2))
                                .addGap(18, 18, 18)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TFD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TFP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TFNE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(TFIF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(LB5)
                                .addGap(28, 28, 28)
                                .addComponent(BBI)
                                .addGap(18, 18, 18)
                                .addComponent(BQI)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(LB6)
                                .addGap(18, 18, 18)
                                .addComponent(sMaxEve, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(LB9)
                        .addGap(18, 18, 18)
                        .addComponent(sDiasR, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(FondoLayout.createSequentialGroup()
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LB7)
                                .addComponent(LB8))
                            .addGap(17, 17, 17)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TFN, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                .addComponent(TFRS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(FondoLayout.createSequentialGroup()
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BTA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTC, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(36, 36, 36)
                            .addComponent(PI, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFNE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB2)
                    .addComponent(LB7)
                    .addComponent(TFRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB3)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB8)
                            .addComponent(TFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB4)
                            .addComponent(TFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LBI)
                                    .addComponent(BBL)
                                    .addComponent(BQL))
                                .addGap(20, 20, 20)
                                .addComponent(TFL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BQI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LB5)
                                    .addComponent(BBI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(BTA)
                                .addGap(18, 18, 18)
                                .addComponent(BTC)))
                        .addGap(17, 17, 17)
                        .addComponent(TFIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PI, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LB6)
                        .addComponent(sMaxEve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LB9)
                        .addComponent(sDiasR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBLActionPerformed
        int seleccion = FileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = FileChooser.getSelectedFile();
            TFL.setText(fichero.getAbsolutePath());            
            PI.setIconLogo(new ImageIcon(fichero.getAbsolutePath()));
            PI.repaint();
        }
    }//GEN-LAST:event_BBLActionPerformed

    private void BTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAActionPerformed
        if(TFNE.isValueOk()){
            Init.config.setProperty("empresa", TFNE.getText());
            Init.config.setProperty("direccion", TFD.getText());
            Init.config.setProperty("propietario", TFP.getText());
            Init.config.setProperty("logo", TFL.getText());
            Init.config.setProperty("imagen", TFIF.getText());
            Init.config.setProperty("razon_social", TFRS.getText());
            Init.config.setProperty("nit", TFN.getText()); 
            Init.config.setProperty("contrato_max",""+((Number)sMaxEve.getValue()).intValue());
            Init.config.setProperty("dias_max",""+((Number)sDiasR.getValue()).intValue());
            try{        
                Init.config.store(new FileOutputStream(Init.fileConfig), Init.fileConfig.getAbsolutePath());
            } catch (IOException ex){
                System.err.println("FPerfilEmpresa\n"+ex.toString());
            }                
        this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Error: Verifique los parametros marcados con Rojo!!!",
                "Configuracion de la Empresa", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BTAActionPerformed

    private void BTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTCActionPerformed

    private void BBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBIActionPerformed
        int seleccion = FileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = FileChooser.getSelectedFile();
            TFIF.setText(fichero.getAbsolutePath());            
            PI.setIcon(new ImageIcon(fichero.getAbsolutePath()));
            PI.repaint();
        }
    }//GEN-LAST:event_BBIActionPerformed

    private void BQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQLActionPerformed
        TFL.setText("");
        PI.setIconLogo(new ImageIcon(""));
        PI.repaint();
    }//GEN-LAST:event_BQLActionPerformed

    private void BQIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQIActionPerformed
        TFIF.setText("");
        PI.setIcon(new ImageIcon(""));
        PI.repaint();
    }//GEN-LAST:event_BQIActionPerformed

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
            java.util.logging.Logger.getLogger(FPerfilEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FPerfilEmpresa dialog = new FPerfilEmpresa(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BBI;
    private javax.swing.JButton BBL;
    private javax.swing.JButton BQI;
    private javax.swing.JButton BQL;
    private javax.swing.JButton BTA;
    private javax.swing.JButton BTC;
    private javax.swing.JFileChooser FileChooser;
    private jcMousePanel.jcMousePanel Fondo;
    private javax.swing.JLabel LB2;
    private javax.swing.JLabel LB3;
    private javax.swing.JLabel LB4;
    private javax.swing.JLabel LB5;
    private javax.swing.JLabel LB6;
    private javax.swing.JLabel LB7;
    private javax.swing.JLabel LB8;
    private javax.swing.JLabel LB9;
    private javax.swing.JLabel LBI;
    private jcMousePanel.jcMousePanel PI;
    private JAbcFieldWPO.JAbcFieldWPO TFD;
    private JAbcFieldWPO.JAbcFieldWPO TFIF;
    private JAbcFieldWPO.JAbcFieldWPO TFL;
    private JAbcFieldWPO.JAbcFieldWPO TFN;
    private JAbcFieldWPO.JAbcFieldWPO TFNE;
    private JAbcFieldWPO.JAbcFieldWPO TFP;
    private JAbcFieldWPO.JAbcFieldWPO TFRS;
    private javax.swing.JSpinner sDiasR;
    private javax.swing.JSpinner sMaxEve;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos(){
        TFNE.setText(Init.config.getProperty("empresa"));
        TFD.setText(Init.config.getProperty("direccion"));
        TFP.setText(Init.config.getProperty("propietario"));
        TFL.setText(Init.config.getProperty("logo"));
        TFIF.setText(Init.config.getProperty("imagen"));
        TFRS.setText(Init.config.getProperty("razon_social"));
        TFN.setText(Init.config.getProperty("nit"));
        sMaxEve.setValue(Integer.parseInt(Init.config.getProperty("contrato_max")));
        sDiasR.setValue(Integer.parseInt(Init.config.getProperty("dias_max")));
        if(!TFIF.getText().isEmpty()){
            PI.setIcon(new ImageIcon(TFIF.getText()));
        }
        if(!TFL.getText().isEmpty()){
            PI.setIconLogo(new ImageIcon(TFL.getText()));
        }
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
    }    

    @Override
    public void clear() {
   
    }

    @Override
    public void activarPrivilegios(String privilegios) {
   
    }
}
