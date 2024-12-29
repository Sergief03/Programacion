import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Ejercicio46 {
    public static void main(String[] args) {
        try {
            Random random = new Random();
            int segundosPausa = random.nextInt(11);

            Instant antesPausa = Instant.now();
            System.out.println("La pausa será de " + segundosPausa + " segundos.");

            Thread.sleep(segundosPausa * 1000);
            Instant despuesPausa = Instant.now();

            Duration duracion = Duration.between(antesPausa, despuesPausa);
            System.out.println("La pausa ha durado: " + duracion.getSeconds() + " segundos.");

        } catch (InterruptedException e) {
            System.out.println("La pausa fue interrumpida.");
        }
    }
}

