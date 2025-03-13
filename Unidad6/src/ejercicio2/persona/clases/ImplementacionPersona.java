package ejercicio2.persona.clases;

class ImplementacionPersona implements Persona{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private Direccion direccion;
    private String telefono;
    private EstadoCivil estadoCivil;
    private Persona pareja;

    public ImplementacionPersona(String nombre, String apellido1, String apellido2, int edad, String calle, String ciudad, String pais, String telefono, EstadoCivil ec, Persona pareja){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.edad=edad;
        this.direccion=new Direccion(calle,ciudad,pais);
        this.telefono=telefono;
        this.estadoCivil=ec;
        this.pareja=pareja;
        if (pareja!=null){
            ((ImplementacionPersona)pareja).pareja=this;
            ((ImplementacionPersona)pareja).estadoCivil=EstadoCivil.CASADO;
        }
    }

    private boolean comprobarEdad(){
        boolean edad=false;
        if (this.edad>0){
            edad=true;
        }
        return edad;
    }

    private boolean comprobarEstadoCivil(){
        boolean estado=true;
        if ((this.pareja!=null&&this.estadoCivil.equals(EstadoCivil.SOLTERO))||(this.pareja==null&&this.estadoCivil.equals(EstadoCivil.CASADO))){
            estado=false;
        }
        return estado;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getApellido() {
        return this.apellido1;
    }

    @Override
    public String getApellido2() {
        return this.apellido2;
    }

    @Override
    public Direccion getDireccion() {
        return this.direccion;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

    @Override
    public EstadoCivil getEstadoCivil() {
        return this.estadoCivil;
    }

    @Override
    public Persona getPareja() {
        return this.pareja;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }
}
