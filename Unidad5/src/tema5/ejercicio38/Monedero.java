package tema5.ejercicio38;

public class Monedero implements Adinerado{
    private double dinero;

    public Monedero(){
        this.dinero=0;
    }

    @Override
    public double getDineroTotal() {
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        boolean respuesta=true;
        if (this.dinero+cantidad>1000){
            respuesta=false;
        }else {
            this.dinero+=cantidad;
        }
        return respuesta;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        boolean respuesta=true;
        if (this.dinero<cantidad){
            respuesta=false;
        }else {
            this.dinero-=cantidad;
        }
        return respuesta;
    }
}
