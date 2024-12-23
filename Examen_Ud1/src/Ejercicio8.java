import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Introduce una cantidad de segundos: ");
        int segundos=new Scanner(System.in).nextInt();

        int horas=segundos/3600;
        int minutos=(segundos%3600)/60;
        segundos=((segundos%3600)%60);

        System.out.println("EL tiempo introducido es "+horas+" horas "+minutos+" minutos "+ segundos+" segundos");

    }
}
