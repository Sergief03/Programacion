package tema5.ejercicio39;

public class Banco implements Adinerado {
    private double dinero;

    public Banco(){
        this.dinero=0;
    }

    @Override
    public double getDineroTotal() {
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        this.dinero+=cantidad;
        return true;
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
