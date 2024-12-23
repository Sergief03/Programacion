import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;

public class Ejercicio25 {
    public static void main(String[] args) {
        Consola consola=new Consola();
        Teclado teclado= consola.getTeclado();
        CapaTexto capaTexto= consola.getCapaTexto();
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        Graphics graphics= capaCanvas.getGraphics();

        int anchoPantalla= Toolkit.getDefaultToolkit().getScreenSize().width;
        int altoPantalla= Toolkit.getDefaultToolkit().getScreenSize().height;

        int anchoBarra=anchoPantalla-40;
        int altoBarra=altoPantalla/2-10;

        capaTexto.print("Introduzca un numero de segundos: ");
        int segundos=teclado.leerNumeroEntero();

        int totalActualizaciones = segundos*100 ;

        for (int i = 0; i <= totalActualizaciones; i++){
            graphics.setColor(Color.white);
            double progreso = (double) i / totalActualizaciones;

            graphics.drawRect(20, altoBarra, anchoBarra, 20);
            graphics.setColor(Color.BLUE);
            graphics.fillRect(21, altoBarra+1, (int) (anchoBarra * progreso), 19);

            capaTexto.printct(12,"Esperando finalizacion ... ("+(segundos-i/100)+"seg de "+segundos+") "+(i*100/totalActualizaciones)+"%");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
