public class Ejercicio26 {
    public static void main(String[] args) {
        String[][] horario = {{"Programacion", "Sistemas", "Programacion", "Sostenibilidad", "Sistemas"},
                {"Programacion", "Programacion", "Programacion", "IPE", "Sistemas"},
                {"Entornos", "Programacion", "Sistemas", "Bases de datos", "Digitalizacion"},
                {"Entornos", "IPE", "Lenguaje de marcas", "Bases de datos", "IPE"},
                {"Entornos de desarrollo", "Bases de datos", "Lenguaje de marcas", "Programacion", "Bases de datos"},
                {"Sistemas", "Bases de datos", "Lenguaje de marcas", "Programacion", "Basesde datos"}
        };

        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                System.out.print(horario[i][j]);  // Imprime cada materia
                if (j < horario[i].length - 1) {
                    System.out.print(" | ");  // Agrega separadores entre las materias
                }
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
}
