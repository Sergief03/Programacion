package clase;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ColeccionPalabras {
    private String ruta;
    private List<String> palabras;

    public ColeccionPalabras(String ruta){
        this.ruta=ruta;
        this.palabras=new ArrayList<>();
    }

    public void cargarPalabras() throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new FileReader(this.ruta));
        boolean continuar=true;
        String linea="";
        while (continuar){
            linea=bufferedReader.readLine();
            if (linea==null){
                continuar=false;
            }else {
                this.palabras.add(linea);
            }
        }
        bufferedReader.close();
    }

    public int getTotalPalabras(){
        return this.palabras.size();
    }

    public boolean quedanPalbras(){
        return this.palabras.isEmpty()? false:true;
    }

    public String getPalbraAleatoria(){
        String palabra=this.palabras.get(new Random().nextInt(0,this.palabras.size()));
        this.palabras.remove(palabra);
        return palabra;

    }
}
