package tema5.ejercicio31;

import tema5.ejercicio30.Altavoz;

public class EquipoMusica {
    private Altavoz[] altavoces;

    public EquipoMusica(int numeroAltavoces){
        this.altavoces=new Altavoz[numeroAltavoces];
        for (int i=0;i<this.altavoces.length;i++){
            this.altavoces[i]=new Altavoz();
        }
    }

    public Altavoz getAltavoz(int posicion){
        return this.altavoces[posicion];
    }

    public void setVolumen(int numeroAltavoz, int volumen){
        this.altavoces[numeroAltavoz].setVolumen(volumen);
    }
}
