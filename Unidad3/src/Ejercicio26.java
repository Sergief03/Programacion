import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        String frase1=new Scanner(System.in).nextLine();
        System.out.println("Introduce otra frase: ");
        String frase2=new Scanner(System.in).nextLine();

        if (frase1.length()==frase2.length()){
            for (int i=0;i<frase1.length();i++){
                String letra1=frase1.substring(i,i+1);
                String letra2=frase2.substring(i,i+1);
                if (!letra1.equals(letra2)){
                    System.out.println("En la posicion "+(i+1)+" difiera una letra");
                }
            }
        }else {
            System.out.println("Las frases no tienen la misma longitud");
        }
    }
}
