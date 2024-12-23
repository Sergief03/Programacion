import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(random.nextInt(101));
        }
        System.out.println("Introduce un numero: ");
        int numero=new Scanner(System.in).nextInt();
        if (list.contains(numero)){
            System.out.println("El numero esta en la lista");
        }else {
            System.out.println("El numero no esta en la lista");
        }
    }
}
