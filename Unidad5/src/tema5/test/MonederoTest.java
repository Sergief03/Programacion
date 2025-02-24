package tema5.test;

import org.junit.Test;
import tema5.ejercicio38.Monedero;

import static org.junit.Assert.*;

public class MonederoTest {
    @Test
    public void test1(){
        Monedero monedero=new Monedero();
        assertEquals(monedero.añadirDinero(50),true);
        assertEquals(monedero.getDineroTotal(),50,0.01);
        assertEquals(monedero.retirarDinero(30),true);
        assertEquals(monedero.getDineroTotal(),20,0.01);
        assertEquals(monedero.retirarDinero(400),false);
        assertEquals(monedero.getDineroTotal(),20,0.01);
    }

    @Test
    public void test2(){
        Monedero monedero=new Monedero();
        assertEquals(monedero.añadirDinero(50),true);
        assertEquals(monedero.getDineroTotal(),50,0.01);
        assertEquals(monedero.retirarDinero(2000),false);
        assertEquals(monedero.getDineroTotal(),50,0.01);
        assertEquals(monedero.añadirDinero(950),true);
        assertEquals(monedero.getDineroTotal(),1000,0.01);
        assertEquals(monedero.añadirDinero(1),false);
        assertEquals(monedero.getDineroTotal(),1000,0.01);
    }

}