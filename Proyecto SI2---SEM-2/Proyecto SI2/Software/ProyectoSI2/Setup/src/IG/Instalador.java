
package IG;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
//import javax.swing.SwingUtilities;
//import org.pushingpixels.substance.api.SubstanceLookAndFeel;

public class Instalador extends javax.swing.JFrame {
    
    public Instalador() {
//        Instalador.setDefaultLookAndFeelDecorated(true);	    
//        try {
//           SubstanceLookAndFeel.setSkin("org.pushingpixels.substance.api.skin.RavenSkin");
//           SwingUtilities.updateComponentTreeUI(Instalador.this);
//        } catch (Exception ex) {
//            System.err.println("Instalador\n"+ex);
//        }
        initComponents();
        TFNE.setText("");
        TFDI.setText("");        
        this.setLocationRelativeTo(null);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser_logo = new javax.swing.JFileChooser();
        jFileChooser_instalacion = new javax.swing.JFileChooser();
        LB1 = new javax.swing.JLabel();
        LB2 = new javax.swing.JLabel();
        LB3 = new javax.swing.JLabel();
        LB4 = new javax.swing.JLabel();
        LBI = new javax.swing.JLabel();
        LB6 = new javax.swing.JLabel();
        LB7 = new javax.swing.JLabel();
        LB8 = new javax.swing.JLabel();
        LB9 = new javax.swing.JLabel();
        LB5 = new javax.swing.JLabel();
        BTBD = new javax.swing.JButton();
        BTC = new javax.swing.JButton();
        BTA = new javax.swing.JButton();
        TBBL = new javax.swing.JButton();
        PI = new jcMousePanel.jcMousePanel();
        TBBI = new javax.swing.JButton();
        TFNE = new JAbcFieldWPO.JAbcFieldWPO();
        TFD = new JAbcFieldWPO.JAbcFieldWPO();
        TFP = new JAbcFieldWPO.JAbcFieldWPO();
        TFRS = new JAbcFieldWPO.JAbcFieldWPO();
        TFN = new JAbcFieldWPO.JAbcFieldWPO();
        TFL = new JAbcFieldWPO.JAbcFieldWPO();
        TFDI = new JAbcFieldWPO.JAbcFieldWPO();
        TFIF = new JAbcFieldWPO.JAbcFieldWPO();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Setup");

        LB1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB1.setText("Configuraciones Iniciales");

        LB2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB2.setText("Nombre de la Empresa");

        LB3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB3.setText("Dirección");

        LB4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB4.setText("Propietario");

        LBI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBI.setText("Logo");

        LB6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LB6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB6.setText("Datos de Facturación");

        LB7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB7.setText("Razon Social");

        LB8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB8.setText("NIT");

        LB9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB9.setText("Directorio de instalación");

        LB5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LB5.setText("Imagen de Fondo");

        BTBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTBD.setText("...");
        BTBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBDActionPerformed(evt);
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

        TBBL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TBBL.setText("...");
        TBBL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBBLActionPerformed(evt);
            }
        });

        PI.setMinimumSize(new java.awt.Dimension(210, 150));

        javax.swing.GroupLayout PILayout = new javax.swing.GroupLayout(PI);
        PI.setLayout(PILayout);
        PILayout.setHorizontalGroup(
            PILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        PILayout.setVerticalGroup(
            PILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TBBI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TBBI.setText("...");
        TBBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBBIActionPerformed(evt);
            }
        });

        TFNE.setBackground(new java.awt.Color(255, 102, 102));
        TFNE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFNE.setMessageText("No Valido");
        TFNE.setModo(((byte)1));
        TFNE.setOptionalText(false);
        TFNE.setTipo(((byte)2));

        TFD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFD.setMessageText("No Valido");
        TFD.setModo(((byte)1));
        TFD.setTipo(((byte)2));

        TFP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFP.setMessageText("No Valido");
        TFP.setModo(((byte)1));
        TFP.setTipo(((byte)2));

        TFRS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFRS.setMessageText("No Valido");
        TFRS.setModo(((byte)1));
        TFRS.setTipo(((byte)2));

        TFN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFN.setMessageText("No Valido");
        TFN.setModo(((byte)2));
        TFN.setTipo(((byte)2));

        TFL.setEditable(false);
        TFL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFL.setModo(((byte)1));

        TFDI.setEditable(false);
        TFDI.setBackground(new java.awt.Color(255, 102, 102));
        TFDI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFDI.setMessageText("No Valido");
        TFDI.setModo(((byte)1));
        TFDI.setOptionalText(false);

        TFIF.setEditable(false);
        TFIF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFIF.setModo(((byte)1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFDI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTBD))
                    .addComponent(LB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB7)
                            .addComponent(LB8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFRS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFIF, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(TFL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LB5)
                                .addGap(48, 48, 48)
                                .addComponent(TBBI)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PI, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LBI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(49, 49, 49))
                            .addComponent(LB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFNE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TBBL)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(LB6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LB1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB2)
                    .addComponent(TFNE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB3)
                    .addComponent(TFD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB4)
                    .addComponent(TFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBI)
                            .addComponent(TBBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB5)
                            .addComponent(TBBI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PI, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LB6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB7)
                    .addComponent(TFRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB8)
                    .addComponent(TFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LB9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTBD)
                    .addComponent(TFDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTC)
                    .addComponent(BTA))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_BTCActionPerformed

    private void TBBLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBBLActionPerformed
        int seleccion = jFileChooser_logo.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = jFileChooser_logo.getSelectedFile();
            TFL.setText(fichero.getAbsolutePath());
            ImageIcon logo = new ImageIcon(fichero.getAbsolutePath());
            PI.setIconLogo(logo);
        }
    }//GEN-LAST:event_TBBLActionPerformed

    private void BTBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBDActionPerformed
        jFileChooser_instalacion.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = jFileChooser_instalacion.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = jFileChooser_instalacion.getSelectedFile();
            TFDI.setText(fichero.getAbsolutePath());                       
        }        
    }//GEN-LAST:event_BTBDActionPerformed

    private void BTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTAActionPerformed
        if(TFNE.isValueOk()&TFDI.isValueOk()){
           String args[]={TFDI.getText(),TFNE.getText(),TFD.getText(),
           TFP.getText(),TFIF.getText(),TFL.getText(),TFRS.getText(),TFN.getText()}; 
           ProgresoInstalacion.main(args);
        }else{
            JOptionPane.showMessageDialog(null, "Error: Verifique los parametros marcados con Rojo!!!",
                                            "Setup", JOptionPane.ERROR_MESSAGE);
        }     
    }//GEN-LAST:event_BTAActionPerformed

    private void TBBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBBIActionPerformed
        int seleccion = jFileChooser_logo.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = jFileChooser_logo.getSelectedFile();            
            TFIF.setText(fichero.getAbsolutePath());
            ImageIcon logo = new ImageIcon(fichero.getAbsolutePath());
            PI.setIcon(logo);
        }
    }//GEN-LAST:event_TBBIActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {         
                new Instalador().setVisible(true);
            }
        });
    }
    

 

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTA;
    private javax.swing.JButton BTBD;
    private javax.swing.JButton BTC;
    private javax.swing.JLabel LB1;
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
    private javax.swing.JButton TBBI;
    private javax.swing.JButton TBBL;
    private JAbcFieldWPO.JAbcFieldWPO TFD;
    private JAbcFieldWPO.JAbcFieldWPO TFDI;
    private JAbcFieldWPO.JAbcFieldWPO TFIF;
    private JAbcFieldWPO.JAbcFieldWPO TFL;
    private JAbcFieldWPO.JAbcFieldWPO TFN;
    private JAbcFieldWPO.JAbcFieldWPO TFNE;
    private JAbcFieldWPO.JAbcFieldWPO TFP;
    private JAbcFieldWPO.JAbcFieldWPO TFRS;
    private javax.swing.JFileChooser jFileChooser_instalacion;
    private javax.swing.JFileChooser jFileChooser_logo;
    // End of variables declaration//GEN-END:variables

  
    
}
