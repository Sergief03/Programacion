import bpc.daw.objetos.TarjetaCredito;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        TarjetaCredito tarjetaCredito=new TarjetaCredito(5000,1111);

        System.out.println("Introduce la contarseña");
        int contraseña=new Scanner(System.in).nextInt();

        try {
            int saldo =tarjetaCredito.getSaldo(contraseña);
            System.out.println("Tu saldo es de: "+saldo);
            tarjetaCredito.ingresarDinero(2000);
            saldo= tarjetaCredito.getSaldo(contraseña);
            System.out.println("Tu saldo es de: "+saldo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
