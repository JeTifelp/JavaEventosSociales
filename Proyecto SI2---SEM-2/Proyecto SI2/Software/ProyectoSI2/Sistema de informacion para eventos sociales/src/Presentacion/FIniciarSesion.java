
package Presentacion;

import Datos.DUsuario;
import Negocio.NUsuario;
import javax.swing.JOptionPane;

public class FIniciarSesion extends javax.swing.JDialog {
    
    private boolean ok;    
    
    public FIniciarSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        if(Init.config.getProperty("imagen")!=null){
           Fondo.setTransparencia((float)0.5);
        }        
        Init.setImagenLogo(Fondo);
        ok=false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new jcMousePanel.jcMousePanel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        tfLogin = new JAbcFieldWPO.JAbcFieldWPO();
        tfPassword = new javax.swing.JPasswordField();
        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(0, 153, 153));
        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(4);
        Fondo.setTransparencia(1.0F);
        Fondo.setVisibleLogo(false);

        lb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb2.setText("Usuario:");

        lb3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb3.setText("Contraseña:");

        tfLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfLogin.setMaxLength(100);
        tfLogin.setMessageText("Dato Obligatorio");
        tfLogin.setOptionalText(false);
        tfLogin.setTipo(((byte)2));

        tfPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btAceptar)
                        .addGap(20, 20, 20)
                        .addComponent(btCancelar))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        ok=false;
        if(tfLogin.isValueOk()){
            if(tfPassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingrese su password!!!",
                    "Inicio de Sesion", JOptionPane.WARNING_MESSAGE);
            }else{
                DUsuario usuario=NUsuario.load(tfLogin.getText());
                if(usuario!=null){
                    String x=tfPassword.getText();
                    if(usuario.getPassword().equals(x)){
                        Init.user=usuario;
                        ok=true;
                        this.dispose();
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema!!!",
                        "Inicio de Sesion", JOptionPane.INFORMATION_MESSAGE);                         
                    }else{
                        JOptionPane.showMessageDialog(null, "El password es incorrecto!!!",
                        "Inicio de Sesion", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No existe un usuario con ese login!!!",
                    "Inicio de Sesion", JOptionPane.ERROR_MESSAGE);
                }
            }            
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese su login de usuario!!!",
                    "Inicio de Sesion", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        ok=false;
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FIniciarSesion dialog = new FIniciarSesion(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private JAbcFieldWPO.JAbcFieldWPO tfLogin;
    private javax.swing.JPasswordField tfPassword;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        tfLogin.clear();
        tfPassword.setText("");
    }    
    
    @Override
    public void setVisible(boolean b) {
        if(b){
            clear();
        }
        super.setVisible(b);
    }      
    
    public boolean isOk(){
        return ok;
    }

}
