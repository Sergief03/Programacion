package ejercicio13.contraseñas.clases;

import java.io.*;
import java.util.Random;

public class GeneradorContraseñasArchivo extends GeneradorContraseñas{
    private File archivo;

    public GeneradorContraseñasArchivo(String ruta){
        this(ruta,new Random());
    }

    public GeneradorContraseñasArchivo(String ruta, Random r){
        super(r);
        this.archivo=new File(ruta);
    }

    @Override
    public String generarContraseña(int longitud){
        boolean continuar=true;
        String contraseña="";
        String linea="";

        try {
            FileWriter printWriter=new FileWriter(this.archivo,true);

            while (continuar) {
                contraseña = super.generarContraseña(longitud);
                continuar=false;
                if (this.archivo.exists()){
                    BufferedReader bufferedReader=new BufferedReader(new FileReader(this.archivo));
                    while ((linea=bufferedReader.readLine()) != null ) {
                        if (linea.equals(contraseña)) {
                            continuar = true;
                        }
                    }
                }
            }
            printWriter.write(contraseña+"\n");
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return contraseña;
    }
}
