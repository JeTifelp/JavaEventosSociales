
package Datos;



import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Empleado  implements java.io.Serializable {

   

     private String ci;
     private CargoLaboral cargoLaboral;
     private Persona persona;
     private Date fechaNac;
     private float sueldo;
     private Date fechaIng;
     private Set contratos = new HashSet(0);
     private Set ordenTrabajos = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(CargoLaboral cargoLaboral, Persona persona, Date fechaNac, short sueldo, Date fechaIng) {
        this.cargoLaboral = cargoLaboral;
        this.persona = persona;
        this.fechaNac = fechaNac;
        this.sueldo = sueldo;
        this.fechaIng = fechaIng;
    }
    public Empleado(CargoLaboral cargoLaboral, Persona persona, Date fechaNac, short sueldo, Date fechaIng, Set contratos, Set ordenTrabajos) {
       this.cargoLaboral = cargoLaboral;
       this.persona = persona;
       this.fechaNac = fechaNac;
       this.sueldo = sueldo;
       this.fechaIng = fechaIng;
       this.contratos = contratos;
       this.ordenTrabajos = ordenTrabajos;
    }
   
    public String getCi() {
        return this.ci;
    }
    
    public void setCi(String ci) {
        this.ci = ci;
    }
    public CargoLaboral getCargoLaboral() {
        return this.cargoLaboral;
    }
    
    public void setCargoLaboral(CargoLaboral cargoLaboral) {
        this.cargoLaboral = cargoLaboral;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Date getFechaNac() {
        return this.fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    public float getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    public Date getFechaIng() {
        return this.fechaIng;
    }
    
    public void setFechaIng(Date fechaIng) {
        this.fechaIng = fechaIng;
    }
    public Set getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Set contratos) {
        this.contratos = contratos;
    }
    public Set getOrdenTrabajos() {
        return this.ordenTrabajos;
    }
    
    public void setOrdenTrabajos(Set ordenTrabajos) {
        this.ordenTrabajos = ordenTrabajos;
    }

    public static boolean agregar(Empleado em ){
        try{
            String agrega="'"+em.ci+"',"+em.cargoLaboral.getId()+","+
                          Sql.castDate(em.fechaNac)+","+em.sueldo;                                            
            Sql.ejecutarComando("exec INS_EMPLEADO "+agrega);
            Sql.commit();            
            return true;
        }catch(SQLException ex) {
            Sql.rollback();
            Sql.logCat(ex);
            return false;
        }
    }
    
    public static boolean modificar(Empleado em){        
        String modifica="'"+em.ci+"',"+em.cargoLaboral.getId()+","+em.sueldo;
        try{
            Sql.ejecutarComando("exec MOD_EMPLEADO "+modifica);
            Sql.commit();
            return true;
        }catch(SQLException ex) {
            Sql.rollback();
            Sql.logCat(ex);
            return false;
        }
    }
    
    public static boolean eliminar(Empleado em){        
        String elimina= "'"+em.ci+"'";
        try{
            Sql.ejecutarComando("exec ELI_EMPLEADO "+elimina);
            Sql.commit();
            return true;
        }catch(SQLException ex) {
            Sql.rollback();
            Sql.logCat(ex);
            return false;
        }
    }    
  
    public static boolean buscar(Empleado em){     
        boolean exito=false;
        String buscar= "'"+em.ci+"'";
        try{
            Sql.ejecutarConsulta("exec BUS_EMPLEADO "+buscar);            
            if(Sql.tabla.next()){
                em.getCargoLaboral().setId(Sql.tabla.getShort(2));
                em.fechaNac=Sql.tabla.getDate(3);
                em.sueldo=Sql.tabla.getFloat(4);
                em.fechaIng=Sql.tabla.getDate(5);                
                exito=true;
            } 
            Sql.cerrarTabla();            
        }catch(SQLException ex) {            
            Sql.logCat(ex);            
        }finally{
            return exito;
        }
    }
   
    public static boolean existe(Empleado em){     
        boolean exito=false;
        String buscar= "'"+em.ci+"'";
        try{
            Sql.ejecutarConsulta("exec BUS_EMPLEADO "+buscar);            
            exito=Sql.tabla.next();
            Sql.cerrarTabla();            
        }catch(SQLException ex) {            
            Sql.logCat(ex);            
        }finally{
            return exito;
        }
   }    
    
    public Object[][] getArray2D() {
        Object[][] data = new Object[0][5];
        try{         
            Sql.ejecutarConsulta("SELECT COUNT(1) FROM Empleado");
            Sql.tabla.next();
            int registros=Sql.tabla.getInt(1); 
            if(registros>0){
                data = new Object[registros][5];
                int i=0;
                Sql.ejecutarConsulta("SELECT * FROM EMPLEADO_PERSONA");
                while(Sql.tabla.next()){
                    data[i][0] = Sql.tabla.getString(1);
                    data[i][1] = Sql.tabla.getString(2);
                    data[i][2] = (Sql.tabla.getBoolean(3))?"Hombre":"Mujer";                   
                    data[i][3] = Sql.tabla.getString(4);    
                    data[i][4] = Sql.tabla.getString(5);    
                    i++;
                } 
            }           
            Sql.cerrarTabla();
        }catch(SQLException ex) {
            Sql.logCat(ex);            
        }finally{            
            return data;
        }
    }   

}


