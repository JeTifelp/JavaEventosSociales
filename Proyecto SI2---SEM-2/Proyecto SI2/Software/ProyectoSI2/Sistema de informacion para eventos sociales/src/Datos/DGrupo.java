
package Datos;

import java.io.Serializable;
import java.util.StringTokenizer;

public class DGrupo implements Serializable {

    private String nombre;
    private String privilegios;
    
    public DGrupo() {        
    }

    public DGrupo(String nombre,String privilegios) {
        this.nombre = nombre;
        this.privilegios = privilegios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrivilegios() {
        return privilegios;
    }

    public void setprivilegios(String privilegios) {
        this.privilegios = privilegios;
    }
       
    @Override
    public String toString() {
        return nombre;
    }

    public String toStringInsertar() {
        return nombre + "|" +privilegios;
    }    
    
    public static DGrupo toGrupo(String tupla) {
        StringTokenizer token = new StringTokenizer(tupla, "|");
        DGrupo u = new DGrupo();
        u.nombre=token.nextToken();
        u.privilegios=token.nextToken();
        return u;
    }
}
