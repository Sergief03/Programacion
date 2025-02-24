package tema5.test;

import org.junit.Test;
import tema5.ejercicio33.Notas;

import static org.junit.Assert.*;

public class NotasTest {
    @Test
    public void test1(){
        Notas notas=new Notas();
        notas.añadirNota(8);
        notas.añadirNota(5);
        notas.añadirNota(9);
        notas.añadirNota(1);
        notas.añadirNota(6);

        assertEquals(notas.calcularNotaMaxima(),9,0.01);
        assertEquals(notas.calcularNotaMedia(),5.8,0.01);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test2(){
        Notas notas=new Notas();
        notas.calcularNotaMaxima();
        fail("No se ha lanzado una excepcion");
    }

}