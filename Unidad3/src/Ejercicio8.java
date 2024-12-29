import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("¿Cuantas piezas se pueden cazar hoy?");
        int maximoPiezas=new Scanner(System.in).nextInt();

        int piezas=0;
        while (piezas<maximoPiezas){
            System.out.println("Introduzca el numero de piezas cazadas: ");
            piezas=piezas+new Scanner(System.in).nextInt();
            System.out.println("Usted lleva cazadas "+piezas+" de "+maximoPiezas);
        }
        System.out.println("El numero maximo de piezas ha sido excedido");
    }
}
