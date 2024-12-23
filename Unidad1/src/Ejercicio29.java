import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[]args){
        System.out.println("Introduce el porcentaje de tinta de la impresora:");
        int tintaImpresora=new Scanner(System.in).nextInt();
        System.out.println("Introduce los folios que tiene la impresora:");
        int folioImpresora= new Scanner(System.in).nextInt();
        System.out.println("Introduce los folios que deseas imprimir:");
        int foliosImprimir= new Scanner(System.in).nextInt();
        System.out.println("¿Esta la impresora encendida?");
        boolean respuesta=new Scanner(System.in).nextBoolean();

        boolean imprimir=((tintaImpresora>0)&&(folioImpresora>=foliosImprimir))&&((respuesta==true)&&(folioImpresora>0));
        if(imprimir==true){
            System.out.println("Imprimiendo "+foliosImprimir+" folios");
        }else{
            System.out.println("No se puede imprimir");
        }

    }
}
