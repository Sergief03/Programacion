import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[]args){
        System.out.print("Ingrese un número entero: ");
        int numero = new Scanner(System.in).nextInt();


        String resultado = (numero % 2 == 0) ? "El número es par." : "El número es impar.";


        System.out.println(resultado);
    }
}
