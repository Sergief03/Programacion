package test;

import clases.Formato;
import clases.Mensaje;
import org.junit.Test;

import static org.junit.Assert.*;

public class MensajeTest {
    @Test
    public void test1(){
        Mensaje mensaje =new Mensaje("juan@ieshlanz.es","Esto es una prueba",false, Formato.TEXTO);
        assertEquals(mensaje.getLineaCSV(),"juan@ieshlanz.es;Esto es una prueba;false;0");
    }

    @Test
    public void test2(){
        Mensaje mensaje=new Mensaje("juan@ieshlanz.es","Esto es una prueba",false, Formato.TEXTO);
        assertTrue(mensaje.leer().leido());
    }

}