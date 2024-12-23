package Ejemplos;

import java.util.Scanner;

//pido nota numerica y pido resultado con palabras.
//Ejemplo: si introduce un 4, muestro por pantalla "Cualidficado".
public class Ejemplo_IF_ELSE {
    public static void main(String[]args){
        double nota;
        String resultado;
        System.out.println("Introduce tu nota:");
        nota=new Scanner(System.in).nextDouble();

        if(nota>=9){
            System.out.println("Sobresaliente");
        } else if (nota>=7) {
            System.out.println("Notable");
        } else if (nota>=5) {
            System.out.println("Suficiente");
        } else if (nota<5) {
            System.out.println("Suspenso");
        }


    }
}
