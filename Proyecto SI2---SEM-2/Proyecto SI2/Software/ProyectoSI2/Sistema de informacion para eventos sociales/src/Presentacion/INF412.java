
package Presentacion;

import java.awt.Color;
import java.awt.Font;

public interface INF412 {
    public void clear();
    public void activarPrivilegios(String privilegios);
    public void repaintAll(Color colorFondo,float transparencia,Color colorFuente,Font font);    
}
