public class Ejercicio21 {
    public static void main(String[] args) {
        int[] numeros=new int[5000];
        for (int i=0;i<numeros.length;i++){
            if (numeros[i]%2==1){
                numeros[i]=1;
            }
        }
        System.out.println(numeros);
    }
}