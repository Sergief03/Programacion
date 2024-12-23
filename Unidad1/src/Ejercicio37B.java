import java.util.Scanner;

public class Ejercicio37B {
    public static void main(String[]args) {
        System.out.println("introduce tres numero enteros:");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        int num3 = new Scanner(System.in).nextInt();


        int numeroMayor = num1;

        if(numeroMayor<num2){
            numeroMayor=num2;
        }
        if (numeroMayor<num3){
            numeroMayor=num3;
        }
        System.out.println("El numero mas grande es: "+numeroMayor);


    }
}
