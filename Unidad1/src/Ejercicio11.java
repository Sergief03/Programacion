import java.util.Scanner;

public class Ejercicio11 {
    public static void  main(String[]args){
        System.out.println("Introduce tu nombre:");
        String nombre=new Scanner(System.in).nextLine();
        System.out.println("Introduce tu primer apellido:");
        String apellido1= new Scanner(System.in).nextLine();
        System.out.println("Introduce tu segundo apellido:");
        String apellido2=new Scanner(System.in).nextLine();
        System.out.println("Tu nombre es "+apellido2+" "+apellido1+" "+nombre);

    }
}
