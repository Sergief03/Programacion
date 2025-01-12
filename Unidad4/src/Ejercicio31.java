import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero de filas: ");
        int filas = new Scanner(System.in).nextInt();
        System.out.println("introduce un numero de columnas");
        int columnas = new Scanner(System.in).nextInt();

        int[][] tabla = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = i + j;
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println();
        }
    }
}
