package Datos;
// Generated 09-05-2014 09:31:22 AM by Hibernate Tools 3.6.0


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * CargoLaboral generated by hbm2java
 */
public class CargoLaboral  implements java.io.Serializable {


     private short id;
     private String nombre;
     private Set empleados = new HashSet(0);     
     
    public CargoLaboral() {
        
    }

	
    public CargoLaboral(short id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public CargoLaboral(short id, String nombre, Set empleados) {
       this.id = id;
       this.nombre = nombre;
       this.empleados = empleados;
    }
   
    public short getId() {
        return this.id;
    }
    
    public void setId(short id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }

    
    public static boolean agregar(CargoLaboral cl ){
        try{
            String agrega="'"+cl.nombre+"'";
            Sql.ejecutarComando("execute INS_CARGO_LABORAL "+agrega);
            Sql.commit();
            return true;
        }catch(SQLException ex) {
            Sql.rollback();
            Sql.logCat(ex);
            return false;
        }
    }
    
    public static boolean modificar(CargoLaboral cl){         
        String modifica=cl.id+",'"+cl.nombre+"'";
        try{
            Sql.ejecutarComando("exec MOD_CARGO_LABORAL "+modifica);
            Sql.commit();
            return true;
        }catch(SQLException ex) {
            Sql.rollback();
            Sql.logCat(ex);
            return false;
        }
    }
    
    public static boolean buscar(CargoLaboral cl){       
        boolean exito=false;
        String buscar= "'"+cl.nombre+"'" ;
        try{
            Sql.ejecutarConsulta("exec BUS_CARGO_LABORAL_NOMBRE "+buscar);            
            if(Sql.tabla.next()){
                cl.nombre = Sql.tabla.getString(2);                 
                exito=true;
            } 
            Sql.cerrarTabla();            
        }catch(SQLException ex) {            
            Sql.logCat(ex.toString());
        }finally{
            return exito;
        }
    }

    public static boolean existe(CargoLaboral cl){       
        boolean exito=false;
        String buscar= "'"+cl.nombre+"'" ;
        try{
            Sql.ejecutarConsulta("exec BUS_CARGO_LABORAL_NOMBRE "+buscar);            
            exito=Sql.tabla.next();
            Sql.cerrarTabla();            
        }catch(SQLException ex) {            
            Sql.logCat(ex.toString());
        }finally{
            return exito;
        }
    }    
    
    private static Object[][] getArray2D(String orderBy){
        Object data[][] = new Object[0][2];
        try{            
            Sql.ejecutarConsulta("SELECT COUNT(*) FROM CargoLaboral");
            Sql.tabla.next(); int n=Sql.tabla.getInt(1); Sql.cerrarTabla();
            if(n>0){
                data=new Object[n][2]; int f=0;
                Sql.ejecutarConsulta("SELECT * FROM CargoLaboral "+orderBy);
                while(Sql.tabla.next()){
                    data[f][0]=Sql.tabla.getShort(1);
                    data[f][1]=Sql.tabla.getString(2);
                    f++;
                }
                Sql.cerrarTabla();
            }
        }catch(SQLException ex) {
            System.out.println(ex.toString());
        }finally{
            return data;
        }
    }
    
    public static Object[][] getArray2DN(){
        return getArray2D("ORDER BY Nombre");
    }    
    
    public static Object[][] getArray2DI(){
        return getArray2D("ORDER BY Id");
    }        
    
    private static ArrayList<CargoLaboral> toListG(String select){
        ArrayList<CargoLaboral> data = new ArrayList();
        try{            
            Sql.ejecutarConsulta(select);
            while(Sql.tabla.next()){
                CargoLaboral cl=new CargoLaboral();
                cl.setId(Sql.tabla.getShort(1));
                cl.setNombre(Sql.tabla.getString(2));
                data.add(cl);                                
            }             
            Sql.cerrarTabla();            
        }catch(SQLException ex) {            
            System.out.println(ex.toString());            
        }finally{            
            return data;
        }       
    } 
   
    public static ArrayList<CargoLaboral> toListNombre(){        
        return toListG("SELECT * FROM CargoLaboral ORDER BY Nombre");
    }    
       
    public static ArrayList<CargoLaboral> toListId(){        
        return toListG("SELECT * FROM CargoLaboral ORDER BY Id");
    }
   
    @Override
    public String toString() {        
        return nombre;
    }            

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CargoLaboral other = (CargoLaboral) obj;
        return this.id == other.id;
    }       
    
}


