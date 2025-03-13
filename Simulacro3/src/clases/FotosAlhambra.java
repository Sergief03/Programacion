package clases;

import java.io.IOException;
import java.util.*;

public class FotosAlhambra implements ColeccionFotos{
    Map<String, Foto> fotosAlhambra;

    public FotosAlhambra(){
        this.fotosAlhambra=new HashMap<>();
        try {
            this.fotosAlhambra.put("ALHAMBRA_COLOR",Foto.cargarFoto("alhambra.jpg"));
            this.fotosAlhambra.put("ALHAMBRA_BN",Foto.cargarFoto("alhambra.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getnumeroFotos() {
        return this.fotosAlhambra.size();
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
        Foto foto=this.fotosAlhambra.get(nombre);
        if (foto.equals(null)){
            throw new NoSuchElementException("No se encuentra la foto");
        }
        return foto;
    }

    @Override
    public boolean borrarFoto(String nombre) {
        boolean borrar=true;
        if (this.fotosAlhambra.remove(nombre).equals(null)){
            borrar=false;
        }

        return borrar;
    }

    @Override
    public List<Foto> getFotos(Tamaño tamaño) {
        List<Foto> fotos=new ArrayList<>();
        Foto foto=null;
        for (String e:this.fotosAlhambra.keySet()){
            foto=getFoto(e);
            if (Tamaño.getTamaño(foto.alto(),foto.ancho()).equals(tamaño)){
                fotos.add(foto);
            }
        }
        return fotos;
    }
}
