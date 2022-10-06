
package Presentacion;

import Datos.Sql;
import Negocio.Msj;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FBackupRestore extends javax.swing.JDialog implements INF412{

    public FBackupRestore(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Init.setImagenLogo(Fondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmTabla = new javax.swing.JPopupMenu();
        miBuscar = new javax.swing.JMenuItem();
        miActualizarTabla = new javax.swing.JMenuItem();
        fcBuscador = new javax.swing.JFileChooser();
        Fondo = new jcMousePanel.jcMousePanel();
        lbImage = new javax.swing.JLabel();
        btBackup = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        btRestore = new javax.swing.JButton();

        miBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        miBuscar.setText("Buscar");
        pmTabla.add(miBuscar);

        miActualizarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        miActualizarTabla.setText("Actualizar la tabla");
        pmTabla.add(miActualizarTabla);

        fcBuscador.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        fcBuscador.setCurrentDirectory(Init.fileConfig.getParentFile());
        fcBuscador.setDialogTitle("Backup & Restore");
        fcBuscador.setFileFilter(new FileNameExtensionFilter("Archivos (blk)", "blk"));
        fcBuscador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Backup & Restore");

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(4);
        Fondo.setTransparencia(1.0F);
        Fondo.setVisibleLogo(false);

        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/bakup&restore.jpg"))); // NOI18N

        btBackup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/backup.png"))); // NOI18N
        btBackup.setText("Backup");
        btBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackupActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb1.setText("Realizar una copia de seguridad:");

        lb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb2.setText("Restaurar una copia de seguridad:");

        btRestore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRestore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/restore.png"))); // NOI18N
        btRestore.setText("Restore");
        btRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestoreActionPerformed(evt);
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
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb1)
                            .addComponent(lb2))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btRestore)
                            .addComponent(btBackup))
                        .addGap(70, 70, 70)))
                .addComponent(lbImage)
                .addGap(20, 20, 20))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbImage)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lb1)
                        .addGap(18, 18, 18)
                        .addComponent(btBackup)
                        .addGap(25, 25, 25)
                        .addComponent(lb2)
                        .addGap(18, 18, 18)
                        .addComponent(btRestore)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackupActionPerformed
        if(fcBuscador.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
            try {
                File f=fcBuscador.getSelectedFile();                
                String db=Init.config.getProperty("nombre_bd");        
                String sql="BACKUP DATABASE "+db+" TO DISK='"+f.getAbsolutePath()+".blk' "
                          +"WITH NOFORMAT,NOINIT,NAME='"+db+" - Full Database Backup',SKIP,STATS=10";
                Sql.setAutoCommit(true);
                Sql.ejecutarComando(sql);
                JOptionPane.showMessageDialog(null, "Copia de seguridad realizada exitosamente!!!",
                        "Backup & Restore", JOptionPane.INFORMATION_MESSAGE);
                Sql.setAutoCommit(false);
            } catch (SQLException ex) {
                System.err.println("FBackup&Restore.btBackupActionPerformed\n"+ex.toString());
            }
        }
    }//GEN-LAST:event_btBackupActionPerformed

    @SuppressWarnings("empty-statement")
    private void btRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestoreActionPerformed
        if(fcBuscador.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            File f=fcBuscador.getSelectedFile();
            if(f.isFile()){
                try {                                    
                    String db=Init.config.getProperty("nombre_bd");
                    Sql.ejecutarComando("ALTER DATABASE ["+db+"] SET SINGLE_USER WITH ROLLBACK IMMEDIATE");
                    Sql.ejecutarComando("USE master");
                    Sql.ejecutarComando("RESTORE DATABASE "+db+" FROM DISK = '"+f.getAbsolutePath()+"' WITH REPLACE");
                    Sql.ejecutarComando("USE "+db);
                    Sql.ejecutarComando("ALTER DATABASE ["+db+"] SET MULTI_USER WITH ROLLBACK IMMEDIATE");
                } catch (SQLException ex) {
                    System.err.println("FBackup&Restore.btRestoreActionPerformed\n"+ex.toString());
                }
                Msj.showI("Restauracion Realizada exitosamente!!!", "Backup & Restore");
            }else{
                Msj.showE("El archivo seleccionado no es valido!!!", "Backup & Restore");
            }
        }
    }//GEN-LAST:event_btRestoreActionPerformed

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
            java.util.logging.Logger.getLogger(FBackupRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FBackupRestore dialog = new FBackupRestore(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jcMousePanel.jcMousePanel Fondo;
    private javax.swing.JButton btBackup;
    private javax.swing.JButton btRestore;
    private javax.swing.JFileChooser fcBuscador;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbImage;
    private javax.swing.JMenuItem miActualizarTabla;
    private javax.swing.JMenuItem miBuscar;
    private javax.swing.JPopupMenu pmTabla;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clear() {
     
    }
    
    @Override
    public void setVisible(boolean b) {
        if(b){
            clear();
        }
        super.setVisible(b);
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

    @Override
    public void activarPrivilegios(String privilegios) {
        
    }
}
