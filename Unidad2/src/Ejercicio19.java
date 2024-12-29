import java.io.File;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.println("Introduce la ruta completa del archivo: ");
        String rutaArchivo = new Scanner(System.in).nextLine();

        File archivo = new File(rutaArchivo);



        if (archivo.exists()) {
            long tamañoBytes = archivo.length();
            double tamañoMBytes = (double) tamañoBytes / (1024 * 1024);

            System.out.println("Tamaño del archivos: \nEn bytes:" + tamañoBytes + "\nEn megabytes: " + tamañoMBytes);

        }else {
            System.out.println("El archivo no existe");
        }
    }
}
