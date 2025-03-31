package ejercicio10.equipoFutbol.clases;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol implements Nombrable{
    private String nombre;
    private List<Empleado> empleados;
    private double presupuesto;

    public EquipoFutbol(String n, double p){
        this.nombre=n;
        this.presupuesto=p;
        this.empleados=new ArrayList<>();
    }

    public List<Empleado> getEmpleados(){
        return this.empleados;
    }

    public double getPresupuesto(){
        return this.presupuesto;
    }

    public void addEmpleados(Empleado e){
        if (e instanceof Entrenador) {
            for (Empleado emp : this.empleados) {
                if (emp instanceof Entrenador) {
                    throw new IllegalArgumentException("Ya existe un entrenador en el equipo.");
                }
            }
        }

        if (e instanceof Futbolista) {
            int contadorFutbolistas = 0;
            for (Empleado emp : this.empleados) {
                if (emp instanceof Futbolista) {
                    contadorFutbolistas++;
                }
            }
            if (contadorFutbolistas >= 25) {
                throw new IllegalArgumentException("El equipo no puede tener más de 25 futbolistas.");
            }
        }
        this.empleados.add(e);
    }

    public void pagarSueldoEmpleados(){
       double presupuesto=this.presupuesto;
       int totalEmpleados=this.empleados.size();
       for (Empleado e: this.empleados){
           double sueldo= e.getSueldo();
           if (e instanceof EmpleadoPrimable primable){
               if (primable.esPrimado()){
                   sueldo*=1.1;
               }
           }
           if (sueldo>presupuesto){

               try {
                   e.cobrar(presupuesto/totalEmpleados);
               }catch (CabreoException ex){
                   System.out.println(ex.getMessage()+" a "+e.getNombre());
               }
               presupuesto-=presupuesto/totalEmpleados;
           }else {

               try {
                   e.cobrar(sueldo);
               } catch (CabreoException ex) {
                   throw new RuntimeException(ex);
               }
               presupuesto-=sueldo;
           }
           totalEmpleados--;
       }
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
