import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[]args){
        final int MAYORIA_EDAD=18;

        System.out.println("Introduce la edad de dos perosnas:");
        int edad1=new Scanner(System.in).nextInt();
        int edad2=new Scanner(System.in).nextInt();

        boolean mayoresEdad=(edad1>=MAYORIA_EDAD)&&(edad2>=MAYORIA_EDAD);

        System.out.println("¿Las dos perosnas son mayores de edad?"+mayoresEdad);
        System.out.println("¿La primera persona es mayor que la segunda?"+(edad1>edad2));
    }
}
