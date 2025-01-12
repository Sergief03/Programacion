import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        String[][] horario = {
                {"Programacion", "Programacion", "Entornos", "Entornos", "Entornos", "Sistemas"},
                {"Sistemas", "Programacion", "Programacion", "IPE", "Base de datos", "Base de datos"},
                {"Programacion", "Programacion", "Sistemas", "Lenguaje de marcas", "Lenguaje de marcas","Lenguaje de marcas"},
                {"Sostenibilidad", "IPE", "Bases de datos", "Bases de datos", "Programacion","Programacion"},
                {"Sistemas", "Sistemas", "Digitalizacion", "IPE", "Bases de datos","Bases de datos"},

        };

        String[] horas = {"8:15-9:15", "9:15-10:15", "10:15-11:15", "11:45-12:45", "12:45-13:45", "13:45-14:45"};

        System.out.println("Introduce el nombre de una asignatura:");
        String asignatura = new Scanner(System.in).nextLine();

        // Buscar la asignatura en el horario
        boolean encontrada = false;
        System.out.println("La asignatura " + asignatura + " se imparte en los siguientes días y horas:");

        for (int dia = 0; dia < horario.length; dia++) {
            for (int hora = 0; hora < horario[dia].length; hora++) {
                if (horario[dia][hora].equalsIgnoreCase(asignatura)) {
                    String diaSemana = "";
                    switch (dia) {
                        case 0-> diaSemana="Lunes";
                        case 1-> diaSemana= "Martes";
                        case 2-> diaSemana= "Miércoles";
                        case 3-> diaSemana= "Jueves";
                        case 4-> diaSemana= "Viernes";
                    }
                    System.out.println("- " + diaSemana + ", " + horas[hora]);
                    encontrada = true;
                }
            }
        }

        if (!encontrada) {
            System.out.println("La asignatura " + asignatura + " no existe en el horario.");
        }
    }
}
