public class Ejercicio33 {
    public static void main(String[]args){
        int alumnos=26;
        double porcentajeAprobados=0.66;
        double porcentajeSuspenso=0.195;
        double porcentajeNoPresentado=1-(porcentajeSuspenso+porcentajeAprobados);

        System.out.println("El numero de alumnos que han aprobado es "+(int)(alumnos*porcentajeAprobados)+
                "\nEl numero de alumnos suspensos es "+(int)(alumnos*porcentajeSuspenso) +
                "\n El numero de alumnos no presentados es "+(int)(porcentajeNoPresentado*alumnos));
    }
}
