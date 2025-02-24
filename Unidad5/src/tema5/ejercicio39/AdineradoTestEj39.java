package tema5.ejercicio39;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdineradoTestEj39 {
    @Test
    public void test1(){
        Banco banco=new Banco();
        assertEquals(false,banco.tieneDinero());
    }

    @Test
    public void test2(){
        Banco banco1=new Banco();
        Banco banco2= new Banco();
        banco1.añadirDinero(2000);
        banco2.añadirDinero(5000);
        banco1.transferirHacia(banco2,2500);
    }

}