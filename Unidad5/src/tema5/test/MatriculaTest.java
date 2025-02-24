package tema5.test;

import org.junit.Before;
import org.junit.Test;
import tema5.ejercicio28.Matricula;

import static org.junit.Assert.*;

public class MatriculaTest {
    @Before
    public void reestablecerNumeroMatricula(){
        Matricula.siguienteNumeroMatricula=0;
    }

    @Test
    public void test1(){
        Matricula matricula1=new Matricula("Juan","Sistemas");
        Matricula matricula2=new Matricula("Juan","Base de datos");
        Matricula matricula3=new Matricula("Juan","Programacion");
        assertEquals(Matricula.siguienteNumeroMatricula,4);

    }

}