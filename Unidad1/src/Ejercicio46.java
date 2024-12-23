import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[]args) {
       char letra = 'ñ';

        int a = letra;

        System.out.println(((a >= 65 && a <= 90) || (a >= 97 && a <= 122||a>164&&a<165)) ? "Es una letra" : "No es una letra");

    }
}
