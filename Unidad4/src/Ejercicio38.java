import java.util.*;

public class Ejercicio38 {
    public static void main(String[] args) {
        List<String> peliculas=new ArrayList<>();
        Map<String,String> socios=new HashMap<>();

        System.out.println("Elige una opcion:\n1) Añadir pelicula" +
                "\n2) Añasir socio\n3) Prestar pelicula\n4) Devolver pelicula" +
                "\n5) Salir");

        socios.put("paco",null);

        boolean continuar=true;
        int eleccion=0;
        String pelicula="";
        String nombre="";
        while (continuar){
            eleccion=new Scanner(System.in).nextInt();
            switch (eleccion){
                case 1->{
                    System.out.println("Introduce una pelicula:");
                    pelicula=new Scanner(System.in).nextLine();
                    peliculas.add(pelicula);
                }
                case 2->{
                    System.out.println("Introduce un nombre de socio: ");
                    nombre=new Scanner(System.in).nextLine();
                    socios.put(nombre,null);
                }
                case 3->{
                    System.out.println("Introduce un nombre de socio:");
                    nombre=new Scanner(System.in).nextLine();
                    if (socios.get(nombre)==null){
                        System.out.println("Introduce el nombre de una pelicula");
                        pelicula=new Scanner(System.in).nextLine();
                        if (peliculas.contains(pelicula)){
                            peliculas.remove(pelicula);
                            socios.put(nombre,pelicula);
                        }
                    }else {
                        System.out.println("El socio ya tiene una pelicula");
                    }
                }
                case 4->{
                    System.out.println("Introduce un nombre de socio:");
                    nombre=new Scanner(System.in).nextLine();
                    if (socios.get(nombre)==null){
                        System.out.println("El socio no tiene ninguna pelicula");
                    }else {
                        peliculas.add(socios.get(nombre));
                        socios.put(nombre,null);
                    }
                }
                case 5->{
                    continuar=false;
                }
            };
        }
    }
}
