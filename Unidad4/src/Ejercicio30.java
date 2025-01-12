import java.util.Random;

public class Ejercicio30 {
    public static void main(String[] args) {
        boolean[][] tabla = new boolean[4][3];
        Random random = new Random();

        int countTrue = 0;
        int countFalse = 0;


        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = random.nextBoolean();
                if (tabla[i][j]) {
                    countTrue++;
                } else {
                    countFalse++;
                }
            }
        }

        System.out.println("Tabla de booleanos:");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTotal de true: " + countTrue);
        System.out.println("Total de false: " + countFalse);
    }
}
