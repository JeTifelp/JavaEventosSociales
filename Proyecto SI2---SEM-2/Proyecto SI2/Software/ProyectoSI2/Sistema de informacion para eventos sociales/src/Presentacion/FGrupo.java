
package Presentacion;

import Datos.DGrupo;
import Negocio.NGrupo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Font;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class FGrupo extends javax.swing.JDialog {

    private DGrupo dGrupo;    

    public FGrupo(Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Init.setImagenLogo(Fondo);
        tfGrupo.clear(); 
        dGrupo=new DGrupo();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new jcMousePanel.jcMousePanel();
        spPrivilegios = new javax.swing.JScrollPane();
        tPrivilegios = new javax.swing.JTable();
        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        tfGrupo = new JAbcFieldWPO.JAbcFieldWPO();
        lbGrupo = new javax.swing.JLabel();
        spOtros = new javax.swing.JScrollPane();
        tOtros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Grupo de usuarios");

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fondo.setModo(4);
        Fondo.setTransparencia(1.0F);
        Fondo.setVisibleLogo(false);

        tPrivilegios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tPrivilegios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"*", "Todos",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"1", "Registro de cliente",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"2", "Registro de empleados",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"3", "Planilla de tipos de cargos laborales",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"4", "Inventario de Equipos",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"5", "Planilla de tipo de equipos",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"6", "Servicios de contratos para eventos",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"7", "Servicios de cobros de contratos",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"8", "Planilla de tipo de eventos sociales",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"9", "Servicio de reserva para eventos sociales",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"10", "Planilla de paquetes",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"11", "Planilla de componentes para paquetes",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"12", "Planilla de categoria de componentes",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"13", "Administracion de la agenda",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"14", "Administracion de la orden de trabajos",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"15", "Administracion de asignacion de equipos",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)},
                {"16", "Administracion de grupos & usuarios",  new Boolean(true),  new Boolean(true),  new Boolean(true),  new Boolean(true)}
            },
            new String [] {
                "Nro", "Privilegios", "Visible", "Agregar", "Modificar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tPrivilegios.setRowHeight(23);
        tPrivilegios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPrivilegiosMouseClicked(evt);
            }
        });
        spPrivilegios.setViewportView(tPrivilegios);
        if (tPrivilegios.getColumnModel().getColumnCount() > 0) {
            tPrivilegios.getColumnModel().getColumn(0).setMinWidth(30);
            tPrivilegios.getColumnModel().getColumn(0).setPreferredWidth(30);
            tPrivilegios.getColumnModel().getColumn(0).setMaxWidth(30);
            tPrivilegios.getColumnModel().getColumn(2).setMinWidth(70);
            tPrivilegios.getColumnModel().getColumn(2).setPreferredWidth(70);
            tPrivilegios.getColumnModel().getColumn(2).setMaxWidth(70);
            tPrivilegios.getColumnModel().getColumn(3).setMinWidth(70);
            tPrivilegios.getColumnModel().getColumn(3).setPreferredWidth(70);
            tPrivilegios.getColumnModel().getColumn(3).setMaxWidth(70);
            tPrivilegios.getColumnModel().getColumn(4).setMinWidth(70);
            tPrivilegios.getColumnModel().getColumn(4).setPreferredWidth(70);
            tPrivilegios.getColumnModel().getColumn(4).setMaxWidth(70);
            tPrivilegios.getColumnModel().getColumn(5).setMinWidth(70);
            tPrivilegios.getColumnModel().getColumn(5).setPreferredWidth(70);
            tPrivilegios.getColumnModel().getColumn(5).setMaxWidth(70);
        }

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

        tfGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfGrupo.setMaxLength(50);
        tfGrupo.setMessageText("Dato Obligatorio");
        tfGrupo.setModo(((byte)1));
        tfGrupo.setOptionalText(false);
        tfGrupo.setTipo(((byte)2));

        lbGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbGrupo.setText("Nombre del Grupo:");

        tOtros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tOtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Boolean(true),  new Boolean(true),  new Boolean(true)}
            },
            new String [] {
                "Reportes", "Configuraciones de la Empresa", "Backup & Restore"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spOtros.setViewportView(tOtros);

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(lbGrupo)
                        .addGap(20, 20, 20)
                        .addComponent(tfGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btAceptar)
                        .addGap(20, 20, 20)
                        .addComponent(btCancelar))
                    .addComponent(spPrivilegios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                    .addComponent(spOtros))
                .addGap(20, 20, 20))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAceptar)
                    .addComponent(btCancelar)
                    .addComponent(tfGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(spPrivilegios, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        dGrupo.setNombre(tfGrupo.getText());
        dGrupo.setprivilegios(getPrivilegios());
        if(tfGrupo.isEditable()){
            if(tfGrupo.isValueOk()){
                NGrupo.insertar(dGrupo);
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese el nombre del grupo!!!", 
                        "Grupos", JOptionPane.WARNING_MESSAGE);
                return;
            }            
        }else{
            NGrupo.modificar(dGrupo);
        }
        this.dispose();
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();  System.out.println(getPrivilegios());
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tPrivilegiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPrivilegiosMouseClicked
        int f=tPrivilegios.getSelectedRow();
        int c=tPrivilegios.getSelectedColumn();
        if(f==0&&c>0){
            f=tPrivilegios.getRowCount();
            for(int i = 1; i < f; i++) {
                tPrivilegios.setValueAt(tPrivilegios.getValueAt(0, c), i, c);                
            }            
        }
    }//GEN-LAST:event_tPrivilegiosMouseClicked

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
            java.util.logging.Logger.getLogger(FGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FGrupo dialog = new FGrupo(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel lbGrupo;
    private javax.swing.JScrollPane spOtros;
    private javax.swing.JScrollPane spPrivilegios;
    private javax.swing.JTable tOtros;
    private javax.swing.JTable tPrivilegios;
    private JAbcFieldWPO.JAbcFieldWPO tfGrupo;
    // End of variables declaration//GEN-END:variables

    private String getPrivilegios (){
        int rows=tPrivilegios.getRowCount();        
        String cast,priv; int f; cast=""; boolean v,a,m,e,r,c,u;
        for ( f = 1; f < rows; f++) {            
            v=(Boolean)tPrivilegios.getValueAt(f, 2);
            a=(Boolean)tPrivilegios.getValueAt(f, 3);
            m=(Boolean)tPrivilegios.getValueAt(f, 4);
            e=(Boolean)tPrivilegios.getValueAt(f, 5);
            priv=(v?"V":"F")+(a?"V":"F")+(m?"V":"F")+(e?"V":"F")+"*";
            cast+=priv;
        }
        r=(Boolean)tOtros.getValueAt(0, 0);
        c=(Boolean)tOtros.getValueAt(0, 1);
        u=(Boolean)tOtros.getValueAt(0, 2);        
        cast+=(r?"V*":"F*")+(c?"V*":"F*")+(r?"V":"F");
        return cast;
    }
    
    private void setPrivilegios (String cast){         
        StringTokenizer token=new StringTokenizer(cast, "*");                 
        String priv; int f=1; int rows=tPrivilegios.getRowCount();
        while (f<rows) {
            priv=token.nextToken();
            tPrivilegios.setValueAt(priv.charAt(0)=='V',f , 2);
            tPrivilegios.setValueAt(priv.charAt(1)=='V',f , 3);
            tPrivilegios.setValueAt(priv.charAt(2)=='V',f , 4);
            tPrivilegios.setValueAt(priv.charAt(3)=='V',f , 5);
            f++;
        }        
        tOtros.setValueAt(token.nextToken().charAt(0)=='V',0, 0);
        tOtros.setValueAt(token.nextToken().charAt(0)=='V',0, 1);
        tOtros.setValueAt(token.nextToken().charAt(0)=='V',0, 2);        
    }
    
    private void clearTabla(){
        int rows=tPrivilegios.getRowCount(); int f;        
        for ( f = 0; f < rows; f++) {            
            tPrivilegios.setValueAt(false,f, 2);
            tPrivilegios.setValueAt(false,f, 3);
            tPrivilegios.setValueAt(false,f, 4);
            tPrivilegios.setValueAt(false,f, 5);            
        }
        tOtros.setValueAt(false,0,0);
        tOtros.setValueAt(false,0,1);
        tOtros.setValueAt(false,0,2);    
    }

    public void show(boolean flag,String nombre){
        tfGrupo.setEditable(flag);
        tfGrupo.setText(nombre);
        if(flag){            
            this.setTitle("Agregar Grupo de Usuarios");
            clearTabla();                
        }else{
            this.setTitle("Modificar Grupo de Usuarios");            
            dGrupo=NGrupo.load(nombre);
            this.setPrivilegios(dGrupo.getPrivilegios());
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
