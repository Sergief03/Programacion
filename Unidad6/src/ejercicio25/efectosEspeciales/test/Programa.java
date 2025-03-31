package ejercicio25.efectosEspeciales.test;

import ejercicio25.efectosEspeciales.clases.EfectoEspecial;
import ejercicio25.efectosEspeciales.clases.EfectoFactory;
import ejercicio25.efectosEspeciales.clases.TipoEfecto;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Introduce una frase por teclado");
        String frase=new Scanner(System.in).nextLine();

        boolean continuar=true;
        TipoEfecto efecto=null;
        while (continuar){
            System.out.println("""
                Que tipo de efecto deseas aplicar:
                A) Efecto Inverso
                B) Efecto Mayusculas
                C) Efecto Corchetes
                D) EfectoGuiones
                """);
            String eleccion=new Scanner(System.in).nextLine();
            if (eleccion.toUpperCase().matches("^[ABCD]$")){
                continuar=false;
                switch (eleccion.toUpperCase()){
                    case "A"->efecto=TipoEfecto.INVERSO;
                    case "B"->efecto=TipoEfecto.MAYUSCULAS;
                    case "C"->efecto=TipoEfecto.CORCHETES;
                    case "D"->efecto=TipoEfecto.GUIONES;
                }
            }else {
                System.out.println("Elige una eleccion correcta");
            }
        }

        EfectoEspecial efectoEspecial= EfectoFactory.getEfecto(efecto);

        System.out.println(efectoEspecial.aplicarEfecto(frase));

    }
}
