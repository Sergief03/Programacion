package test;

import clases.CuentaPersonal;
import clases.Formato;
import clases.Mensaje;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CuentaPersonalTest {
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void testCrearCuentaInvalida() {
        try {
            new CuentaPersonal("jose#hlanz");
            fail("Se esperaba una IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Test exitoso
        }
    }

    @Test
    public void testEnvioYRecepcionDeMensajes() {
        CuentaPersonal juan = new CuentaPersonal("juan", "hlanz.es");
        CuentaPersonal ana = new CuentaPersonal("ana", "gmail.com");

        juan.enviarMensaje(ana, "¿Vas a aprobar?", Formato.TEXTO);
        ana.enviarMensaje(juan, "Si", Formato.TEXTO);
        juan.enviarMensaje(ana, "<mensaje>Pues yo no</mensaje>", Formato.XML);

        List<Mensaje> mensajesAnaNoLeidos = ana.getMensajes(false);
        assertEquals( 2, mensajesAnaNoLeidos.size());

        int mensajesLeidos = ana.leer();
        assertEquals(2, mensajesLeidos);

        List<Mensaje> mensajesAnaLeidos = ana.getMensajes(true);
        assertEquals(2, mensajesAnaLeidos.size());
    }

}