import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String edad="";
        while (!edad.equalsIgnoreCase("si") && !edad.equalsIgnoreCase("no")){
            System.out.println("¿Eres mayor de edad?(si/no)");
            edad=new Scanner(System.in).next();

            if (edad.equalsIgnoreCase("si")){
                System.out.println("Eres mayor de edad");
            }else if (edad.equalsIgnoreCase("no")){
                System.out.println("Eres menor edad");
            }else {
                System.out.println("No te entiendo");
            }


        }

    }
}
