import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[]args){
        double nota1=6.5;
        double nota2=4.2;
        double nota3=5.75;
        double nota4=3.5;
        double nota5=8;
        int faltas=10;

        if (faltas<10&&faltas>=0){
            double media=(nota1+nota2+nota3+nota4+nota5)/5;

            System.out.println("Estas aprobado?"+(media>=5));
        }
        if((faltas>=10)&&(faltas<=20)){
            double media=(nota1+nota2+nota3+nota4+nota5)/5;
            System.out.println("Estas aprobado?"+(media>=7));

        }else{
            System.out.println("Estas suspenso");
        }

    }
}


/*public class Ejercicio30 {
    public static void main(String[]args){
        System.out.println("Intrdouce la noat de tus 5 examenes");
        double nota1=new Scanner(System.in).nextDouble();
        double nota2=new Scanner(System.in).nextDouble();
        double nota3=new Scanner(System.in).nextDouble();
        double nota4=new Scanner(System.in).nextDouble();
        double nota5=new Scanner(System.in).nextDouble();

        System.out.println("Introduce tu numero de faltas");
        int faltas=new Scanner(System.in).nextInt();


        if (faltas<10){
            double media=(nota1+nota2+nota3+nota4+nota5)/5;

            System.out.println("Estas aprobado?"+(media>=5));
        }
        if((faltas>=10)&&(faltas<=20)){
            double media=(nota1+nota2+nota3+nota4+nota5)/5;
            System.out.println("Estas aprobado?"+(media>=7));

        }else{
            System.out.println("Estas suspenso");
        }

    }
}*/