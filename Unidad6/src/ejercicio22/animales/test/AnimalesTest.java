package ejercicio22.animales.test;

import ejercicio22.animales.clases.Leon;
import ejercicio22.animales.clases.Tigre;
import ejercicio22.animales.clases.TransporteAnimales;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalesTest {
    @Test
    public void test1(){
        Leon leon1 = new Leon("Leon", 100);
        Leon leon2 = new Leon("Leon", 50);
        Leon leon3 = new Leon("Leon", 90);
        Leon leon4 = new Leon("Leon", 40);
        Leon leon5 = new Leon("Leon", 120);
        Leon leon6 = new Leon("Leon", 180);


        assertFalse(leon1.isEncerrado());
        assertFalse(leon2.isEncerrado());
        assertFalse(leon3.isEncerrado());
        assertFalse(leon4.isEncerrado());
        assertFalse(leon5.isEncerrado());
        assertFalse(leon6.isEncerrado());

        TransporteAnimales transporte = new TransporteAnimales();
        transporte.añadir(leon1);
        transporte.añadir(leon2);
        transporte.añadir(leon3);
        transporte.añadir(leon4);
        transporte.añadir(leon5);
        transporte.añadir(leon6);

        assertTrue(leon1.isEncerrado());
        assertTrue(leon2.isEncerrado());
        assertTrue(leon3.isEncerrado());
        assertTrue(leon4.isEncerrado());
        assertTrue(leon5.isEncerrado());
        assertTrue(leon6.isEncerrado());

        assertEquals(6, transporte.getNumeroAnimales());

        assertEquals(580, transporte.getPesoActual());
    }

    @Test
    public void test2(){
        TransporteAnimales transporte = new TransporteAnimales();

        for (int i = 0; i < 6; i++) {
            transporte.añadir(new Leon("Leon" + i, 80));
        }

        Leon leonExtra = new Leon("LeonExtra", 70);
        boolean resultado = transporte.añadir(leonExtra);

        assertFalse(resultado);
    }

    @Test
    public void test3(){
        TransporteAnimales transporte = new TransporteAnimales();

        transporte.añadir(new Leon("Leon1", 90));
        transporte.añadir(new Leon("Leon2", 80));

        Tigre tigre = new Tigre("Tigre1", 100);
        boolean resultado = transporte.añadir(tigre);

        assertFalse(resultado);
    }

}