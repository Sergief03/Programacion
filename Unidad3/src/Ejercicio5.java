import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        Random random=new Random();
        int num= 0;
        while (num!=10){
            num= random.nextInt(11);
            System.out.println(num);
        }
    }
}
