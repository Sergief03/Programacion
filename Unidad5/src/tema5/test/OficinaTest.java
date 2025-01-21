package tema5.test;

import com.sun.jdi.connect.Connector;
import org.junit.Test;
import tema5.Ejercicio5.Oficina;

import static org.junit.Assert.*;

public class OficinaTest {
    @Test
    public void test1(){
        Oficina oficina=new Oficina("HP");
        assertEquals("HP",oficina.nombre);
        assertEquals(true,oficina.trabajadores.isEmpty());
    }

    @Test
    public void test2(){
        Oficina oficina1=new Oficina("HP",0);
        Oficina oficina2=new Oficina("HP",1);
        Oficina oficina3=new Oficina("HP",2);
        Oficina oficina4=new Oficina("HP",3);
        assertEquals("HP",oficina1.nombre);
        assertEquals("HP",oficina2.nombre);
        assertEquals("HP",oficina3.nombre);
        assertEquals("HP",oficina4.nombre);
        assertEquals(true,oficina1.trabajadores.isEmpty());
        assertEquals(1,oficina2.trabajadores.size());
        assertEquals(2,oficina3.trabajadores.size());
        assertEquals(3,oficina4.trabajadores.size());
    }

    @Test
    public void test3(){
        Oficina oficina=new Oficina("HP",5);
        assertEquals(true,oficina.trabajadores.isEmpty());
    }

    @Test
    public void test4(){
        Oficina oficina=new Oficina("HP",3);
        assertEquals(22222222,oficina.trabajadores.get(1).dni.numero);
        assertEquals('J',oficina.trabajadores.get(1).dni.letra);
        assertEquals(1000,oficina.trabajadores.get(1).sueldo,0.001);
        assertEquals(33333333,oficina.trabajadores.get(2).dni.numero);
        assertEquals('P',oficina.trabajadores.get(2).dni.letra);
        assertEquals(1200,oficina.trabajadores.get(2).sueldo,0.001);
    }

}