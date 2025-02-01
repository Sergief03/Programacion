import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        File[] file=new File("Imagenes").listFiles();

        ArrayList<Image> images=new ArrayList<>();
        Consola consola=new Consola();
        Teclado teclado= consola.getTeclado();
        CapaSprites capaSprites=consola.getCapaSprites();
        CapaTexto capaTexto=consola.getCapaTexto();

        try {
            for (int i=1;i< file.length+1;i++){
                images.add(ImageIO.read(new File("Imagenes/"+i+".png")));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int[][] cuadricula={
                {4,4,8,4,13,14,15,14,16,4},
                {4,4,4,4,21,23,22,46,24,4},
                {4,8,4,4,29,30,31,30,32,4}
        };

        int distancia=0;
        int altura=0;


        for (int i=0;i< cuadricula.length;i++){
            for (int j=0;j< cuadricula[i].length;j++){
                capaSprites.crearSprite(images.get((cuadricula[i][j])-1),new Rectangle(16,16),distancia,altura);
                distancia+=16;
            }
            distancia=0;
            altura+=16;
        }


        teclado.leerCaracter();
    }
}
