import java.util.Scanner;

public class Ejercicio3B {
    public static void main(String[] args) {
        char letraCentral = 0;

        System.out.println("Escribe una palabra:");
        String palabra=new Scanner(System.in).nextLine();

        int longitud=palabra.length();
        int mitad=longitud/2;
        switch (longitud%2){
            case 1->{
                letraCentral=palabra.charAt(mitad);


            }
            case 0->{
                System.out.println("Hay dos posibles letras centrales.¿Quieres la de la izquierda (i) o la de la derecha (d)?");
                String letra=new Scanner(System.in).nextLine();
                letraCentral=switch (letra){
                    case "i", "I"->
                        palabra.charAt(mitad-1);

                    case "d", "D" ->
                        palabra.charAt(mitad);

                    default -> throw new IllegalStateException("Unexpected value: " + letra);
                };

            }

        }
        System.out.println("La letra del medio es: "+letraCentral);
    }
}
