import bpc.daw.objetos.Caja;

public class Ejercicio9 {
    public static void main(String[] args) {
        String cajaMensaje="Bienvenido al instituto";
        Caja caja= new Caja(cajaMensaje);
        String  mensaje=caja.getMensaje();
        System.out.println(mensaje);

        caja.abrirCaja();
        mensaje=caja.getMensaje();
        System.out.println(mensaje);
    }
}
