import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero entre 1 y 12: ");

        try {
            int mes=new Scanner(System.in).nextInt();
            if (mes<1||mes>12){
                System.out.println("Introduce un numero entre 1 y 12");
            }
            int año = LocalDate.now().getYear();

            int diasDelMes = LocalDate.of(año, mes, 1).lengthOfMonth();


            List<LocalDate> listaFechas = new ArrayList<>();
            for (int dia = 1; dia <= diasDelMes; dia++) {
                listaFechas.add(LocalDate.of(año, mes, dia));
            }

            System.out.println("Lista de fechas del mes " + mes + ":");
            for (int i=0;i<listaFechas.size();i++) {
                LocalDate fecha=listaFechas.get(i);
                System.out.println(fecha);
            }
            System.out.println("Tamaño de la lista: " + listaFechas.size());

        } catch (Exception e) {
            System.out.println("Introduce un numero entre 1 y 12");
        }


    }
}
