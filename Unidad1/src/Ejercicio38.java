import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[]args){

        System.out.println("Introduce un numero comprendido entre el 10 y el 56: ");
        int num=new Scanner(System.in).nextInt();
        String resultado;


        if(num>56){
            resultado="Incorrecto";
        } else if (num>10) {
            resultado="Correcto";

        } else {
            resultado="incorrecto";
        }

        System.out.println(resultado);

    }
}
