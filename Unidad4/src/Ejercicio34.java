import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        String[] palabras = {
                "hola", "adiós", "gracias", "por favor", "buenos días",
                "buenas noches", "agua", "comida", "amigo", "familia",
                "casa", "escuela", "trabajo", "libro", "coche",
                "perro", "gato", "sol", "luna", "estrella"
        };

        String[] traducciones = {
                "hello", "goodbye", "thank you", "please", "good morning",
                "good night", "water", "food", "friend", "family",
                "house", "school", "work", "book", "car",
                "dog", "cat", "sun", "moon", "star"
        };

        // Mostrar la tabla de 5 filas y 2 columnas
        System.out.println("Tabla de palabras:");
        System.out.println("Español                 Inglés");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print( palabras[i]);
            for (int j=palabras[i].length();j<24;j++){
                System.out.print(" ");
            }
            System.out.println(traducciones[i]);
        }

        System.out.println("\nIntroduce una palabra en español para traducir:");
        String palabraUsuario =new  Scanner(System.in).nextLine();

        boolean encontrada = false;
        for (int i = 0; i < palabras.length&&!encontrada; i++) {
            if (palabras[i].equalsIgnoreCase(palabraUsuario)) {
                System.out.println("La traducción en inglés es: " + traducciones[i]);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("La palabra no está en la tabla.");
        }
    }
}


