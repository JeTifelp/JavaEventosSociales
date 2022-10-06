
package Datos;

import Presentacion.Init;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Sql {

    private static Connection cnx;
    private static Statement exec;
    public  static CallableStatement pa;
    public  static ResultSet tabla;
    private static final PrintStream log; 
    private static String msj;
    private static String odbc;    
    private static String user;
    private static String password;        
    private static String dataBase;       

    static{ 
        PrintStream xLog=null;
        try {
            File runIDE=new File(System.getProperty("user.dir"),"src");            
            if(runIDE.exists()){
                xLog=System.err;
            }else{
                File fRun=new File("Datos","run");
                fRun.createNewFile();
                xLog=new PrintStream(fRun);        
            }
        } catch (IOException ex) {
            xLog=System.err;
        }finally{
            log=xLog;
        }  
    }
    
    public static void guardarLog(){
        File fLog=new File("Datos","log");        
        File fRun=new File("Datos","run");
        fLog.delete();
        if(fRun.exists()){
            fRun.renameTo(fLog);
        }                        
    }
    
    //--------------------------------------------------------------------------
    public static Connection getSqlServer() {
        return cnx;
    }
    //--------------------------------------------------------------------------
    public static String getMensajeError() {
        return msj;
    }
    //--------------------------------------------------------------------------
    private static String getUrl(String url,String serverName,            
    String portNumber) {        
                return url + serverName + ":" + portNumber + ";databaseName="
                       + dataBase + ";";                
    }    
    //--------------------------------------------------------------------------
    //Se conecta a la base de datos a traves de un origen de datos...
    public static boolean conectarODBC(String odbc) throws SQLException {
        try {
            Sql.odbc=odbc;
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            cnx = DriverManager.getConnection("jdbc:odbc:"+odbc);
            log.println("Conexion realizada con la base de datos!!!");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            log.println(ex.toString());
            log.println("Error: Sql.conectar!!!");
            return false;
        }
    }
    //--------------------------------------------------------------------------    
    //Se conecta a la base de datos a traves de cualquier driver de conexion...
    private static boolean conectarDriverGeneric(String driver,String sgbd,String serverName,
    String portNumber,String dataBaseName,String user,String password) {
        try {            
            dataBase=dataBaseName; Sql.user=user; Sql.password=password;            
            Class.forName(driver);
            cnx = DriverManager.getConnection(getUrl(sgbd, serverName, portNumber), user, password);            
//            cnx.setAutoCommit(false);            
            log.println("Conexion realizada con la base de datos!!!");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            log.println(ex.toString());
            log.println("Error: Sql.conectarDriverGeneric!!!");            
            return false;
        }
    }
    //--------------------------------------------------------------------------    
    //Se conecta a la base de datos a traves de un driver de conexion sqlserver...
    public static boolean conectarSQLServer(String DataBaseName,String User,String Password) {
        return conectarDriverGeneric("com.microsoft.sqlserver.jdbc.SQLServerDriver",
                              "jdbc:sqlserver://","localhost","1433", 
                              DataBaseName, User, Password);
    }
    //--------------------------------------------------------------------------    
    //Se desconecta de la base de datos...
    public static boolean desconectar() {
        try {
            cnx.close();             
            log.println("Conexion finalizada!!!");
            return true;
        } catch (SQLException ex) {
            log.println(ex.toString());
            log.println("Error:Conexion.desconectar!!!");
            return false;
        }
    }
    //--------------------------------------------------------------------------
    //Ejecuta una consulta sql...
    public static boolean ejecutarConsulta(String sql) throws SQLException {              
        exec=cnx.createStatement();
        tabla = exec.executeQuery(sql);          
        return !tabla.wasNull();                                        
    }
    //--------------------------------------------------------------------------
    //Ejecuta una sentencia sql pero no consultas...
    public static boolean ejecutarComando(String sql) throws SQLException {        
        exec=cnx.createStatement();
        return exec.execute(sql);
    }        
    //--------------------------------------------------------------------------
    //Carga un procedimiento almacenado...
    public static boolean cargarPA(String procedimientoAlmacenado) throws SQLException {        
        pa=cnx.prepareCall("{call " + procedimientoAlmacenado + "}");
        return true;
    }
    //--------------------------------------------------------------------------
    //Ejecuta un procedimiento almacenado que no sea de consulta...
    public static boolean ejecutarPA() throws SQLException {        
        return pa.executeUpdate()==1;
    }
    //--------------------------------------------------------------------------
    //Ejecuta un procedimiento almacenado de consulta...
    public static boolean ejecutarPAConsulta() throws SQLException {        
        tabla=pa.executeQuery();
        return !tabla.wasNull(); 
    }
    //--------------------------------------------------------------------------      
    //Deshace la transacsion...
    public static void rollback() {
        try {            
            cnx.rollback();
            log.println("Transaccion Truncada!!!");
        } catch (SQLException ex) {
            log.println(ex.toString());
            log.println("Sql.rollback Error!!!");
        }
    }
    //--------------------------------------------------------------------------
    //Pergunta si existe conexion...
    public static boolean isConected() {
        return cnx!=null;
    }
    //--------------------------------------------------------------------------
    //acepta la transacion...
    public static void commit() throws SQLException{        
        cnx.commit();
    }
    //--------------------------------------------------------------------------
    //Libera los recurso de la tabla...
    public static void cerrarTabla() throws SQLException{        
        tabla.close();        
    }    
    //--------------------------------------------------------------------------    
    public static String castDate(java.util.Date date){
        return "'"+new SimpleDateFormat("dd/MM/yyyy").format(date)+"'";
    }
    //--------------------------------------------------------------------------    
    public static java.util.Date toDate(String date){
        java.util.Date var=new java.util.Date();
        var.setDate(Integer.parseInt(""+date.charAt(0)+date.charAt(1)));
        var.setMonth(Integer.parseInt(""+date.charAt(3)+date.charAt(4)));
        var.setYear(Integer.parseInt(""+date.charAt(6)+date.charAt(7)+date.charAt(8)+date.charAt(9)));
        return var;
    }
    //--------------------------------------------------------------------------	
    public static String castTime(Date time) {        
         return "'"+new SimpleDateFormat("hh:mm:ss").format(time)+"'";
    }
    //--------------------------------------------------------------------------	
    public static Date toTime(String time) {                
        Date var=new Date();        
        var.setHours(Integer.parseInt(""+time.charAt(0)+time.charAt(1)));
        var.setMinutes(Integer.parseInt(""+time.charAt(3)+time.charAt(4)));
        var.setSeconds(Integer.parseInt(""+time.charAt(6)+time.charAt(7)));
        return var;
    }    
    //--------------------------------------------------------------------------    
    public static void main(String args[]) throws SQLException {        
        Sql.conectarODBC("master");
        
        Sql.desconectar();        
    }
    
    public static void logCat(Object msj) {
        log.println(msj.toString());
    }    

    public static void mostrarArray2D(Object array[][]) {
        for (Object[] f : array) {
            String a="";
            for (Object c : f) {
                a += c.toString() + " ; ";
            }
            System.out.println(a);
        }
    }        

    public static void mostrarArray(Object array[]) {
        for (Object f : array) {                        
            System.out.println(f);
        }
    }        
    
    public static void setAutoCommit(boolean b) throws SQLException{
        cnx.setAutoCommit(b);
    }
            
    
}
