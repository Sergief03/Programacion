package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public interface ColeccionFotos {
    public abstract int getnumeroFotos();
    public abstract boolean existeFoto(String nombre);
    public abstract Foto getFoto(String nombre) throws NoSuchElementException;
    public abstract boolean borrarFoto(String nombre);
    public abstract List<Foto> getFotos(Tamaño tamaño);
    public default List<Foto> getFotos(String[] nombres){
        List<Foto> fotos=new ArrayList<>();
        for (String e: nombres){
            try {
                if (existeFoto(e)){
                    fotos.add(getFoto(e));

                }
            }catch (NoSuchElementException x){

            }

        }
        return fotos;
    }

    public default boolean estaVacia(){
        boolean vacia=false;
        if (getnumeroFotos()==0){
            vacia=true;
        }
        return vacia;
    }
}
