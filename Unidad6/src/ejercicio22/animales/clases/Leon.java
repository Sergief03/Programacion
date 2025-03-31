package ejercicio22.animales.clases;

public class Leon extends Animal{
    public Leon(String n, int p) {
        super(n, p);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Roarr");
    }
}
