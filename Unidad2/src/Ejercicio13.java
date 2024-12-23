import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Introduce tu nombre:");
        String nombre=new Scanner(System.in).nextLine();

        System.out.println("Tu nombre en mayusculas es:"+nombre.toUpperCase()+"\nTu nombre en minusculas es: "+nombre.toLowerCase()+"\nEl total de caracteres es: "+nombre.length());
    }
}
