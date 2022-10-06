
package Negocio;

import Datos.DUsuario;
import Datos.Persistencia;
import Presentacion.Init;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NUsuario {

    public static void insertar(DUsuario usuario) {
        if(!Persistencia.existe(usuario.getLogin(), "Usuario")){
            if(Persistencia.insertar(usuario.toString(), "Usuario")){
                JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente!!!", 
                                            "Usuarios del sistema", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar el usuario!!!", 
                                            "Usuarios del sistema", JOptionPane.ERROR_MESSAGE);                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Alerta ya existe un usuario con ese login !!!", 
                            "Usuarios del sistema", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void modificar(DUsuario usuario,boolean flag) {
        ArrayList<String> lst = Persistencia.consultar("Usuario");        
        try {
            Persistencia.vaciarTabla("Usuario");
            for (int i = 0; i < lst.size(); i++) {
                DUsuario u = DUsuario.toUsuario(lst.get(i));
                if (usuario.getLogin().equals(u.getLogin())) {
                    Persistencia.insertar(usuario.toString(), "Usuario");
                } else {
                    Persistencia.insertar(u.toString(), "Usuario");
                }
            }
            if(flag){
                JOptionPane.showMessageDialog(null, "Asigno otro grupo al usuario exitosamente!!!", 
                        "Usuario del sistema", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Password cambiado exitosamente!!!", 
                        "Usuario del sistema", JOptionPane.INFORMATION_MESSAGE);                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cambiar el password del usuario!!!", 
                                            "Usuarios del sistema", JOptionPane.ERROR_MESSAGE);
            Init.showError("NUsuario.modificar\n"+e.toString());
        }        
    }

    public static void eliminar(String Login){
        ArrayList<String> lst = Persistencia.consultar("Usuario");
        try {            
            Persistencia.vaciarTabla("Usuario");
            for (int i = 0; i < lst.size(); i++) {
                DUsuario u = DUsuario.toUsuario(lst.get(i));
                if (!Login.equals(u.getLogin())) {
                    Persistencia.insertar(u.toString(), "Usuario");
                }
            }
            JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente!!!", 
                        "Usuarios del sistema", JOptionPane.INFORMATION_MESSAGE);            
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario!!!", 
                        "Usuarios del sistema", JOptionPane.ERROR_MESSAGE);
            Init.showError("NUsuario.eliminar\n"+e.toString());
        }
    }

    public static void eliminar(DUsuario usuario) {
        eliminar(usuario.getLogin());
    }

    public static Object[][] getTabla() {
        ArrayList<String> list = Persistencia.consultar("Usuario");
        Object[][] usuarios = new Object[list.size()][3]; DUsuario u;
        for (int i = 0; i < list.size(); i++) {
            u=DUsuario.toUsuario(list.get(i));
            usuarios[i][0]=i+1;
            usuarios[i][1]=u.getLogin();
            usuarios[i][2]=u.getCI();
        }
        return usuarios;
    }

    public static Object[][] getTablaBitacora() {
        ArrayList<String> list = Persistencia.consultar("Usuario");
        Object[][] usuarios = new Object[list.size()][1]; DUsuario u;
        for (int i = 0; i < list.size(); i++) {
            u=DUsuario.toUsuario(list.get(i));            
            usuarios[i][0]=u.getLogin();
        }
        return usuarios;
    }    
    
    public static Object[][] getTablaGrupo(String grupo) {
        ArrayList<String> list = Persistencia.consultar("Usuario");
        ArrayList<DUsuario> users = new ArrayList(); DUsuario usuario;
        for (int i = 0; i < list.size(); i++) {
            usuario = DUsuario.toUsuario(list.get(i));
            if (usuario.getIdGrupo().equals(grupo)) {
                users.add(usuario);
            }
        }
        Object[][] usuarios = new Object[users.size()][3];
        for (int i = 0; i < users.size(); i++) {
            usuario=users.get(i);
            usuarios[i][0] = i+1;
            usuarios[i][1] = usuario.getLogin();
            usuarios[i][2] = usuario.getCI();
        }
        return usuarios;
    }

    public static DUsuario load(String NombreUsuario) {
        ArrayList<String> list = Persistencia.consultar("Usuario");
        for (int i = 0; i < list.size(); i++) {
            DUsuario usuario = DUsuario.toUsuario(list.get(i));
            if (usuario.getLogin().equals(NombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }
    
    
}