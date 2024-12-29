import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int a=new Scanner(System.in).nextInt();
        System.out.println("Introduce un numero: ");
        int b=new Scanner(System.in).nextInt();

        if (b<a){
            int temp=a;
            a=b;
            b=temp;
        }

        while (!(b==0)){
            int c=a%b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
}
