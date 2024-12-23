import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int a=new Scanner(System.in).nextInt();
        System.out.println("Introduce un numero: ");
        int b=new Scanner(System.in).nextInt();

        boolean mcd=true;
        if (a<b){
            for (int i=a;i>0&&mcd;i--){
                if (a%i==0&&b%i==0){
                    System.out.println("El minimo comun multiplo es: "+ i);
                    mcd=false;
                }
            }
        }else {
            for (int i=b;i>0&&mcd;i--){
                if (a%i==0&&b%i==0){
                    System.out.println("El minimo comun multiplo es: "+ i);
                    mcd=false;
                }
            }
        }
    }
}
