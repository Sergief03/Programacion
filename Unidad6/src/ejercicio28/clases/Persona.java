package ejercicio28.clases;

import java.util.List;

public record Persona(String nombre, int edad, boolean soltero){
    public static void mostrarEnPantalla(List<Persona> personas, Filtro filtro){
        for (Persona p:personas){
            if(filtro.aceptar(p)){
                System.out.println("Nombre: "+p.nombre+"\nEdad: "+p.edad+
                        "\nEstado: "+p.soltero+
                        "\n###################################");
            };
        }
    }
    }

