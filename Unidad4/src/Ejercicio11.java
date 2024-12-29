import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        String cadena="";
        String longitud="";
        for (int i=0;i<5;i++){
            System.out.println("Introduce una palabra");
            cadena=new Scanner(System.in).nextLine();
            list.add(cadena);
        }
        /*
        for (int i=0;i<5;i++){
            cadena+=i;
            list.add(cadena);
        }*/
        for (String e : list){
            if (e.length()>longitud.length()){
                longitud=e;
            }
        }
        System.out.println(longitud);
    }
}
