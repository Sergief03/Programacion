package ejercicio22.animales.clases;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class ContenedorAnimales {
    protected List<Animal> animales;

    public ContenedorAnimales(){
        this.animales= new ArrayList<>();
    }

    public boolean añadir(Animal a){
        boolean añadir=false;
        if (comprobarDisponibilidadPlaza(a)){
            a.setEncerrado(true);
            this.animales.add(a);
            añadir=true;
        }
        return añadir;
    }

    public boolean retirar(Animal a){
        return this.animales.remove(a);
    }

    public int getPesoActual(){
        int peso=0;
        for (Animal a:this.animales){
            peso+=a.getPeso();
        }
        return peso;
    }

    public int getNumeroAnimales(){
        return this.animales.size();
    }

    protected abstract boolean comprobarDisponibilidadPlaza(Animal a);

}
