package tema5.ejercicio19;

import tema5.ejercicio11.Dni;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private String nombre;
    private ArrayList<Persona> trabajadores;

    public Oficina(String nombre) {
        this(nombre, 0);
    }

    public Oficina(String nombre, int tipo) throws IllegalArgumentException{
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
        switch (tipo) {
            case 1 ->
                    trabajadores.add(new Persona("Antonio Pérez Pérez", new Dni(11111111, 'H'), 900, LocalDate.of(2000, 2, 28)));
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

        /*switch (tipo){
            case 3:   // añade a Ana (no hay break y así el case 3 incluirá también el 2)
                this.trabajadores.add(new Persona("Ana Díaz Díaz", new Dni("33333333P"),1200,LocalDate.of(1985,5,21)));
            case 2:   // añade a Luis
                this.trabajadores.add(new Persona("Luis López López",new Dni("22222222J"),1000,LocalDate.of(1995,9,10)));
            case 1:   // añade a Antonio
                this.trabajadores.add(new Persona("Antonio Pérez Pérez",new Dni("11111111H"),900, LocalDate.of(2000,2,28)));
            case 0: // no añade nada
            default:throw new IllegalArgumentException("Tipo incorrecto");
        }*/
    }

    public Oficina() {
        this("Industrias DAW", 3);
    }

    public void añdirEmpleado(Persona p) {
        trabajadores.add(p);
    }

    public void añadirEmpelado(String nombre, String Dni, double sueldo, LocalDate fechaNac) {
        trabajadores.add(new Persona(nombre, new Dni(Dni), sueldo, fechaNac));
    }

    public int getTotalEmpleados() {
        return this.trabajadores.size();
    }

    public int getTotalEmpleadosMileuristas() {
        int numeroMileuristas = 0;
        for (int i = 0; i < this.trabajadores.size(); i++) {
            if (this.trabajadores.get(i).esMileurista()) {
                numeroMileuristas++;
            }
        }
        return numeroMileuristas;
    }

    public List<Persona> getMileurista() {
        List<Persona> mileuristas = new ArrayList<>();
        for (int i = 0; i < this.trabajadores.size(); i++) {
            if (this.trabajadores.get(i).esMileurista()) {
                mileuristas.add(this.trabajadores.get(i));
            }
        }
        return mileuristas;
    }

    public boolean trabaja(Persona p) {
        for (Persona persona : this.trabajadores) {
            if (persona.getNombre().equals(p.getNombre()) &&
                    persona.getDni().numero == p.getDni().numero && persona.getDni().letra == persona.getDni().letra) {
                return true;
            }
        }
        return false;
    }

    public void pagarEmpleados() {
        for (int i = 0; i < this.trabajadores.size(); i++) {
            this.trabajadores.get(i).cobrarSueldo();
        }
    }

    public void mostrarInformeEmpleados() {
        for (int i = 0; i < this.trabajadores.size(); i++) {
            System.out.println("Nombre: " + this.trabajadores.get(i).getNombre() +
                    " | Sueldo: " + this.trabajadores.get(i).getSueldo() + "€" +
                    " | Mileurista: " + this.trabajadores.get(i).esMileurista());
        }
    }

    public Persona getEmpleado(int i) {
        if (this.trabajadores.size()<i){
            return this.trabajadores.get(0);
        }else {
            return this.trabajadores.get(i);
        }
    }

    public double getSueldoMedio() throws IOException {
        if (this.trabajadores.isEmpty()){
            double media=0;
            for (Persona e:this.trabajadores){
                media+=e.getSueldo();
            }

            return media/this.trabajadores.size();
        }else {
            throw new IOException("No hay trabajadores en la oficina");
        }


    }
}