package tema5.test;

import org.junit.Test;
import tema5.ejercicio20.CuentaCorriente;

import java.io.IOException;

import static org.junit.Assert.*;

public class CuentaCorrienteTestEj20 {
    @Test(expected = java.io.IOException.class)
    public void test2() throws IOException {
        CuentaCorriente cuentaCorriente=new CuentaCorriente(1234,2000);
        cuentaCorriente.retirarDinero(6000);
        fail("No se ha lanzado la excepcion");
    }

}