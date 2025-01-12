public class Ejercicio32 {
    public static void main(String[] args) {
        int[] numeros = {50, 26, 7, 9, 15, 27};

        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Intercambiar el número más pequeño con el número en la posición actual
            int temp = numeros[i];
            numeros[i] = numeros[indiceMenor];
            numeros[indiceMenor] = temp;
        }

        System.out.println("Array ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
