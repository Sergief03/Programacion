import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[]args){

        System.out.println("La persona es adulta?");
        boolean adulta=new Scanner(System.in).nextBoolean();
        System.out.println("La persona va acompañada?");
        boolean acompañada= new Scanner(System.in).nextBoolean();
        
        System.out.println("La puerta debe abrirse?"+(adulta||acompañada));

    }
}
