
package Negocio;

import javax.swing.JOptionPane;

public class Msj {

    public static void showI(String msj,String cu){
        JOptionPane.showMessageDialog(null, msj, cu, JOptionPane.INFORMATION_MESSAGE);
    }    
    
    public static void showW(String msj,String cu){
        JOptionPane.showMessageDialog(null, msj, cu, JOptionPane.WARNING_MESSAGE);
    }    
    
    public static void showE(String msj,String cu){
        JOptionPane.showMessageDialog(null, msj, cu, JOptionPane.ERROR_MESSAGE);
    }

}
