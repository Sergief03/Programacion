package tema5.test;

import org.junit.Test;
import tema5.ejercicio11.Oficina;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class OficinaTestEj11 {
    @Test
    public void test1(){
        Oficina oficina=new Oficina("Oficina");
        oficina.añadirEmpelado("Antonio","44444444M",2000, LocalDate.now());
        assertEquals(1,oficina.trabajadores.size());
        assertEquals(44444444,oficina.trabajadores.get(0).dni.numero);
        assertEquals('M',oficina.trabajadores.get(0).dni.letra);
    }

}