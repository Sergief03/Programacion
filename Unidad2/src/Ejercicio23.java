import bpc.daw.objetos.TarjetaCredito;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        TarjetaCredito tarjetaCredito=new TarjetaCredito(1000,2222);
        System.out.println("Intrdoduce la contraseña: ");
        int contraseña=new Scanner(System.in).nextInt();

        try {
            System.out.println("Tu saldo es de: "+tarjetaCredito.getSaldo(contraseña));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tarjetaCredito.ingresarDinero(100);

        try {
            System.out.println("Tu saldo es de: "+tarjetaCredito.getSaldo(contraseña));
            tarjetaCredito.sacarDinero(2800,contraseña);
            System.out.println("Tu saldo es de: "+tarjetaCredito.getSaldo(contraseña));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
