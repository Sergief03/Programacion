import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Ejercicio36 {
    public static void main(String[] args) {
        Random random=new Random();
        List<Long> lista=new ArrayList<>();
        Set<Long> set=new HashSet<>();

        for (int i=0;i<1000000;i++){
            lista.add(random.nextLong(0,Long.MAX_VALUE));
            set.add(random.nextLong(0,Long.MAX_VALUE));
        }

        System.out.println("introduce un numero:");
        int numero=new Scanner(System.in).nextInt();

        Instant inicioLista = Instant.now();
        boolean estaEnLista = lista.contains(numero);
        Instant finLista = Instant.now();
        Duration tiempoLista = Duration.between(inicioLista,finLista);

        Instant inicioSet = Instant.now();
        boolean estaEnSet = set.contains(numero);
        Instant finSet= Instant.now();
        Duration tiempoSet = Duration.between(inicioSet,finSet);
        
        System.out.println("Resultado de la búsqueda:");
        System.out.println("¿Está en la lista?: " + estaEnLista + " (Tiempo: " + tiempoLista + " ns)");
        System.out.println("¿Está en el set?: " + estaEnSet + " (Tiempo: " + tiempoSet + " ns)");
    }
}
