package ejercicio2.persona.clases;

public interface Persona {
    public abstract String getNombre();
    public abstract String getApellido();
    public abstract String getApellido2();
    public default String[] getApellidos(){
        return new String[]{getApellido(),getApellido2()};
    };
    public abstract Direccion getDireccion();
    public abstract String getTelefono();
    public abstract EstadoCivil getEstadoCivil();
    public abstract Persona getPareja();

    int getEdad();
}
