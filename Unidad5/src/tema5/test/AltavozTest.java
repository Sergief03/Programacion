package tema5.test;

import org.junit.Before;
import org.junit.Test;
import tema5.ejercicio30.Altavoz;

import static org.junit.Assert.*;

public class AltavozTest {
    @Before
    public void reestablecerVolumen(){

    }
    @Test
    public void test1(){
        Altavoz altavoz=new Altavoz();
        assertEquals(altavoz.getVolumen(),Altavoz.VOL_MIN);
        altavoz.ponerVolumenMaximo();
        assertEquals(altavoz.getVolumen(),Altavoz.VOL_MAX);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test2(){
        Altavoz altavoz=new Altavoz();
        altavoz.setVolumen(-28);
        fail("No ha lanzado una excepcion");
    }

    @Test
    public void test3(){
        Altavoz altavoz=new Altavoz();
        altavoz.setVolumen(127);
        assertEquals(altavoz.toString(),"[127] *****_____");
    }



}