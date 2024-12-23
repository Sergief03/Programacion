import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[]args){
        final int NOTA_MINIMA=5;

        System.out.println("Introduce tres notas de examenes");
        int nota1= new Scanner(System.in).nextInt();
        int nota2= new Scanner(System.in).nextInt();
        int nota3= new Scanner(System.in).nextInt();

        double media= (nota1+nota2+nota3)/3.0;

        boolean aprobado=media>=NOTA_MINIMA;
        System.out.println("¿Estas aprobado?"+aprobado);
    }
}
