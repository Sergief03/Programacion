import java.util.*;

public class Ejemplo {

    public static void main(String[] args) {
        // Crear el horario como un array bidimensional
        String[][] horario = {
                {"Programacion", "Sistemas", "Programacion", "Sostenibilidad", "Sistemas"},
                {"Programacion", "Programacion", "Programacion", "IPE", "Sistemas"},
                {"Entornos", "Programacion", "Sistemas", "Bases de datos", "Digitalizacion"},
                {"Entornos", "IPE", "Lenguaje de marcas", "Bases de datos", "IPE"},
                {"Entornos de desarrollo", "Bases de datos", "Lenguaje de marcas", "Programacion", "Bases de datos"},
                {"Sistemas", "Bases de datos", "Lenguaje de marcas", "Programacion", "Bases de datos"}
        };

        // Crear las horas del horario
        String[] horas = {"8:15-9:15", "9:15-10:15", "10:15-11:15", "11:45-12:45", "12:45-13:45", "13:45-14:45"};

        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre de una asignatura (por ejemplo, Programacion):");
        String asignatura = scanner.nextLine();

        // Contadores para las ocurrencias
        int totalVeces = 0;
        int primerasHoras = 0;

        // Buscar la asignatura en el horario y contar
        for (int dia = 0; dia < horario.length; dia++) {
            for (int hora = 0; hora < horario[dia].length; hora++) {
                if (horario[dia][hora].equalsIgnoreCase(asignatura)) {
                    totalVeces++;
                    if (hora == 0) { // Primera hora
                        primerasHoras++;
                    }
                }
            }
        }

        // Mostrar resultados
        if (totalVeces > 0) {
            System.out.println("La asignatura " + asignatura + " se imparte " + totalVeces + " veces a la semana.");
            System.out.println("De esas, " + primerasHoras + " veces son a primera hora.");
        } else {
            System.out.println("La asignatura " + asignatura + " no existe en el horario.");
        }

        scanner.close();
    }
}
