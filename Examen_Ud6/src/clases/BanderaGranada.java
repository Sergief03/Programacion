package clases;

import java.awt.*;
import java.io.IOException;

public class BanderaGranada extends DibujoPredefinido {
    public BanderaGranada() {
        super(1280,768);
    }

    @Override
    public void añadirElementos() {
        this.añadir(new Rectangulo(new Point(200,200),400,300,new Color(174,37,53),1));
        this.añadir(new Rectangulo(new Point(600,200),400,300,new Color(0,255,0),1));
        try {
            this.añadir(new ImagenEscalable("escudo.png",300,200,400,300,2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
