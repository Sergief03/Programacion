package test;

import clases.FotosAlhambra;
import org.junit.Test;

import static org.junit.Assert.*;

public class FotosAlhambraTest {
    @Test
    public void test1(){
        FotosAlhambra fotosAlhambra=new FotosAlhambra();
        assertEquals(fotosAlhambra.getnumeroFotos(),2);
        assertNotEquals(fotosAlhambra.getFoto("ALHAMBRA_COLOR").nombre(),null);
        assertNotEquals(fotosAlhambra.getFoto("ALHAMBRA_BN").nombre(),null);

    }

}