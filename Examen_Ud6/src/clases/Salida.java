package clases;

import java.awt.image.BufferedImage;

public abstract class Salida {
    protected BufferedImage imagen;

    public Salida(BufferedImage img){
        this.imagen=img;
    }

    public abstract boolean mostrarImagen();
}
