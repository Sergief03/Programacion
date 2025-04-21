package clases;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SalidaConsolaDaw extends Salida{
    private Consola consola;

    public SalidaConsolaDaw(BufferedImage img){
        super(img);
        this.consola=new Consola();
    }

    @Override
    public boolean mostrarImagen() {
        CapaCanvas capaCanvas=consola.getCapaCanvas();
        Graphics graphics=capaCanvas.getGraphics();
        graphics.drawImage(this.imagen,0,0,null);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
