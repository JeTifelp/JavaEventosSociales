package Datos;
// Generated 16-05-2014 02:50:52 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * Cobros generated by hbm2java
 */
public class Cobros  implements java.io.Serializable {


     private int nro;
     private int idCont;
     private String nombreApellido;
     private BigDecimal monto;
     private Date fecha;
     private Date hora;
     private Empleado empleado;

    public Cobros() {
    }

    public Cobros(int nro, int idCont, String nombreApellido, BigDecimal monto, Date fecha, Date hora, Empleado empleado) {
       this.nro = nro;
       this.idCont = idCont;
       this.nombreApellido = nombreApellido;
       this.monto = monto;
       this.fecha = fecha;
       this.hora = hora;
       this.empleado = empleado;
    }
   
    public int getNro() {
        return this.nro;
    }
    
    public void setNro(int nro) {
        this.nro = nro;
    }
    public int getIdCont() {
        return this.idCont;
    }
    
    public void setIdCont(int idCont) {
        this.idCont = idCont;
    }
    public String getNombreApellido() {
        return this.nombreApellido;
    }
    
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getHora() {
        return this.hora;
    }
    
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }




}

