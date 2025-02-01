package Test;

import clase.PalabraOculta;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalabraOcultaTest {
    @Test
    public void test1(){
        PalabraOculta palabraOculta=new PalabraOculta("java");
        assertEquals(palabraOculta.getLetrasRestantes(),4);
        assertEquals(palabraOculta.toString(),"----");
    }

    @Test
    public void test2(){
        PalabraOculta palabraOculta=new PalabraOculta("javas");
        assertEquals(palabraOculta.probarLetra('a'),2);
        assertEquals(palabraOculta.getLetrasRestantes(),3);
        assertEquals(palabraOculta.toString(),"-a-a-");
    }

    @Test
    public void test3(){
        PalabraOculta palabraOculta=new PalabraOculta("java");
        assertEquals(palabraOculta.probarLetra('x'),0);
        assertEquals(palabraOculta.getLetrasRestantes(),4);
        assertEquals(palabraOculta.toString(),"----");
    }

    @Test
    public void test4(){
        PalabraOculta palabraOculta=new PalabraOculta("java");
        palabraOculta.probarLetra('j');
        palabraOculta.probarLetra('a');
        palabraOculta.probarLetra('v');
        palabraOculta.probarLetra('a');
        assertEquals(palabraOculta.getLetrasRestantes(),0);
        assertEquals(palabraOculta.palabraAcertada(),true);
    }
}