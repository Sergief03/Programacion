import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Coche");
        palabras.add("Casa");
        palabras.add("Ordenador");
        palabras.add("Raton");
        int vidas = 4;
        Collections.shuffle(palabras);
        String palabra = palabras.get(0).toUpperCase();
        int longitudPalabra = palabra.length();
        boolean[] aciertos = new boolean[longitudPalabra];
        String[] vistaUsuario = new String[longitudPalabra];

        for (int i = 0; i < longitudPalabra; i++) {
            aciertos[i] = false;
            vistaUsuario[i] = "-";
        }


        while (vidas > 0) {
            // Comprobar si se han adivinado todas las letras
            boolean todasAdivinadas = true;
            for (int i = 0; i < aciertos.length; i++) {
                if (!aciertos[i]) {
                    todasAdivinadas = false;
                }
            }

            if (todasAdivinadas) {
                System.out.println("¡Ganaste! La palabra era: " + palabra);
                vidas = 0;
            } else {
                System.out.println("Vidas: " + vidas);
                for (int i = 0; i < longitudPalabra; i++) {
                    System.out.print(vistaUsuario[i] + " ");
                }
                System.out.println("\nIntroduce una letra: ");
                char letra = new Scanner(System.in).nextLine().toUpperCase().charAt(0);

                boolean letraCorrecta = false;
                for (int i = 0; i < longitudPalabra; i++) {
                    if (palabra.charAt(i) == letra) {
                        aciertos[i] = true;
                        vistaUsuario[i] = String.valueOf(letra);
                        letraCorrecta = true;
                    }
                }

                if (!letraCorrecta) {
                    vidas--;
                }

                if (vidas == 0) {
                    System.out.println("Perdiste. La palabra era: " + palabra);
                }
            }
        }
    }
}

