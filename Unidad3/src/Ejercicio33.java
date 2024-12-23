import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int numero=new Scanner(System.in).nextInt();
        for (int i=0; i<11;i++){
            int resultado=numero*i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
    }
}
