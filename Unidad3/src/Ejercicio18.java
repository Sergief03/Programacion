import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;

import java.awt.*;
import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        Consola consola=new Consola();
        CapaCanvas capaCanvas=consola.getCapaCanvas();

        Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
        Random random=new Random();
        for (int i=0; i<9;i++){
            Graphics graphics = capaCanvas.getGraphics();
            graphics.setColor(Color.white);
            graphics.drawRect(random.nextInt(dimension.width+1), random.nextInt(dimension.height+1), random.nextInt(20,50), random.nextInt(20,50) );

        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
