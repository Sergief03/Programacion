package tema5.test;

import org.junit.Test;
import tema5.ejercicio7.CuentaCorriente;

import static org.junit.Assert.*;

public class CuentaCorrienteTest {
    @Test
    public void test1(){
        CuentaCorriente cuentaCorriente=new CuentaCorriente(1253,850);
        assertEquals(1253,cuentaCorriente.numero);
        assertEquals(850,cuentaCorriente.saldo);
    }

    @Test
    public void  test2() {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1253, 850);
        cuentaCorriente.añadirDinero(100);
        assertEquals(950, cuentaCorriente.saldo);
        cuentaCorriente.retirarDinero(200);
        assertEquals(750, cuentaCorriente.saldo);
        cuentaCorriente.retirarDinero(1000);
        assertEquals(750, cuentaCorriente.saldo);
    }
}