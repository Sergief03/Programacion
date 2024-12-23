import java.util.Scanner;

public class Ejercicio18B {
    public static void main(String[] args) {
        /*String[] alumnos={"Pepe","Ana","Juan","Roberta"};
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
        */
        System.out.println("Introduce el numero de alumnos que vas a tener: ");
        int numeroAlumnos=new Scanner(System.in).nextInt();
        String[] alumnos=new String[numeroAlumnos];
        for (int i=0;i<numeroAlumnos;i++){
            System.out.println("Introduce el nombre del alumno "+(i+1));
            alumnos[i]=new Scanner(System.in).nextLine();
        }
        int[] programacion=new int[numeroAlumnos];
        int[] baseDatos=new int[numeroAlumnos];
        int[] sistemas=new int[numeroAlumnos];
        int[] notaIpe=new int[numeroAlumnos];
        for (int i=0;i<numeroAlumnos;i++){
            System.out.println("Introduce la nota de programacion del alumno "+(i+1));
            programacion[i]=new Scanner(System.in).nextInt();
        }
        for (int i=0;i<numeroAlumnos;i++){
            System.out.println("Introduce la nota de base de datos del alumno "+(i+1));
            programacion[i]=new Scanner(System.in).nextInt();
        }
        for (int i=0;i<numeroAlumnos;i++){
            System.out.println("Introduce la nota de sistemas del alumno "+(i+1));
            programacion[i]=new Scanner(System.in).nextInt();
        }
        for (int i=0;i<numeroAlumnos;i++){
            System.out.println("Introduce la nota de IPE del alumno "+(i+1));
            programacion[i]=new Scanner(System.in).nextInt();
        }

        double media=0;
        for (int i=0; i<alumnos.length;i++){
            media=((programacion[i]+baseDatos[i]+sistemas[i]+notaIpe[i])/(double)4);
            System.out.println(alumnos[i]+": "+media);
        }
    }
}
