
package Presentacion;

import Datos.DGrupo;
import Datos.DUsuario;
import Negocio.NGrupo;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.LinkedList;
import java.util.Properties;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jcMousePanel.jcMousePanel;

public abstract class Init {
    public static final Properties config;
    public static File fileGrupos;  
    public static File fileUsuarios;
    public static File fileBitacoras;
    public static File fileConfig;
    public static Date fechaActual;
    public static DUsuario user;
    public static String defaultPerfilUser;
    public static ImageIcon fondo;
    public static ImageIcon logo;
    
    public static FPrincipal principal;    
    public static FIniciarSesion iniciarSesion;
    public static FCambiarPassword cambiarPassword;
    public static FBitacora bitacora;    
    public static FInputBitacora inputBitacora;
    
    public static FCliente cliente;
    public static FEmpleado empleado;
    public static FCargoLaboral cargoLaboral;
    public static FEquipo equipo;
    public static FTipoEquipos tipoEquipos;
    public static FContratoEvento contratoEvento;
    public static FCobros cobros;
    public static FTipoEvento tipoEvento;    
    public static FReserva reserva;
    public static FPaquete paquete;
    public static FComponente componente;
    public static FCategoriaComponente categoriaComponente;
    public static FAgenda agenda;
    public static FOrdenTrabajo ordenTrabajo;
    public static FAsignacionEquipo asignacionEquipo;
    public static FUsuariosGrupos UG;
    public static FPerfilUsuario perfilUsuario;    
    public static FPerfilEmpresa perfilEmpresa;        
    public static FBackupRestore backupRestore;
    public static Reportes reportes;
    
    public static PrintStream out;
    
    public static LinkedList<INF412> forms;
    
    static{
        config = new Properties();
        fechaActual=new Date();
        String dir="Datos";
        fileGrupos=new File(dir,"Grupo.data"); 
        fileUsuarios=new File(dir,"Usuario.data"); 
        fileBitacoras=new File(dir,"Bitacora.data");
        fileConfig=new File(dir,"configuracion.properties");        
        defaultPerfilUser="-986896|1.0|-16777216|Tahoma|0|14";        
        try { 
            Init.config.load(new FileInputStream(Init.fileConfig));
            String f=config.getProperty("imagen");
            String l=config.getProperty("logo");            
            fondo=new ImageIcon(f!=null?f:"");
            logo=new ImageIcon(l!=null?l:"");
        } catch (IOException ex) {
            showError("Init.static\n"+ex.toString());
        }        
    }

    public static void showError(String error){
        JOptionPane.showMessageDialog(null,error,"Error de Arranque",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }    
    
    private static void crearReporteErrores(){
        File f=new File("Datos", "Errores.txt");
        if(f.exists()){
            f.delete();
        }
        try {
            f.createNewFile();
            out=new PrintStream(f);
        } catch (IOException ex) {
            showError("Error: No se pudo crear el archivo de errores!!!\n"+ex);            
        }
    }
    
    public static void load(FPrincipal principal) {        
        user=new DUsuario();
        forms=new LinkedList();
        Init.principal=principal;
        
        forms.add(cliente=new FCliente(principal, true));
        forms.add(empleado=new FEmpleado(principal, true));
        forms.add(cargoLaboral=new FCargoLaboral(principal, true));
        forms.add(equipo=new FEquipo(principal, true));
        forms.add(tipoEquipos=new FTipoEquipos(principal, true));
        forms.add(contratoEvento=new FContratoEvento());
        forms.add(cobros=new FCobros(principal, true));
        forms.add(tipoEvento=new FTipoEvento(principal, true));
        forms.add(reserva=new FReserva());
        forms.add(paquete=new FPaquete());
        forms.add(componente=new FComponente(principal, true));
        forms.add(categoriaComponente=new FCategoriaComponente(principal, true));
        forms.add(agenda=new FAgenda(principal, true));
        forms.add(ordenTrabajo=new FOrdenTrabajo(principal, true));
        forms.add(asignacionEquipo=new FAsignacionEquipo(principal, true));
        forms.add(UG=new FUsuariosGrupos(principal, true));    
        forms.add(reportes=new Reportes());
        forms.add(perfilEmpresa=new FPerfilEmpresa(principal, true));
        forms.add(backupRestore=new FBackupRestore(principal, true));
                
        iniciarSesion=new FIniciarSesion(principal, true);
        cambiarPassword=new FCambiarPassword(principal, true);
        bitacora=new FBitacora(principal, true);
        inputBitacora=new FInputBitacora(principal, true);
        perfilUsuario=new FPerfilUsuario(principal, true);        
    }
    
    public static void loadPrivilegios() {        
        DGrupo grupo=NGrupo.load(user.getIdGrupo());
        if(grupo!=null){
            StringTokenizer token=new StringTokenizer(grupo.getPrivilegios(),"*");
            for (INF412 inf412 : forms) {
                inf412.activarPrivilegios(token.nextToken());
            }
            principal.activarPrivilegios(grupo.getPrivilegios());
        }else{
            showError("Init.loadPrivilegios");
        }        
    }
    
    public static Object[] castPerfil(String perfil) {
        StringTokenizer token=new StringTokenizer(perfil,"|");
        Color fondoC=new Color(Integer.parseInt(token.nextToken()));
        float transparencia=Float.parseFloat(token.nextToken());
        Color fuente=new Color(Integer.parseInt(token.nextToken()));
        Font font=new Font(token.nextToken(),Integer.parseInt(token.nextToken()),
                      Integer.parseInt(token.nextToken()));
        return new Object[]{fondoC,transparencia,fuente,font};
    }
    
    public static void repaintAllForms(Color fondo,float transparencia,Color fuente,Font font) {                            
        for (INF412 inf412 : forms) {
            inf412.repaintAll(fondo,transparencia,fuente,font);
        }          
        principal.repaintAll(fondo, transparencia, fuente, font);
        perfilUsuario.repaintAll(fondo, transparencia, fuente, font);
        cambiarPassword.repaintAll(fondo, transparencia, fuente, font);
    }        
    
    public static void setImagenLogo(jcMousePanel Fondo){
        Fondo.setIcon(fondo);
        Fondo.setIconLogo(logo);
    }    
    
    public static void main(String args[]){
        /* Set the Windows look and feel */
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
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
                Init.load(new FPrincipal());
                Init.principal.setVisible(true);
//            }
//        });        
    }    
}
