package clases;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public record Foto(String nombre, int ancho, int alto, Tamaño tamaño, Image imagen) {
    public Foto(String nombre, int ancho, int alto, Tamaño tamaño, Image imagen){
        if (alto<=0||ancho<=0){
            throw new IllegalArgumentException("Medidas incorrectas");
        } else if (imagen.equals(null)) {
            throw new IllegalArgumentException("La imagen es null");
        }

        this.nombre=nombre;
        this.ancho=ancho;
        this.alto=alto;
        this.tamaño=tamaño;
        this.imagen=imagen;
    }

    public Foto(String nombre, Image imagen) {
        this(nombre, imagen.getWidth(null), imagen.getHeight(null), Tamaño.getTamaño(imagen.getWidth(null), imagen.getHeight(null)), imagen);
    }

    public boolean mayorQue(Foto f){
        boolean mayor=false;
        if ((this.alto*this.ancho)>(f.alto* f.ancho)){
            mayor=true;
        }

        return mayor;
    }

    public Foto toBlancoNegro(){
        BufferedImage bufferedImage=new BufferedImage(this.ancho,this.alto,BufferedImage.TYPE_BYTE_GRAY);
        Graphics graphics=bufferedImage.getGraphics();
        graphics.drawImage(this.imagen,0,0,null);
        return new Foto("blacoNegro",bufferedImage);
    }

    public static Foto cargarFoto(String ruta) throws IOException{
        BufferedImage imagen=ImageIO.read(new File(ruta));
        String nombre="";
        if (ruta.contains("/")){
            nombre=ruta.substring(ruta.lastIndexOf("/")+1,ruta.lastIndexOf("."));

        }else {
            nombre=ruta.substring(0,ruta.lastIndexOf("."));
        }
        int ancho=imagen.getWidth();
        int alto=imagen.getHeight();

        return new Foto(nombre,ancho,alto,Tamaño.getTamaño(ancho,alto),imagen);
    }



}
