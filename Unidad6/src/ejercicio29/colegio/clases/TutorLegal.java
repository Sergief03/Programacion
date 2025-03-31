package ejercicio29.colegio.clases;

public record TutorLegal(String nombre, Alumno[] hijos) implements CalificacionListener{

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        boolean hijo=false;
        for (Alumno al : this.hijos){
            if (al.equals(a)){
                hijo=true;
            }
        }
        if (hijo){
            if (nota.getValoracion().esAprobado()){
                System.out.println("Bien hecho "+a.nombre()+" has sacado un "+nota.valorNumerico()+" en "+p.getAsignatura());
            }else {
                System.out.println("Muy mal "+a.nombre()+", has suspendido "+p.getAsignatura()+" y te voy a castigar");
            }
        }
    }
}
