import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Introduce una direccion ip: ");
        String ip=new Scanner(System.in).nextLine();
        System.out.println("Introduce el tiempo de timeout (en milisegundos): ");
        int timeOut=new Scanner(System.in).nextInt();

        try {
            boolean ping= InetAddress.getByName(ip).isReachable(timeOut);
            System.out.println("Haciendo ping a "+ip+" "+ping);
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }


    }
}
