import java.io.File;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("Introduce la ruta completa del directorio:");
        String rutaDirectorio=new Scanner(System.in).nextLine();

        File directorio= new File(rutaDirectorio);

        if (directorio.isDirectory()){
            
        }
    }
}
