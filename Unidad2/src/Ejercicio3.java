import bpc.daw.mario.*;

import java.sql.SQLOutput;

public class Ejercicio3 {
    public static void main(String[] args) {
        Seta seta=new Seta(400,300);
        Mario mario=new Mario(300,300);
        Luigi luigi=new Luigi(mario,20);
        Planta planta=new Planta(400,500);
        Planta planta1=new Planta(450,500);
        Planta planta2=new Planta(500,500);
        Cañon cañon=new Cañon(100,300);

        seta.andarHacia(0,0);
        mario.saltar();
        cañon.disparar(320,300);
        planta1.comer(true);
        planta2.comer(true);
        planta.comer(true);

    }
}
