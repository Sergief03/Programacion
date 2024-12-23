import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[]args){
        System.out.println("Introduce una cantidad en euros:");
        double euros=new Scanner(System.in).nextDouble();
        double dolares= euros*1.42;
        double libras= (100*euros*87.13)/100;
        double yens=euros*113.86;
        double pesetas=euros*166.386;
        System.out.println("La conversion de esa cantidad a estas monedas seria:");
        System.out.println("Dolares:"+dolares+"$");
        System.out.println("Libras:"+libras+"£");
        System.out.println("Yens:"+yens+"¥");
        System.out.println("Pesetas:"+pesetas+"pts");
    }
}
