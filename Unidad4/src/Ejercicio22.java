import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero de palabras a introducir: ");
        int numero=new Scanner(System.in).nextInt();
        String[] palabras=new String[numero];
        for (int i=0;i<numero;i++){
            System.out.println("Introduce una palabra: ");
            palabras[i]=new Scanner(System.in).nextLine();
        }
        System.out.print("Palabras introducidas: {");
        for (int i = 0; i < numero; i++) {
            System.out.print(palabras[i]);
            if (i < numero - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Las palabras que contienen la letra 'a' son: {");
        boolean primeraPalabra = true;
        for (String palabra : palabras) {
            if (palabra.contains("a")) {
                if (!primeraPalabra) {
                    System.out.print(", ");
                }
                System.out.print(palabra);
                primeraPalabra = false;
            }
        }
        System.out.println("}");
    }
}
