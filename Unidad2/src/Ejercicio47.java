import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        System.out.println("Introduce una ruta de archivo: ");
        String archivo=new Scanner(System.in).nextLine();
        File file=new File(archivo);
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
