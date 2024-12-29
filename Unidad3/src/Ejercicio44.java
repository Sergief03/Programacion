import java.util.Random;
import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("Introduce un numero: ");
        int numero=new Scanner(System.in).nextInt();

        for (int i=0;i<numero;i++){
            int cifras= random.nextInt(1001,10000);
            String letras="";
            for (int j=0;j<3;j++){
                char letra =(char)(random.nextInt(26)+'A');
                letras+=letra;
            }
            System.out.println(cifras+letras);
        }

    }
}
