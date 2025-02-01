package tema5.ejercicio11;

public class Dni {
    public int numero;
    public char letra;

    public Dni(int n, char l){
        this.numero=n;
        this.letra=l;
    }

    public Dni(String dni){
        this(Integer.parseInt(dni.substring(0,8)),dni.charAt(8));
    }
}
