import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[]args){
        System.out.println("Introduce el precio del articulo");
        double precio=new Scanner(System.in).nextDouble();
        System.out.println("Introdue la cantidad de dinero que va a pagar");
        double pagar=new Scanner(System.in).nextDouble();

        if(pagar>precio){
            System.out.println("Su cambio es:"+(pagar-precio));
        } else if (pagar<precio) {
            System.out.println("Le faltan"+(precio-pagar));
        }
    }
}
