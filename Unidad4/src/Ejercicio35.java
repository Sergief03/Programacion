import java.util.HashSet;
import java.util.Set;

public class Ejercicio35 {
    public static void main(String[] args) {
        Set<String> mensajes=new HashSet<>();
        mensajes.add("silla");
        mensajes.add("mesa");
        mensajes.add("casa");
        mensajes.add("casa");
        mensajes.add("silla");
        mensajes.add("lapiz");
        System.out.println("El tamaño de mensajes es: "+mensajes.size());
        System.out.println("Mensajes contiene: "+mensajes.toString());
    }
}
