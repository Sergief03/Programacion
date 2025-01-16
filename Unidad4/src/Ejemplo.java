import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        String[] alumnos={"Pepe","Ana","Juan","Roberta"};
        int[] programacion={9,4,2,10};
        int [] baseDatos={5,8,5,10};
        int[] sistemas={4,6,10,10};
        int[] notaIPE={3,5,2,9};
        double media=0;
        System.out.println("Nota media de cada alumno: ");
        for (int i=0; i<alumnos.length;i++){
            media=((programacion[i]+baseDatos[i]+sistemas[i]+notaIPE[i])/(double)4);
            System.out.println(alumnos[i]+": "+media);
        }
    }
}

