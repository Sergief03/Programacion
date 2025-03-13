package ejercicio13.contraseñas.test;

import ejercicio13.contraseñas.clases.*;

public class Programa {
    public static void main(String[] args) {
        System.out.println("GeneradorContraseñas: "+new GeneradorContraseñas().generarContraseña(8));
        System.out.println("GeneradorContraseñasUnicas: "+new GeneradorContraseñasUnicas().generarContraseña(8));
        System.out.println("GeneradorContraseñasArchivo: "+new GeneradorContraseñasArchivo("contraseñas.txt").generarContraseña(8));
        System.out.println("GeneradorContraseñasInvertidas: "+new GeneradorContraseñasInvertidas().generarContraseña(8));
        System.out.println("GeneradorContraseñasRaras: "+new GeneradorContraseñasRaras().generarContraseña(8));
    }
}
