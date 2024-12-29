import java.io.*;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int opcion=0;
        while (!(opcion==3)){
            System.out.println("Elige una opcion\n"+"1. Añadir nuevo alumno\n"+"2. Ver los datos de un alumno\n"+"3. Salir");
            opcion=new Scanner(System.in).nextInt();
            if (opcion==1){
                System.out.println("Introduce el DNI: ");
                String dni=new Scanner(System.in).nextLine();
                System.out.println("Introduce el nombre completo:");
                String nombre=new Scanner(System.in).nextLine();
                System.out.println("Introduce tu direccion:");
                String direccion=new Scanner(System.in).nextLine();
                System.out.println("Introduce en telefono de un alumno:");
                int telefono=new Scanner(System.in).nextInt();


                try {
                    PrintWriter printWriter=new PrintWriter(dni+".txt");
                    printWriter.println("Dni: "+dni);
                    printWriter.println("Nombre: "+nombre);
                    printWriter.println("Direccion: "+direccion);
                    printWriter.println("Telefono alumno: "+telefono);
                    printWriter.close();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }else if (opcion==2){
                System.out.println("Intrdouce el dni");
                String dni=new Scanner(System.in).nextLine();
                try {
                    FileReader fileReader=new FileReader(dni+".txt");
                    BufferedReader bufferedReader=new BufferedReader(fileReader);
                    System.out.println("Dni: "+bufferedReader.readLine());
                    System.out.println("Nombre: "+bufferedReader.readLine());
                    System.out.println("Direccion: "+bufferedReader.readLine());
                    System.out.println("Telefono Alumno: "+bufferedReader.readLine()+"\n");

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            } else if (opcion<1||opcion>3) {
                System.out.println("Error al elegir opcion, elige un numero correcto\n");
            }
        }
    }
}