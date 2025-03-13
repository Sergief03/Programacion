package clases;

public enum TipoCarta {
    NUMERO,SOTA,CABALLO,REY;

    public boolean esFigura(){
        boolean figura=false;
        if (this!=TipoCarta.NUMERO){
            figura=true;
        }
        return figura;
    }
}
