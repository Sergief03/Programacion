import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        String palabra="";
        for (int i=0;i<10;i++){
            list.add(i);
        }
        for (int i=0;i<10;i++){
            System.out.println(list.get(i));
        }
    }
}
