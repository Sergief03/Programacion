package ejercicio2.persona.clases;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonaTest {
    @Test
    public void test() {
        // Crear la primera persona usando el builder
        Persona persona1 = new PersonaBuilder("Jaime", "Lara", "Ramos")
                .setEdad(15)
                .setTelefono("958000000")
                .setCiudad("Granada")
                .build();

        // Crear la segunda persona usando el builder, con pareja
        Persona persona2 = new PersonaBuilder("María", "García", "Pérez")
                .setCiudad("Almería")
                .setPais("España")
                .setPareja(new PersonaBuilder("Juan", "Molina", "Molina")
                        .setEdad(30)
                        .setPais("Ecuador")
                        .setEstadoCivil(EstadoCivil.CASADO)
                        .build())
                .setEstadoCivil(EstadoCivil.CASADO)
                .build();

        // Comprobaciones para persona1
        assertEquals( "Granada", persona1.getDireccion().ciudad());
        assertEquals( 15, persona1.getEdad());
        assertEquals( EstadoCivil.SOLTERO, persona1.getEstadoCivil());

        // Comprobaciones para persona2
        assertEquals( "María", persona2.getNombre());
        assertEquals( "España", persona2.getDireccion().pais());
        assertEquals( EstadoCivil.CASADO, persona2.getEstadoCivil());

        Persona parejaDePersona2 = persona2.getPareja();
        assertEquals( "Juan", parejaDePersona2.getNombre());
        assertEquals( EstadoCivil.CASADO, parejaDePersona2.getEstadoCivil());
        assertEquals( "Ecuador", parejaDePersona2.getDireccion().pais());
    }
}