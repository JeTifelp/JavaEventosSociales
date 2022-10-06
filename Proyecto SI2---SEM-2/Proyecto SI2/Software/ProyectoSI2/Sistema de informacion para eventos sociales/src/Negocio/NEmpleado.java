
package Negocio;

import Datos.Cliente;
import Datos.Empleado;
import Datos.Persona;

public class NEmpleado {
        
    public static void agregar(Empleado empleado){
        Persona p=empleado.getPersona();
        if(p.getCi().isEmpty()){
            Msj.showW("Ingrese el CI!!!", "Empleado"); return;            
        }        
        if(p.getNombre().isEmpty()){
            Msj.showW("Ingrese el nombre!!!", "Empleado"); return;            
        }
        if(p.getApellidoP().isEmpty()){
            Msj.showW("Ingrese el apellido paterno!!!", "Empleado"); return;
        }
        if(empleado.getFechaNac()==null){
            Msj.showW("Ingrese la fecha de nacimiento!!!", "Empleado"); return;
        }
        if(!Persona.existeEmail(p)){
            Persona.agregar(p);
            if(Empleado.agregar(empleado)){
                Msj.showI("Registro exitoso!!!", "Empleado");
            }else{
                Msj.showE("Error: Ya existe un empleado con ese CI!!!","Empleado");
            } 
        }else{
            Msj.showW("Ya existe un empleado con ese email!!!", "Empleado");
        }
    }
    
    public static void modificar(Empleado empleado){
        if(Empleado.existe(empleado)){
            if(Persona.existeEmail(empleado.getPersona())){
                Msj.showW("Ya existe un empleado con ese email!!!", "Empleado");
            }else{
                if(Empleado.modificar(empleado)&&Persona.modificar(empleado.getPersona())){
                    Msj.showI("Modificado exitosamente!!!", "Empleado");
                }else{
                    Msj.showE("Error: no se pudo modificar el empleado!!!", "Empleado");
                }     
            }
        }else{
            Msj.showW("No existe un empleado con ese CI!!!", "Empleado");
        }
    }    
    
    public static void eliminar(Empleado empleado){
        Cliente c=new Cliente();
        c.setCi(empleado.getCi());
        if(Empleado.existe(empleado)){                    
            if(Empleado.eliminar(empleado)){
                if(!Cliente.existe(c)){
                    Persona.eliminar(empleado.getPersona());
                }
                Msj.showI("Eliminado Exitosamente!!!", "Empleado");
            }else{
                Msj.showE("Error: no se pudo eliminar el empleado!!!", "Empleado");
            }        
        }else{
            Msj.showW("No existe un empleado con ese CI!!!", "Empleado");
        }
    }    
    
    public static boolean buscar(Empleado empleado){
        if(Empleado.buscar(empleado)){
            return Persona.buscar(empleado.getPersona());
        }else{
            Msj.showI("No existe un empleado con esa CI!!!", "Empleado");
            return false;
        }
    }
    
    
}
