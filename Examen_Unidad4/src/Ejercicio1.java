import bpc.productos.Producto;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Producto[] productos={new Producto("Pollo",7.15,true),new Producto("Patatas",1.21,false),
        new Producto("Flan",3,true),new Producto("Tomate",2.3,false),new Producto("Huevos",2.25,false)};
        ArrayList<Producto> compra=new ArrayList<>();
        Random random=new Random();

        System.out.println("""
                Elige una opcion:
                1. Comprar todos los productos
                2. Comprar solo los productos en oferta
                3. Comprar solo flan y patatas
                4. Comprar aleatoriamente
                """);

        int eleccion=new Scanner(System.in).nextInt();
        if (eleccion>0&&eleccion<=4){
            switch (eleccion){
                case 1->{
                    for (int i=0;i<productos.length;i++){
                        compra.add(productos[i]);
                    }
                }
                case 2->{
                    for (int i=0;i<productos.length;i++){
                        if (productos[i].tieneOferta()==true) {
                            compra.add(productos[i]);
                        }
                    }
                }
                case 3->{
                    for (int i=0;i<productos.length;i++){
                        if (productos[i].getNombre().matches("Patatas")||productos[i].getNombre().matches("Flan")){
                            compra.add(productos[i]);
                        }
                    }
                }
                case 4->{
                    System.out.println("Introduce un numero de productos que quieras comprar");
                    int numProductos=new Scanner(System.in).nextInt();

                    for (int i=0;i<numProductos;i++){
                        int aleatorio=random.nextInt(1, productos.length);
                        if (!compra.contains(productos[aleatorio])){
                            compra.add(productos[aleatorio]);
                        }
                    }
                }
            }

            double precio=0;

            for (int i=0;i<compra.size();i++){
                precio+=compra.get(i).getPrecio();
            }

            System.out.println("El precio de la compra es "+precio+" euros");
        }else {
            System.out.println("Debes de introducir un numero valido");
        }

    }
}
