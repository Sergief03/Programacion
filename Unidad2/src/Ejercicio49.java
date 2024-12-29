import daw.efectoimagen.EfectoBuilder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        System.out.println("Introduce la ruta de una imagen:");
        String rutaArchivo=new Scanner(System.in).nextLine();

        File archivo=new File(rutaArchivo);
        try {
            BufferedImage imagen= ImageIO.read(archivo);
            EfectoBuilder efectoBuilder=new EfectoBuilder(imagen);
            int invertir=efectoBuilder.INVERTIR;
            int blurred=efectoBuilder.BLURRED;
            int escala=efectoBuilder.ESCALA_GRISES;
            efectoBuilder.aplicarEfecto(invertir);
            efectoBuilder.aplicarEfecto(blurred);
            efectoBuilder.aplicarEfecto(escala);
            efectoBuilder.build();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
