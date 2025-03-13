package clases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListaFotos implements ColeccionFotos{
    private List<Foto> fotos;

    public ListaFotos(ArrayList<Foto> fotos){
        this.fotos=fotos;
    }

    public ListaFotos(){
        this.fotos=new ArrayList<>();
    }

    public boolean añadir(String rutaArchivo){
        boolean añadir=true;

        try {
            this.fotos.add(Foto.cargarFoto(rutaArchivo));

        } catch (IOException e) {
            añadir=false;
        }

        return añadir;
    }

    @Override
    public int getnumeroFotos() {
        return this.fotos.size();
    }

    @Override
    public boolean existeFoto(String nombre) {
        boolean foto=false;

        if (getFoto(nombre).nombre().equals(nombre)){
            foto=true;
        }

        return foto;
    }

    @Override
    public Foto getFoto(String nombre) throws NoSuchElementException {
        boolean excepcion=true;
        Foto foto=null;
        for (Foto e: this.fotos){
            if (e.nombre().equals(nombre)){
                excepcion=false;
                foto=e;
            }
        }

        if (excepcion){
        throw new NoSuchElementException("La foto no existe en la colleccion");
        }

        return foto;
    }

    @Override
    public boolean borrarFoto(String nombre) {
        boolean borrar=false;
        if (existeFoto(nombre)){
            this.fotos.remove(getFoto(nombre));
            borrar=true;
        }
        return borrar;
    }

    @Override
    public List<Foto> getFotos(Tamaño tamaño) {
        List<Foto> fotos=new ArrayList<>();
        for (Foto e:this.fotos){
            if (Tamaño.getTamaño(e.alto(),e.ancho()).equals(tamaño)){
                fotos.add(e);
            }
        }
        return fotos;
    }
}
