
package Negocio;

import Datos.DBitacora;
import Datos.Persistencia;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NBitacora {
    
    private static final DBitacora bitacora=new DBitacora();
    
    public static void insertar(String detalle) {
        bitacora.setDescripcion(detalle);
        bitacora.actualizarDateTime();
        Persistencia.insertar(bitacora.toString(), "Bitacora");
    }

    public static DBitacora[] listar(Date fecha) {
        ArrayList<String> list = Persistencia.consultar("Bitacora");
        ArrayList<DBitacora> users = new ArrayList();        
        for (int i = 0; i < list.size(); i++) {
            String fechaI = new SimpleDateFormat("yyyy/MM/dd").format(DBitacora.toBitacora(list.get(i)).getFecha());
            String fechaF = new SimpleDateFormat("yyyy/MM/dd").format(fecha);            
            if (fechaI.equals(fechaF)) {
                users.add(DBitacora.toBitacora(list.get(i)));
            }
        }
        DBitacora[] bitacoras = new DBitacora[users.size()];
        for (int i = 0; i < users.size(); i++) {
            bitacoras[i] = users.get(i);
        }
        return bitacoras;
    }

    public static Object[][] getTablaUsuario(String login) {
        ArrayList<String> list = Persistencia.consultar("Bitacora");
        ArrayList<DBitacora> users = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            DBitacora bitac = DBitacora.toBitacora(list.get(i));
            if (bitac.getLogin().equals(login)) {
                users.add(bitac);
            }
        }
        Object[][] bitacoras = new DBitacora[users.size()][4];
        DBitacora bit;
        for (int i = 0; i < users.size(); i++) {
            bit=users.get(i);
            bitacoras[i][0] = i ;
            bitacoras[i][1] = bit.getDescripcion();
            bitacoras[i][2] = bit.getFecha();
            bitacoras[i][3] = bit.getHora();
        }
        return bitacoras;
    }

    public static DBitacora[] listar(String ID, Date fecha) {
        ArrayList<String> list = Persistencia.consultar("Bitacora");
        ArrayList<DBitacora> users = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            DBitacora bitac = DBitacora.toBitacora(list.get(i));
            String fechaI = new SimpleDateFormat("yyyy/MM/dd").format(DBitacora.toBitacora(list.get(i)).getFecha());
            String fechaF = new SimpleDateFormat("yyyy/MM/dd").format(fecha);
            if (bitac.getLogin().equals(ID) && fechaI.equals(fechaF)) 
            {
                users.add(bitac);
            }
        }
        DBitacora[] usuarios = new DBitacora[users.size()];
        for (int i = 0; i < users.size(); i++) {
            usuarios[i] = users.get(i);
        }
        return usuarios;
    }
}
