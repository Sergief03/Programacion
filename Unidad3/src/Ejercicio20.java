import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

public class Ejercicio20 {
    public static void main(String[] args) {
        Consola consola=new Consola();
        CapaTexto capaTexto=consola.getCapaTexto();
        int filaPar=1;
        int filaImpar=1;
        for (int i=1;i<21;i++ ){
            if (i%2==1){
                capaTexto.print(filaPar,0,i+") En clase no se juega");
                filaPar++;
            }else {
                capaTexto.print(filaImpar,30,i+") En clase no se juega");
                filaImpar++;
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
