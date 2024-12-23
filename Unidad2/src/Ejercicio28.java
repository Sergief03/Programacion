import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        System.out.println("Introduzca un nombre de equipo: ");
        String nombre=new Scanner(System.in).nextLine();

        try {
            String direccion= InetAddress.getByName(nombre).getHostAddress();
            System.out.println("La ip de "+nombre+" es "+direccion);
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());;
        }
    }
}
