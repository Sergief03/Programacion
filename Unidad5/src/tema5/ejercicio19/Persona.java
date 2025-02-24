package tema5.ejercicio19;

import tema5.ejercicio10.CuentaCorriente;
import tema5.ejercicio11.Dni;

import java.time.LocalDate;
import java.util.Random;

public class Persona {
    private String nombre;
    private Dni dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    private CuentaCorriente cuentaCorriente;

    public Persona(String n, Dni d, double s, LocalDate fn){
        this(n,d.numero,d.letra,s,fn);
    }

    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn){
        this.nombre=n;
        this.dni=new Dni(numDNI,letraDNI);
        this.sueldo=s;
        this.fechaNacimiento=fn;
        this.cuentaCorriente=new CuentaCorriente(new Random().nextInt(10000),0);

    }

    public Persona(String n, Dni d){
        this(n,d.numero,d.letra,900.0,LocalDate.of(LocalDate.now().getYear()-20,LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth()));
    }

    public Persona(String n, int numDNI, char letraDNI){
        this(n,numDNI,letraDNI,900.0,LocalDate.of(LocalDate.now().getYear()-20,LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth()));
    }

    public void aumentarSueldo(int porcentaje){
        this.sueldo=sueldo*(porcentaje+100)*0.01;
    }
    public void cobrarSueldo(){
        this.cuentaCorriente.saldo= cuentaCorriente.saldo+sueldo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Dni getDni(){
        return this.dni;
    }

    public double getSueldo(){
        return  this.sueldo;
    }

    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public CuentaCorriente getCuentaCorriente(){
        return this.cuentaCorriente;
    }

    public boolean esMayorEdad(){
        return LocalDate.now().isAfter(this.fechaNacimiento.plusYears(18));
    }

    public boolean esMileurista(){
        return this.sueldo<1200? true:false;
    }

}
