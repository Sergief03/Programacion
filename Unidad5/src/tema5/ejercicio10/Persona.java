package tema5.ejercicio10;

import tema5.Ejercicio1.Dni;

import java.time.LocalDate;
import java.util.Random;

public class Persona {
    public String nombre;
    public Dni dni;
    public double sueldo;
    public LocalDate fechaNacimiento;
    public CuentaCorriente cuentaCorriente;

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

}
