package tema5.test;

import org.junit.Test;
import tema5.Ejercicio1.Dni;
import tema5.Ejercicio4.Persona;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonaTest {
    @Test
    public void test1(){
        Persona persona1=new Persona("Pepe",new Dni("12345678B"),1500,LocalDate.of(2007,3,8));
        Persona persona2=new Persona("Pepe",12345678,'B',1500,LocalDate.of(2007,3,8));
        assertEquals("Pepe", persona1.nombre);
        assertEquals(12345678,persona1.dni.numero);
        assertEquals('B',persona1.dni.letra);
        assertEquals(1500,persona1.sueldo);
        assertEquals(LocalDate.of(2007,3,8),persona1.fechaNacimiento);
        assertEquals("Pepe", persona2.nombre);
        assertEquals(12345678,persona2.dni.numero);
        assertEquals('B',persona2.dni.letra);
        assertEquals(1500,persona2.sueldo);
        assertEquals(LocalDate.of(2007,3,8),persona2.fechaNacimiento);
        assertEquals(LocalDate.of(LocalDate.now().getYear()-20,LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth()),persona1.fechaNacimiento);
    }

    @Test
    public void test2(){
        Persona persona1=new Persona("Antonio",new Dni("88776655X"));
        Persona persona2=new Persona("Antonio",88776655,'X');
        assertEquals(LocalDate.of(LocalDate.now().getYear()-20,LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth()),persona1.fechaNacimiento);
        assertEquals("Antonio",persona1.nombre);
        assertEquals(900,persona1.sueldo,0.001);
        assertEquals(88776655,persona1.dni.numero);
        assertEquals('X',persona1.dni.letra);
        assertEquals(LocalDate.of(LocalDate.now().getYear()-20,LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth()),persona2.fechaNacimiento);
        assertEquals("Antonio",persona2.nombre);
        assertEquals(900,persona2.sueldo,0.001);
        assertEquals(88776655,persona2.dni.numero);
        assertEquals('X',persona2.dni.letra);

    }

}