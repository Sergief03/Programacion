package tema5.ejercicio13;

public class Caja {
    private boolean abierto;
    private String mensaje;


    public Caja(boolean a, String m){
        this.abierto=a;
        this.mensaje=m;
    }
    public Caja(String m){
        this(false,m);
    }
    public Caja(){
        this(false,"Viva el tema 4");
    }

    public void setMensaje(String m){
        if (abierto){
            this.mensaje=m;
        }
    }

    public void pasarMayusculas(){
        this.mensaje=mensaje.toUpperCase();
    }

    public void abrir(){
        this.abierto=true;
    }

    public void  cerrar(){
        this.abierto=false;
    }

    public boolean esAbierta(){
        return this.abierto;
    }

    public String getMensaje(){
        return this.abierto==true? this.mensaje:null;
    }
}
