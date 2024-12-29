import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[]args){
        System.out.println("Introduce dos numeros enteros:");
        int num1= new Scanner(System.in).nextInt();
        int num2=new Scanner(System.in).nextInt();

        if(num1>=num2){
            if(num1==num2) {
                System.out.println("El primer numero es igual que el segundo");
            }else {
                System.out.println("El primer numero es mayor que el segundo");
            }
            }else {
            System.out.println("El primer numero es menor que el segundo");
        }
    }
}
