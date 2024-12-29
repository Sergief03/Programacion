import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();


        for (int i=0;i<10;i++){
            System.out.println("Introduce un numero: ");
            list.add(new Scanner(System.in).nextInt());
        }
        int mayor=list.get(0);
        int menor= list.get(0);
        int num=0;
        for (int i=0;i<10;i++){
            num =list.get(i);
            if (num>mayor){
                mayor=num;
            }
            if (num<menor){
                menor=num;
            }
        }
        System.out.println("El numero mayor es "+mayor+" y el numero menor es "+menor);
    }
}
