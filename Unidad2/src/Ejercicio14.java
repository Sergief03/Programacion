import java.util.Scanner;
import java.util.SortedMap;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Introduce una farse: ");
        String frase=new Scanner(System.in).nextLine();

        int mitadFrase=frase.length()/2;

        System.out.println("La letra que esta a la mitad de la frase es: "+frase.charAt(mitadFrase));
    }
}
