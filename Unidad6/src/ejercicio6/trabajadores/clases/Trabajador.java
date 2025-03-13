package ejercicio6.trabajadores.clases;

public class Trabajador {
    private String dni;
    private String nombre;
    protected int sueldo;

    public Trabajador(String nombre, int sueldo, int numDni,char letraDni){
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.dni=numDni+""+letraDni;
    }

    public int getSueldo(){
        return this.sueldo;
    }

    public String getNombre(){
        return this.getNombre();
    }

    public String getDni(){
        return this.dni;
    }
}
