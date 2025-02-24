package tema5.ejercicio47;

import org.junit.Test;
import tema5.ejercicio47.Examen;

import java.util.List;

import static org.junit.Assert.*;

public class ExamenTest {
    @Test
    public void test1(){
        Examen examen=new Examen();
        examen.añadirNota("Antonio", 6);
        assertEquals(examen.getNota("Antonio"), 6,0.01);
    }

    @Test
    public void test2(){
        Examen examen=new Examen();
        examen.añadirNota("Alicia", 10);
        examen.añadirNota("Alejandro", 0);
        examen.añadirNota("Juan Antonio", 5);
        assertEquals(examen.getNotaMedia(),5,0.01);
    }

    @Test
    public void test3(){
        Examen examen=new Examen();
        examen.añadirNota("Alicia", 10);
        examen.añadirNota("Alejandro", 0);
        examen.añadirNota("Juan Antonio", 5);
        assertEquals(examen.mediaAprobada(),true);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test4(){
        Examen examen=new Examen();
        examen.añadirNota("Antonio",-20);
        fail("no se ha lanzado ninguna excepcion");
    }

    @Test
    public void test5(){
        Examen examen=new Examen();
        examen.añadirNota("Armando", 3);
        examen.añadirNota("Matias", 4.9);
        examen.añadirNota("Rigoberto", 2);
        assertEquals(examen.mediaAprobada(),false);
    }

    @Test
    public void test6(){
        Examen examen=new Examen();
        examen.añadirNota("Juan Antonio", 6);
        examen.añadirNota("Jose Antonio", 4);
        examen.añadirNota("Oscar", 7);
        List<String> aprobados=examen.getAprobados();
        assertEquals(aprobados.get(0),"Juan Antonio");
        assertEquals(aprobados.get(1),"Oscar");
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test7(){
        Examen examen=new Examen();
        examen.getNotaMedia();
        fail("No se ha lanzado ninguna excepcion");
    }

}