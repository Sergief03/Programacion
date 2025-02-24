package tema5.ejercicio39;

public interface Adinerado {
    public static int TRANSFERENCIA_MINIMA=1526;

    public abstract double getDineroTotal();
    public abstract boolean añadirDinero(int cantidad);
    public abstract boolean retirarDinero(int cantidad);
    public default boolean tieneDinero(){
        boolean respuesta=false;
        if (this.getDineroTotal()>0){
            respuesta=true;
        }

        return respuesta;
    }

    public default boolean transferirHacia(Adinerado receptor, double cantidad){
        boolean respuesta=false;
        if (cantidad>=Adinerado.TRANSFERENCIA_MINIMA){
            if (this.retirarDinero((int) cantidad)){
                receptor.añadirDinero((int) cantidad);
                respuesta=true;
            }
        }
        return respuesta;
    }

    public default boolean transferirDesde(Adinerado emisor, double cantidad){
        boolean respuesta=false;
        if (cantidad>=Adinerado.TRANSFERENCIA_MINIMA){
            if (emisor.retirarDinero((int) cantidad)){
                this.añadirDinero((int) cantidad);
                respuesta=true;
            }
        }
        return respuesta;
    }

    public default boolean transferir(Adinerado emisor,Adinerado receptor, double cantidad){
        boolean respuesta=false;
        if (cantidad>=Adinerado.TRANSFERENCIA_MINIMA){
            if (emisor.retirarDinero((int) cantidad)){
                receptor.añadirDinero((int) cantidad);
                respuesta=true;
            }
        }
        return respuesta;
    }

}
