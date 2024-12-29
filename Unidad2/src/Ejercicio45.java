import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio45 {
    public static void main(String[] args) {
        LocalDate fecha= LocalDate.of(2100,2,28);
        DayOfWeek diaSemana=fecha.getDayOfWeek();

        System.out.println("El "+fecha+" es "+diaSemana);
    }
}
