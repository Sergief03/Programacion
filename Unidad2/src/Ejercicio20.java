import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
       /* File archivo1=new File("archivo.txt");

        try {
            archivo1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

        System.out.println("Introdue la ruta completa del archivo o del directorio: ");
        String rutaArchivo= new Scanner(System.in).nextLine();

        File archivo=new File(rutaArchivo);

        if (archivo.exists()){
            if (archivo.isDirectory()){
                System.out.println("La ruta inrtroducida es de un directorio");
            }else if (archivo.isFile()){
                double tamañoBytes= archivo.length();
                System.out.println("la ruta introducida correponde a un archivo de "+tamañoBytes+" bytes\n¿Deseas borrarlo? (si/no): ");
                String respuesta= new Scanner(System.in).nextLine();

                if (respuesta.equalsIgnoreCase("si")){
                    if (archivo.delete()) {
                        System.out.println("El archivo se ha borrado correctamente");
                    } else {
                        System.out.println("Se ha producido un error");
                    }
                }else {
                    System.out.println("Borrado cancelado");
                }
            }
        }else {
            System.out.println("El archivo o directorio no existe");
        }

    }
}
