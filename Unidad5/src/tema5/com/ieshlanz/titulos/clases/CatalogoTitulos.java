package tema5.com.ieshlanz.titulos.clases;

import tema5.com.ieshlanz.titulos.clases.Estado;
import tema5.com.ieshlanz.titulos.clases.Titulo;

import java.util.List;
import java.util.NoSuchElementException;

public interface CatalogoTitulos {
    public abstract List<Titulo> getTitulos(); ;
    public abstract boolean guardar();
    public abstract boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado);
    public default Titulo getTitulo(String dni) throws NoSuchElementException {
        List<Titulo> titulos=getTitulos();
        Titulo titulo=null;
        for (Titulo t: titulos){
            if (t.getDni().equals(dni)){
                titulo= t;
            }
        }

        if (titulo==null){
            throw new NoSuchElementException("No se encuentra un titulo con ese dni");
        }

        return titulo;
    }
}
