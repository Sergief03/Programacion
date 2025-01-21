package jd.programacion.tema5.test;

import jd.programacion.tema5.Perro;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerroTest {
    @Test
    public void  test1(){
       Perro perro=new Perro("Nombre",1,"raza");
       assertEquals("Nombre",perro.nombre);
    }
}