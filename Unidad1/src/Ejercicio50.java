import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[]args){
        int pedro=0;
        int luis=1;
        int miguel=2;
        int jorge=3;
        int juan=4;
        int manolo=5;
        int pepe=6;
        String resultado=null;
        
        System.out.println("Introduce el numero de dedos que has sacado");
        int numero1= new Scanner(System.in).nextInt();
        System.out.println("Introduce el numero de dedos que has sacado");
        int numero2= new Scanner(System.in).nextInt();
        System.out.println("Introduce el numero de dedos que has sacado");
        int numero3= new Scanner(System.in).nextInt();
        System.out.println("Introduce el numero de dedos que has sacado");
        int numero4= new Scanner(System.in).nextInt();
        System.out.println("Introduce el numero de dedos que has sacado");
        int numero5= new Scanner(System.in).nextInt();
        System.out.println("Introduce el numero de dedos que has sacado");
        int numero6= new Scanner(System.in).nextInt();
        System.out.println("Introduce el numero de dedos que has sacado");
        int numero7= new Scanner(System.in).nextInt();
        
        int contar=numero1+numero2+numero3+numero4+numero5+numero6+numero7;
        
        int cuenta=contar%7;
        
        if(cuenta==pedro){
            resultado="Pedro";
            
        } else if (cuenta==luis) {
            resultado="Luis";

        } else if (cuenta==miguel) {
            resultado="Miguel";
        } else if (cuenta==jorge) {
            resultado="jorge";
        } else if (cuenta==juan) {
            resultado="Juan";
        } else if (cuenta==manolo) {
            resultado="Manolo";
        } else if (cuenta==pepe) {
            resultado="Pepe";
        }

        System.out.println("Ha salido "+resultado);

    }
}

