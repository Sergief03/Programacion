package tema5.com.ieshlanz.titulos.clases;

import tema5.com.ieshlanz.titulos.clases.CatalogoTitulos;
import tema5.com.ieshlanz.titulos.clases.CatalogoTitulosArchivo;
import tema5.com.ieshlanz.titulos.clases.TipoCatalogo;

public class CatalogoTitulosFactory {
    public static CatalogoTitulos getCatalogoTitulos(TipoCatalogo t) throws IllegalArgumentException{
        if (t.equals(TipoCatalogo.ARCHIVO)){
            return new CatalogoTitulosArchivo("titulos.csv");
        }
        throw new IllegalArgumentException("Tipo de catalogo no soportado por el programa");
    }
}
