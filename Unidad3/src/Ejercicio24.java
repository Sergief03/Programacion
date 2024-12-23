import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;

import java.awt.*;
import java.util.Random;

public class Ejercicio24 {
    public static void main(String[] args) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Consola consola = new Consola();
        Random random = new Random();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        graphics.setColor(Color.red);
        int anchoPantalla = dimension.width;
        int altoPantalla = dimension.height;
        int x = anchoPantalla / 2;
        int y = altoPantalla / 2;

        for (int i = 0; i < 5 * Math.pow(10, 6); i++) {
            boolean aleatorio1 = random.nextBoolean();
            boolean aleatorio2 = random.nextBoolean();

            if (aleatorio1 == true) {
                x++;
            } else if (aleatorio1 == false) {
                x--;
            }

            if (aleatorio2 == true) {
                y++;
            } else if (aleatorio2 == false) {
                y--;
            }

            if (y > altoPantalla) {
                y = 0;
            } else if (y < 0) {
                y = altoPantalla;
            }

            if (x > anchoPantalla) {
                x = 0;
            } else if (x < 0) {
                x = anchoPantalla;
            }
            graphics.drawOval(x,y,4,4);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}