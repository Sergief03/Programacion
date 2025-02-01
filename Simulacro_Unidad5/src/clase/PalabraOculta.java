package clase;

public class PalabraOculta {
    private String palabra;
    private boolean[] aciertos;

    public PalabraOculta(String p){
        this.palabra=p;
        this.aciertos=new boolean[p.length()];
        for (int i=0;i<p.length();i++){
            this.aciertos[i]=false;
        }
    }

    public int probarLetra(char letra){
        int contador=0;
        for (int i=0;i< aciertos.length;i++){
            if (letra == palabra.charAt(i)){
                this.aciertos[i]=true;
                contador++;
            }
        }
        return contador;
    }

    public int getLetrasRestantes(){
        int contador=0;
        for (int i=0;i< aciertos.length;i++){
            if (false==aciertos[i]){
                contador++;
            }
        }
        return contador;
    }

    public boolean palabraAcertada(){
        boolean palabraAcertada=true;
        for (int i=0;i< aciertos.length;i++){
            if (false==aciertos[i]){
                palabraAcertada=false;
            }
        }
        return palabraAcertada;
    }

    public String toString(){
        String palabra="";
        for (int i=0;i< aciertos.length;i++){
            if (false==aciertos[i]){
                palabra+="-";
            }else {
                palabra+=this.palabra.charAt(i);
            }
        }
        return palabra;
    }
}
