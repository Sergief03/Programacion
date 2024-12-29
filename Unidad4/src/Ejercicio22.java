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
        for (int i=0;i<numero;i++){
            if (i==0){
                System.out.print("{");
            } else if (i==numero-1) {
                System.out.print(palabras[i]+"}\n");
            }else {
                System.out.print(palabras[i]+", ");
            }
        }
        System.out.println("Las palabras que contiene a son: ");
        for (int i=0;i<numero;i++){
            if (palabras[i].contains("a")){
                if (i==0){
                    System.out.print("{");
                } else if (i==numero) {
                    System.out.print(palabras[i]+"}");
                }else {
                    System.out.print(palabras[i]+", ");
                }
            }
        }


    }
}
