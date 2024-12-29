import bpc.daw.objetos.DepositoAgua;

import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        Random random= new Random();
        DepositoAgua depositoAgua1=new DepositoAgua(random.nextInt(1001),1000 );
        DepositoAgua depositoAgua2=new DepositoAgua(random.nextInt(1001),1000 );
        int cantidadI1=depositoAgua1.getCantidadActual();
        int cantidadI2=depositoAgua2.getCantidadActual();
        int litros=0;
        while (cantidadI2 != cantidadI1) {
            if (cantidadI1>cantidadI2){
                depositoAgua1.retirarLitro();
                depositoAgua2.añadirLitro();
                litros++;
            }else {
                depositoAgua2.retirarLitro();
                depositoAgua1.añadirLitro();
                litros++;
            }
            System.out.println("Capacida inicial deposito1: "+cantidadI1+
                    "\nCapacidad inicial deposito2: "+cantidadI2+
                    "\nCapacidad actual de los depositos: "+depositoAgua2.getCantidadActual()+
                    "\nLitros intercambiados: "+litros);
        }

    }
}
