package tema5.test;

import org.junit.Test;
import tema5.Ejercicio1.Dni;
import tema5.ejercicio10.Persona;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonaTestEj10 {
    @Test
    public void test1(){
        Persona persona=new Persona("Juan",new Dni(11111111,'H'),1500, LocalDate.now());
        assertEquals(0,persona.cuentaCorriente.saldo,0.01);
        for (int i=0;i<3;i++){
            persona.cobrarSueldo();
        }
        assertEquals(4500,persona.cuentaCorriente.saldo,0.01);
        persona.aumentarSueldo(25);
        persona.cobrarSueldo();
        assertEquals(6375,persona.cuentaCorriente.saldo,0.01);
    }

}