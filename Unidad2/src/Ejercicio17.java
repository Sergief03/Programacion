import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        String resultado=null;

        System.out.println("Introduce el nombre de tu correo");
        String nombre=new Scanner(System.in).nextLine();
        System.out.println("Introduce el dominio de tu correo");
        String dominio= new Scanner(System.in).nextLine();

        if (dominio.endsWith(".com")||dominio.endsWith(".es")){
            String correo= nombre+"@"+dominio;
            resultado="Tu correo es: "+correo;
        }else {
            resultado="Dominio incorrecto";
        }

        System.out.println(resultado);
    }
}
