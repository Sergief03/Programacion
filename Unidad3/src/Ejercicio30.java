import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase");
        String frase=new Scanner(System.in).nextLine();

        int largo=frase.length();
        for (int i=0;i<largo;i++){
            System.out.println(frase.substring(i,i+1));
        }
    }
}
