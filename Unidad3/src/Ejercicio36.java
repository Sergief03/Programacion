import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;

public class Ejercicio36 {
    public static void main(String[] args) {
        int altoPantalla=Toolkit.getDefaultToolkit().getScreenSize().height;
        int anchoPantalla=altoPantalla;
        Consola consola=new Consola("Consola",altoPantalla,anchoPantalla);
        CapaCanvas capaCanvas= consola.getCapaCanvas();
        Graphics graphics= capaCanvas.getGraphics();
        Teclado teclado=consola.getTeclado();


        for (int i=50;i<altoPantalla;i+=50){
            graphics.drawLine(i,0,anchoPantalla,i);
            graphics.drawLine(anchoPantalla,altoPantalla-i,anchoPantalla-i,0);
        }
        teclado.setTipoCursor(Teclado.CURSOR_NULO);
        teclado.leerCaracter();
    }
}
