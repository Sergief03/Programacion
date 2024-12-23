import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[]args){
        System.out.println("Introduce una nota");
        int num=new Scanner(System.in).nextInt();
        String resultado="";

        if(num==10){
            resultado="Matricula";
        } else if (num>=9) {
            resultado="Sobresaliente";
        } else if (num>=7) {
            resultado="Notable";
        } else if (num>=6) {
            resultado="Bien";

        } else if (num>=5) {
            resultado="Suficiente";
        } else if (num<5) {
            resultado="Insuficiente";
        }
        System.out.println("Tu nota es: "+ resultado);
    }
}
