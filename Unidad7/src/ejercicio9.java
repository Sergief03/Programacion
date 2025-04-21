import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ejercicio9 {
    public static class Empleado{
        private String nombre;
        private String departamento;
        private double sueldo;

        public Empleado(String nombre, String departamento,double sueldo){
            this.nombre=nombre;
            this.departamento=departamento;
            this.sueldo=sueldo;
        }

        public String getNombre(){return this.nombre;}
        public String getDepartamento(){return  this.departamento;}
        public double getSueldo(){return this.sueldo;}
        public void setNombre(String n){this.nombre=n;}
        public void setDepartamento(String d){this.departamento=d;}
        public void setSueldo(double s){this.sueldo=s;}
    }

    public static void main(String[] args) {
        List<Empleado> empleados=new ArrayList<>(List.of(
                new Empleado("Juan Perez", "Informática", 1200),
                new Empleado("Antonio Castillo", "Contabilidad", 1500),
                new Empleado("María López", "Informática", 1500),
                new Empleado("Luis Martínez", "Informática", 2000),
                new Empleado("Rigoberta Pérez", "Contabilidad", 4000)
        ));
        //a
        empleados.removeIf(emp->emp.sueldo>=2500);
        //b
        empleados.forEach(emp->emp.setSueldo(emp.sueldo*1.1));
        //c
        try {
            PrintWriter printWriter=new PrintWriter("empresa.txt");
            empleados.forEach(emp-> printWriter.println("Empleado: "+emp.nombre+" Sueldo: "+emp.sueldo));
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
