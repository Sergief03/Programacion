package tema5.test;

import org.junit.Test;
import tema5.ejercicio8.Caja;

import static org.junit.Assert.assertEquals;

public class CajaTestEj8 {
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

    @Test
    public void test4(){
        Caja caja=new Caja("Hola");
        caja.setMensaje("Adios");
        assertEquals(false,caja.abierto);
        assertEquals("Hola",caja.mensaje);
    }

    @Test
    public void test5(){
        Caja caja=new Caja(true,"Hola");
        caja.setMensaje("Adios");
        assertEquals(true,caja.abierto);
        assertEquals("Adios",caja.mensaje);
    }

    @Test
    public void test6(){
        Caja caja=new Caja("Hola");
        caja.pasarMayusculas();
        assertEquals("HOLA",caja.mensaje);
    }

}