package Datos;
// Generated 13-05-2014 06:34:34 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * CategoriaComponente generated by hbm2java
 */
public class CategoriaComponente  implements java.io.Serializable {


     private short id;
     private String nombre;
     private Set componentePaquetes = new HashSet(0);

    public CategoriaComponente() {
    }

	
    public CategoriaComponente(short id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public CategoriaComponente(short id, String nombre, Set componentePaquetes) {
       this.id = id;
       this.nombre = nombre;
       this.componentePaquetes = componentePaquetes;
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
    public Set getComponentePaquetes() {
        return this.componentePaquetes;
    }
    
    public void setComponentePaquetes(Set componentePaquetes) {
        this.componentePaquetes = componentePaquetes;
    }




}


