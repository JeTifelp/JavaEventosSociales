package Datos;
// Generated 13-05-2014 06:34:34 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * TipoEquipo generated by hbm2java
 */
public class TipoEquipo  implements java.io.Serializable {


     private short id;
     private String nombre;
     private Set equipos = new HashSet(0);

    public TipoEquipo() {
    }

	
    public TipoEquipo(short id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public TipoEquipo(short id, String nombre, Set equipos) {
       this.id = id;
       this.nombre = nombre;
       this.equipos = equipos;
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
    public Set getEquipos() {
        return this.equipos;
    }
    
    public void setEquipos(Set equipos) {
        this.equipos = equipos;
    }




}


