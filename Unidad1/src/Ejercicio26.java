import java.util.Scanner;

public class Ejercicio26 {
    public static void main (String[] args){
        final int APROBADO=5;

        System.out.println("Introduce la nota final de tu examen:");
        double nota=new Scanner(System.in).nextDouble();

        System.out.println("Has aprobado?"+(nota>=APROBADO));
        System.out.println("Has suspendido?"+(nota<APROBADO));
    }
}
