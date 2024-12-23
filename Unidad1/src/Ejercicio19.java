public class Ejercicio19 {
    public static  void main(String[]args){
        final int sueldo=200;
        final int precioAlumno=15;
        final int numAlumnos=30;
        final int pagaAlumno=100;

        int totalEstudiante=sueldo+precioAlumno*numAlumnos;
        int ganancia=numAlumnos*pagaAlumno-totalEstudiante;

        System.out.println("El estudiante que da clases gana: "+totalEstudiante);
        System.out.println("La academia gana:"+ganancia);
    }
}
