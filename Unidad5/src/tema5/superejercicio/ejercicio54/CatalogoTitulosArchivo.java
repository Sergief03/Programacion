package tema5.superejercicio.ejercicio54;

import tema5.superejercicio.ejercicio50.Estado;
import tema5.superejercicio.ejercicio51.Titulo;
import tema5.superejercicio.ejercicio52.CatalogoTitulos;
import tema5.superejercicio.ejercicio53.TituloArchivo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CatalogoTitulosArchivo implements CatalogoTitulos {
    private String ruta;
    private List<Titulo> titulos;

    public CatalogoTitulosArchivo(String ruta){
        this.ruta=ruta;
        this.titulos=new ArrayList<>();
        File file=new File(this.ruta);
        try {
            if (!file.createNewFile()){
                boolean continuar=true;
                BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
                while (continuar){
                    String linea=bufferedReader.readLine();
                    if ((linea==null)){
                        bufferedReader.close();
                        continuar=false;
                    }else {
                        this.titulos.add(extraerTitulo(linea));
                    }
                }
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    public static Titulo extraerTitulo(String linea){
        String[] partesLinea=linea.split(";");
        Estado estado = null;
        for (Estado e: Estado.values()){
            if (e.ordinal()==Integer.parseInt(partesLinea[3])){
                estado=e;
            }
        }
        return new TituloArchivo(partesLinea[0],partesLinea[1],partesLinea[2],estado);
    }

    @Override
    public List<Titulo> getTitulos() {
        return Collections.unmodifiableList(this.titulos);
    }

    @Override
    public boolean guardar() {
        boolean guardar=true;
        try {
            PrintWriter printWriter=new PrintWriter(this.ruta);
            for (Titulo e:this.titulos){
                printWriter.println(e.toString());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
           guardar=false;
        }

        return guardar;
    }

    @Override
    public boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado) {
        return this.titulos.add(new TituloArchivo(dni,nombre,estudio,estado));
    }
}

