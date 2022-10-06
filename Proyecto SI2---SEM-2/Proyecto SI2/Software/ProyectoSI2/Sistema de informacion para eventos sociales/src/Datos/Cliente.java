
package Datos;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Cliente  implements java.io.Serializable {

     private String ci;
     private Persona persona;
     private Date fechaReg;
     private Set contratos = new HashSet(0);

    public Cliente() {

    }

	
    public Cliente(Persona persona, Date fechaReg) {
        this.persona = persona;
        this.fechaReg = fechaReg;
    }
    public Cliente(Persona persona, Date fechaReg, Set contratos) {
       this.persona = persona;
       this.fechaReg = fechaReg;
       this.contratos = contratos;
    }
   
    public String getCi() {
        return this.ci;
    }
    
    public void setCi(String ci) {
        this.ci = ci;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Date getFechaReg() {
        return this.fechaReg;
    }
    
    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }
    public Set getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Set contratos) {
        this.contratos = contratos;
    }

    public static boolean  buscar(Cliente c){        
        boolean exito=false;
        String busca= "'"+c.ci+"'";
        try {
           Sql.ejecutarConsulta("execute BUS_CLIENTE "+ busca);           
            if(Sql.tabla.next()){               
                c.fechaReg = Sql.tabla.getDate(2);          
                exito=true;
            } 
            Sql.cerrarTabla();            
        }catch(SQLException ex) {            
            Sql.logCat(ex);            
        }finally{
            return exito;
        }
    }

    public static boolean existe(Cliente c){        
        boolean exito=false;
        String busca="'"+c.ci+"'";
        try {
            Sql.ejecutarConsulta("execute BUS_CLIENTE "+ busca);           
            exito=Sql.tabla.next();
            Sql.cerrarTabla();            
        }catch(SQLException ex) {            
            Sql.logCat(ex);            
        }finally{
            return exito;
        }
    }
    
}


