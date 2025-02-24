package tema5.superejercicio.ejercicio56;

import org.junit.Test;
import tema5.superejercicio.ejercicio52.CatalogoTitulos;
import tema5.superejercicio.ejercicio55.TipoCatalogo;

import static org.junit.Assert.*;

public class CatalogoTitulosFactoryTest {
    @Test
    public void test1(){
        CatalogoTitulos catalogoTitulos=CatalogoTitulosFactory.getCatalogoTitulos(TipoCatalogo.ARCHIVO);
        assertNotNull(catalogoTitulos);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test2(){
        CatalogoTitulos catalogoTitulos=CatalogoTitulosFactory.getCatalogoTitulos(TipoCatalogo.BD_MOGODB);
        fail("No se ha lanzado ninguna excepcion");
    }

}