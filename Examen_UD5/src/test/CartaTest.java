package test;

import bpc.imagenescartas.lib.OutputMode;
import clases.Carta;
import clases.Palo;
import clases.TipoCarta;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class CartaTest {
    @Test
    public void test1(){
        Carta carta=new Carta(Palo.ESPADAS,11);
        assertEquals(carta.getTipoCarta(), TipoCarta.CABALLO);
        assertTrue(carta.getTipoCarta().esFigura());
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test2(){
        Carta carta=new Carta(Palo.BASTOS,44);
        fail("No se ha lanzado ninguna excepcion");
    }

    @Test
    public void test3(){
        Carta carta=new Carta(Palo.COPAS,12);
        carta.mostrar(OutputMode.ASCII_ART_STRING, Color.BLUE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test4(){
        Carta carta=new Carta(Palo.OROS,1);
        carta.mostrar(OutputMode.COLOR_BUFFERED_IMAGE, Color.BLUE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}