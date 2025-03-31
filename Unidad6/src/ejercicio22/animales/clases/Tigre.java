package ejercicio22.animales.clases;

public class Tigre extends Animal{
    public Tigre(String n, int p) {
        super(n, p);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Grrr");
    }
}
