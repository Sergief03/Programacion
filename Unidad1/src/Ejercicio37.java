import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[]args){
        System.out.println("introduce tres numero enteros:");
        int num1= new Scanner(System.in).nextInt();
        int num2= new Scanner(System.in).nextInt();
        int num3= new Scanner(System.in).nextInt();

        String resultado="El numero mas grande es: ";

        int numeroMayor=0;

        if (num1>num2){
            if (num2>num3){
                numeroMayor=num1;
            }else if(num1>num3) {
                numeroMayor=num1;
            }
        }
        if (num2>num1){
            if (num1>num3){
                numeroMayor=num2;
            }else if(num2>num3) {
                numeroMayor=num2;
            }

        }
        if (num3>num1){
            if (num1>num2){
                numeroMayor=num3;
            }else if(num3>num2) {
                numeroMayor=num3;
            }
        }
        System.out.println(resultado+numeroMayor);
    }
}
