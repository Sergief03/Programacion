import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        List mensajes=new ArrayList<>();
        int opcion=0;
        do {
            System.out.println("Elija una opcion\n1) Añadir mensaje\n2) Consulatr tamaño\n" +
                    "3) Consultar mensaje\n4) Comprobar mensaje\n5) Consultar todos los mensajes\n"+
                    "\n6) Borrar todo\n7) Salir");
            opcion=new Scanner(System.in).nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Introduce el mensaje");
                    mensajes.add(new Scanner(System.in).nextLine());
                }
                case 2->{
                    System.out.println("El tamaño de la lista es: "+mensajes.size());
                }
                case 3->{
                    if (mensajes.isEmpty()){
                        System.out.println("No hay mensajes");
                    }else {
                        System.out.println("Introduce el un numero entre 1 y "+(mensajes.size()));
                        int numero=new Scanner(System.in).nextInt();
                        if (numero>1&&numero< mensajes.size()){
                            System.out.println(mensajes.get(numero-1));
                        }else {
                            System.out.println("Numero no valido");
                        }
                    }
                }
                case 4->{
                    System.out.println("Introduce un mensaje: ");
                    String mensaje=new Scanner(System.in).nextLine();
                    if (mensajes.contains(mensaje)) {
                        System.out.println("EL mensaje esta dentro de la lista");
                    }else {
                        System.out.println("El mensaje no esta dentro de la lista");
                    }
                }
                case 5-> {
                    for (int i=0;i< mensajes.size();i++){
                        System.out.println(mensajes.get(i));
                    }
                }
                case 6->{
                    mensajes.clear();
                    System.out.println("Todos los objetos han sido borrados");
                }
            }
        }while (!(opcion==7));

    }
}
