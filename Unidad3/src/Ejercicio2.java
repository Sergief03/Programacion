import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            FileWriter archivo = new FileWriter("frases.txt");
            System.out.println("Elige:\n1) Escribir dos frases en un archivo\n2) Leer dos frases del archivo");
            int numero = new Scanner(System.in).nextInt();
            switch (numero){
                case 1->{
                    System.out.println("Introduce una linea");
                    archivo.write(new Scanner(System.in).nextLine());
                    System.out.println("Introduce una linea");
                    archivo.write("\n"+new Scanner(System.in).nextLine());
                    archivo.close();
                }


                case 2->{
                    File file=new File("frases.txt");
                    Scanner scanner=new Scanner(file);
                    System.out.println(scanner.nextLine()+"\n"+scanner.nextLine());
                }


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
