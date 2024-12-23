import java.util.Scanner;
//Este programa sirve para obtener el precio de un producto aplicando un descuento
public class Ejercicio12 {
    public static void main(String[]args){

        System.out.println("Introduce el precio del producto");
        double precioProducto= new Scanner(System.in).nextDouble();
        System.out.println("Introduce el numero del procentaje de rebaja que se le va a aplicar al precio:");
        double porcentajeRebaja= new Scanner(System.in).nextDouble();
        double precioReal=precioProducto *(porcentajeRebaja/100);
        double descuento=precioProducto-precioReal;
        System.out.println("Precio normal del producto es: "+precioProducto+"euros");
        System.out.println("Porcentaje de rebaja aplicado: "+porcentajeRebaja+"%");
        System.out.println("Descuento aplicado: "+descuento+"euros");
        System.out.println("Precio final del articulo:"+precioReal+"euros");
    }
}
