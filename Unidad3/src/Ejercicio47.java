import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;

import java.awt.*;
import java.util.Random;

public class Ejercicio47 {
    public static void main(String[] args) {
        Consola consola=new Consola();
        Random random=new Random();
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        Graphics graphics= capaCanvas.getGraphics();
        int anchoPantalla=Toolkit.getDefaultToolkit().getScreenSize().width;
        int altoPantalla=Toolkit.getDefaultToolkit().getScreenSize().height;

        for (int i=50;i<anchoPantalla;i+=50){
            for (int j=50;j<anchoPantalla;j+=50){
                Color color=new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
                graphics.setColor(color);
                graphics.drawLine(i,0,j,altoPantalla);
            }
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
