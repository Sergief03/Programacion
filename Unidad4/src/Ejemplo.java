import bpc.daw.consola.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();
        CapaCanvas canvas = consola.getCapaCanvas();
        Teclado teclado= consola.getTeclado();
        Graphics2D graphics2D= canvas.getGraphics2D();

        List<Rectangle> rectangulos = new ArrayList<>();
        List<Color> colores = new ArrayList<>();
        List<Color> coloresIniciales=new ArrayList<>();
        // Crear 6 rectángulos con colores iniciales
        int ancho = 50;
        int alto = 100;
        int espacio = 10;
        int inicioX = 100;
        int inicioY = 150;
        boolean repetir=true;

        coloresIniciales.add(Color.RED);
        coloresIniciales.add(Color.GREEN);
        coloresIniciales.add(Color.BLUE);
        coloresIniciales.add(Color.YELLOW);
        coloresIniciales.add(Color.CYAN);
        coloresIniciales.add(Color.MAGENTA);


        for (int i = 0; i < 6; i++) {
            // Crear rectángulo
            Rectangle r = new Rectangle(inicioX + (ancho + espacio) * i, inicioY, ancho, alto);
            rectangulos.add(r);
            colores.add(coloresIniciales.get(i));
        }

        // Dibujar los rectángulos iniciales
        for (int i = 0; i < rectangulos.size(); i++) {
            graphics2D.setColor(colores.get(i));
            graphics2D.draw(rectangulos.get(i));
        }


        texto.println("Presiona Enter para intercambiar los rectángulos de dos en dos, o escribe 'salir' para terminar.");

        while (repetir) {
            String entrada = teclado.leerCadenaCaracteres();
            if (entrada.equalsIgnoreCase("salir")) {
                repetir=false;
            }

            // Intercambiar colores de dos en dos
            for (int i = 0; i < colores.size() - 1; i += 2) {
                Color temp = colores.get(i);
                colores.set(i, colores.get(i + 1));
                colores.set(i + 1, temp);
            }

            // Limpiar y redibujar los rectángulos
            canvas.cls();
            for (int i = 0; i < rectangulos.size(); i++) {
                graphics2D.setColor(colores.get(i));
                graphics2D.draw(rectangulos.get(i));
            }
        }

        texto.println("Programa terminado.");
    }
}
