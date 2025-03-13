package clases;

import org.apache.commons.validator.routines.EmailValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CuentaPersonal implements EnviadorCorreo, ReceptorCorreo{
    private String direccionCorreo;
    private List<Mensaje> buzon;

    public CuentaPersonal(String direccion){
        if (!validarDireccion(direccion)){
            throw new IllegalArgumentException("La cuenta "+direccion+" es incorrecta");
        }
        this.direccionCorreo=direccion;
        this.buzon=new ArrayList<>();
    }

    public CuentaPersonal(String usuario, String dominio){
        this(usuario+"@"+dominio);
    }

    private static boolean validarDireccion(String direccion){
        return EmailValidator.getInstance().isValid(direccion);
    }

    public List<Mensaje> getMensajes(){
        return this.buzon;
    }

    public List<Mensaje> getMensajes(boolean estado){
        List<Mensaje> mensajes=new ArrayList<>();
        for (Mensaje e: this.buzon){
            if (estado){
                if (e.leido()){
                    mensajes.add(e);
                }
            }else {
                if (!e.leido()){
                    mensajes.add(e);
                }
            }
        }

        return mensajes;
    }

    public int leer(){
        int contador=0;
        for (Mensaje e:getMensajes(false)){
            this.buzon.remove(e);
            this.buzon.add(e.leer());
            contador++;
        }
        return contador;
    }

    public boolean guardarMensajes(String ruta){
        boolean guardar=true;
        try {
            FileWriter fileWriter=new FileWriter(ruta);
            for (Mensaje e:this.buzon){
                fileWriter.write(e.getLineaCSV());
            }

        } catch (IOException e) {
           guardar=false;
        }
        return guardar;
    }

    public void cargarMensajes(String ruta) throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new FileReader(ruta));
        String linea[]=null;
        while ((linea= bufferedReader.readLine().split(";")) !=null){
            this.buzon.add(new Mensaje(linea[0],linea[1],Boolean.valueOf(linea[2]),Formato.values()[Integer.parseInt(linea[3])]));
        }
    }

    @Override
    public String getDireccionCorreo() {
        return this.direccionCorreo;
    }


    @Override
    public String getNombre() {
        return this.direccionCorreo.substring(0,this.direccionCorreo.lastIndexOf("@"));
    }


    @Override
    public void recibirMensaje(Mensaje m) {
        this.buzon.add(m);
    }
}
