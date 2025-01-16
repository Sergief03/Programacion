import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();


        map.put("Mesa", "Table");
        map.put("Silla", "Chair");
        map.put("Casa", "House");
        map.put("Lápiz", "Pencil");
        map.put("Libro", "Book");
        map.put("Flor", "Flower");
        map.put("Perro", "Dog");
        map.put("Gato", "Cat");
        map.put("Cielo", "Sky");
        map.put("Agua", "Water");

        System.out.println("Introduce una palabra en español: ");
        String palabra=new Scanner(System.in).nextLine();
        System.out.println("La traduccion es:\n"+palabra+" - "+map.get(palabra));

    }
}
