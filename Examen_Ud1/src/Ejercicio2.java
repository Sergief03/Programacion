import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduce el numero del precio del producto");
        int precio=new Scanner(System.in).nextInt();
        System.out.println("Introduce el porcentaje de la rebaja");
        int porcentajeRebaja=new Scanner(System.in).nextInt();

        double rebaja=(100-porcentajeRebaja)*0.01;
        double calculo=precio*rebaja;

        System.out.println("El precio final del producto es: "+calculo);
    }
}
