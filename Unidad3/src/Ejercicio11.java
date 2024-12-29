import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Escribe una frase");
        String frase=new Scanner(System.in).nextLine();

        StringTokenizer stringTokenizer=new StringTokenizer(frase);

        int contador = 0;
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
            contador++;
        }
        System.out.println("\nEl numero de palabra de la frase es: "+contador);
    }
}
