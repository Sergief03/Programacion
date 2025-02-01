package tema5.test;

import org.junit.Test;
import tema5.ejemploTDD.Coche;

import static org.junit.Assert.*;

public class CocheTest {
    @Test
    public void test1(){
        Coche  coche=new Coche("1234ABC","Ferrari",15);
        assertEquals("1234ABC",coche.matricula);
        assertEquals("Ferrari",coche.marca);
        assertEquals(15,coche.velocidad);
    }

    @Test
    public void test2(){
        Coche coche=new Coche("2153ABX","Ferrari",-32);
        assertEquals("2153ABX",coche.matricula);
        assertEquals(0,coche.velocidad);
    }

    @Test
    public void tes3(){
        Coche coche=new Coche("Ferrari");
        int numero=Integer.parseInt(coche.matricula.substring(0,3));
        String letras= coche.matricula.substring(3);
        assertEquals(7,coche.matricula.length());

        if (!(numero >= 1111 && numero <= 9999)) {
            fail("El numero de matricula no es correcto");
        }
        assertEquals(0,coche.velocidad);
        assertEquals("XYZ",letras);
    }

}