package tema5.test;

import org.junit.Test;
import tema5.ejercicio11.Dni;
import tema5.ejercicio14.Oficina;
import tema5.ejercicio14.Persona;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class OficinaTestEj14 {
    @Test
    public void test1(){
        Oficina oficina=new Oficina("Oficina");
        oficina.añadirEmpelado("Antonio","44444444M",2000, LocalDate.now());
        assertEquals(1,oficina.getTotalEmpleados());
        assertEquals(44444444,oficina.getEmpleado(0).getDni().numero);
        assertEquals('M',oficina.getEmpleado(0).getDni().letra);
    }

    @Test
    public void test2(){
        Oficina oficina=new Oficina("Oficina");
        oficina.añadirEmpelado("Antonio","44444444M",2000, LocalDate.now());
        oficina.añadirEmpelado("Pablo","55555555X",1000, LocalDate.now().minusYears(1));
        assertEquals(true,oficina.trabaja(new Persona("Antonio",new Dni("44444444M"),2000, LocalDate.now())));
        assertEquals(true,oficina.trabaja(new Persona("Pablo",new Dni("55555555X"),1000, LocalDate.now().minusYears(1))));
        oficina.pagarEmpleados();
        assertEquals(2000,oficina.getEmpleado(0).getSueldo(),0.01);
        assertEquals(1000,oficina.getEmpleado(1).getSueldo(),0.01);

    }

}