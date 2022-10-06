
package Presentacion;

import Datos.DGrupo;
import Datos.DUsuario;
import Negocio.NGrupo;
import Negocio.NUsuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FUsuario extends javax.swing.JDialog {       

    private DUsuario dUsuario;
    
    public FUsuario(Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Init.setImagenLogo(Fondo);
        tfLogin.setText("");
        tfCI.setText("");
        dUsuario=new DUsuario();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new jcMousePanel.jcMousePanel();
        lbL = new javax.swing.JLabel();
        lbP = new javax.swing.JLabel();
        lbG = new javax.swing.JLabel();
        lbCI = new javax.swing.JLabel();
        tfLogin = new JAbcFieldWPO.JAbcFieldWPO();
        tfPassword = new javax.swing.JPasswordField();
        cbGrupo = new javax.swing.JComboBox();
        tfCI = new JAbcFieldWPO.JAbcFieldWPO();
        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Usuarios de la Empresa");

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(4);
        Fondo.setTransparencia(1.0F);
        Fondo.setVisibleLogo(false);

        lbL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbL.setText("Login:");

        lbP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbP.setText("Password:");

        lbG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbG.setText("Grupo:");

        lbCI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCI.setText("CI:");

        tfLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfLogin.setMaxLength(100);
        tfLogin.setMessageText("Dato Obligatorio");
        tfLogin.setOptionalText(false);
        tfLogin.setTipo(((byte)2));
        tfLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLoginFocusLost(evt);
            }
        });

        tfPassword.setEditable(false);
        tfPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfCI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCI.setMaxLength(10);
        tfCI.setMessageText("Dato Obligatorio");
        tfCI.setOptionalText(false);
        tfCI.setTipo(((byte)2));

        btAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
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
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbGrupo, 0, 280, Short.MAX_VALUE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAceptar)
                .addGap(20, 20, 20)
                .addComponent(btCancelar)
                .addGap(85, 85, 85))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbL)
                    .addComponent(tfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbP)
                    .addComponent(tfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbG)
                    .addComponent(cbGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCI)
                    .addComponent(tfCI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        if(tfLogin.isValueOk()&&tfCI.isValueOk()&&cbGrupo.getSelectedIndex()>-1){
            if(tfLogin.isEditable()){                    
                dUsuario.setLogin(tfLogin.getText());    
                dUsuario.setPassword(tfLogin.getText());
                dUsuario.setCI(tfCI.getText());
                dUsuario.setIdGrupo(cbGrupo.getSelectedItem().toString());
                NUsuario.insertar(dUsuario);
                try {
                    Init.config.setProperty("perfil."+dUsuario.getLogin(), Init.defaultPerfilUser);
                    Init.config.store(new FileOutputStream(Init.fileConfig), Init.fileConfig.getAbsolutePath());                    
                } catch (FileNotFoundException ex) {
                    System.err.println("FUsuario\n"+ex.toString());
                } catch (IOException ex) {
                    System.err.println("FUsuario\n"+ex.toString());
                }                
            }else{
                dUsuario.setIdGrupo(cbGrupo.getSelectedItem().toString());
                NUsuario.modificar(dUsuario,true);
            } 
            this.dispose();
        }else{             
         JOptionPane.showMessageDialog(null, "Ingrese todos los datos !!!", 
                            "Grupos", JOptionPane.WARNING_MESSAGE);             
        }
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLoginFocusLost
        if(tfLogin.isEditable()){
            tfPassword.setText(tfLogin.getText());
        }
    }//GEN-LAST:event_tfLoginFocusLost

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
            java.util.logging.Logger.getLogger(FUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FUsuario dialog = new FUsuario(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btCancelar;
    private javax.swing.JComboBox cbGrupo;
    private javax.swing.JLabel lbCI;
    private javax.swing.JLabel lbG;
    private javax.swing.JLabel lbL;
    private javax.swing.JLabel lbP;
    private JAbcFieldWPO.JAbcFieldWPO tfCI;
    private JAbcFieldWPO.JAbcFieldWPO tfLogin;
    private javax.swing.JPasswordField tfPassword;
    // End of variables declaration//GEN-END:variables

    private void clear(){
        tfLogin.clear();
        tfPassword.setText("");
        cbGrupo.setSelectedIndex(-1);
        tfCI.clear();
    }

    private void actualizarComboBox(DGrupo array[]){
        cbGrupo.setModel(new javax.swing.DefaultComboBoxModel(array));
    }
    
    public void show(boolean flag,String login){
        actualizarComboBox(NGrupo.getArray());
        tfLogin.setEditable(flag);
        tfCI.setEditable(flag);        
        if(flag){
            this.setTitle("Agregar Usuario");  
            clear();
        }else{
            this.setTitle("Modificar Usuario");            
            dUsuario=NUsuario.load(login);    
            tfLogin.setText(login);
            tfPassword.setText("**********************************");
            tfCI.setText(dUsuario.getCI());
            cbGrupo.setSelectedIndex(-1);
        }
        this.setVisible(true);
    }  
    
    public void repaintAll(Color colorFondo,float transparencia,Color colorFuente,Font font){
        Fondo.setBackground(colorFondo);
        Fondo.setTransparencia(transparencia);
        Component c[]=Fondo.getComponents();
        for (Component ci : c) {
            ci.setForeground(colorFuente);
            ci.setFont(font);
        }
    }    
}
