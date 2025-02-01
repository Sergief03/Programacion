package tema5.test;

import org.junit.Test;
import tema5.ejercicio15.MarcadorBaloncesto;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MarcadorBaloncestoTestEj15 {
    @Test
    public void test1(){
        MarcadorBaloncesto marcadorBaloncesto=new MarcadorBaloncesto("Granada","Visitante");
        for (int i=0;i<5;i++){
            marcadorBaloncesto.añadirCanasta('L',1);
            if (i<3){
                marcadorBaloncesto.añadirCanasta('V',1);
            }
        }
        for (int i=0;i<10;i++){
            marcadorBaloncesto.añadirCanasta('V',2);
            if (i<8){
                marcadorBaloncesto.añadirCanasta('L',2);
            }
        }
        for (int i=0;i<4;i++){
            marcadorBaloncesto.añadirCanasta('L',3);
            if (i<1){
                marcadorBaloncesto.añadirCanasta('V',3);
            }
        }
        assertEquals(33, marcadorBaloncesto.getPuntosLocal());
        assertEquals(26, marcadorBaloncesto.getPuntosVisitante());
    }

    @Test
    public void test2(){
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", 100, "Estudiantes", 80, LocalDate.now());
        marcadorBaloncesto.reset();

        assertEquals(0, marcadorBaloncesto.getPuntosLocal());
        assertEquals(0, marcadorBaloncesto.getPuntosVisitante());
    }

    @Test
    public void test3(){
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", 10, "Estudiantes", 12, LocalDate.now());
        marcadorBaloncesto.añadirCanasta('L', 4);

        assertEquals(10, marcadorBaloncesto.getPuntosLocal());
        assertEquals(12, marcadorBaloncesto.getPuntosVisitante());
    }

    @Test
    public void test4(){
        MarcadorBaloncesto marcadorBaloncesto=new MarcadorBaloncesto("Granada",80,"Visitante",80,LocalDate.now());
        assertEquals(true,marcadorBaloncesto.hayEmpate());
        assertEquals(false,marcadorBaloncesto.ganaLocal());
        assertEquals(false,marcadorBaloncesto.ganaVisitante());
    }

    @Test
    public void test5(){
        MarcadorBaloncesto marcadorBaloncesto=new MarcadorBaloncesto("Granada",90,"Visitante",80,LocalDate.now());
        assertEquals(false,marcadorBaloncesto.hayEmpate());
        assertEquals(true,marcadorBaloncesto.ganaLocal());
        assertEquals(false,marcadorBaloncesto.ganaVisitante());
    }
}