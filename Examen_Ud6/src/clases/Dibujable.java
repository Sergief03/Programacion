package clases;

import java.awt.image.BufferedImage;

public interface Dibujable {
    public abstract BufferedImage getBufferedImage();
    public default boolean dibujar(Salida s){
        return s.mostrarImagen();
    }
}
