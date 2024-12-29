import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        int numero=new Scanner(System.in).nextInt();

        System.out.println("Su numero en binario es "+ Integer.toBinaryString(numero)+"\nSu numero en hexadecimal es "+Integer.toHexString(numero));
    }
}
