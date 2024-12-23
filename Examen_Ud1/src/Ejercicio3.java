import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final double PI =3.14159;

        System.out.println("Introduce el radio de una esfera: ");
        int radio=new Scanner(System.in).nextInt();

        double calculo=(4/3)*PI*(radio*radio*radio);

        System.out.println("El volumen de la esfera es: "+calculo);
    }
}
