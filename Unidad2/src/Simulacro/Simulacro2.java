package Simulacro;

import bpc.daw.consola.*;

import java.util.Scanner;

public class Simulacro2 {
    public static void main(String[] args) {
        System.out.println("Introduce el valor R:");
        int r=new Scanner(System.in).nextInt();
        System.out.println("Introduce el valor G:");
        int g=new Scanner(System.in).nextInt();
        System.out.println("Introduce el valor B:");
        int b=new Scanner(System.in).nextInt();

        Consola consola=new Consola();

       FondoColorSolido fondo= new FondoColorSolido(r,g,b);
        CapaFondo capaFondo= consola.getCapaFondo();
        capaFondo.setFondo(fondo);
        Teclado teclado= consola.getTeclado();
        teclado.leerCaracter();
    }
}
