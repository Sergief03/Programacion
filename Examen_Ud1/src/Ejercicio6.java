import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int numero1=new Scanner(System.in).nextInt();
        System.out.println("Introduce otr numero: ");
        int numero2=new Scanner(System.in).nextInt();

        if (numero2==numero1+1||numero1==numero2+1){
            System.out.println("Uno de los numeros es el siguiente del otro");
        }else {
            System.out.println("Ninguno de los numeros es el siguiente del otro");
        }
    }
}
