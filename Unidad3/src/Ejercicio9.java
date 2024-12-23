import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            boolean continuar=true;
            Consola consola=new Consola();
            CapaTexto capaTexto= consola.getCapaTexto();
            Teclado teclado= consola.getTeclado();
            while (continuar){

                capaTexto.print("Introduce la ruta de acceso de una imagen ");
                String imagen=teclado.leerCadenaCaracteres();

                File file=new File(imagen);
                BufferedImage bufferedImage= ImageIO.read(file);
                FondoImagen fondoImagen=new FondoImagen(bufferedImage);
                CapaFondo capaFondo= consola.getCapaFondo();
                capaFondo.setFondo(fondoImagen);

                capaTexto.print("Si quieres continuar pulsa s: ");
                String opcion= teclado.leerCadenaCaracteres();
                if (!opcion.equalsIgnoreCase("s")){
                    continuar=false;
                }
                capaTexto.cls();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
