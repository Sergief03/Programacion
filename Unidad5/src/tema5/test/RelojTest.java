package tema5.test;

import org.junit.Test;
import tema5.ejercicio34.Reloj;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class RelojTest {
    @Test
    public void test1(){
        Reloj reloj=new Reloj(LocalTime.of(16,0,0));
        reloj.añadir(3600);
        assertEquals(LocalTime.of(17,0,0),reloj.getHora());
    }

    @Test
    public void test2(){
        Reloj reloj=new Reloj(LocalTime.of(23,59,0));
        reloj.añadir(60);
        assertEquals(LocalTime.of(0,0,0),reloj.getHora());
    }

    @Test
    public void test3(){
        Reloj reloj=new Reloj(LocalTime.of(19,30,0));
        assertEquals(false,reloj.esNoche());
        reloj.añadir(3600);
        assertEquals(true,reloj.esNoche());
    }

    @Test
    public void test4(){
        Reloj reloj=new Reloj(LocalTime.of(7,30,0));
        assertEquals(true,reloj.esNoche());
        reloj.añadir(3600);
        assertEquals(false,reloj.esNoche());
    }

    @Test
    public void test5(){
        Reloj reloj=new Reloj(LocalTime.of(15,28,0));
        assertEquals(reloj.toString(),"15:28:0");
    }

}