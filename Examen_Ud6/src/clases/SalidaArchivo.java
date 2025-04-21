package clases;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SalidaArchivo extends Salida  {
    private String ruta;
    private String formato;

    public SalidaArchivo(BufferedImage i,String r, String f){
        super(i);
        this.ruta=r;
        this.formato=f;
    }

    @Override
    public boolean mostrarImagen() {
        boolean mostrar=true;
        try {
            ImageIO.write(this.imagen,this.formato,new File(this.ruta));
        } catch (IOException e) {
            mostrar=false;
        }

        return mostrar;
    }
}
