package clases;

import javax.swing.*;
import java.awt.*;

public abstract class ElementoDibujo implements PoseedorDimensiones,Comparable<ElementoDibujo>{
    private Point coordenadas;
    private int profundidad;

    public ElementoDibujo(Point coord, int prof){
        if (coord.getX()<0||coord.getY()<0){
            throw new IllegalArgumentException("Las coordenadas son negativas");
        }
        if (prof<0){
            throw new IllegalArgumentException("La profundidad es negativa");
        }
        this.coordenadas=coord;
        this.profundidad=prof;

    }

    public int getX(){
        return this.coordenadas.x;
    }

    public int getY(){
        return this.coordenadas.y;
    }

    public int getProfundidad(){
        return this.profundidad;
    }

    @Override
    public int compareTo(ElementoDibujo o) {
        return getProfundidad()-o.getProfundidad();
    }

    protected abstract void dibujar(Graphics g);
}
