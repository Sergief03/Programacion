package ejercicio9.adivinanzas.test;

import ejercicio9.adivinanzas.clases.Adivinanza;
import ejercicio9.adivinanzas.clases.AdivinanzaException;
import ejercicio9.adivinanzas.clases.AdivinanzaIncorrectaException;
import ejercicio9.adivinanzas.clases.TiempoSuperadoException;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Adivinanza adivinanza=new Adivinanza("Esto es una adivinanza?","Si");
        System.out.println(adivinanza.getEnunciado());
        try {
            adivinanza.comprobar(new Scanner(System.in).nextLine());
            System.out.println("Has acertado");
        }catch (AdivinanzaException e){
            if(e instanceof AdivinanzaIncorrectaException exception){
                System.out.println(exception.getMessage());
            } else {
                System.out.println("Has acertado, pero fuera del tiempo");
            }
        }
    }
}
