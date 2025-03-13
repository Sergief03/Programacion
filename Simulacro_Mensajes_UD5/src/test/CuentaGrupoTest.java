package test;

import clases.CuentaGrupo;
import clases.CuentaPersonal;
import clases.Formato;
import clases.Mensaje;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CuentaGrupoTest {
    @Test
    public void testEnvioMensajeAGrupo() {
        CuentaPersonal a = new CuentaPersonal("a", "gmail.com");
        CuentaPersonal b = new CuentaPersonal("b", "gmail.com");
        CuentaPersonal c = new CuentaPersonal("c", "gmail.com");
        CuentaPersonal hermenegildo = new CuentaPersonal("hermenegildo", "ieshlanz.com");

        CuentaGrupo Test = new CuentaGrupo("Test", new CuentaPersonal[]{a, b, c});

        hermenegildo.enviarMensaje(Test, "¿Os llega?", Formato.TEXTO);

        for (CuentaPersonal miembro : new CuentaPersonal[]{a, b, c}) {
            List<Mensaje> mensajes = miembro.getMensajes(false);
            assertEquals(1, mensajes.size());
            assertEquals("¿Os llega?", mensajes.get(0).mensaje());
        }
    }
}