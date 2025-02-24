package tema5.test;

import org.junit.Test;
import tema5.ejercicio32.Bombo;

import static org.junit.Assert.*;

public class BomboTest {
    @Test
    public void test1(){
        Bombo bombo=new Bombo(100);
        assertEquals(100,bombo.getNumeroBolas());
        for (int i=0;i<100;i++) {
            bombo.sacarBola();
        }
        assertEquals(0,bombo.getNumeroBolas());
    }

}