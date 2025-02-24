package tema5.ejercicio41;

import java.util.ArrayList;
import java.util.List;

public record Empleado(String nombre, List<Empleado> subordinados) {


    public Empleado(String nombre){
        this(nombre,new ArrayList<>());
    }

    public void mostrarSubordinados(){
        System.out.println(this.nombre);
        mostrarSubordinados(1);
    }

    private void mostrarSubordinados(int tabs){
        for (Empleado e:this.subordinados){
            for (int i=0; i<tabs;i++){
                System.out.print("-");
            }
            System.out.print(e.nombre+"\n");
            e.mostrarSubordinados(tabs+1);
        }
    }
}
