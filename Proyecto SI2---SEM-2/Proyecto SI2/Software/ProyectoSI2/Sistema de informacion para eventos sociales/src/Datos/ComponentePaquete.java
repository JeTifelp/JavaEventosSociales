package Datos;
// Generated 13-05-2014 06:34:34 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * ComponentePaquete generated by hbm2java
 */
public class ComponentePaquete  implements java.io.Serializable {


     private short id;
     private CategoriaComponente categoriaComponente;
     private String nombre;
     private BigDecimal precio;
     private boolean icono;
     private Set incluyePcs = new HashSet(0);

    public ComponentePaquete() {
    }

	
    public ComponentePaquete(short id, CategoriaComponente categoriaComponente, String nombre, BigDecimal precio, boolean icono) {
        this.id = id;
        this.categoriaComponente = categoriaComponente;
        this.nombre = nombre;
        this.precio = precio;
        this.icono = icono;
    }
    public ComponentePaquete(short id, CategoriaComponente categoriaComponente, String nombre, BigDecimal precio, boolean icono, Set incluyePcs) {
       this.id = id;
       this.categoriaComponente = categoriaComponente;
       this.nombre = nombre;
       this.precio = precio;
       this.icono = icono;
       this.incluyePcs = incluyePcs;
    }
   
    public short getId() {
        return this.id;
    }
    
    public void setId(short id) {
        this.id = id;
    }
    public CategoriaComponente getCategoriaComponente() {
        return this.categoriaComponente;
    }
    
    public void setCategoriaComponente(CategoriaComponente categoriaComponente) {
        this.categoriaComponente = categoriaComponente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    public boolean isIcono() {
        return this.icono;
    }
    
    public void setIcono(boolean icono) {
        this.icono = icono;
    }
    public Set getIncluyePcs() {
        return this.incluyePcs;
    }
    
    public void setIncluyePcs(Set incluyePcs) {
        this.incluyePcs = incluyePcs;
    }




}


