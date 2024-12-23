import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.PlayList;
import bpc.daw.reproductor.Reproducible;
import bpc.daw.reproductor.Reproductor;

import java.io.IOException;

public class Ejemplo {
    public static void main(String[] args) {

        try {
            PlayList playList = new PlayList("C:\\Windows\\Temp");
        } catch (IOException e) {
            e.printStackTrace();  // Muestra el mensaje de error exacto.
        }

    }
}
