import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

public class Ejercicio21 {
    public static void main(String[] args) {
        Consola consola=new Consola();
        CapaTexto capaTexto=consola.getCapaTexto();
        int fila=0;
        int columna=0;
        for (int i=1;i<21;i++ ){
                capaTexto.print(fila,columna,i+") En clase no se juega");
                fila++;
                if (i==10){
                    fila=0;
                    columna=30;
                }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
