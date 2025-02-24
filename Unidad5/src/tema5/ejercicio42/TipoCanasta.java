package tema5.ejercicio42;

public enum TipoCanasta {
    TIRO_LIBRE (1) , CANASTA_NORMLA(2), TRIPLE(3);

    private final int valor;

    TipoCanasta(int valor){
        this.valor=valor;
    }

    public int getValor(){
        return valor;
    }
}
