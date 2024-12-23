package Ejemplos;

import java.util.Scanner;

public class Ejemplo_IF_ELSE_Anidado {
    public static void main(String[]args){
        double a;
        double b;
        double x;
        String resultado;

        System.out.println("Introduce el valor de a y b:");
        a=new Scanner(System.in).nextDouble();
        b= new Scanner(System.in).nextDouble();

        if(a!=0){
            x=-b/a;
            resultado="La solucion es: "+x;
        }else {
            if (b!= 0) {
                resultado = "La ecuacion no tiene solucion";
            } else {
                resultado = "Solucion indeterminada";
            }
        }
        System.out.println("La solucion de la ecuacion es "+resultado);
    }
}
