import bpc.daw.objetos.DepositoAgua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        List < DepositoAgua> depositoAguas=new ArrayList<>();
        for (int i=0;i<50;i++){
            depositoAguas.add(new DepositoAgua(0,100));
        }
        boolean repetir=true;
        while (repetir){
            System.out.println("Introduce el numero de una eleccion:\n" +
                    "1. Dibujar deposito\n" +
                    "2. rellenar deposito\n" +
                    "3. Vaciar deposito\n" +
                    "4. Añadir deposito\n" +
                    "5. Salir");
            int numero=new Scanner(System.in).nextInt();
            switch (numero){
                case 1->{
                    System.out.println("Introduce el numero de la posicion del deposito: ");
                    int posicion=new Scanner(System.in).nextInt();

                    depositoAguas.get(posicion).dibujar();
                }
                case 2-> {
                    System.out.println("Introduce el numero de la posicion del deposito: ");
                    int posicion=new Scanner(System.in).nextInt();
                    System.out.println("Introduce la cantidad de litros que quieres rellenar:");
                    int cantidad=new Scanner(System.in).nextInt();
                    for (int i=0;i<cantidad;i++){
                        depositoAguas.get(posicion).añadirLitro();
                    }
                }
                case 3->{
                    System.out.println("Introduce el numero de la posicion del deposito: ");
                    int posicion=new Scanner(System.in).nextInt();
                    for (int i=0;i<depositoAguas.get(posicion).getCantidadActual();i++)
                    depositoAguas.get(posicion).retirarLitro();
                }
                case 4->{
                    depositoAguas.add(new DepositoAgua(0,100));
                    depositoAguas.lastIndexOf(depositoAguas);
                }
                case 5-> repetir=false;
            }
        }
    }
}
