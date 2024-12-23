package Simulacro;

import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Simulacro3 {
    public static void main(String[] args) {
        File file=new File("C:/Users/sergi/Downloads/wetransfer_prog_1daw-main_2024-09-25_1608/prog_1daw-main/figuras_ventana/img.jpg");
        try {
            BufferedImage imageIO=ImageIO.read(file);
            int x=imageIO.getWidth();
            int y=imageIO.getHeight();
            FondoImagen fondoImagen=new FondoImagen(imageIO);
            Consola consola=new Consola("hola",x,y);
            CapaFondo capaFondo= consola.getCapaFondo();
            capaFondo.setFondo(fondoImagen);

            CapaTexto capaTexto=consola.getCapaTexto();
            capaTexto.print("Pulsa cualquier boton para salir");

            Teclado teclado= consola.getTeclado();
            teclado.setTipoCursor(Teclado.CURSOR_NULO);
            teclado.leerCaracter();



        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
