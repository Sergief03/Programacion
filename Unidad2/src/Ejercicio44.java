import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio44 {
    public static void main(String[] args) {
        LocalDate fecha= LocalDate.now();
        DateTimeFormatter formatoBarras=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoGuion=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String fechaBarras=fecha.format(formatoBarras);
        String fechaGuion=fecha.format(formatoGuion);


        System.out.println("La fecha es:\n"+fechaBarras+"\n"+fechaGuion);
    }
}
