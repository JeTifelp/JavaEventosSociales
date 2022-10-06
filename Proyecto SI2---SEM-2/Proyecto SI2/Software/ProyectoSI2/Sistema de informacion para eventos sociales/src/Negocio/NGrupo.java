
package Negocio;

import Datos.DGrupo;
import Datos.Persistencia;
import Presentacion.Init;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NGrupo {    

    public static void insertar(DGrupo grupo) {
        if(!Persistencia.existe(grupo.getNombre(), "Grupo")){
            if(Persistencia.insertar(grupo.toStringInsertar(), "Grupo")){
                JOptionPane.showMessageDialog(null, "Grupo agregado exitosamente!!!", 
                                            "Grupo de usuarios", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar el grupo!!!", 
                                            "Grupo de usuarios", JOptionPane.ERROR_MESSAGE);                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Alerta ya existe un grupo con ese nombre !!!", 
                            "Grupo de usuarios", JOptionPane.WARNING_MESSAGE);            
        }
    }

    public static void modificar(DGrupo grupo) {
        ArrayList<String> lst = Persistencia.consultar("Grupo");        
        try {
            Persistencia.vaciarTabla("Grupo");
            for (int i = 0; i < lst.size(); i++) {
                DGrupo u = DGrupo.toGrupo(lst.get(i));
                if (grupo.getNombre().equals(u.getNombre())) {
                    Persistencia.insertar(grupo.toStringInsertar(), "Grupo");
                } else {
                    Persistencia.insertar(u.toStringInsertar(), "Grupo");
                }
            }
            JOptionPane.showMessageDialog(null, "Grupo modificado exitosamente!!!", 
                                            "Grupo de usuarios", JOptionPane.INFORMATION_MESSAGE);            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el grupo!!!", 
                                            "Grupo de usuarios", JOptionPane.ERROR_MESSAGE);
            Init.showError("NGrupo.modificar\n"+e.toString());
        }
    }

    public static void eliminar(String nombreGrupo) {
        ArrayList<String> lst = Persistencia.consultar("Grupo");
        try {            
            Persistencia.vaciarTabla("Grupo");
            for (int i = 0; i < lst.size(); i++) {
                DGrupo u = DGrupo.toGrupo(lst.get(i));
                if (!nombreGrupo.equals(u.getNombre())) {
                    Persistencia.insertar(u.toStringInsertar(), "Grupo");
                }
            }
            JOptionPane.showMessageDialog(null, "Grupo eliminado exitosamente!!!", 
                                            "Grupo de usuarios", JOptionPane.INFORMATION_MESSAGE);            
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el grupo!!!", 
                                            "Grupo de usuarios", JOptionPane.ERROR_MESSAGE);
            Init.showError("NGrupo.eliminar\n"+e.toString());
        }
    }

    public static void eliminar(DGrupo grupo) {
        eliminar(grupo.getNombre());
    }

    public static DGrupo[] getArray() {
        ArrayList<String> list = Persistencia.consultar("Grupo");
        DGrupo[] grupos = new DGrupo[list.size()];
        for (int i = 0; i < list.size(); i++) {
            grupos[i] = DGrupo.toGrupo(list.get(i));
        }
        return grupos;
    }
    
    public static DGrupo load(String nombreGrupo) {
        ArrayList<String> list = Persistencia.consultar("Grupo");
        for (int i = 0; i < list.size(); i++) {
            DGrupo grupo = DGrupo.toGrupo(list.get(i));
            if (grupo.getNombre().equals(nombreGrupo)) {
                return grupo;
            }
        }
        return null;
    }
    
    public static Object[][] getTabla() {
        ArrayList<String> list = Persistencia.consultar("Grupo");
        Object[][] grupos = new Object[list.size()][1];
        for (int i = 0; i < list.size(); i++) {
            grupos[i][0] = DGrupo.toGrupo(list.get(i)).getNombre();
        }
        return grupos;
    }
}
