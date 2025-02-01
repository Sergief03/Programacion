package tema5.test;

import org.junit.Test;
import tema5.ejercicio16.DniMejorado;

import static org.junit.Assert.*;

public class DniMejoradoTest {
    @Test
    public void test1(){
        DniMejorado dniMejorado=new DniMejorado(11111111);
        assertEquals(11111111,dniMejorado.getNumero());
        assertEquals('H',dniMejorado.getLetra());
    }

}