import bpc.daw.mario.Mario;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduce un valor de x para mario:");
        int x= new Scanner(System.in).nextInt();
        System.out.println("Introduce un valor de y para mario:");
        int y=new Scanner(System.in).nextInt();

        Mario mario= new Mario(x,y);

    }
}
