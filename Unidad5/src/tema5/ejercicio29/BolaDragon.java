package tema5.ejercicio29;

public class BolaDragon {
    private static final int MAXIMO_BOLAS=7;
    private static int siguientebola=1;
    private int numero;

    private BolaDragon(int numero){
        this.numero=siguientebola;
        siguientebola++;

    }

    public int getNumero(){
        return this.numero;
    }

    public static BolaDragon crearBolaDragon() throws Exception{
        if (siguientebola<=MAXIMO_BOLAS){
            return new BolaDragon(1);
        }else {
            throw new Exception("Ya se han creado 7 bolas de dragon");
        }
    }
}
