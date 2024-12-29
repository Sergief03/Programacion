import java.util.Scanner;

public class Ejercicio15 {
    public static void  main(String[]args){
        System.out.println("Introduce los grados celcius:");
        double celcius=new Scanner(System.in).nextDouble();
        double farenheit=((9*celcius)/5)+32;
        System.out.println("Los grados celcius introducidos en grados Faarenheit serian:"+farenheit);

    }
}
