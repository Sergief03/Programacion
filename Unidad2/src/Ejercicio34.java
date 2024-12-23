import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.PlayList;
import bpc.daw.reproductor.Reproductor;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        System.out.println("Introduce una ruta de archivo MP3:");
        String ruta1= new Scanner(System.in).nextLine();
        System.out.println("Introduce una ruta de archivo MP3:");
        String ruta2= new Scanner(System.in).nextLine();
        System.out.println("Introduce una ruta de archivo MP3:");
        String ruta3= new Scanner(System.in).nextLine();
        try {
            PlayList playList=new PlayList("C:/Users/sergi/Desktop/Nueva carpeta");
            playList.setTitulo("Lista de Ejemplo");
            ArchivoMP3 archivo1=new ArchivoMP3(ruta1);
            ArchivoMP3 archivo2=new ArchivoMP3(ruta2);
            ArchivoMP3 archivo3=new ArchivoMP3(ruta3);
            playList.añadir(archivo1);
            playList.añadir(archivo2);
            playList.añadir(archivo3);
            playList.guardar("C:/Users/sergi/Downloads");

            Reproductor reproductor1 = new Reproductor(playList, true, true);
            reproductor1.play();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
