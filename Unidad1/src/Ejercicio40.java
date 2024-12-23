import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[]args){

        System.out.println("Introduce un numero: ");
        int num=new Scanner(System.in).nextInt();
        int resto=num%2;

        System.out.println("El numero es"+(resto==0? "par":"impar"));
    }
}
