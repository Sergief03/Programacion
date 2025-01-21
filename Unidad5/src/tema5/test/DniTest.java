package tema5.test;

import org.junit.Test;
import tema5.Ejercicio1.Dni;


import static org.junit.Assert.assertEquals;

public class DniTest {
    @Test
    public void test1(){
        Dni dni=new Dni(12345678,'Z');
        assertEquals(12345678,dni.numero);
        assertEquals('Z',dni.letra);
    }

    @Test
    public void test2(){
        Dni dni=new Dni("12345678X");
        assertEquals(12345678,dni.numero);
        assertEquals('X',dni.letra);
    }

}