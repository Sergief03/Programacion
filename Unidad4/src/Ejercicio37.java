import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        int numero=0;
        int telefono=0;
        String nombre="";

        boolean continuar=true;


        while (continuar){
            System.out.println("Elige una opcion:\n1) Añadir entrada\n2) Consultar telefono" +
                    "\n3) Mostrar listado\n4) Salir");
            numero=new Scanner(System.in).nextInt();
            switch (numero){
                case 1->{
                    System.out.println("Introduce un nombre:");
                    nombre=new Scanner(System.in).nextLine();
                    System.out.println("Introduce un numero de telefono:");
                    telefono=new Scanner(System.in).nextInt();
                    map.put(nombre,telefono);
                }
                case 2->{
                    System.out.println("Introduce un nombre: ");
                    nombre=new Scanner(System.in).nextLine();
                    if (map.containsKey(nombre)){
                        System.out.println("El numero de telefono de "+numero+" es "+map.get(nombre));
                    }
                }
                case 3->{
                    for (String e:map.keySet()){
                        System.out.println(e+": "+map.get(e));
                    }
                }
                case 4->{
                    continuar=false;
                }
            };

        }
    }
}
