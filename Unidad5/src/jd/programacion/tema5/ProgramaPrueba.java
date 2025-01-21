package jd.programacion.tema5;

import java.awt.*;

public class ProgramaPrueba {
    public static void main(String[] args) {
        Perro perro=new Perro("Perro",2,"salchicha");
        perro.edad=2312;
        System.out.println(perro.edad+" "+ perro.nombre);

        Perro perro1=new Perro("perro",2,"buldog",new Point(0,0),false);
    }
}
