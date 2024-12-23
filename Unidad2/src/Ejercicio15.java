import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        final String clave="1234";
        System.out.println("Introduce la clave:");
        String claveUsuario=new Scanner(System.in).nextLine();
        System.out.println((clave.equals(claveUsuario))? "Contraseña correcta":"Contraseña incorrecta");
    }
}
