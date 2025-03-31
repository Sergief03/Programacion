package ejercicio29.colegio.test;

import ejercicio29.colegio.clases.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ColegioTest {
    @Test
    public void testCalificacionesYReacciones() {
        Alumno ana = new Alumno("Ana", new ArrayList<>());
        Alumno rafael = new Alumno("Rafael", new ArrayList<>());

        Profesor luis = new Profesor("Luis", "Matemáticas");
        Profesor juan = new Profesor("Juan", "Historia");

        JefeEstudios alberto = new JefeEstudios("Alberto", "IES Granada Capital");
        DirectorColegio antonio = new DirectorColegio("Antonio", "IES Granada Capital");

        TutorLegal julia = new TutorLegal("Julia", new Alumno[]{ana});
        TutorLegal jorge = new TutorLegal("Jorge", new Alumno[]{rafael});

        // Añadir interesados
        luis.addCalificacionListener(ana);
        luis.addCalificacionListener(julia);
        luis.addCalificacionListener(alberto);
        luis.addCalificacionListener(antonio);

        juan.addCalificacionListener(rafael);
        juan.addCalificacionListener(jorge);
        juan.addCalificacionListener(alberto);
        juan.addCalificacionListener(antonio);

        luis.calificar(ana, 10);

        juan.calificar(rafael, 4);

        // Verificar notas de los alumnos
        assertEquals(10.0, ana.getNotaMedia(), 0.01);
        assertEquals(4.0, rafael.getNotaMedia(), 0.01);

        // Verificar suspensos
        assertEquals(1, alberto.getNumeroSuspensos("Historia"));
        assertEquals(0, alberto.getNumeroSuspensos("Matemáticas"));
    }
}