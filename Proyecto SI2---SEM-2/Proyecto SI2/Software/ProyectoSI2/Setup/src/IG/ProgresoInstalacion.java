
package IG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Properties;

public class ProgresoInstalacion extends javax.swing.JDialog implements Runnable{

    private String dir_instalacion;
    private final Properties config;
    private OutputStream ou;
    private FileInputStream c;    
    private String directorio;    
    private  String emp;
    private String dirE;
    private String prop;
    private String img;
    private String logo;
    private String raz;
    private String nit;  
    private final RegistrarSuperUsuario registrarSuperUsuario;
    private final Finalizar finalizar;      
    
    public ProgresoInstalacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        dir_instalacion="";
        config = new  Properties();
        this.setLocationRelativeTo(null);
        finalizar = new Finalizar(parent,modal);
        registrarSuperUsuario=new RegistrarSuperUsuario(parent, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        LBT = new javax.swing.JLabel();
        LBE = new javax.swing.JLabel();
        LBN = new javax.swing.JLabel();
        PB = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Setup");
        setResizable(false);

        Panel.setBackground(new java.awt.Color(0, 0, 0));

        LBT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBT.setForeground(new java.awt.Color(255, 255, 255));
        LBT.setText("Progreso de la Instalacion... ");

        LBE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBE.setForeground(new java.awt.Color(255, 255, 255));
        LBE.setText("Extayendo Archivos:");

        LBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBN.setForeground(new java.awt.Color(255, 255, 255));
        LBN.setText("Nombre");

        PB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PB.setForeground(new java.awt.Color(51, 0, 51));
        PB.setStringPainted(true);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(LBE, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBN, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(LBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(LBT)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBE)
                    .addComponent(LBN))
                .addGap(15, 15, 15)
                .addComponent(PB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
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
            java.util.logging.Logger.getLogger(ProgresoInstalacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProgresoInstalacion dialog = new ProgresoInstalacion(new javax.swing.JFrame(), true);                
                dialog.instalarSoftware(args[0], args[1], args[2],args[3], args[4], args[5], args[6], args[7]);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBE;
    private javax.swing.JLabel LBN;
    private javax.swing.JLabel LBT;
    private javax.swing.JProgressBar PB;
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables

 private static long cantidadArchivos(File dir){
        if(dir.isDirectory()){
            File[] ficheros=dir.listFiles(); long cant=0;
            if(ficheros!=null){
                for (File fichero : ficheros) {
                    cant += cantidadArchivos(fichero);
                }                
            }                            
            return cant+1;
        }else{ 
            return 1;
        }            
    }    
    
    public static void copiarFicheros(File f1, File f2){
         try {
             OutputStream out;
             try (InputStream in = new FileInputStream(f1)) {
                 out = new FileOutputStream(f2);
                 byte[] buf = new byte[1024];
                 int len;
                 while ((len = in.read(buf)) > 0) {
                     out.write(buf, 0, len);
                 }}
            out.close();            
         } catch (IOException ex){
             System.err.println("ProgresoInstalacion.copiarFicheros\n"+ex.toString());
         }
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(ProgresoInstalacion.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
        
    public void copiarDirectorios(File di, File df){
        int i=PB.getValue()+1;
        PB.setValue(i); 
        LBN.setText(df.toString());        
        if (di.isDirectory()){
            if (!df.exists()){                              
                df.mkdir();           
            }           
            String[] ficheros = di.list();
            for (String fichero : ficheros) {
                copiarDirectorios(new File(di, fichero), new File(df, fichero));                           
            }
        } else {
            copiarFicheros(di,df);            
        }
    }    
    
    public static String getNombreBD(String bd){
        String S=""; char c; 
        for (int i = 0; i < bd.length(); i++) {            
            c=bd.charAt(i);
            if(c!=' '){
                S+=c;
            }
        }
        return S;
    }
    
    public void crearCarpetaEmpresa(){
        File d1 = new File("Software");
        dir_instalacion=directorio+"\\"+emp;
        File d2 = new File(dir_instalacion);        
        PB.setMaximum((int) cantidadArchivos(d1));
        copiarDirectorios(d1,d2);
    }
 
    public void crearArchivosDatos(){
        File dir=new File(dir_instalacion,"/Datos"); File file;
        if(!dir.exists()){
            dir.mkdir();
        }     
        try {
            file=new File(dir,"/Grupo.data"); file.createNewFile();
            file=new File(dir,"/Usuario.data"); file.createNewFile();
            file=new File(dir,"/Bitacora.data"); file.createNewFile();
            file=new File(dir,"/configuracion.properties"); file.createNewFile();
            config.setProperty("empresa", emp);
            config.setProperty("direccion", dirE);
            config.setProperty("propietario", prop);
            config.setProperty("imagen", img);
            config.setProperty("logo", logo);
            config.setProperty("razon_social", raz);
            config.setProperty("nit", nit);
            config.setProperty("nombre_bd", getNombreBD(emp));
            config.setProperty("dir_instalacion", dir_instalacion);                
            ou = new FileOutputStream(file);
            config.store(ou, file.getAbsolutePath());
        } catch (IOException ex) {
            Sql.logCat("ProgesoInstalacion.crearArchivoDatos(line 259)\n "+ex);
        }
    }
    
    @SuppressWarnings("empty-statement")
    public void ejecutarScriptBD(){
        String nombreBD=getNombreBD(emp);
        File BD = new File(nombreBD+".sql");
        File f = new File("Recursos","script_bd.sql");
        BufferedReader entrada;        
        try {
            entrada = new BufferedReader( new FileReader( f ) );
            FileWriter w = new FileWriter(BD);
            try (BufferedWriter bw = new BufferedWriter(w); PrintWriter wr = new PrintWriter(bw)) {
                wr.append("USE [master]\n");
                wr.append("GO\n");
                wr.append("IF SUSER_SID(N'"+nombreBD+"') IS NOT NULL\n");
                wr.append("DROP LOGIN ["+nombreBD+"]\n");
                wr.append("GO\n");
                wr.append("EXEC msdb.dbo.sp_delete_database_backuphistory @database_name = N'"+nombreBD+"'\n");
                wr.append("GO\n");
                wr.append("ALTER DATABASE ["+nombreBD+"] SET  SINGLE_USER WITH ROLLBACK IMMEDIATE\n");
                wr.append("IF EXISTS (SELECT * FROM sysdatabases WHERE NAME = '"+nombreBD+"')\n");
                wr.append("DROP DATABASE ["+nombreBD+"]\n");
                wr.append("GO\n");
                wr.append("CREATE DATABASE ["+nombreBD+"];\n");
                wr.append("GO"+"\n");
                wr.append("USE ["+nombreBD+"]\n");
                wr.append("GO"+"\n");
                wr.append("CREATE LOGIN ["+nombreBD+"] WITH PASSWORD='"+nombreBD+"', "
                        + "DEFAULT_DATABASE=["+nombreBD+"], DEFAULT_LANGUAGE=[Spanish]\n");
                wr.append("GO"+"\n");
                wr.append("EXEC master..sp_addsrvrolemember @loginame = N'"+nombreBD+"', @rolename = N'sysadmin'\n");
                wr.append("GO"+"\n");
                wr.append("USE ["+nombreBD+"];\n");
                wr.append("GO"+"\n");
                wr.append("CREATE USER ["+nombreBD+"] FOR LOGIN ["+nombreBD+"] WITH DEFAULT_SCHEMA=[dbo]"+"\n");
                wr.append("GO"+"\n");
                wr.append("EXEC sp_addrolemember N'db_owner', N'"+nombreBD+"'\n");
                wr.append("GO"+"\n");
                wr.append("ALTER AUTHORIZATION ON SCHEMA::[db_owner] TO ["+nombreBD+"]"+"\n");
                wr.append("GO"+"\n");
                String linea;
                while(entrada.ready()){
                    linea = entrada.readLine();
                    wr.append(linea+"\n");
                }
                wr.append("GO"+"\n");
                wr.append("INSERT INTO CargoLaboral VALUES('GERENTE')\n");
                wr.append("INSERT INTO CargoLaboral VALUES('ADMINISTRADOR')\n");
                wr.append("INSERT INTO CargoLaboral VALUES('SECRETARIA')\n");
                wr.append("GO"+"\n");
            }
        }catch (IOException ex) {
            System.err.println("ProgresoInstalacion.ejecutar_script_bd(line308)\n"+ex.toString());
        }           
        Runtime proceso = Runtime.getRuntime();
        try{
            Process p=proceso.exec("SQLCMD -i "+nombreBD+".sql");
            while(p.waitFor()!=0);
        }catch (IOException ex){     
            System.err.println("ProgresoInstalacion.ejecutar_script_bd(line319)\n"+ex.toString());
        } catch (InterruptedException ex) {
            System.err.println("ProgresoInstalacion.ejecutar_script_bd(line321)\n"+ex.toString());
        }        
//        BD.renameTo(new File("Recursos",nombreBD+".sql"));
    }
        
    public void setPropiedades(String directorio, String emp, String dirE, String prop, String img, String logo, String raz, String nit) {
        this.directorio = directorio;        
        this.emp = emp;
        this.dirE = dirE;
        this.prop = prop;
        this.img = img;
        this.logo = logo;
        this.raz = raz;
        this.nit = nit;        
    }    
    
    @Override
    @SuppressWarnings({"empty-statement", "empty-statement"})
    public void run() {  
        while(!this.isVisible());
        ejecutarScriptBD();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String db=getNombreBD(emp);
                Sql.conectarSQLServer(db, db, db);
            }
        }).start();
        crearCarpetaEmpresa(); 
        crearArchivosDatos();        
        while(!Sql.isConected());
        this.dispose();
        String adm=registrarSuperUsuario.getADM(dir_instalacion+"/Datos");
        File file=new File(new File(dir_instalacion,"/Datos"),"/configuracion.properties");
        config.setProperty("perfil."+adm,"-986896|1.0|-16777216|Tahoma|0|14");
        config.setProperty("admin.user", adm);
        config.setProperty("admin.group", "ADMINISTRADOR DE SISTEMAS");
        config.setProperty("contrato_max","5");
        config.setProperty("dias_max","15");
        try {
            ou = new FileOutputStream(file);
            config.store(ou, file.getAbsolutePath());
        }  catch (IOException ex) {
            Sql.logCat("ProgesoInstalacion.run(line 352)\n "+ex);
        }        
        finalizar.execSoftware(dir_instalacion);
    }
    
    public void instalarSoftware(String dir,String emp,String dirE,String prop,
    String img,String log,String raz,String nit){
        setPropiedades(dir,emp,dirE,prop,img,log,raz,nit);
        new Thread(this).start();
        this.setVisible(true);
    }
}
