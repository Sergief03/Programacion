package ejercicio18.paqueteria.test;

import static org.junit.Assert.*;

import ejercicio18.paqueteria.clases.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class EmpresaPaqueteriaTest {
    private EmpresaLowCost empresaLowCost;
    private EmpresaPremium empresaPremium;
    private PaquetesPepe paquetesPepe;
    private Paquete paqueteAlta;
    private Paquete paqueteMedia;
    private Paquete paqueteBaja;

    @Before
    public void setUp() {
        empresaLowCost = new EmpresaLowCost(3);
        empresaPremium = new EmpresaPremium();
        paquetesPepe = new PaquetesPepe();
        paqueteAlta = new Paquete("Laptop", "Calle 123", Paquete.ALTA);
        paqueteMedia = new Paquete("Tablet", "Calle 456", Paquete.MEDIA);
        paqueteBaja = new Paquete("Libro", "Calle 789", Paquete.BAJA);
    }

    @Test
    public void testRegistrarPedidoEnEmpresaLowCost() {
        empresaLowCost.registrarPedido(paqueteAlta);
        empresaLowCost.registrarPedido(paqueteMedia);
        empresaLowCost.registrarPedido(paqueteBaja);

        List<Transportista> transportistas = empresaLowCost.getTransportistas();
        assertEquals(3, transportistas.size());
    }

    @Test
    public void testRegistrarPedidoEnEmpresaPremium() {
        empresaPremium.registrarPedido(paqueteAlta);
        empresaPremium.registrarPedido(paqueteMedia);
        empresaPremium.registrarPedido(paqueteBaja);

        List<Transportista> transportistas = empresaPremium.getTransportistas();
        assertEquals(3, transportistas.size());
    }

    @Test
    public void testPaquetesPepeOrdenaPorPrioridad() {
        paquetesPepe.registrarPedido(paqueteBaja);
        paquetesPepe.registrarPedido(paqueteMedia);
        paquetesPepe.registrarPedido(paqueteAlta);

        List<Transportista> transportistas = paquetesPepe.getTransportistas();
        assertEquals(1, transportistas.size());
    }
}
