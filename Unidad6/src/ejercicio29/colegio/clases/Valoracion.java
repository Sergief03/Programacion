package ejercicio29.colegio.clases;

public enum Valoracion {
    MUY_DEFICIENTE, INFUFICIENTE,SUFICIENTE, BIEN ,NOTABLE, SOBRESALIENTE;

    public boolean esAprobado(){
        return this.ordinal()>1;
    }

    public boolean esSuspenso(){
        return (!this.esAprobado());
    }
}
