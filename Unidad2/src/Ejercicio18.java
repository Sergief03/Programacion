import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("Introduce tu correo electronico completo: ");
        String correo= new Scanner(System.in).nextLine();

        int posicionArroba = correo.indexOf('@');

        String nombreUsuario = correo.substring(0, posicionArroba);
        String dominio = correo.substring(posicionArroba + 1);


        System.out.println("Nombre de usuario: " + nombreUsuario+"\nDominio: "+dominio);


    }
}
