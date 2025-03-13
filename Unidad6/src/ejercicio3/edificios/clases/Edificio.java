package ejercicio3.edificios.clases;

public class Edificio {
    private String direccion;
    private int numeroPlantas;

    public Edificio(String d, int np){
        if (np>0){
            this.direccion=d;
            this.numeroPlantas=np;
        }
    }

    public String getDireccion(){
        return this.direccion;
    }

    public int getNumeroPlantas() {
        return this.numeroPlantas;
    }
}
