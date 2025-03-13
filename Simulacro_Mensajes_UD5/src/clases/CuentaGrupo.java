package clases;

import java.util.ArrayList;
import java.util.List;

public class CuentaGrupo implements ReceptorCorreo{
    private String nombre;
    private List<CuentaPersonal> miembros;

    public CuentaGrupo(String nombre){
        this.nombre=nombre;
        this.miembros=new ArrayList<>();
    }

    public CuentaGrupo(String nombre,CuentaPersonal[] miembros){
        this.nombre=nombre;
        this.miembros=new ArrayList<>();
        for (CuentaPersonal e: miembros){
            this.miembros.add(e);
        }
    }

    public List<CuentaPersonal> getMiembros(){
        List<CuentaPersonal> cuentas=new ArrayList<>();
        for (CuentaPersonal e:this.miembros){
            cuentas.add(e);
        }
        return cuentas;
    }

    public void add(CuentaPersonal cuenta){
        this.add(cuenta);
    }

    public void add(CuentaGrupo cuenta){
        List<CuentaPersonal> cuentas=getMiembros();
        for (CuentaPersonal e: cuentas){
            this.miembros.add(e);
        }
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void recibirMensaje(Mensaje m) {
        for (CuentaPersonal e:this.miembros){
            e.recibirMensaje(m);
        }
    }
}
