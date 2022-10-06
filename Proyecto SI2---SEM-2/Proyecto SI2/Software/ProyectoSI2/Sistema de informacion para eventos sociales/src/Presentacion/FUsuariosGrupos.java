
package Presentacion;

import Negocio.NGrupo;
import Negocio.NUsuario;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FUsuariosGrupos extends javax.swing.JDialog implements INF412{
    
    private final FGrupo fGrupo;
    private final FUsuario fUsuario;    
    
    public FUsuariosGrupos(java.awt.Frame parent, boolean modal) {               
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Init.setImagenLogo(FondoGrupo);
        Init.setImagenLogo(FondoUsuario);
        fGrupo=new FGrupo(this, true);
        fUsuario=new FUsuario(this, true);         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmTabla = new javax.swing.JPopupMenu();
        miActualizarTabla = new javax.swing.JMenuItem();
        tp = new javax.swing.JTabbedPane();
        FondoGrupo = new jcMousePanel.jcMousePanel();
        spGrupos = new javax.swing.JScrollPane();
        tGrupos = new JTableDX.JTableDX();
        spUsuariosG = new javax.swing.JScrollPane();
        tUsuariosG = new JTableDX.JTableDX();
        btAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        FondoUsuario = new jcMousePanel.jcMousePanel();
        spUsuarios = new javax.swing.JScrollPane();
        tUsuarios = new JTableDX.JTableDX();
        btAgregarU = new javax.swing.JButton();
        btModificarU = new javax.swing.JButton();
        btEliminarU = new javax.swing.JButton();

        miActualizarTabla.setText("Actualizar Tabla");
        miActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActualizarTablaActionPerformed(evt);
            }
        });
        pmTabla.add(miActualizarTabla);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grupos & Usuarios");

        tp.setToolTipText("");

        FondoGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FondoGrupo.setModo(4);
        FondoGrupo.setTransparencia(1.0F);
        FondoGrupo.setVisibleLogo(false);

        spGrupos.setBackground(new java.awt.Color(255, 255, 255));
        spGrupos.setComponentPopupMenu(pmTabla);

        tGrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grupos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tGrupos.setComponentPopupMenu(pmTabla);
        tGrupos.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        tGrupos.setGridColor(new java.awt.Color(0, 0, 0));
        tGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tGruposMousePressed(evt);
            }
        });
        tGrupos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tGruposKeyReleased(evt);
            }
        });
        spGrupos.setViewportView(tGrupos);

        spUsuariosG.setBackground(new java.awt.Color(255, 255, 255));

        tUsuariosG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Usuarios", "CI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tUsuariosG.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        tUsuariosG.setGridColor(new java.awt.Color(0, 0, 0));
        spUsuariosG.setViewportView(tUsuariosG);

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

        javax.swing.GroupLayout FondoGrupoLayout = new javax.swing.GroupLayout(FondoGrupo);
        FondoGrupo.setLayout(FondoGrupoLayout);
        FondoGrupoLayout.setHorizontalGroup(
            FondoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoGrupoLayout.createSequentialGroup()
                .addGroup(FondoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoGrupoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(spGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(spUsuariosG, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoGrupoLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btAgregar)
                        .addGap(20, 20, 20)
                        .addComponent(btModificar)
                        .addGap(20, 20, 20)
                        .addComponent(btEliminar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        FondoGrupoLayout.setVerticalGroup(
            FondoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoGrupoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spUsuariosG, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(FondoGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregar)
                    .addComponent(btModificar)
                    .addComponent(btEliminar))
                .addGap(20, 20, 20))
        );

        tp.addTab("Grupos", FondoGrupo);

        FondoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FondoUsuario.setModo(4);
        FondoUsuario.setTransparencia(1.0F);
        FondoUsuario.setVisibleLogo(false);

        spUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        spUsuarios.setComponentPopupMenu(pmTabla);

        tUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Usuario", "CI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tUsuarios.setComponentPopupMenu(pmTabla);
        tUsuarios.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11)); // NOI18N
        tUsuarios.setGridColor(new java.awt.Color(0, 0, 0));
        spUsuarios.setViewportView(tUsuarios);

        btAgregarU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAgregarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar.png"))); // NOI18N
        btAgregarU.setText("Agregar");
        btAgregarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarUActionPerformed(evt);
            }
        });

        btModificarU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btModificarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        btModificarU.setText("Modificar");
        btModificarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarUActionPerformed(evt);
            }
        });

        btEliminarU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEliminarU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eleminar.png"))); // NOI18N
        btEliminarU.setText("Eliminar");
        btEliminarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoUsuarioLayout = new javax.swing.GroupLayout(FondoUsuario);
        FondoUsuario.setLayout(FondoUsuarioLayout);
        FondoUsuarioLayout.setHorizontalGroup(
            FondoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoUsuarioLayout.createSequentialGroup()
                .addGroup(FondoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoUsuarioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(spUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoUsuarioLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btAgregarU)
                        .addGap(20, 20, 20)
                        .addComponent(btModificarU)
                        .addGap(20, 20, 20)
                        .addComponent(btEliminarU)))
                .addContainerGap())
        );
        FondoUsuarioLayout.setVerticalGroup(
            FondoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(spUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(FondoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregarU)
                    .addComponent(btModificarU)
                    .addComponent(btEliminarU))
                .addGap(22, 22, 22))
        );

        tp.addTab("Usuarios", FondoUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        tp.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarUActionPerformed
        fUsuario.show(true,"");
    }//GEN-LAST:event_btAgregarUActionPerformed

    private void btModificarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarUActionPerformed
        int f=tUsuarios.getSelectedRow();
        if(f>-1){
            fUsuario.show(false,tUsuarios.getValueAt(f, 1).toString());            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un usuario!!!", 
                    "Usuarios del sistema", JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_btModificarUActionPerformed

    private void btEliminarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarUActionPerformed
        int f=tUsuarios.getSelectedRow();
        if(f>-1){
            NUsuario.eliminar(tUsuarios.getValueAt(f, 1).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un usuario!!!", 
                    "Grupos de usuarios", JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_btEliminarUActionPerformed

    private void tGruposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tGruposMousePressed
        int f=tGrupos.getSelectedRow();
        if(f>-1){
            tUsuariosG.updateTabla(NUsuario.getTablaGrupo(tGrupos.getValueAt(f, 0).toString()));
        }
    }//GEN-LAST:event_tGruposMousePressed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        fGrupo.show(true, "");
    }//GEN-LAST:event_btAgregarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        int f=tGrupos.getSelectedRow();
        if(f>-1){
            fGrupo.show(false,tGrupos.getValueAt(f, 0).toString());            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un grupo!!!", 
                    "Grupos de usuarios", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        int f=tGrupos.getSelectedRow();
        if(f>-1){
            NGrupo.eliminar(tGrupos.getValueAt(f, 0).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un grupo!!!", 
                    "Grupos de usuarios", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void miActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActualizarTablaActionPerformed
        if(tp.getSelectedIndex()>0){
            tUsuarios.updateTabla(NUsuario.getTabla());
        }else{
            tGrupos.updateTabla(NGrupo.getTabla());
        }                
    }//GEN-LAST:event_miActualizarTablaActionPerformed

    private void tGruposKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tGruposKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_UP||evt.getKeyCode()==KeyEvent.VK_DOWN){
            tGruposMousePressed(null);
        }
    }//GEN-LAST:event_tGruposKeyReleased

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
            java.util.logging.Logger.getLogger(FUsuariosGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FUsuariosGrupos dialog = new FUsuariosGrupos(new javax.swing.JFrame(), true);
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
    private jcMousePanel.jcMousePanel FondoGrupo;
    private jcMousePanel.jcMousePanel FondoUsuario;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btAgregarU;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEliminarU;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btModificarU;
    private javax.swing.JMenuItem miActualizarTabla;
    private javax.swing.JPopupMenu pmTabla;
    private javax.swing.JScrollPane spGrupos;
    private javax.swing.JScrollPane spUsuarios;
    private javax.swing.JScrollPane spUsuariosG;
    private JTableDX.JTableDX tGrupos;
    private JTableDX.JTableDX tUsuarios;
    private JTableDX.JTableDX tUsuariosG;
    private javax.swing.JTabbedPane tp;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clear() {
       
    }
    
    @Override
    public void setVisible(boolean b) {
        if(b){
            tGrupos.updateTabla(NGrupo.getTabla());
            tUsuarios.updateTabla(NUsuario.getTabla());                   
        }
        super.setVisible(b);
    }        
   
    @Override
    public void activarPrivilegios(String privilegios){
        btAgregar.setEnabled(privilegios.charAt(1)=='V');
        btModificar.setEnabled(privilegios.charAt(2)=='V');
        btEliminar.setEnabled(privilegios.charAt(3)=='V');
        btAgregarU.setEnabled(privilegios.charAt(1)=='V');
        btModificarU.setEnabled(privilegios.charAt(2)=='V');
        btEliminarU.setEnabled(privilegios.charAt(3)=='V');        
    }    
    
    @Override
    public void repaintAll(Color colorFondo,float transparencia,Color colorFuente,Font font){
        FondoGrupo.setBackground(colorFondo);
        FondoGrupo.setTransparencia(transparencia);
        Component c[]=FondoGrupo.getComponents();
        for (Component ci : c) {
            ci.setForeground(colorFuente);
            ci.setFont(font);
        }
        FondoUsuario.setBackground(colorFondo);
        FondoUsuario.setTransparencia(transparencia);
        c=FondoUsuario.getComponents();
        for (Component ci : c) {
            ci.setForeground(colorFuente);
            ci.setFont(font);
        }
        pmTabla.setFont(font);
        pmTabla.setBackground(colorFondo);
        pmTabla.setForeground(colorFuente);
        fGrupo.repaintAll(colorFondo, transparencia, colorFuente, font);
        fUsuario.repaintAll(colorFondo, transparencia, colorFuente, font);
    }    

}
