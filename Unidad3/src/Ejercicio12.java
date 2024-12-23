import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        boolean mayor=true;
        double s = 1;
        double a = 1;

        System.out.println("introduce el valor de N: ");
        double n = new Scanner(System.in).nextInt();

        while (mayor){
            s = 0.5 * (a + n / a);
            if (Math.abs(s-a)<0.000001){
                mayor=false;
            }
            a=s;
        }
        System.out.println("La raiz cuadrada de aproximada de N es: "+s);
    }
}
