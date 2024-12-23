import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        System.out.println("Introduce a:");
        double a=new Scanner(System.in).nextDouble();
        System.out.println("Introduce b:");
        double b=new Scanner(System.in).nextDouble();
        System.out.println("Introduce c:");
        double c=new Scanner(System.in).nextDouble();

        double raiz= Math.sqrt(Math.pow(b,2)-4*a*c);
        double ecuacion1= (b+raiz)/(2*a);
        double ecuacion2= (b-raiz)/(2*a);

        System.out.println("Las dos soluciones de la ecuacion es:\n"+ecuacion1+"\n"+ecuacion2);
    }
}
