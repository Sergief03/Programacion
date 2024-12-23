import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int porecentajeSatisfechos=86;
        int porecentajeNoResponde=2;
        int porcentajeNoSatisfechos=100-(porecentajeSatisfechos+porecentajeNoResponde);

        System.out.println("Introduce el numero de alumnos que hay en el instituto: ");
        int alumnos=new Scanner(System.in).nextInt();

        int alumnosSatisfechos=(int) (alumnos*(porecentajeSatisfechos*0.01));
        int alumnosNoResponden=(int)(alumnos*(porecentajeNoResponde*0.01));
        int alumnosNoSatisfechos=alumnos-(alumnosSatisfechos+alumnosNoResponden);

        System.out.println("El numero de alumnos satisfechos es: "+alumnosSatisfechos+
                "\nEl numero de alumnos que no responden es: "+ alumnosNoResponden+
                "\nEl numero de alumnos que no estan satisfechos es: "+ alumnosNoSatisfechos);

    }
}
