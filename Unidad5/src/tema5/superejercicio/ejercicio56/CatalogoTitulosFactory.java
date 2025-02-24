package tema5.superejercicio.ejercicio56;

import tema5.superejercicio.ejercicio52.CatalogoTitulos;
import tema5.superejercicio.ejercicio54.CatalogoTitulosArchivo;
import tema5.superejercicio.ejercicio55.TipoCatalogo;

public class CatalogoTitulosFactory {
    public static CatalogoTitulos getCatalogoTitulos(TipoCatalogo t) throws IllegalArgumentException{
        if (t.equals(TipoCatalogo.ARCHIVO)){
            return new CatalogoTitulosArchivo("Archivo ");
        }
        throw new IllegalArgumentException("Tipo de catalogo no soportado por el programa");
    }
}
