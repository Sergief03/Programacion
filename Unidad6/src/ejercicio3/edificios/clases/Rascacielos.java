package ejercicio3.edificios.clases;

public class Rascacielos extends Edificio{
    private int altura;

    public Rascacielos(String d, int np){
        super(d,np);
        this.altura=10+(np*3);
    }

    public int getAltura(){
        return this.altura;

    }
}
