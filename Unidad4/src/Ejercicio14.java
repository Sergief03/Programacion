import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;

public class Ejercicio14 {
    public static void main(String[] args) {
       int[] posicionx={250,297,446,297,250,203,53,202};
       int[] posiciony={46,180,224,268,400,268,224,180};
        Consola consola=new Consola();
        Teclado teclado= consola.getTeclado();
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        Graphics graphics= capaCanvas.getGraphics();
        graphics.drawPolygon(posicionx,posiciony,8);
        teclado.leerCaracter();
    }
}
