package tema5.test;

import org.junit.Test;
import tema5.ejercicio11.Dni;
import tema5.ejercicio12.Persona;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonaTestEj12 {
    @Test
    public void test1(){
        Persona persona=new Persona("Juan",new Dni(11111111,'H'),1500, LocalDate.now());
        assertEquals(0,persona.getCuentaCorriente().saldo,0.01);
        for (int i=0;i<3;i++){
            persona.cobrarSueldo();
        }
        assertEquals(4500,persona.getCuentaCorriente().saldo,0.01);
        persona.aumentarSueldo(25);
        persona.cobrarSueldo();
        assertEquals(6375,persona.getCuentaCorriente().saldo,0.01);
    }

    @Test
    public void test2(){
        Persona persona=new Persona("Juan",new Dni(11111111,'H'),1500, LocalDate.of(2010,1,1));
        assertEquals(false,persona.esMayorEdad());
    }

    @Test
    public void test3(){
        Persona persona=new Persona("Juan",new Dni(11111111,'H'),1500, LocalDate.of(1985,1,1));
        assertEquals(true,persona.esMayorEdad());
    }

    @Test
    public void test4(){
        Persona persona=new Persona("Juan",new Dni(11111111,'H'),0, LocalDate.of(1985,1,1));
        assertEquals(0,persona.getSueldo(),0.01);
    }

    @Test
    public void test5(){
        Persona persona=new Persona("Juan",new Dni(11111111,'H'),900, LocalDate.of(1985,1,1));
        assertEquals(true,persona.esMileurista());
    }

    @Test
    public void test6(){
        Persona persona=new Persona("Juan",new Dni(11111111,'H'),1800, LocalDate.of(1985,1,1));
        assertEquals(false,persona.esMileurista());
    }

}