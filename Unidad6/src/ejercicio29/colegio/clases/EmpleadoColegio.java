package ejercicio29.colegio.clases;

import ejercicio10.equipoFutbol.clases.Empleado;

public abstract class EmpleadoColegio implements CalificacionListener{
    private String nombre;
    private String colegio;

    public EmpleadoColegio(String n,String c){
        this.nombre=n;
        this.colegio=c;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getColegio(){
        return this.colegio;
    }
}
