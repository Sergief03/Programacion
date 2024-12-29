import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[]args) {
        final double porcentajeFaltas = 0.02;

        int horasLenguaje = 128;
        int horasRedes = 192;
        int horasHardware = 96;

        int faltasLenguaje =(int) (horasLenguaje * porcentajeFaltas);
        int faltasRedes = (int) (horasRedes * porcentajeFaltas);
        int faltasHardware = (int) (horasHardware * porcentajeFaltas);

        System.out.println("El numero de faltas permitidas en Lenguaje de marcas es: " + faltasLenguaje);
        System.out.println("El numero de faltas permitidas en Redes es: " + faltasRedes);
        System.out.println("El numero de faltas permitidas en Hardware es: " + faltasHardware);


        System.out.println("Introduce el numero de faltas en  redes: ");
        int faltasAlumno = new Scanner(System.in).nextInt();

        if ((faltasAlumno > faltasRedes)) {

            System.out.println("Has superado la cantidad de faltas");
        }else {
        System.out.println("No has superado la cantidad de faltas");
        }
    }
}
