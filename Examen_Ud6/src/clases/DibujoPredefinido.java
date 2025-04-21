package clases;

public abstract class DibujoPredefinido extends Dibujo{
    private boolean inicializando;

    public DibujoPredefinido(int anchura, int altura) {
        super(anchura, altura);
        this.inicializando=true;
        añadirElementos();
        this.inicializando=false;
    }

    @Override
    public void añadir(ElementoDibujo e){
        if (this.inicializando==false){
            throw new IllegalStateException("El dibujo ha dejado de inicializarse");
        }
        super.añadir(e);
    }

    public abstract void añadirElementos();
}
