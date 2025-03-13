package ejercicio3.edificios.clases.test;

import ejercicio3.edificios.clases.CasaRural;
import ejercicio3.edificios.clases.Rascacielos;
import org.junit.Test;

import static org.junit.Assert.*;

public class EdificioTest {
    @Test
    public void test1() {
        Rascacielos rascacielos = new Rascacielos("Calle Albondón S/N", 90);
        assertEquals(280, rascacielos.getAltura());
    }

    @Test(expected = IllegalStateException.class)
    public void test2(){
        CasaRural casaRural = new CasaRural("Calle Granada");

        for (int i = 0; i <7; i++) {
            casaRural.añadirCliente("Persona" + i);
        }
        fail("No se ha lanzado ninguna excepcion");
    }
}