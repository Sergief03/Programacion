package clases;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class ElementoDibujoConfinado extends ElementoDibujo{
    private Dimension tamaño;

    public ElementoDibujoConfinado(Point c, Dimension t, int p){
        super(c,p);
        this.tamaño=t;
    }

    @Override
    public int getAltura() {
        return this.tamaño.height;
    }

    @Override
    public int getAnchura() {
        return this.tamaño.width;
    }

}
