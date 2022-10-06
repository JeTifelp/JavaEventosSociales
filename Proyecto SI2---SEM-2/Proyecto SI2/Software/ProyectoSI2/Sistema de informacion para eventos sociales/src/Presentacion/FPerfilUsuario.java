
package Presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FPerfilUsuario extends javax.swing.JDialog implements INF412{
    
    private final  FColor fColor;
    
    public FPerfilUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        fColor=new FColor(this, true);
        Init.setImagenLogo(Fondo);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new jcMousePanel.jcMousePanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        sSize = new javax.swing.JSpinner();
        cbFont = new javax.swing.JComboBox();
        cbStyle = new javax.swing.JComboBox();
        btCFondo = new javax.swing.JButton();
        btCFuente = new javax.swing.JButton();
        sTransparencia = new javax.swing.JSlider();
        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Configurar estilo de ventanas");

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(4);
        Fondo.setTransparencia(1.0F);
        Fondo.setVisibleLogo(false);

        lb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb1.setText("Elegir color de fondo:");

        lb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb2.setText("Elegir color de fuente:");

        lb3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb3.setText("Elegir estilo de fuente:");

        lb4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb4.setText("Transparencia de fondo:");

        sSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sSize.setModel(new javax.swing.SpinnerNumberModel(14, 12, 24, 1));
        sSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sSizeStateChanged(evt);
            }
        });

        cbFont.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbFont.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arial", "Arial Black", "Algerian", "Calibri", "Cambria", "Tahoma", "Times New Roman", "Virtual DJ" }));
        cbFont.setSelectedIndex(5);
        cbFont.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFontItemStateChanged(evt);
            }
        });

        cbStyle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbStyle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plain", "Bold", "Italic", "Bold Italic" }));
        cbStyle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbStyleItemStateChanged(evt);
            }
        });

        btCFondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/color.png"))); // NOI18N
        btCFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCFondoActionPerformed(evt);
            }
        });

        btCFuente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCFuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/color.png"))); // NOI18N
        btCFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCFuenteActionPerformed(evt);
            }
        });

        sTransparencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sTransparencia.setMajorTickSpacing(1);
        sTransparencia.setMaximum(10);
        sTransparencia.setMinorTickSpacing(1);
        sTransparencia.setPaintLabels(true);
        sTransparencia.setPaintTicks(true);
        sTransparencia.setSnapToTicks(true);
        sTransparencia.setToolTipText("");
        sTransparencia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sTransparenciaStateChanged(evt);
            }
        });

        btAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        btAceptar.setText("Realizar cambios");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar cambios");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb4)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lb1)
                                .addComponent(lb3)))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addComponent(btCFondo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb2)
                                .addGap(18, 18, 18)
                                .addComponent(btCFuente))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addComponent(cbFont, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbStyle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sTransparencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btAceptar)
                        .addGap(20, 20, 20)
                        .addComponent(btCancelar)))
                .addGap(20, 20, 20))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb4)
                    .addComponent(sTransparencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb1)
                    .addComponent(btCFondo)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb2)
                        .addComponent(btCFuente)))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb3)
                        .addComponent(cbFont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbStyle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAceptar)
                    .addComponent(btCancelar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCFondoActionPerformed
        Color color=fColor.getColor();
        if(color!=null){
            setColorFondo(color);
        }
    }//GEN-LAST:event_btCFondoActionPerformed

    private void btCFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCFuenteActionPerformed
        Color color=fColor.getColor();
        if(color!=null){
            setColorFuente(color);
        }        
    }//GEN-LAST:event_btCFuenteActionPerformed

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        try {
            Init.repaintAllForms(Fondo.getBackground(),(float)sTransparencia.getValue()/(float)10,
                                 lb1.getForeground(),lb1.getFont());
            Init.config.setProperty("perfil."+Init.user.getLogin(), getPerfilUser());
            Init.config.store(new FileOutputStream(Init.fileConfig), Init.fileConfig.getAbsolutePath());
            this.dispose();            
        } catch (FileNotFoundException ex) {
            System.err.println("FPerfilEmpresa\n"+ex.toString());
        } catch (IOException ex) {
            System.err.println("FPerfilEmpresa\n"+ex.toString());
        }
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        String perfil=Init.config.getProperty("perfil."+Init.user.getLogin());
        Object array[]=Init.castPerfil(perfil);
        this.repaintAll((Color)array[0],(float)array[1],(Color)array[2],(Font)array[3]);
        sTransparencia.setBackground((Color)array[0]);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void sTransparenciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sTransparenciaStateChanged
        Fondo.setTransparencia((float)sTransparencia.getValue()/(float)10);
        Fondo.repaint();
    }//GEN-LAST:event_sTransparenciaStateChanged

    private void sSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sSizeStateChanged
        setFontStyleSize(cbFont.getSelectedItem().toString(), cbStyle.getSelectedIndex(), (int)sSize.getValue());
    }//GEN-LAST:event_sSizeStateChanged

    private void cbStyleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbStyleItemStateChanged
        setFontStyleSize(cbFont.getSelectedItem().toString(), cbStyle.getSelectedIndex(), (int)sSize.getValue());
    }//GEN-LAST:event_cbStyleItemStateChanged

    private void cbFontItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFontItemStateChanged
        setFontStyleSize(cbFont.getSelectedItem().toString(), cbStyle.getSelectedIndex(), (int)sSize.getValue());
    }//GEN-LAST:event_cbFontItemStateChanged

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
            java.util.logging.Logger.getLogger(FPerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FPerfilUsuario dialog = new FPerfilUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btCFondo;
    private javax.swing.JButton btCFuente;
    private javax.swing.JButton btCancelar;
    private javax.swing.JComboBox cbFont;
    private javax.swing.JComboBox cbStyle;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JSpinner sSize;
    private javax.swing.JSlider sTransparencia;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clear() {
     
    }
    
    public void setColorFondo(Color color){
        Fondo.setBackground(color);
        sTransparencia.setBackground(color);
    }
    
    public void setColorFuente(Color color){
        Component c[]=Fondo.getComponents();
        for (Component ci : c) {
            ci.setForeground(color);
        }        
    }
    
    public void setFontStyleSize(String font,int style,int size){
        Component c[]=Fondo.getComponents();
        Font xFont=new Font(font, style, size);
        for (Component ci : c) {
            ci.setFont(xFont);
        }
    }    
    
    @Override
    public void repaintAll(Color colorFondo,float transparencia,Color colorFuente,Font font){
        Fondo.setBackground(colorFondo);
        sTransparencia.setBackground(colorFondo);
        Fondo.setTransparencia(transparencia);
        Component c[]=Fondo.getComponents();
        for (Component ci : c) {
            ci.setForeground(colorFuente);
            ci.setFont(font);
        }        
    }    

    @Override
    public void activarPrivilegios(String privilegios) {
       
    }
    
    private String getPerfilUser() {
        return Fondo.getBackground().getRGB()+"|"+(float)sTransparencia.getValue()/(float)10+"|"+
               lb1.getForeground().getRGB()+"|"+lb1.getFont().getFamily()+"|"+lb1.getFont().getStyle()+"|"+
               +lb1.getFont().getSize();
    }
    
             
}
