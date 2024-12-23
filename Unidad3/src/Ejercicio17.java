import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        boolean repetir=true;
        System.out.println("Introduce el numero de mes: ");
        int mes=new Scanner(System.in).nextInt();
        System.out.println("Introduce el numero del año: ");
        int año=new Scanner(System.in).nextInt();

        int dia=1;

        while (repetir){
            LocalDate localDate=LocalDate.of(año,mes,dia);
            DayOfWeek dayOfWeek=localDate.getDayOfWeek();
            int numeroDias=localDate.lengthOfMonth();

            System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" "+dayOfWeek.toString().toLowerCase());
            dia++;
            if (numeroDias<dia){
                repetir=false;
            }
        }

    }
}
