package ejercicio6.trabajadores.clases;

public class TrabajadorTecleante extends Trabajador{
    private int pulsacionesMinuto;
    protected Teclado teclado;

    public TrabajadorTecleante(String n, int s, int nDni, char lDni,int ppm) {
        super(n, s, nDni, lDni);
        this.pulsacionesMinuto=ppm;
    }

    public void  setTeclado(Teclado t){
        this.teclado=t;
    }

    public Teclado getTeclado(){
        return this.teclado;
    }

    public int getPulsacionesMinuto(){
        return this.pulsacionesMinuto;
    }
}
