package ejercicio22.animales.clases;

public class Jaula extends  ContenedorAnimales{
    private int capacidadMaxima;
    private int pesoMaximo;

    public Jaula(int cm,int pm){
        super();
        this.capacidadMaxima=cm;
        this.pesoMaximo=pm;
    }

    public int getCapacidadMaxima(){
        return this.capacidadMaxima;
    }

    public int getPesoMaximo(){
        return this.pesoMaximo;
    }

    @Override
    protected  boolean comprobarDisponibilidadPlaza(Animal a){
        boolean disponibilidad=false;
        if (super.getPesoActual()+a.getPeso()<=this.pesoMaximo&&super.getNumeroAnimales()<=this.capacidadMaxima){
            disponibilidad=true;
        }
        return disponibilidad;
    }
}
