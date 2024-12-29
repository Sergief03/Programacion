import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero de base: ");
        int base=new Scanner(System.in).nextInt();
        System.out.println("Introduce un numero de exponente: ");
        int exponente=new Scanner(System.in).nextInt();
        int resultado=1;
        for (int i=0;i<exponente;i++){
            resultado*=base;
        }
        System.out.println(resultado);
    }
}
