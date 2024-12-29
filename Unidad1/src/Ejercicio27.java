import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[]args){
        final int MENOR=17;
        final int MAYOR=60;

        System.out.println("Introduce tu edad:");
        int edad=new Scanner(System.in).nextInt();

        System.out.println("Se te aplica el descuento?"+((MAYOR<edad)||(MENOR>=edad)));

    }
}
