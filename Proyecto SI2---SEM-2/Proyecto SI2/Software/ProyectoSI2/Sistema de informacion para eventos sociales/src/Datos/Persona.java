package Datos;
// Generated 09-05-2014 09:31:22 AM by Hibernate Tools 3.6.0

import Datos.*;
import java.sql.SQLException;




/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private String ci;
     private String nombre;
     private String apellidoP;
     private String apellidoM;
     private String direccion;
     private boolean sexo;
     private String telefono;
     private String email;
     private Cliente cliente;
     private Empleado empleado;
 
    
    
    public Persona() {
    }

	
    public Persona(String ci, String nombre, String apellidoP, boolean sexo, String email) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.sexo = sexo;
        this.email = email;
    }
    public Persona(String ci, String nombre, String apellidoP, String apellidoM, String direccion, boolean sexo, String telefono, String email, Cliente cliente, Empleado empleado) {
       this.ci = ci;
       this.nombre = nombre;
       this.apellidoP = apellidoP;
       this.apellidoM = apellidoM;
       this.direccion = direccion;
       this.sexo = sexo;
       this.telefono = telefono;
       this.email = email;
       this.cliente = cliente;
       this.empleado = empleado;
    }
   
    public String getCi() {
        return this.ci;
    }
    
    public void setCi(String ci) {
        this.ci = ci;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoP() {
        return this.apellidoP;
    }
    
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public String getApellidoM() {
        return this.apellidoM;
    }
    
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public boolean isSexo() {
        return this.sexo;
    }
    
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public static void XXX(Empleado empleado) {
        
    }


    public static boolean agregar(Persona p){
        String inserta="'"+ p.ci + "','"+p.nombre+"','"+p.apellidoP+"','"+ p.apellidoM+"','"+ p.direccion+"','"+p.sexo+"','"+p.telefono + "','" +p.email+"'";
        try{           
            Sql.ejecutarComando("exec INS_PERSONA "+inserta+"");                
            Sql.commit();
            return true;
        }catch(SQLException ex) {
            Sql.rollback();
            Sql.logCat(ex.toString());
            return  false;
        }    
    }
    


    public static boolean modificar(Persona p){
        String modifica="'"+ p.ci+"','"+p.direccion+"','"+p.telefono +"','"+p.email+"'";
        try{           
            Sql.ejecutarComando("exec MOD_PERSONA"+ modifica);                
            Sql.commit();
            return true;
        }catch(SQLException ex) {
            Sql.rollback();
            Sql.logCat(ex.toString());
            return  false;
        }     
    }
    
    public static boolean eliminar(Persona p){
        String elimina ="'"+p.ci+"'";
        try {
            Sql.ejecutarComando("exec ELI_PERSONA "+ elimina);
            Sql.commit();
            return true;
        } catch (SQLException ex) {
            Sql.rollback();
            Sql.logCat(ex.toString());
            return false;
        }
    }
    
    public static boolean existeEmail(Persona p){
        boolean exito=false;
        String busca= "'"+p.email+"'";
        try {
            Sql.ejecutarConsulta("exec BUS_PERSONA_EMAIL "+busca);           
            exito=Sql.tabla.next()&&!p.ci.equals(Sql.tabla.getString(1));
            Sql.cerrarTabla();           
        }catch(SQLException ex) {            
            Sql.logCat(ex);
        }finally{            
            return exito;
        }   
    }      
    
    public static boolean  buscarEmail(Persona p){
        boolean exito=false;
        String busca= "'"+p.email+"'";
        try {
           Sql.ejecutarConsulta("execute BUS_PERSONA_EMAIL "+busca);           
            if(Sql.tabla.next()){
                p.ci=Sql.tabla.getString(1);
                p.nombre = Sql.tabla.getString(2); 
                p.apellidoP= Sql.tabla.getString(3);
                p.apellidoM=Sql.tabla.getString(4);
                p.direccion=Sql.tabla.getString(5);
                p.sexo=Sql.tabla.getBoolean(6);
                p.telefono=Sql.tabla.getString(7);                
                exito=true;
            } 
            Sql.cerrarTabla();           
        }catch(SQLException ex) {            
            Sql.logCat(ex);
        }finally{            
            return exito;
        }   
    }    
    
    public static boolean buscar(Persona p){
        boolean exito=false;
        String busca= "'" +p.ci+"'";
        try {
           Sql.ejecutarConsulta("execute BUS_PERSONA_CI "+ busca);           
            if(Sql.tabla.next()){               
                p.nombre = Sql.tabla.getString(2); 
                p.apellidoP= Sql.tabla.getString(3);
                p.apellidoM=Sql.tabla.getString(4);
                p.direccion=Sql.tabla.getString(5);
                p.sexo=Sql.tabla.getBoolean(6);
                p.telefono=Sql.tabla.getString(7);
                p.email=Sql.tabla.getString(8);
                exito=true;
            } 
            Sql.cerrarTabla();           
        }catch(SQLException ex) {            
            Sql.logCat(ex);
        }finally{            
            return exito;
        }   
    }
    
    public static boolean existe(Persona p){
        boolean exito=false;
        String busca="'"+p.ci+"'";
        try {
            Sql.ejecutarConsulta("execute BUS_PERSONA_CI "+ busca);           
            exito=Sql.tabla.next();
            Sql.cerrarTabla();           
        }catch(SQLException ex) {            
            Sql.logCat(ex);
        }finally{     
            return exito;
        }   
    }    
    

}
