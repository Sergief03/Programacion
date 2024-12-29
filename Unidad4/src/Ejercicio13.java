import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            numeros.add(random.nextInt(101));
        }

        Collections.sort(numeros);

        System.out.println("Lista ordenada:");
        for (Integer e : numeros) {
            System.out.print(e + " ");
        }
    }
}
