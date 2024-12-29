public class Ejercicio16 {
    public static void main(String[] args) {
        int[] numeros = {2, 9, 4, 5, 6, 1, 2, 3, 45, 2, 1, 2, 65, 3, 2, 6, 1, 2, 3, 5, 2, 2, 6, 67, 11, 67, 3, 2, 1, 7, 8, 5, 3, 27, 8, 93, 1, 6};

        int suma=0;
        for (int a:numeros){
            suma+=a;
        }
        System.out.println(suma);
    }
}
