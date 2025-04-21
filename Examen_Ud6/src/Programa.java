import clases.*;

import java.io.IOException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        boolean continuar=true;
        while (continuar){
            System.out.println("""
                ¿Donde deseas mostrar la bandera del granada?
                1. Consola DAW
                2. Archivo(granada.png)
                Introduce una opcion:
                """);
            String eleccion=new Scanner(System.in).nextLine();
            if (eleccion.length()==1&&eleccion.matches("^[12]")){
                continuar=false;
                if (eleccion.charAt(0)==1){
                    Dibujo dibujo=new Dibujo(1280,768);
                    try {
                        dibujo.añadir(new ImagenEscalable("alhambra.jpg",0,0,1280,768,0));
                        DibujoCapas dibujoCapas=new DibujoCapas(2,1280,768);
                        dibujoCapas.setCapa(1,dibujo);
                        dibujoCapas.setCapa(2,new BanderaGranada());
                        SalidaConsolaDaw salida=new SalidaConsolaDaw(dibujoCapas.getBufferedImage());
                        salida.mostrarImagen();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }else {
                    Dibujo dibujo=new Dibujo(1280,768);
                    try {
                        dibujo.añadir(new ImagenEscalable("alhambra.jpg",0,0,1280,768,0));
                        DibujoCapas dibujoCapas=new DibujoCapas(2,1280,768);
                        dibujoCapas.setCapa(1,dibujo);
                        dibujoCapas.setCapa(2,new BanderaGranada());
                        SalidaArchivo salida=new SalidaArchivo(dibujoCapas.getBufferedImage(),"imagen.png","png");
                        salida.mostrarImagen();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }else {
                System.out.println("Elige una opcion correcta");
            }
        }
    }
}
