package Ejemplos;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
       System.out.println("Introduce el dividendo:");
       double dividendo=new Scanner(System.in).nextDouble();
        System.out.println("Introduce el divisor:");
        double divisor=new Scanner(System.in).nextDouble();

        if(divisor==0){
            System.out.println("No se puede hacer la division");
        }else{
            System.out.println("El resultado es"+(dividendo/divisor));
        }

    }
}
