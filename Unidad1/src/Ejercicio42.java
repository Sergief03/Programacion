import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[]args){
        System.out.println("Introduce las distancias de los tres lados de un triangulo siendo el primer lado el de la hipotenusa:");
        double dis1=new Scanner(System.in).nextDouble();
        double dis2=new Scanner(System.in).nextDouble();
        double dis3=new Scanner(System.in).nextDouble();



        if ((dis1*dis1)==(dis2*dis2)+(dis3*dis3)){
            System.out.println("El triangulo es rectangulo");
        } else if ((dis1*dis1)<(dis2*dis2)+(dis3*dis3)) {
            System.out.println("El triangulo es acutangulo");
        } else if ((dis1*dis1)>(dis2*dis2)+(dis3*dis3)) {
            System.out.println("El triangulo es obtusangulo");
        }
    }
}
