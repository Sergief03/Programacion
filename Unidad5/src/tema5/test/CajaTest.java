package tema5.test;

import org.junit.Test;
import tema5.Ejercicio2.Caja;

import static org.junit.Assert.*;

public class CajaTest {
    @Test
    public void test1(){
        Caja caja=new Caja("Hola amigos");
        assertEquals("Hola amigos",caja.mensaje);
        assertEquals(false,caja.abierto);
    }

    @Test
    public void test2(){
        Caja caja=new Caja(true,"Adios amigos");
        assertEquals(true,caja.abierto);
        assertEquals("Adios amigos",caja.mensaje);
    }

    @Test
    public void test3(){
        Caja caja=new Caja();
        assertEquals(false,caja.abierto);
        assertEquals("Viva el tema 4",caja.mensaje);
    }

}