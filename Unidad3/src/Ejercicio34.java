import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int numero=new Scanner(System.in).nextInt();

        for (int i=1;i<numero;i++){
            int resto=numero%i;
            if ((resto)==0){
                System.out.println(i);
            }
        }
    }
}
