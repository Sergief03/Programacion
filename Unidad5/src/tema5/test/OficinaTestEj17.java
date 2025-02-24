package tema5.test;

import org.junit.Test;
import tema5.ejercicio19.Oficina;

import static org.junit.Assert.*;
public class OficinaTestEj17 {
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test1() {
        Oficina oficina=new Oficina("oficina",4);
        fail("No se ha lanzado ninguna excepcion");
    }

}