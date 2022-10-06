
package ReportCol;

import Presentacion.Init;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.codehaus.groovy.reflection.handlegen;

public class DR_Cliente {

    public static Connection conexion;
    private String BD=Init.config.getProperty("nombre_bd");
    private String url="jdbc:sqlserver://localhost:1433;databaseName="+BD;// [root on dbo]
    private final String login=BD;
    private final String password=BD;
               

    public DR_Cliente() {
        try {
            //AQUI SE CARGA EL DRIVER DE CONEXION SQL SERVER
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");            //"sun.jdbc.odbc.JdbcOdbcDriver"
            conexion = DriverManager.getConnection(url,login,password);                                                    
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void runReporte(String Ajasper,String titulo,String Empresa) {
        try {                    
        String master = System.getProperty("user.dir") + "\\src\\Rep_Diseño\\"+Ajasper;   
        System.out.print("master "+ master);
        if (master==null) {
            System.out.print("no se encontro el archivo de reporte maestro");    
            System.exit(2);
        }
        JasperReport masterReport=null;
        try {
            masterReport=(JasperReport) JRLoader.loadObject(master);
        } catch (Exception e) {
            System.out.print("error cargando el reporte maestro"+e.getMessage());    
            System.exit(3);
        }        
        //NomEmp
        Map paramt= new HashMap();        
        paramt.put("NomEmp", Empresa);
        
        JasperPrint jasperPrint = JasperFillManager.fillReport(master, paramt, conexion);
        JasperViewer jviewer = new JasperViewer(jasperPrint, false);
        jviewer.setTitle(titulo);
        jviewer.setVisible(true);
        
        } catch (Exception j) {
            System.out.print("Mensaje de error"+j.getMessage());
        }
    }
    public void runReporte(String Ajasper,Date parametro,String titulo,String Empresa) {
        try {                    
        String master = System.getProperty("user.dir") + "\\src\\Rep_Diseño\\"+Ajasper;   
        System.out.print("master"+ master);
        if (master==null) {
            System.out.print("no se encontro el archivo de reporte maestro");    
            System.exit(2);
        }
        JasperReport masterReport=null;
        try {
            masterReport=(JasperReport) JRLoader.loadObject(master);
        } catch (Exception e) {
            System.out.print("error cargando el reporte maestro"+e.getMessage());    
            System.exit(3);
        }
        
        Map paramt= new HashMap();
        paramt.put("nomparam", parametro);
        paramt.put("NomEmp", Empresa);
        
        
        JasperPrint jasperPrint = JasperFillManager.fillReport(master, paramt, conexion);
        JasperViewer jviewer = new JasperViewer(jasperPrint, false);
        jviewer.setTitle(titulo);
        jviewer.setVisible(true);
        
        } catch (Exception j) {
            System.out.print("Mensaje de error"+j.getMessage());
        }
    }
    public void runReporte(String Ajasper,String parametro,String titulo,String Empresa) {
        try {                    
        String master = System.getProperty("user.dir") + "\\src\\Rep_Diseño\\"+Ajasper;   
        System.out.print("master"+ master);
        if (master==null) {
            System.out.print("no se encontro el archivo de reporte maestro");    
            System.exit(2);
        }
        JasperReport masterReport=null;
        try {
            masterReport=(JasperReport) JRLoader.loadObject(master);
        } catch (Exception e) {
            System.out.print("error cargando el reporte maestro"+e.getMessage());    
            System.exit(3);
        }
        
        Map paramt= new HashMap();
        paramt.put("nomparam", parametro);
        paramt.put("NomEmp", Empresa);
        
        JasperPrint jasperPrint = JasperFillManager.fillReport(master, paramt, conexion);
        JasperViewer jviewer = new JasperViewer(jasperPrint, false);
        jviewer.setTitle(titulo);
        jviewer.setVisible(true);
        
        } catch (Exception j) {
            System.out.print("Mensaje de error"+j.getMessage());
        }
    }
    public void runReporte(String Ajasper,int parametro,String titulo,String Empresa) {
        try {                    
        String master = System.getProperty("user.dir") + "\\src\\Rep_Diseño\\"+Ajasper;   
        System.out.print("master"+ master);
        if (master==null) {
            System.out.print("no se encontro el archivo de reporte maestro");    
            System.exit(2);
        }
        JasperReport masterReport=null;
        try {
            masterReport=(JasperReport) JRLoader.loadObject(master);
        } catch (Exception e) {
            System.out.print("error cargando el reporte maestro"+e.getMessage());    
            System.exit(3);
        }
        
        Map paramt= new HashMap();
        paramt.put("nomparam", parametro);
        paramt.put("NomEmp", Empresa);
        
        JasperPrint jasperPrint = JasperFillManager.fillReport(master, paramt, conexion);
        JasperViewer jviewer = new JasperViewer(jasperPrint, false);
        jviewer.setTitle(titulo);
        jviewer.setVisible(true);
        
        } catch (Exception j) {
            System.out.print("Mensaje de error"+j.getMessage());
        }
    }

    public void cerrar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
