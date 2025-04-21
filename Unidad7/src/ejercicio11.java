import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ejercicio11 {
    public record Alumno(String nombre, int edad, String ciudad){

    }

    public record Instituto(String nombre, List<Alumno> alumnos){

    }

    public record CargadorInstituto() {
        public static void cargarInstituto(String ruta, Consumer<Instituto> exito, Consumer<IOException> error) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(ruta));
                String l = null;
                String[] linea=null;
                List<Alumno> alumnos = new ArrayList<>();
                while ((l = bufferedReader.readLine()) != null) {
                    linea=l.split(";");
                    alumnos.add(new Alumno(linea[0], Integer.parseInt(linea[1]), linea[2]));
                }
                exito.accept(new Instituto("Instituto", alumnos));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                error.accept(e);
            }
        }

    }
    public static void main(String[] args) {
        try {
            List<String> alumnos = List.of(
                    "Ana;20;Madrid",
                    "Carlos;22;Barcelona",
                    "Elena;19;Sevilla",
                    "David;21;Valencia",
                    "Sofía;23;Málaga",
                    "Javier;20;Granada",
                    "Lucía;18;Alicante",
                    "Miguel;24;Bilbao",
                    "Carmen;21;Zaragoza",
                    "Pablo;19;Murcia"
            );

            PrintWriter printWriter = new PrintWriter("hlanz.csv");
            for (String e : alumnos) {
                printWriter.println(e);
            }
            printWriter.close();

        } catch (IOException e) {
            System.err.println("Error al crear y llenar el archivo: " + e.getMessage());
        }
        CargadorInstituto.cargarInstituto(
                "hlanz.csv",
                instituto -> {
                    System.out.println("\nInstituto cargado: " + instituto.nombre());
                    System.out.println("Alumnos:");
                    for (Alumno alumno : instituto.alumnos()) {
                        System.out.println("- Nombre: " + alumno.nombre() + ", Edad: " + alumno.edad());
                    }
                },
                error -> {
                    System.err.println("\nError al cargar el archivo " + "hlanz.csv" + ": " + error.getMessage());
                }
        );
    }
}


