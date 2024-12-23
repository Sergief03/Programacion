package Simulacro;

import bpc.daw.consola.*;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.File;

public class Simulacro4  {
    public static void main(String[] args) {
        Consola consola = new Consola();


        CapaFondo fondo = consola.getCapaFondo();
        fondo.setFondo(new FondoColorSolido(Color.BLUE));


        CapaTexto texto = consola.getCapaTexto();
        texto.setColorTexto(Color.YELLOW);


        Teclado teclado = consola.getTeclado();
        teclado.setTipoCursor(Teclado.CURSOR_NULO);


        texto.print("Escriba la ruta de un archivo de imagen: ");
        String rutaImagen = teclado.leerCadenaCaracteres();


        File archivoImagen = new File(rutaImagen);
        if (archivoImagen.exists()) {
            Image imagen = new ImageIcon(rutaImagen).getImage();
            FondoImagen fondoImagen = new FondoImagen(imagen);
            fondoImagen.setEscalado(true);
            fondo.setFondo(fondoImagen);
            texto.cls();
            texto.print("Imagen cargada como fondo. Pulse una tecla para salir.");
        } else {
            texto.println("No se encontró la imagen. Pulse una tecla para salir.");
        }


        teclado.leerCaracter();
    }
}

