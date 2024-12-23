import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproducible;
import bpc.daw.reproductor.Reproductor;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.println("Introduce una ruta de un archivo MP3:");
        String rutaArchivo=new Scanner(System.in).nextLine();

        ArchivoMP3 archivoMP3=new ArchivoMP3(rutaArchivo);
        Reproducible cancion=archivoMP3;
        Reproductor reproductor=new  Reproductor(cancion,false,false);
        reproductor.play();
        System.out.println("Titulo: "+archivoMP3.getTitulo()+"\nAutor: "+archivoMP3.getAutor()+"\nDuracion: "+ archivoMP3.getDuracion()/(double)(1000*60)+" min");


    }
}
