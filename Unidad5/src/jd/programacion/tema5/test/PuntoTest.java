package jd.programacion.tema5.test;

import org.junit.Test;
import tema5.Ejercicio6.Punto;

import java.awt.*;

import static org.junit.Assert.*;

public class PuntoTest {
    @Test
    public void test1(){
        Punto punto=new Punto(120,90);
        assertEquals(120,punto.x);
        assertEquals(90,punto.y);
    }

    @Test
    public void test2(){
        Punto punto=new Punto(-200,10000);
        assertEquals(Toolkit.getDefaultToolkit().getScreenSize().width,punto.x,punto.x);
        assertEquals(Toolkit.getDefaultToolkit().getScreenSize().height,punto.y, punto.y);
    }

    @Test
    public void test3(){
        Punto punto=new Punto(new Punto(120,90));
        assertEquals(60,punto.x);
        assertEquals(45,punto.y);
    }

    @Test
    public void test4(){
        Punto punto=new Punto(45.0,100);
        assertEquals(71,punto.x);
        assertEquals(71,punto.y);
    }

}