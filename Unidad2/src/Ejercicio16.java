import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        String frase1=new Scanner(System.in).nextLine();
        System.out.println("Introduce otra frase: ");
        String frase2=new Scanner(System.in).nextLine();

        System.out.println((frase1.contains(frase2))? "La primera frase contiene a la segunda":"La primera frase no contiene a la segunda");
    }
}
