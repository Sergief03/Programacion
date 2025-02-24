package tema5.test;

import org.junit.Test;
import tema5.ejercicio38.Banco;

import static org.junit.Assert.*;

public class BancoTest {
    @Test
    public void test1(){
        Banco banco=new Banco();
        assertEquals(true,banco.añadirDinero(1000));
        assertEquals(banco.getDineroTotal(),1000,0.01);
        assertEquals(true,banco.retirarDinero(200));
        assertEquals(banco.getDineroTotal(),800,0.001);
        assertEquals(false,banco.retirarDinero(4000));
        assertEquals(banco.getDineroTotal(),800,0.001);
    }

}