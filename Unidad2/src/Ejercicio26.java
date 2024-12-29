import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        try {
            System.out.println("Cuantos segundo quiere esperar?");
            int segundos=new Scanner(System.in).nextInt();
            Thread.sleep(segundos*1000);
            System.out.println("Programa finalizado");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());;
        }


    }
}
