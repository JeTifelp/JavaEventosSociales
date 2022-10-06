
package Datos;

import java.io.Serializable;
import java.util.Date;
import java.util.StringTokenizer;

public final class DBitacora implements Serializable {
    
    private String descripcion;
    private String fecha;
    private String hora;
    private String login;

    public DBitacora() {
    
    }
   
    public DBitacora(String descripcion, String login) {        
        this.descripcion = descripcion;
        actualizarDateTime();
        this.login = login;
    }        

    public void actualizarDateTime() {        
        Date date=new Date();
        this.fecha = date.getYear()+"/"+date.getMonth()+"/"+date.getDay();
        this.hora = date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();        
    }        
    
    public void setLogin(String login) {
        this.login = login;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLogin() {
        return login;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return login + "|" +descripcion + "|" + fecha + "|" + hora;
    }

    public static DBitacora toBitacora(String tupla) {
        StringTokenizer token = new StringTokenizer(tupla, "|");
        DBitacora g = new DBitacora();
        g.login=token.nextToken();
        g.descripcion=token.nextToken();
        g.fecha=token.nextToken();
        g.hora=token.nextToken();        
        return g;
    }
}