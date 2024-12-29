import bpc.daw.mario.Luigi;
import bpc.daw.mario.Mario;

public class Ejercicio4 {
    public static void main(String[] args) {
        Luigi luigi= new Luigi(500);
        Mario mario=new Mario(luigi,50);

        double posLuigi= luigi.getDistanciaOrigen();
        double posMario= mario.getDistanciaOrigen();

        System.out.println("La posicion de marios es: "+ posMario+" \nLa posicion de Luigi es: "+posLuigi);


    }
}
