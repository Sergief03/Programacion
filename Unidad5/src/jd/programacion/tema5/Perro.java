package jd.programacion.tema5;

import java.awt.*;

public class Perro {
    public String nombre;
    public int edad;
    public String raza;
    public Point posicion;
    public boolean hambriento;

    public Perro(String n,int e, String r){
        this.nombre=n;
        if (e>0){
            this.edad=e;
        }else {
            this.edad=1;
        }
        this.raza=r;
        this.posicion=new Point(0,0);
        this.hambriento=false;
    }

    public Perro(String n, int e, String r,Point p,boolean h){
        this.nombre=n;
        this.edad=e>0? e:1;
        this.raza=r;
        this.posicion=p;
        this.hambriento=h;
    }

    public  Perro(String n,int e, String r,int x, int y,boolean h){
        this.nombre=n;
        this.edad=e>0? e:1;
        this.raza=r;
        this.posicion=new Point(x,y);
        this.hambriento=h;
    }
}
