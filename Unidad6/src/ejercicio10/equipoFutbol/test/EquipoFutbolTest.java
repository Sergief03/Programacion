package ejercicio10.equipoFutbol.test;

import ejercicio10.equipoFutbol.clases.*;
import ejercicio10.equipoFutbol.clases.Futbolista;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EquipoFutbolTest {
    @Test
    public void testPagarSueldoEmpleados() {
        // Crear el equipo de fútbol
        EquipoFutbol equipo = new EquipoFutbol("Granada CF", 1000);

        // Agregar los empleados en el orden indicado
        equipo.addEmpleados(new Entrenador("Iván", 100));
        equipo.addEmpleados(new CuerpoTecnico("Ana", 80, "Médico"));
        equipo.addEmpleados(new Futbolista("Pepe", 400, 10));
        equipo.addEmpleados(new Futbolista("Jorge", 450, 11));
        equipo.addEmpleados(new Futbolista("Jose", 380, 12));

        // Primar a los jugadores que corresponden
        for (Empleado empleado : equipo.getEmpleados()) {
            if (empleado instanceof Futbolista futbolista) {
                if (futbolista.getNombre().equals("Pepe") || futbolista.getNombre().equals("Jose")) {
                    futbolista.primar();
                }
            }
        }

        // Pagar sueldos
        equipo.pagarSueldoEmpleados();

        // Obtener empleados para verificar los sueldos recibidos
        List<Empleado> empleados = equipo.getEmpleados();

        // Verificar que los sueldos fueron asignados correctamente
        assertEquals(100, empleados.get(0).getDinero(),0.01);

        assertEquals(80, empleados.get(1).getDinero(),0.01);

        assertEquals(440, empleados.get(2).getDinero(),0.01);

        assertEquals(190, empleados.get(3).getDinero(),0.01);

        assertEquals(190, empleados.get(4).getDinero(),0.01);


    }

}