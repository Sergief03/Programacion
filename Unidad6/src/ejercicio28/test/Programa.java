package ejercicio28.test;

import ejercicio28.clases.Filtro;
import ejercicio28.clases.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Filtro filtroCasado=new Filtro() {
            @Override
            public boolean aceptar(Persona p) {
                return p.soltero()==false;
            }
        };

        Filtro filtroSolteraMayor=new Filtro() {
            @Override
            public boolean aceptar(Persona p) {
                return p.soltero()==true && p.edad()>=18;
            }
        };

        Filtro filtroNombreJ=new Filtro() {
            @Override
            public boolean aceptar(Persona p) {
                return p.nombre().matches("^J[a-zA-Z ]+$");
            }
        };


        boolean continuar=true;
        while (continuar){
            System.out.println("""
                Elige una opcion:
                1) Ver personas casadas
                2) Ver personas solteras mayores de edad
                3) ver personas cuyo nombre empieza por la letra J
                """);
            String eleccion=new Scanner(System.in).nextLine();

            if (eleccion.matches("^[1-3]$")){
                List<Persona> personas=new ArrayList<>();
                personas.add(new Persona("Juan Perez",25,true));
                personas.add(new Persona("Maria Lopez",39,false));
                personas.add(new Persona("Jacier Presley",19,false));
                personas.add(new Persona("Robert Jimenez",30,false));
                switch (Integer.parseInt(eleccion)){
                    case 1-> Persona.mostrarEnPantalla(personas,filtroCasado);
                    case 2-> Persona.mostrarEnPantalla(personas,filtroSolteraMayor);
                    case 3-> Persona.mostrarEnPantalla(personas,filtroNombreJ);

                }
            }else{
                System.out.println("Elige una opcion correcta");
            }

        }




    }
}
