import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[]args){
        final int cantidadAren=3*15;

        System.out.println("Introduce la capacidad del camion en toneladas:");
        float capacidad=new Scanner(System.in).nextFloat();

        System.out.println("El camion necesitara "+(cantidadAren/capacidad)+" viajes");
    }
}
