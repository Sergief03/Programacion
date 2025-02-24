package tema5.test;

import org.junit.Test;
import tema5.ejercicio36.Examen;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ExamenTest {
    @Test
    public void test1(){
        Examen examenAlumno=new Examen("Jose");
        examenAlumno.responder("¿Cuanto es 2+2","24");
        examenAlumno.responder("Cual es el planeta mas cercano al sol?","Mercurio");
        examenAlumno.responder("Cual es la capital de España?","Madrid");
        examenAlumno.responder("Cuantos kilos son 2500 gramos?", "25000");

        Map<String, String> examen=new HashMap<>();
        examen.put("¿Cuanto es 2+2","4");
        examen.put("Cual es el planeta mas cercano al sol?","Mercurio");
        examen.put("Cual es la capital de España?","Madrid");
        examen.put("Cuantos kilos son 2500 gramos?", "2.5");


        assertEquals(examenAlumno.calificar(examen),5,0.01);
    }

}