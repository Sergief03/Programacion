package ejercicio2.persona.clases;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonaBuilderTest {
    @Test
    public void testPersonaBuilder() {
        // Crear la primera persona
        Persona persona1 = new PersonaBuilder("Jaime", "Lara", "Ramos")
                .setTelefono("958000000")
                .setCiudad("Granada")
                .setEdad(15)
                .build();

        // Crear la pareja de la segunda persona
        Persona parejaMaria = new PersonaBuilder("Juan", "Molina", "Molina")
                .setEdad(30)
                .setPais("Ecuador")
                .setEstadoCivil(EstadoCivil.CASADO)
                .build();

        // Crear la segunda persona
        Persona persona2 = new PersonaBuilder("María", "García", "Pérez")
                .setCiudad("Almería")
                .setPais("España")
                .setEstadoCivil(EstadoCivil.CASADO)
                .setPareja(parejaMaria)
                .build();

        // Realizar las comprobaciones
        assertEquals("Granada", persona1.getDireccion().ciudad());
        assertEquals(15, persona1.getEdad());
        assertEquals(EstadoCivil.SOLTERO, persona1.getEstadoCivil());

        assertEquals("María", persona2.getNombre());
        assertEquals("España", persona2.getDireccion().pais());
        assertEquals(EstadoCivil.CASADO, persona2.getEstadoCivil());
        assertEquals("Juan", persona2.getPareja().getNombre());
        assertEquals(EstadoCivil.CASADO, persona2.getPareja().getEstadoCivil());
        assertEquals("Ecuador", persona2.getPareja().getDireccion().pais());
    }

}