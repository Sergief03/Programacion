import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String resultado=null;

        System.out.println("Introduce un numero: ");
        int a=new Scanner(System.in).nextInt();
        System.out.println("Introduce otro numero entre el que  dividir el primero: ");
        int b=new Scanner(System.in).nextInt();

        if(b==0){
            resultado="No se puede dividir entre cero";
        }else {
            System.out.println("¿Quieres sacar decimales? 1=si, 2=no");
            int pregunta=new Scanner(System.in).nextInt();
            if (pregunta==1){
                resultado="El resultado de la division es: "+((double)a/b);
            } else if (pregunta==2) {
                resultado="El resultado de la division es: "+(a/b)+", el resto es: "+(a%b);
            }else {
                resultado="Opción incorrecta";
            }
        }

        System.out.println(resultado);
    }
}
