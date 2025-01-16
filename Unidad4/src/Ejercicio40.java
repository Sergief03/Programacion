import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Map<String,Integer> usuario=new HashMap<>();

        usuario.put("Pepe",9385);
        usuario.put("Manuel",1234);
        usuario.put("Ana",1085);

        System.out.println("Introduce el nombre de usuario");
        String nombre=new Scanner(System.in).nextLine();
        System.out.println("Introduce el pin: ");
        int pin=new Scanner(System.in).nextInt();

        if (usuario.get(nombre)==pin){
            System.out.println("Acceso permitido");
        }else {
            System.out.println("Usuario/Pin incorrecto");
        }
    }
}
