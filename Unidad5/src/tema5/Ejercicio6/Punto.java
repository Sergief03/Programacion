package tema5.Ejercicio6;

import java.awt.*;

public class Punto {
    public int x;
    public int y;

    public Punto(){
        this(0,0);
    }

    public Punto(int x, int y){
        int ancho=Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto=Toolkit.getDefaultToolkit().getScreenSize().height;
       this.x= ancho>=x&&x>=0? x:ancho;
       this.y=alto>=y&&y>=0? y:alto;
    }

    public Punto(Punto p){
        this(p.x/2,p.y/2);
    }
    public Punto(double angulo,double distancia){
        this.x = (int) Math.round(distancia * Math.cos(Math.toRadians(angulo)));
        this.y = (int) Math.round(distancia * Math.sin(Math.toRadians(angulo)));
    }
}
