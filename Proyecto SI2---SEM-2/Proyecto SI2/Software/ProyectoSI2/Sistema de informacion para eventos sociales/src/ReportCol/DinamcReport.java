/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportCol;


import Presentacion.Init;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author David
 */
public abstract class DinamcReport {
    private static String nomEmpresa=Init.config.getProperty("empresa");

    public static void seleRep(String titulo, LinkedList<String> NomCol,String qry,String QryConunt) throws JRException, SQLException {
        JasperReport reporte;
        Map<String, String> parametros = new HashMap<String, String>();
        //parametros.put("fecha", "14/11/2013");
        parametros.put("titulo", titulo);
        parametros.put("NomEmp", nomEmpresa);
        JasperPrint jasperPrint;
        JasperViewer jviewer ;        
        
        switch (NomCol.size()) {
            case 1:
                List<col1> listaPariticipantes = col1.gettab(qry, QryConunt);
                reporte = (JasperReport) JRLoader.loadObject("src\\diseño_x_col\\Rep1.jasper");// src\\Reportes\\ReporteStaticos\\Rcliente.jasper
                for (int i = 0; i < NomCol.size(); i++) {
                    int ii = i + 1;
                    parametros.put("columna" + ii, NomCol.get(i));
                }

                jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(listaPariticipantes));
                jviewer = new JasperViewer(jasperPrint, false);
                jviewer.setVisible(true);
                
                break;
            case 2:
                List<col2> lista2 = col2.gettab(qry,QryConunt);//,where
                reporte = (JasperReport) JRLoader.loadObject("src\\diseño_x_col\\Rep2.jasper");
                for (int i = 0; i < NomCol.size(); i++) {
                    int ii = i + 1;
                    parametros.put("columna" + ii, NomCol.get(i));
                }
                jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(lista2));
                jviewer = new JasperViewer(jasperPrint, false);
                jviewer.setVisible(true);
                break;
             case 3:
                List<col3> lista3 = col3.gettab(qry,QryConunt);//,where
                reporte = (JasperReport) JRLoader.loadObject("src\\diseño_x_col\\Rep3.jasper");
                for (int i = 0; i < NomCol.size(); i++) {
                    int ii = i + 1;
                    parametros.put("columna" + ii, NomCol.get(i));
                }
                jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(lista3));
                jviewer = new JasperViewer(jasperPrint, false);
                jviewer.setVisible(true);
                 break;
             case 4:
                List<col4> lista4 = col4.gettab(qry,QryConunt);//,where
                reporte = (JasperReport) JRLoader.loadObject("src\\diseño_x_col\\Rep4.jasper");
                for (int i = 0; i < NomCol.size(); i++) {
                    int ii = i + 1;
                    parametros.put("columna" + ii, NomCol.get(i));
                }
                jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(lista4));
                jviewer = new JasperViewer(jasperPrint, false);
                jviewer.setVisible(true);
                 break;
             case 5:
                 List<col5> lista5 = col5.gettab(qry,QryConunt);//,where
                reporte = (JasperReport) JRLoader.loadObject("src\\diseño_x_col\\Rep05.jasper");
                for (int i = 0; i < NomCol.size(); i++) {
                    int ii = i + 1;
                    parametros.put("columna" + ii, NomCol.get(i));
                }
                jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(lista5));
                jviewer = new JasperViewer(jasperPrint, false);
                jviewer.setVisible(true);
                 break;
             case 6:
                 List<col6> lista6 = col6.gettab(qry,QryConunt);//,where
                reporte = (JasperReport) JRLoader.loadObject("src\\diseño_x_col\\Rep06.jasper");
                for (int i = 0; i < NomCol.size(); i++) {
                    int ii = i + 1;
                    parametros.put("columna" + ii, NomCol.get(i));
                }
                jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(lista6));
                jviewer = new JasperViewer(jasperPrint, false);
                jviewer.setVisible(true);
                 break;
             case 7:
                 List<col7> lista7 = col7.gettab(qry,QryConunt);//,where
                reporte = (JasperReport) JRLoader.loadObject("src\\diseño_x_col\\Rep7.jasper");
                for (int i = 0; i < NomCol.size(); i++) {
                    int ii = i + 1;
                    parametros.put("columna" + ii, NomCol.get(i));
                }
                jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(lista7));
                jviewer = new JasperViewer(jasperPrint, false);
                jviewer.setVisible(true);
                 break;
             case 8:
                 List<col8> lista8 = col8.gettab(qry,QryConunt);//,where
                reporte = (JasperReport) JRLoader.loadObject("src\\diseño_x_col\\Rep8.jasper");
                for (int i = 0; i < NomCol.size(); i++) {
                    int ii = i + 1;
                    parametros.put("columna" + ii, NomCol.get(i));
                }
                jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(lista8));
                jviewer = new JasperViewer(jasperPrint, false);
                jviewer.setVisible(true);
                 break;
             case 9:
                 List<col9> lista9 = col9.gettab(qry,QryConunt);//,where
                reporte = (JasperReport) JRLoader.loadObject("src\\diseño_x_col\\Rep9.jasper");
                for (int i = 0; i < NomCol.size(); i++) {
                    int ii = i + 1;
                    parametros.put("columna" + ii, NomCol.get(i));
                }
                jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(lista9));
                jviewer = new JasperViewer(jasperPrint, false);
                jviewer.setVisible(true);
                 break;
                }
            
    }
    
    public static String listtostr(LinkedList<String> atrib) {
        String result = "";
        int i = 0;
        while (i < atrib.size()) {
            result = result + "," + atrib.get(i);
            i++;
        }
        result = result.substring(1);
        return result;
    }
    
    public static void mostrarRep(String titulo, LinkedList<String> TituloCol,LinkedList<String> DselecCol,String Dfrom,String Dwhere) throws JRException, SQLException{
        
        String qry="select "+listtostr(DselecCol)+" from "+Dfrom+" where "+Dwhere;
        String qrycount="Select count(1) from "+Dfrom+" where "+Dwhere;
        seleRep(titulo, TituloCol,qry,qrycount);
    }
    
    

    public static void main(String[] args) throws Exception {
        
        
//        LinkedList<String> l = new LinkedList<>();
//        l.add("Nombre");
        //seleRep(1, "reportessssss", l, dato);
        //l.add("sexo");
//        String qry="select Nombre from Cliente,Persona where Persona.CI=Cliente.CI";//para 1 col
//        String qrycount="Select count(1) from Cliente,Persona where Persona.CI=Cliente.CI";//para 1 col
//        
//        String qry="select Paquete.Nombre,Paquete.PrecioTotal from Paquete";//para 2 col
//        String qrycount="select count(1) from Paquete";        
//        seleRep("tiyulo", l,qry,qrycount);
//        l.add("telefono");
//        //seleRep(3, "report03", l, null);
//        l.add("telefono");
//  //      seleRep(4, "report04", l, null);
//        l.add("telef2");
//    //    seleRep(5, "report04", l, null);
//        l.add("tel3");
//        seleRep(6, "report04", l, null,"vendedor");
    }
}
