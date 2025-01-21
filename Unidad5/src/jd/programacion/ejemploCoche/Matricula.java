package jd.programacion.ejemploCoche;

import java.util.Random;

public class Matricula {
    public int numero;
    public String letras;

    public Matricula(int n,String m){
        this.numero=(n>=0&&n<=9999)? n:1234;
        this.letras=(m.matches("[A-Z]{3}"))? m:"ABC";
    }

    public Matricula(int n,char d1,char d2,char d3){
        /*String m=""+d1+d2+d3;
        this.numero=(n>=0&&n<=9999)? n:1234;
        this.letras=(m.matches("(A-Z){3}"))? m:"ABC";
        */
         this(n,""+d1+d2+d3);
    }

    public Matricula(){
        /*this.numero=1234;
        this.letras="ABC";
         */
        this(1234,"ABC");
    }

    public Matricula(String m){
        /*
        this.numero=new Random().nextInt(0,10000);
        this.letras=(m.matches("(A-Z){3}"))? m:"ABC";
         */
        this(new Random().nextInt(0,10000),m);
    }
}
