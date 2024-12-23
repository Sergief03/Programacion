import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int numero=new Scanner(System.in).nextInt();

        int divisores=0;

        for (int i=1;i<numero;i++){
            if ((numero%i)==0){
                divisores++;
            }
        }
        if (divisores==1){
            System.out.println("El numero es primo");
        }else {
            System.out.println("El numero no es primo");
        }

    }
}
