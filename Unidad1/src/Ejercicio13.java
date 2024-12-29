import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String []args){
        System.out.println("Introduce las horas:");
        int horas= new Scanner(System.in).nextInt();
        System.out.println("Introduce los minutos:");
        int minutos=new Scanner(System.in).nextInt();
        System.out.println("Introduce los segundos:");
        int segundos= new Scanner(System.in).nextInt();

        int total=(horas*3600)+(minutos*60)+segundos;
        System.out.println("El total en segundos es "+total);

    }
}
