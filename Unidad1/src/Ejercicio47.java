import java.util.Scanner;

public class Ejercicio47 {
    public static void main (String[]args){
        System.out.println("Introduce una cantidad en euros");
        int dinero= new Scanner(System.in).nextInt();

        int billetes500 = dinero / 500;
        dinero = dinero % 500;

        int billetes100 = dinero / 100;
        dinero = dinero % 100;

        int billetes50 = dinero / 50;
        dinero = dinero % 50;

        int billetes20 = dinero / 20;
        dinero = dinero % 20;

        int billetes10 = dinero / 10;
        dinero = dinero % 10;

        int monedas2 = dinero / 2;
        dinero = dinero % 2;

        int monedas1 = dinero;


        System.out.println("Tenemos:\n"+billetes500+" billetes de 500\n"+
        billetes100+" billetes de 100\n"+billetes50+"billetes de 50\n"+
        billetes20+" billetes de 20\n"+billetes10+" billetes de 10\n"+
        monedas2+" monedas de 2\n"+monedas1+" monedas de 1");
    }
}
