import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Consola consola=new Consola();
        CapaFondo capaFondo= consola.getCapaFondo();
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        CapaTexto capaTexto=consola.getCapaTexto();
        Teclado teclado=consola.getTeclado();
        Graphics graphics=capaCanvas.getGraphics();
        capaTexto.print("Introduce una ruta de una imagen: ");
        String imagen= teclado.leerCadenaCaracteres();
        try {
            File file=new File(imagen);
            BufferedImage bufferedImage=ImageIO.read(file);
            FondoImagen fondo= new FondoImagen(bufferedImage);
            capaFondo.setFondo(fondo);
            int anchoPantalla=Toolkit.getDefaultToolkit().getScreenSize().width;
            int altoPantalla=Toolkit.getDefaultToolkit().getScreenSize().height;
            for (int i=0;i<altoPantalla;i+=2){
                if (i%4==0){
                    graphics.setColor(Color.black);
                    graphics.drawLine(0,i,anchoPantalla,i);
                }
            }
            teclado.leerCaracter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
