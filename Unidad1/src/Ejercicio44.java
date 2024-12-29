import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[]args){
       int suspensosAntonio=3;
       int suspensosJaime=8;
       int suspensosPedro=2;
       int suspensosManuel=0;
       int suspensosMaite=0;

       int numeroAntonio=0;
       int numeroJaime=1;
       int numeroPedro=2;
       int numeroManuel=3;
       int numeroMaite=4;

       String resultado="";

       System.out.println("Introduce tu numero de lista del 0 al 4");
       int numeroLista=new Scanner(System.in).nextInt();




       if (numeroLista==numeroAntonio){
           resultado="El alumno seleccionado es Antonio\nEl numero de suspensos es "+suspensosAntonio +((suspensosAntonio==0)? "\nPasa de curso":"\nNo pasa de curso");
       } else if (numeroLista==numeroJaime) {
           resultado="El alumno seleccionado es Jaime\nEl numero de suspensos es "+suspensosJaime +((suspensosJaime==0)? "\nPasa de curso":"\nNo pasa de curso");
       } else if (numeroLista==numeroPedro) {
           resultado="El alumno seleccionado es Pedro\nEl numero de suspensos es "+suspensosPedro +((suspensosPedro==0)? "\nPasa de curso":"\nNo pasa de curso");
       }if (numeroLista==numeroManuel) {
            resultado="El alumno seleccionado es Manuel\nEl numero de suspensos es "+suspensosManuel +((suspensosManuel==0)? "\nPasa de curso":"\nNo pasa de curso");
        }if (numeroLista==numeroMaite) {
            resultado="El alumno seleccionado es Maite\nEl numero de suspensos es "+suspensosMaite +((suspensosMaite==0)? "\nPasa de curso":"\nNo pasa de curso");
        }

        System.out.println(resultado);

    }
}
