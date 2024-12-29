import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        boolean nLinea= true;
        System.out.println("Introduce una ruta de un archivo .txt: ");
        String archivo=new Scanner(System.in).nextLine();

        try {
            FileReader fileReader=new FileReader(archivo);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            while (nLinea) {
                String linea = bufferedReader.readLine();
                if (linea != null) {
                    System.out.println(linea);
                } else {
                    nLinea = false;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
