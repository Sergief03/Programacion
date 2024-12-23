import bpc.daw.objetos.*;

import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        final int CAPACIDAD = 100;
        Random random = new Random();
        int cantidad = random.nextInt(101);
        DepositoAgua depositoAgua = new DepositoAgua(cantidad, CAPACIDAD);
        int litros = 0;

        while (litros < CAPACIDAD - cantidad) {
            depositoAgua.añadirLitro();
            litros++;
        }
        System.out.println("La cantidad inicial era: "+cantidad+"\nSe han añadido: "+litros);
    }
}
