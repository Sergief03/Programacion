import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int n=new Scanner(System.in).nextInt();

        for (int i=0;i<=n;i++){
            String asterisco="";
            for (int j=0;j<i;j++){
                asterisco+="*";
            }
            System.out.println(asterisco);
        }
    }
}
