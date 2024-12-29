import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[]args){
        System.out.println("Introduce cual va a ser el valor de x en la funcion:");
        double funcionx=new Scanner(System.in).nextDouble();

        double funcion=(3*((funcionx/2)*(funcionx/2)*(funcionx/2)))/((funcionx*funcionx)-funcionx+3);

        System.out.println("El resultado de la funcion es:"+funcion);
    }
}
