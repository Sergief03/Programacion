import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
        Random random=new Random();
        Consola consola=new Consola();
        Teclado teclado=consola.getTeclado();
        CapaTexto capaTexto= consola.getCapaTexto();
        CapaCanvas capaCanvas=consola.getCapaCanvas();

        capaTexto.print("Cuantos circulos desea dibujar?");
        int circulos= teclado.leerNumeroEntero();

        try {
            int numroCirculos=0;

            if (circulos<0){
                capaTexto.print("Numero incorrecto");
                Thread.sleep(2000);
            }else{
                while (numroCirculos<circulos){
                    Graphics graphics= capaCanvas.getGraphics();
                    Color color=new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
                    graphics.setColor(color);
                    graphics.drawOval(random.nextInt(dimension.width+1), random.nextInt(dimension.height+1),20,20 );
                    numroCirculos++;
                }
                Thread.sleep(2000);
            }
        }catch (Exception e){
            capaTexto.print("Numero incorrecto");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(e.getMessage());
            }
        }
    }
}
