
package IG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Persistencia {

   public static void guardar(String nombreFichero, Object obj) {       
       try {           
           try (ObjectOutputStream p = new ObjectOutputStream(new FileOutputStream(nombreFichero))) {
               p.writeObject(obj);
           }
       } catch (FileNotFoundException ex) {
           System.err.println("Persistencia.guardar\n"+ex.toString());
       } catch (IOException ex) {
           System.err.println(ex.toString());
       } 
    }
   
    public static Object recuperar(String nombreFichero) {
        Object ob = new Object();
        try {            
            try (ObjectInputStream p = new ObjectInputStream(new FileInputStream(nombreFichero))) {
                ob = p.readObject();
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("Persistencia.recuperar\n"+ex.toString());
        }
        return ob;
    }        

    public static boolean insertar(String dato, String tabla) {
        try {            
            try (BufferedWriter out = new BufferedWriter(new FileWriter(new File("Datos",tabla + ".data"), true))) {
                out.write(Encriptador.encriptar(dato, "software12345678") + "\n");
            }
            return true;
        } catch (Exception ex) {
            System.err.println("Persistencia.insertar\n"+ex.toString());
            return false;
        }
    }   

    public static boolean insertar(String dato,String ruta, String tabla) {
        try {            
            try (BufferedWriter out = new BufferedWriter(new FileWriter(new File(ruta, tabla + ".data"), true))) {
                out.write(Encriptador.encriptar(dato, "software12345678") + "\n");
            }
            return true;
        } catch (Exception ex) {
            System.err.println("Persistencia.insertar\n"+ex.toString());
            return false;
        }
    }
    
    private static void cerrarFileReader(FileReader fr){
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (IOException ex) {
            System.err.println("Persistencia.cerrarFileReader\n"+ex.toString());
        }    
    }
    
    public static boolean existe(String dato, String tabla) {
        FileReader fr=null;
        boolean exito=false;
        try {
            fr = new FileReader(new File("Datos",tabla + ".data"));
            BufferedReader br = new BufferedReader(fr);
            String id; String linea;
            while ((linea = br.readLine()) != null) {
               id=new StringTokenizer(Encriptador.desencriptar(linea, "software12345678"),"|").nextToken();
               if(id.equals(dato)){
                   exito=true;
                   break;
               }
            }
        } catch (Exception ex) {
            System.err.println("Persistencia.existe\n"+ex.toString());
        } finally {
            cerrarFileReader(fr);
        }
        return exito;     
    }    

    public static ArrayList<String> consultar(String tabla) {
        FileReader fr = null;
        ArrayList<String> l = new ArrayList();
        try {
            fr = new FileReader(new File("Datos",tabla + ".data"));
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                l.add(Encriptador.desencriptar(linea, "software12345678"));
            }
        } catch (Exception ex) {
            System.err.println("Persistencia.arrayList\n"+ex.toString());
        } finally {
            cerrarFileReader(fr);
        }
        return l;
    }
    
    public static void vaciarTabla(String tabla) throws IOException{
        File f = new File("Datos",tabla+".data");
        f.delete();
        f.createNewFile();        
    }    
   
}
