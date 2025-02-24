package tema5.test;

import org.junit.Test;
import tema5.ejercicio26.Fraccion;

import static org.junit.Assert.*;

public class FraccionTest {
    @Test
    public void test1(){
        Fraccion resultado=Fraccion.sumar(new Fraccion(1,2),new Fraccion(3,4));
        assertEquals(10,resultado.getNumerador());
        assertEquals(8,resultado.getDenominador());

    }

    @Test
    public void test2(){
        Fraccion resultado=Fraccion.sumar(new Fraccion(2,5),new Fraccion(3,7));
        assertEquals(29,resultado.getNumerador());
        assertEquals(35,resultado.getDenominador());
    }

    @Test
    public void test3(){
        Fraccion resultado=Fraccion.dividir(new Fraccion(1,2),new Fraccion(4,3));
        assertEquals(3,resultado.getNumerador());
        assertEquals(8,resultado.getDenominador());
    }

    @Test
    public void test4(){
        Fraccion resultado=Fraccion.sumar(new Fraccion(3,7),new Fraccion(8,5));
        Fraccion resultadoFinal=Fraccion.multiplicar(new Fraccion(1,2),resultado);
        assertEquals(71,resultadoFinal.getNumerador());
        assertEquals(70,resultadoFinal.getDenominador());
    }

}