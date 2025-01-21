package jd.programacion.tema5.test;

import jd.programacion.ejemploCoche.Matricula;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatriculaTest {
    @Test
    public void test1(){
        Matricula matricula=new Matricula(1234,"XYZ");
        assertEquals(1234,matricula.numero);
        assertEquals("XYZ",matricula.letras);
    }

    @Test
    public void test2(){
        Matricula matricula=new Matricula(123456,"XYZ");
        assertEquals(1234,matricula.numero);
        assertEquals("XYZ",matricula.letras);
    }

    @Test
    public void test3(){
        Matricula matricula=new Matricula(-80,"UFR");
        assertEquals(1234,matricula.numero);
        assertEquals("UFR",matricula.letras);
    }

    @Test
    public void test4(){
        Matricula matricula=new Matricula(1562,"%-A");
        assertEquals(1562,matricula.numero);
        assertEquals("ABC",matricula.letras);
    }

    @Test
    public void test5(){
        Matricula matricula=new Matricula(98650,"Y*A");
        assertEquals(1234,matricula.numero);
        assertEquals("ABC",matricula.letras);
    }

    @Test
    public void test6(){
        Matricula matricula=new Matricula(1234,'X','Y','Z');
        assertEquals(1234,matricula.numero);
        assertEquals("XYZ",matricula.letras);
    }

    @Test
    public void test7() {
        Matricula matricula = new Matricula(123456, 'X', 'Y', 'Z');
        assertEquals(1234,matricula.numero);
        assertEquals("XYZ",matricula.letras);
    }

    @Test
    public void test8(){
        Matricula matricula=new Matricula(-80,'U','F','R');
        assertEquals(1234,matricula.numero);
        assertEquals("UFR",matricula.letras);
    }

    @Test
    public void test9(){
        Matricula matricula=new Matricula(1562,'%','-','A');
        assertEquals(1562,matricula.numero);
        assertEquals("ABC",matricula.letras);
    }

    @Test
    public void test10(){
        Matricula matricula=new Matricula(98650,'Y','*','A');
        assertEquals(1234,matricula.numero);
        assertEquals("ABC",matricula.letras);
    }
}