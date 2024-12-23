import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Consola consola=new Consola();
        CapaTexto capaTexto= consola.getCapaTexto();
        Teclado teclado= consola.getTeclado();
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        Graphics graphics=capaCanvas.getGraphics();
        Toolkit toolkit=Toolkit.getDefaultToolkit();

        Color rojo=Color.RED;
        Color verde=Color.GREEN;

        int altoPantalla=toolkit.getScreenSize().height;
        int anchoPantalla=toolkit.getScreenSize().width;

        capaTexto.print("Introduce un numero de circulos que quieres dibujar: ");

        try {
            int n= teclado.leerNumeroEntero();
            if (n<=0){
                capaTexto.cls();
                capaTexto.print("Introduce un valor valido");
                Thread.sleep(2000);
            }else {
                boolean continuar=true;
                int posicion=0;

                for (int i=0;i<n&&continuar;i++){
                    if (i>anchoPantalla){
                        continuar=false;
                    }

                    posicion+=25;

                    if (n%2==0){
                        graphics.setColor(rojo);
                        graphics.drawOval(anchoPantalla/n+posicion,altoPantalla/2,20,20);
                    }else {
                        graphics.setColor(rojo);
                        if (n/2==i){
                            graphics.setColor(verde);
                        }
                        graphics.drawOval(anchoPantalla/n+posicion,altoPantalla/2,20,20);
                    }
                }
            }
        }catch (Exception e){
            capaTexto.cls();
            capaTexto.print("Introduce un valor valido");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(e.getMessage());
            }
        }
    }
}
