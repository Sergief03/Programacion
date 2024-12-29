import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[]args){
        final double padrino=3.5;
        final double odisea=2.95;

        System.out.println("Introduce la cantidad de dias que quieres alquilar El padrino y la Odisea respectivamente:");
        double padrinoDias=new Scanner(System.in).nextDouble();
        double odiseaDias=new Scanner(System.in).nextDouble();
        System.out.println("Introduce el dinero que va a gastar");
        double dineroGastar=new Scanner(System.in).nextDouble();

        double dineroCuesta=padrino*padrinoDias+odisea*odiseaDias;
        boolean poderPagar=dineroGastar>=dineroCuesta;
        System.out.println("¿Es suficiente la cantidad introducida para pagar?"+poderPagar);

    }
}
