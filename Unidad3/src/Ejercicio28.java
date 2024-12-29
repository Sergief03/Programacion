import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int notas=10;
        int totalnotas=0;
        for (int i=0;i<10&&notas>5;i++){
            System.out.println("Introduce una nota: ");
            notas=new Scanner(System.in).nextInt();
            totalnotas=totalnotas+notas;
        }
        System.out.println("La nota media es: "+totalnotas/10);
    }
}
