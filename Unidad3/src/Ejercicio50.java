import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;

import java.awt.*;

public class Ejercicio50 {
    public static void main(String[] args) {
        final double X_MIN = -2;
        final double Y_MIN = -2;
        final double X_MAX = 2;
        final double Y_MAX = 2;
        final double MAX_ITERACIONES = 1000;

        Consola consola = new Consola();
        CapaCanvas capaCanvas=consola.getCapaCanvas();

        double x = 0;
        double y = 0;
        double x1 = 0;
        double y1 = 0;

        int anchoPantalla = Toolkit.getDefaultToolkit().getScreenSize().width;
        int altoPantalla = Toolkit.getDefaultToolkit().getScreenSize().height;

        Graphics graphics=capaCanvas.getGraphics();

        for (int i = 0; i < anchoPantalla; i++) {

            for (int j = 0; j < altoPantalla; j++) {

                x = X_MIN + i * (X_MAX - X_MIN) / anchoPantalla;
                y = Y_MIN + j * (Y_MAX - Y_MIN) / altoPantalla;

                double x0 = x;
                double y0 = y;
                boolean pertenece=true;
                int iteraciones = 0;
                while (iteraciones < MAX_ITERACIONES&&pertenece) {

                    x1 = x0 * x0 - y0 * y0 + x;
                    y1 = 2 * x0 * y0 + y;

                    double r = Math.sqrt(x1 * x1 + y1 * y1);
                    if (r>2){
                        pertenece=false;
                    }else {
                        x0 = x1;
                        y0 = y1;
                        iteraciones++;
                    }
                }
                if (iteraciones == MAX_ITERACIONES) {
                    graphics.setColor(Color.BLACK);
                } else {
                    double hue = iteraciones * 12 / MAX_ITERACIONES;
                    graphics.setColor(Color.getHSBColor((float) hue, 1, 1));
                }

                graphics.fillRect(i, j, 1, 1);
            }
        }
    }
}