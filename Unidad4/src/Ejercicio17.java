import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        int[] numeros = {2, 9, 4, 5, 6, 1, 2, 3, 45, 2, 1, 2, 65, 3, 2, 6, 1, 2, 3, 5, 2, 2, 6, 67, 11, 67, 3, 2, 1, 7, 8, 5, 3, 27, 8, 93, 1, 6};
        System.out.println("Introduce un numero: ");
        int numero=new Scanner(System.in).nextInt();
        int vecesAparece=0;
        boolean aparece=false;
        for(int e : numeros){
            if (e==numero){
                vecesAparece++;
                aparece=true;
            }
        }
        if (aparece){
            System.out.println("El numero aparece "+vecesAparece+" veces");
        }else {
            System.out.println("El numero no aparece en la lista");
        }
    }
}
