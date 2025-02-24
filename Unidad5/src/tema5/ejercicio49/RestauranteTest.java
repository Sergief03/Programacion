package tema5.ejercicio49;

import org.junit.Test;
import tema5.ejercicio49.Restaurante;

import java.util.List;

import static org.junit.Assert.*;

public class RestauranteTest {
    @Test
    public void testInicializacionNombreYPrecios() {
        Restaurante restaurante = new Restaurante("La Buena Mesa");

        assertEquals("La Buena Mesa", restaurante.getNombre());

        assertEquals(5, restaurante.getPrecio("bocadillo"));
        assertEquals(15, restaurante.getPrecio("fillete"));
        assertEquals(8, restaurante.getPrecio("sopa"));
        assertEquals(9, restaurante.getPrecio("ensalada"));
        assertEquals(30, restaurante.getPrecio("caviar"));
    }

    @Test
    public void testDisponibilidadPlatos() {
        Restaurante restaurante = new Restaurante("La Buena Mesa");

        assertTrue(restaurante.estaDisponible("bocadillo"));
        assertTrue(restaurante.estaDisponible("sopa"));
        assertTrue(restaurante.estaDisponible("fillete"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrecioCalamares() {
        Restaurante restaurante = new Restaurante("La Buena Mesa");

        restaurante.getPrecio("calamares");
    }

    @Test
    public void testNoHayCalamares() {
        Restaurante restaurante = new Restaurante("La Buena Mesa");

        assertFalse(restaurante.estaDisponible("calamares"));
    }

    @Test
    public void testPlatosCaros() {
        Restaurante restaurante = new Restaurante("La Buena Mesa");

        List<String> platosBaratos =restaurante.getPlatosBaratos();

        assertEquals(3, platosBaratos.size());
        assertTrue(platosBaratos.contains("bocadillo"));
        assertTrue(platosBaratos.contains("sopa"));
        assertTrue(platosBaratos.contains("ensalada"));
    }

    @Test
    public void testCuenta() {
        Restaurante restaurante = new Restaurante("La Buena Mesa");

        String[] platosConsumidos = {"bocadillo", "fillete", "caviar"};
        assertEquals(50, restaurante.getCuenta(platosConsumidos));
    }
}