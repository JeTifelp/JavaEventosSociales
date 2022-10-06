/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportCol;

import Datos.Sql;
//import static admusuario.DUsuario.getColumnas;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class col1 {
    private int id;
    private String col1;

    public col1() {
    }

    public col1(int id, String col1) {
        this.id = id;
        this.col1 = col1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }
    
     public static LinkedList<col1> gettab(String query, String qrycont) throws SQLException {
        
        if (!Sql.isConected()) {
            return null;
        }
        LinkedList<col1> data=null;        
        try {
            Sql.ejecutarConsulta(qrycont);
            Sql.tabla.next();
            int registros = Sql.tabla.getInt(1);//getInt(0);
            if (registros > 0) {
                data = new LinkedList();
                int i = 0;
                col1 col;                
                Sql.ejecutarConsulta(query);
                while (Sql.tabla.next()) {
                    col=new col1();
                    col.setId(i+1);
                    col.setCol1(Sql.tabla.getString(1));                    
                    data.add(col);
                    i++;
                }
            }
            Sql.commit();
        } catch (SQLException ex) {
            Sql.rollback();
            System.out.println(ex.toString());
        } finally {
            Sql.cerrarTabla();
            return data;
        }
    }      

}
