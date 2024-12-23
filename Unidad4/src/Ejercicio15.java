import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Introduce tu numero de DNI:");
        int numero=new Scanner(System.in).nextInt();
        char[] letra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        System.out.println("Tu letra de DNI es "+letra[numero%23]);
    }
}
