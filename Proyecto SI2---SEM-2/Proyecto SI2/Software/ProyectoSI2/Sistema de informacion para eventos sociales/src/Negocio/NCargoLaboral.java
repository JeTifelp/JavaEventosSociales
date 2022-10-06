
package Negocio;

import Datos.CargoLaboral;

public class NCargoLaboral {
 
    public static void agregar(CargoLaboral cl){
        if(cl.getNombre().isEmpty()){
            Msj.showW("Ingrese la descripcion!!!","Cargo Laboral");
        }else if(CargoLaboral.agregar(cl)){
            Msj.showI("Registro exitoso!!!","Cargo Laboral");
        }else{
            Msj.showE("Error: ya existe un registro con ese nombre!!!","Cargo Laboral");
        }
    }
    
    public static void modificar(CargoLaboral cl){
        if(cl.getNombre().isEmpty()){
            Msj.showW("Ingrese la descripcion!!!","Cargo Laboral");
        }else if(CargoLaboral.modificar(cl)){
            Msj.showI("Modificacion Exitosa!!!","Cargo Laboral");
        }else{
            Msj.showE("Error: ya existe un registro con ese nombre!!!","Cargo Laboral");
        }
    }            
    
}