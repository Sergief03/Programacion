import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){
        System.out.println("Introduce el dia de la semana que sera la reunión");
        String diaSemana=new Scanner(System.in).nextLine();
        System.out.println("Introduce el mes en el que sera la reunión");
        String mes=new Scanner(System.in).nextLine();
        System.out.println("Introduce tu curso");
        String cursoNombre= new Scanner(System.in).nextLine();
        System.out.println("introduce tu instituto");
        String instituto=new Scanner(System.in).nextLine();
        System.out.println("Introduce tu localidad");
        String localidad=new Scanner(System.in).nextLine();
        System.out.println("Introduce la hora de la reunión");
        int horas=new Scanner(System.in).nextInt();
        System.out.println("introduce los minutos en los que sera la reunión");
        int minutos=new Scanner(System.in).nextInt();
        System.out.println("Introduce el número del curso l que vas a entrar");
        int curso=new Scanner(System.in).nextInt();
        System.out.println("Introduce el dia en el que sera la reunión");
        int dia=new Scanner(System.in).nextInt();
        System.out.println("El "+diaSemana+" día "+dia+" de "+mes+" tendrá lugar la reunión de evaluación del "+curso+" ºcurso de "+cursoNombre+" en el "+instituto+" de "+localidad+" .Los profesores calificarán al alumnado y se prevé que a las "+horas+" : "+minutos+" horas las notas estén publicadas en el tablón de anuncios del centro ");

    }
}
