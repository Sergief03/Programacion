package clases;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Dibujo implements Dibujable{
    private Dimension tamaño;
    private List<ElementoDibujo> elementos;

    public Dibujo(int anchura, int altura){
        this.tamaño=new Dimension(altura,anchura);
        this.elementos=new ArrayList<>();
    }

    public void añadir(ElementoDibujo e){
        if (e.getX()>this.tamaño.width||e.getY()>this.tamaño.height){
            throw new IllegalArgumentException("El elemento dibujable es demasiado grande");
        }
        this.elementos.add(e);
    }

    public Map<Color, Integer> contarColores(){
        return null;
    }

    @Override
    public BufferedImage getBufferedImage() {
        BufferedImage bufferedImage=new BufferedImage(this.tamaño.height,this.tamaño.width,BufferedImage.TYPE_INT_ARGB);
        Graphics graphics= bufferedImage.getGraphics();
        List<ElementoDibujo> orden= this.elementos;
        Collections.sort(orden);
        for (ElementoDibujo e:orden){
            e.dibujar(graphics);
        }
        return bufferedImage;
    }
}