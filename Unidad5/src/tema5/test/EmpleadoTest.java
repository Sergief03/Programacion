package tema5.test;

import tema5.ejercicio41.Empleado;

import java.util.List;


public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado antonio = new Empleado("Antonio", List.of(
                new Empleado("Juan", List.of(new Empleado("Diego"))),
                new Empleado("Paco", List.of(
                        new Empleado("Rafa", List.of(
                                new Empleado("Manuel"),
                                new Empleado("María José", List.of(
                                        new Empleado("Valentín"),
                                        new Empleado("Gema")
                                ))
                        )),
                        new Empleado("Ricardo")
                )),
                new Empleado("Alberto", List.of(new Empleado("Patricia")))
        ));
        antonio.mostrarSubordinados();
    }



}