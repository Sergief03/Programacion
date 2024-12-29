import bpc.daw.reproductor.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        boolean repetir=true;
        List<ArchivoMP3> reproductorMusica=new ArrayList<>();
        reproductorMusica.add(new ArchivoMP3("cancion.mp3"));
        reproductorMusica.add(new ArchivoMP3("letitbe.mp3"));
        reproductorMusica.add(new ArchivoMP3("limbo.mp3"));
        reproductorMusica.add(new ArchivoMP3("waka.mp3"));
        Reproductor reproductor = null;
        while (repetir) {
            System.out.println("Selecciona una cancion:");
            for (int i = 0; i < 4; i++) {
                System.out.println(i+1 + ") " + reproductorMusica.get(i));
            }

            System.out.println("10) Salir");
            int numero = new Scanner(System.in).nextInt();
            if (numero == 10) {
                repetir = false;
            } else {
                if (reproductor!=null){
                    reproductor.stop();
                }
                reproductor = new Reproductor(reproductorMusica.get(numero-1), false, true);
                reproductor.play();
            }
        }
    }
}
