package tema5.test;

import org.junit.Test;
import tema5.ejercicio40.DepositoAguaInmutable;

import static org.junit.Assert.*;

public class DepositoAguaInmutableTest {
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test1(){
        DepositoAguaInmutable depositoAguaInmutable=new DepositoAguaInmutable(-100,50);
        fail("No se ha lanzado ninguna excepcion");
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test2(){
        DepositoAguaInmutable depositoAguaInmutable=new DepositoAguaInmutable(300,200);
        fail("No se ha lanzado ninguna excepcion");
    }

    @Test
    public void test3(){
        DepositoAguaInmutable depositoAguaInmutable=new DepositoAguaInmutable(20,500);
        assertEquals(4,depositoAguaInmutable.getPorcentaje());
    }

    @Test
    public void test4(){
        DepositoAguaInmutable depositoAguaInmutable=new DepositoAguaInmutable(400,500);
        DepositoAguaInmutable depositoAguaInmutable1= depositoAguaInmutable.añadirLitro();
        assertEquals(depositoAguaInmutable.capacidadActual(),400);
        assertEquals(depositoAguaInmutable1.capacidadActual(),401);
    }

}