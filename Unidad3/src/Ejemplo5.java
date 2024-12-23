import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        int num=1;
        int suma=0;

        while (!(num==0)){
            System.out.println("Introduce un numero");
            num=new Scanner(System.in).nextInt();
            suma=suma+num;
        }
        System.out.println("La suma es de todos los numeros es: "+suma);
    }
}
