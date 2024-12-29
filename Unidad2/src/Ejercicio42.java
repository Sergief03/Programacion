import java.util.Random;

public class Ejercicio42 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero=29+ random.nextInt(65-29);

        System.out.println(numero);
    }
}
