package tema5.test;

import org.junit.Test;
import tema5.Ejercicio3.MarcadorBaloncesto;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MarcadorBaloncestoTest {
    @Test
    public void test1(){
        MarcadorBaloncesto marcadorBaloncesto=new MarcadorBaloncesto("Granada",100,"Estudiantes",90, LocalDate.of(2010,10,10));
        assertEquals(100,marcadorBaloncesto.puntosLocal);
        assertEquals(90,marcadorBaloncesto.puntosVisitante);
        assertEquals("Granada",marcadorBaloncesto.nombreLocal);
        assertEquals("Estudiantes",marcadorBaloncesto.nombreVisitante);
        assertEquals(LocalDate.of(2010,10,10),marcadorBaloncesto.fecha);
    }

    @Test
    public void test2(){
        MarcadorBaloncesto marcadorBaloncesto=new MarcadorBaloncesto("Granada", "Estudiantes");
        assertEquals("Granada",marcadorBaloncesto.nombreLocal);
        assertEquals("Estudiantes",marcadorBaloncesto.nombreVisitante);
        assertEquals(0,marcadorBaloncesto.puntosLocal);
        assertEquals(0,marcadorBaloncesto.puntosVisitante);
        assertEquals(LocalDate.now(),marcadorBaloncesto.fecha);
    }

    @Test
    public void test3(){
        MarcadorBaloncesto marcadorBaloncesto=new MarcadorBaloncesto("Granada", "Estudiantes",LocalDate.of(2000,2,28));
        assertEquals("Granada",marcadorBaloncesto.nombreLocal);
        assertEquals("Estudiantes",marcadorBaloncesto.nombreVisitante);
        assertEquals(0,marcadorBaloncesto.puntosLocal);
        assertEquals(0,marcadorBaloncesto.puntosVisitante);
        assertEquals(LocalDate.of(2000,2,28),marcadorBaloncesto.fecha);
    }
}