import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;

public class Ejercicio41 {
    public static void main(String[] args) {
        int anchoPantalla=Toolkit.getDefaultToolkit().getScreenSize().width;
        int altoPantalla=Toolkit.getDefaultToolkit().getScreenSize().height-40;
        Consola consola=new Consola("Consola",altoPantalla,altoPantalla);
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        Graphics graphics= capaCanvas.getGraphics();
        Teclado teclado=consola.getTeclado();
        CapaTexto capaTexto= consola.getCapaTexto();
        capaTexto.print("Introduce un numro entre el que dividir la pantalla: ");
        int numero= teclado.leerNumeroEntero();


        for (int i=0;i<altoPantalla;i+=altoPantalla/numero){
            graphics.drawLine(0,i,altoPantalla,i);
            graphics.drawLine(i,0,i,altoPantalla);
        }
        teclado.leerCaracter();
    }
}
