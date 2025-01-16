import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        String[] palabras = new String[6];
        boolean[] esRepetida = new boolean[6]; // Marca si una palabra está repetida

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce la palabra " + (i + 1) + ": ");
            palabras[i] =new Scanner(System.in).nextLine();
        }

        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].equals(palabras[j])) {
                    esRepetida[i] = true;
                    esRepetida[j] = true;
                }
            }
        }

        System.out.print("Palabras únicas: {");
        boolean primera = true;
        for (int i = 0; i < palabras.length; i++) {
            if (!esRepetida[i]) {
                if (!primera) {
                    System.out.print(", ");
                }
                System.out.print(palabras[i]);
                primera = false;
            }
        }
        System.out.println("}");
    }
}
