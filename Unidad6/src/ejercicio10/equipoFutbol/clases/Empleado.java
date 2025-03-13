package ejercicio10.equipoFutbol.clases;

public class Empleado implements Nombrable{
    private String nombre;
    private double sueldo;
    private double dinero;

    public Empleado(String n, double s){
        this.nombre=n;
        this.sueldo=s;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public double getDinero(){
        return this.dinero;
    }

    public void cobrar(double cantidad) throws  CabreoException{
        this.dinero+=cantidad;
        if (cantidad<this.sueldo){
            throw new CabreoException("No se ha dado el sueldo completo");
        }
    }


}
