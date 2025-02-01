package tema5.ejercicio16;

public class DniMejorado {
    private int numero;
    private char letra;

    public DniMejorado(int n){
        this.numero=n;
        this.letra=calcularLetra(n);
    }

    public int getNumero(){
        return this.numero;
    }

    public char getLetra(){
        return this.letra;
    }

    private char calcularLetra(int n){
        char[] letra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letra[n%23];
    }
}
