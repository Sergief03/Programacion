package tema5.ejercicio33;


import java.util.ArrayList;
import java.util.List;

public class Notas {
    private List<Double> notas;

    public Notas(){
        this.notas=new ArrayList<>();
    }

    public void añadirNota(double n){
        this.notas.add(n);
    }

    public int getTotalNotas(){
        return this.notas.size();
    }

    public double calcularNotaMedia()throws IllegalArgumentException{
        if (this.notas.isEmpty()){
            throw new IllegalArgumentException("No hay notas para calcular la media");
        }else {
            double media=0;
            for (int i=0;i<this.notas.size();i++){
                media+= this.notas.get(i);
            }
            return media/this.notas.size();
        }

    }

    public double calcularNotaMaxima() throws IllegalArgumentException{
        if (this.notas.isEmpty()){
            throw new IllegalArgumentException("No hay notas para calcular la nota maxima");
        }else {
            double notaMax=0;
            for (int i=0;i<this.notas.size();i++){
                if (this.notas.get(i)>notaMax){
                    notaMax= this.notas.get(i);
                }

            }
            return notaMax;
        }
    }
}
