/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportCol;

import Datos.Sql;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author David
 */
public class col3 {
    private int id;
    private String col1;
    private String col2;
    private String col3;

    public col3() {
    }

    public col3(int id, String col1, String col2, String col3) {
        this.id = id;
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
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

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public String getCol3() {
        return col3;
    }

    public void setCol3(String col3) {
        this.col3 = col3;
    }
    
     public static LinkedList<col3> gettab(String query, String qrycont) throws SQLException {
        
        if (!Sql.isConected()) {
            return null;
        }
        LinkedList<col3> data=null;        
        try {
            Sql.ejecutarConsulta(qrycont);
            Sql.tabla.next();
            int registros = Sql.tabla.getInt(1);
            if (registros > 0) {
                data = new LinkedList();
                int i = 0;
                col3 col;
                Sql.ejecutarConsulta(query);
                while (Sql.tabla.next()) {
                    col=new col3();
                    col.setId(i+1);
                    col.setCol1(Sql.tabla.getString(1));
                    col.setCol2(Sql.tabla.getString(2));
                    col.setCol3(Sql.tabla.getString(3));
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
