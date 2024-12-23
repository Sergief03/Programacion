import bpc.daw.mario.Mario;
import bpc.daw.mario.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Mario mario=new Mario(100);
        Mario mario1=new Mario(640,320);

        Seta seta=new Seta(0,0);
        Cañon cañon=new Cañon(100,320);
        Planta planta=new Planta(400,500);
        Planta planta1=new Planta(450,500);
        Planta planta2=new Planta(500,500);
        Luigi luigi=new Luigi(200);
        Mario mario2=new Mario(luigi,50);
        cañon.disparar(640,320);
        mario.andarHacia(100,0);
    }

}
