import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        int[] pepe={9,5,4,3};
        int[] ana={4,8,6,5};
        int[] juan={2,5,10,2};
        int[] roberta={10,10,10,9};

        /*
        int [] pepe=new int[4];
        for (int i=0;i<4;i++){
            System.out.println("Introduce las nota "+i+" de pepe: ");
            pepe[i]=new Scanner(System.in).nextInt();
        }
        int [] ana=new int[4];
        for (int i=0;i<4;i++){
            System.out.println("Introduce las nota "+i+" de ana: ");
            pepe[i]=new Scanner(System.in).nextInt();
        }
        int [] juan=new int[4];
        for (int i=0;i<4;i++){
            System.out.println("Introduce las nota "+i+" de juan: ");
            pepe[i]=new Scanner(System.in).nextInt();
        }
        int [] roberta=new int[4];
        for (int i=0;i<4;i++){
            System.out.println("Introduce las nota "+i+" de roberta: ");
            pepe[i]=new Scanner(System.in).nextInt();
        }
        */
        int mediaPepe=0;
        int mediaAna=0;
        int mediaJuan=0;
        int mediaRoberta=0;
        for (int e:pepe){
            mediaPepe+=e;
        }
        for (int e:ana){
            mediaAna+=e;
        }
        for (int e:juan){
            mediaJuan+=e;
        }
        for (int e:roberta){
            mediaRoberta+=e;
        }
        System.out.println("Las medias de los alumnos son:\n" +
                "Pepe: "+(double)mediaPepe/pepe.length+"\n" +
                "Ana: "+(double)mediaAna/ana.length+"\n" +
                "Juan: "+(double)mediaJuan/juan.length+"\n" +
                "Roberta: "+(double)mediaRoberta/roberta.length);
    }
}
