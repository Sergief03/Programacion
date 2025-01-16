import java.util.Random;
import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero de filas");
        int n=new Scanner(System.in).nextInt();
        System.out.println("Introduce un numero de columnas");
        int m=new Scanner(System.in).nextInt();

        int [][] tabla=new int[n][m];

        Random random=new Random();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                tabla[i][j]= random.nextInt();
            }
        }

        int suma=0;

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(tabla[i][j]+" | ");
                suma+=tabla[i][j];
            }
            System.out.println();
        }
        System.out.println("La suma de todos los numeros es: "+suma);
    }
}
