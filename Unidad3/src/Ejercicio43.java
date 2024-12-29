import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        double suma=0;
        for (int i=0;i<10;i++){
            System.out.println("Inserte una nota");
            int nota =new Scanner(System.in).nextInt();
            if (nota>=0&&nota<=10) {
            suma=suma+nota;
            }else {
                System.out.println("Nota incorrecta" );
                i--;
            }
        }
        System.out.println("La nota media es "+suma/10);
    }
}
