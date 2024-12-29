import java.util.Scanner;

public class Ejerccio9 {
    public static void main(String[] args) {
        System.out.println("Introduce solo el valor de las horas de la primera hora(formato 0 a 24 horas):");
        int horas1=new Scanner(System.in).nextInt();
        System.out.println("Introduce solo el valor de los minutos de la primera hora(formato 0 a 60 minutos):");
        int minutos1= new Scanner(System.in).nextInt();
        System.out.println("Introduce solo el valor de las horas de la segunda hora(formato 0 a 24 horas):");
        int horas2=new Scanner(System.in).nextInt();
        System.out.println("Introduce solo el valor de los minutos de la segunda hora(formato 0 a 60 minutos):");
        int minutos2= new Scanner(System.in).nextInt();

        if(horas1<=24&&horas1>=0||horas2<=24&&horas2>=0||minutos1<=60&&minutos1>=0||minutos2<=60&&minutos2>=0){

            int primerMinutos = horas1 * 60 + minutos1;
            int segundoMinutos = horas2 * 60 + minutos2;

            if (segundoMinutos>primerMinutos){
                System.out.println("La diferencia entre las dos horas es de "+(segundoMinutos-primerMinutos)+" minutos");
            }else {
                System.out.println("La primera hora es posterior a la segunda");
            }

        }else {
            System.out.println("Numeros incorrectos, error");

        }

    }
}
