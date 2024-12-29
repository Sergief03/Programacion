import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        int opcion=0;
        while (!(opcion==3)){
            System.out.println("Elige el numero de una opcion:\n1. Comprar coche\n2. Ver lista de coches vendidos\n3. Salir");
            opcion=new Scanner(System.in).nextInt();
        }
    }
}
