package tema5.com.ieshlanz.titulos.clases;

import tema5.com.ieshlanz.titulos.clases.Estado;
import tema5.com.ieshlanz.titulos.clases.Titulo;

public class TituloArchivo  implements Titulo {
    private String dni;
    private String nombre;
    private String estudios;
    private Estado estado;

     TituloArchivo(String d, String n, String e, Estado s){
        this.dni=d;
        this.nombre=n;
        this.estudios=e;
        this.estado=s;
    }

    public String toString(){
        return this.dni+";"+this.nombre+";"+this.estudios+";"+this.estado.ordinal();
    }

    @Override
    public String getDni() {
        return this.dni;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getEstudios() {
        return this.estudios;
    }

    @Override
    public Estado getEstado() {
        return this.estado;
    }

    @Override
    public void setEstado(Estado e) {
        this.estado=e;
    }
}
