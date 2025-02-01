package tema5.ejemploTDD;

import java.util.Random;

public class Coche {
    public String marca;
    public String matricula;
    public int velocidad;

    public Coche(String matricula, String marca, int velocidad) {
        this.marca = marca;
        this.matricula = matricula;
        if (velocidad < 0) {
            this.velocidad = 0;
        } else {
            this.velocidad = velocidad;
        }
    }

    public Coche(String marca){
        this(new Random().nextInt(1111,9999)+"XYZ",marca,0);
    }
}
