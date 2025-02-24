package tema5.test;

import org.junit.Test;
import tema5.ejercicio19.Oficina;

import java.io.IOException;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class OficinaTestEj19 {
    @Test
    public void test1(){
        Oficina oficina=new Oficina("Oficina");
        oficina.añadirEmpelado("Paco","12345678A",1000, LocalDate.now());
        oficina.añadirEmpelado("Paco","12345678A",2000, LocalDate.now());
        oficina.añadirEmpelado("Paco","12345678A",1500, LocalDate.now());
        oficina.añadirEmpelado("Paco","12345678A",900, LocalDate.now());
        try {
            assertEquals(1350,oficina.getSueldoMedio(),0.1);
        } catch (IOException e) {
            fail("El metodo comer lanza excepcion");
        }
    }

    @Test(expected = IOException.class)
    public void test2() throws IOException{
        Oficina oficina=new Oficina();
        oficina.getSueldoMedio();
        fail("No se ha lanzado una excepcion");

    }

}