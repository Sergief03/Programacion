import java.io.File;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println("introduce la ruat de una carpeta: ");
        File file=new File(new Scanner(System.in).nextLine());
        File[] archivos=file.listFiles();;
        if (file.isDirectory()){
            for (int i=0;i< archivos.length;i++){
                if (archivos[i].isFile()){
                    System.out.println(archivos[i].getName()+" "+archivos[i].length()+" bytes");
                }
            }
        }else {
            System.out.println("Debe introducir la ruta de una carpeta");
        }
    }
}
