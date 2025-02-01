package tema5.test;

import org.junit.Test;
import tema5.ejercicio13.Caja;

import static org.junit.Assert.assertEquals;

public class CajaTestEj13 {
    @Test
    public void test1(){
        Caja caja=new Caja("Hola amigos");
        assertEquals("Hola amigos",caja.getMensaje());
        assertEquals(false,caja.esAbierta());
    }

    @Test
    public void test2(){
        Caja caja=new Caja(true,"Adios amigos");
        assertEquals(true,caja.esAbierta());
        assertEquals("Adios amigos",caja.getMensaje());
    }

    @Test
    public void test3(){
        Caja caja=new Caja();
        assertEquals(false,caja.esAbierta());
        assertEquals("Viva el tema 4",caja.getMensaje());
    }

    @Test
    public void test4(){
        Caja caja=new Caja("Hola");
        caja.setMensaje("Adios");
        assertEquals(false,caja.esAbierta());
        assertEquals("Hola",caja.getMensaje());
    }

    @Test
    public void test5(){
        Caja caja=new Caja(true,"Hola");
        caja.setMensaje("Adios");
        assertEquals(true,caja.esAbierta());
        assertEquals("Adios",caja.getMensaje());
    }

    @Test
    public void test6(){
        Caja caja=new Caja("Hola");
        caja.pasarMayusculas();
        assertEquals("HOLA",caja.getMensaje());
    }

    @Test
    public void test7(){
        Caja caja=new Caja("Hola");
        caja.abrir();
        assertEquals("Hola",caja.getMensaje());
    }

}