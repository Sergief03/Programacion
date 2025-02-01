package tema5.ejercicio11;

import tema5.Ejercicio1.Dni;
import tema5.ejercicio11.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Oficina {
    public String nombre;
    public ArrayList<Persona> trabajadores;

    public Oficina(String nombre){
        this(nombre,0);
    }

    public Oficina(String nombre, int tipo){
        this.nombre=nombre;
        this.trabajadores = new ArrayList<>();
        switch (tipo) {
            case 1 -> trabajadores.add(new Persona("Antonio Pérez Pérez", new Dni(11111111, 'H'), 900, LocalDate.of(2000, 2, 28)));
            case 2 -> {
                trabajadores.add(new Persona("Antonio Pérez Pérez", new Dni(11111111, 'H'), 900, LocalDate.of(2000, 2, 28)));
                trabajadores.add(new Persona("Luis López López", new Dni(22222222, 'J'), 1000, LocalDate.of(1995, 9, 10)));
            }
            case 3 -> {
                trabajadores.add(new Persona("Antonio Pérez Pérez", new Dni(11111111, 'H'), 900, LocalDate.of(2000, 2, 28)));
                trabajadores.add(new Persona("Luis López López", new Dni(22222222, 'J'), 1000, LocalDate.of(1995, 9, 10)));
                trabajadores.add(new Persona("Ana Díaz Díaz", new Dni(33333333, 'P'), 1200, LocalDate.of(1985, 5, 21)));
            }
        }
    }

    public Oficina(){
        this("Industrias DAW", 3);
    }

    public void añdirEmpleado(Persona p){
        trabajadores.add(p);
    }

    public void añadirEmpelado(String nombre,String Dni,double sueldo,LocalDate fechaNac) {
        trabajadores.add(new Persona(nombre,new Dni(Dni),sueldo,fechaNac));
    }
}
