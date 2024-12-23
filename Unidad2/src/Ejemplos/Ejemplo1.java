package Ejemplos;
import bpc.daw.mario.*;

public class Ejemplo1 {
    public static void main(String[] args) {
        Mario m= new Mario(700,300);
        Mario m2=new Mario();
        Luigi luigi=new Luigi();
        Mario m3=new Mario(luigi,0);
        Seta s=null;
    }
}
