import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println("Introduce la primera frase: ");
        String frase1=new Scanner(System.in).nextLine();
        System.out.println("Introduce la segunda frase: ");
        String frase2=new Scanner(System.in).nextLine();

        File archivo= new File("frases.txt");

        try {
            PrintWriter writer=new PrintWriter(archivo);
            writer.println(frase1);
            writer.println(frase2);
            System.out.println("Las frases se han escrito correctamente");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
