import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        File archivo=new File("frases.txt");

        try {
            Scanner scanner=new Scanner(archivo);
            System.out.println(scanner.nextLine());
            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
