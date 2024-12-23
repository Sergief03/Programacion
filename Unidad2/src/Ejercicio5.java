import bpc.daw.mario.*;
import bpc.daw.mario.Cañon;

import java.sql.SQLOutput;

public class Ejercicio5 {
    public static void main(String[] args) {
        Cañon cañon1=new Cañon(200,300);
        Cañon cañon2=new Cañon(200,350);


        cañon1.disparar(300,300);
        cañon1.disparar(300,300);
        cañon2.disparar(300,350);
        cañon2.disparar(300,350);
        cañon2.disparar(300,350);

        int disparos1= cañon1.getTotalDisparosRealizados();
        int disparos2= cañon2.getTotalDisparosRealizados();


        System.out.printf("El primer cañor ha disparado: "+disparos1+"\nEl segundo cañon ha disparado: "+disparos2);


    }
}
