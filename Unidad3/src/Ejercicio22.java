import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Introduce una ip:");
        String ip=new Scanner(System.in).nextLine();
        System.out.println("Cuantas veces quieres hacer ping con la ip?");
        int ping=new Scanner(System.in).nextInt();
        System.out.println("haciendo ping a "+ip);
        for (int i=0;i<ping;i++){
            try {
                Instant instant1=Instant.now();
                InetAddress inetAddress=InetAddress.getByName(ip);
                inetAddress.isReachable(2000);
                Instant instant2=Instant.now();
                double duracion=Duration.between(instant1,instant2).toMillis();
                System.out.println("Respuesta desde "+inetAddress.getHostAddress()+": tiempo="+duracion+"ms");
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
