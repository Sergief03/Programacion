package tema5.test;

import org.junit.Test;
import tema5.ejemploCoche.Coche;

import static org.junit.Assert.*;

public class CocheTestEjemplo2 {
    @Test
    public void test1(){
        Coche coche=new Coche("1234ABC","Ferrari",15);
        assertEquals("Ferrari",coche.marca);
        assertEquals("1234ABC",coche.matricula);
        assertEquals(15,coche.velocidad);
    }

    @Test
    public void test2(){
        Coche coche=new Coche("2153ABX","Ferrari",-32);
        assertEquals(0,coche.velocidad);
    }

    @Test
    public void test3(){
        Coche coche=new Coche("Ferrari");
        assertEquals(7,coche.matricula.length());
        assertEquals(true,Integer.parseInt(coche.matricula.substring(0,3))>1111&&Integer.parseInt(coche.matricula.substring(0,3))<9999? true:false);
        assertEquals("XYZ",coche.matricula.substring(3));
    }

}