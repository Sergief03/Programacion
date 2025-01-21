package tema5.Ejercicio2;

public class Caja {
    public boolean abierto;
    public String mensaje;


    public  Caja(boolean a,String m){
        this.abierto=a;
        this.mensaje=m;
    }
    public  Caja(String m){
        this(false,m);
    }
    public Caja(){
        this(false,"Viva el tema 4");
    }
}
