import bpc.daw.objetos.MarcadorBaloncesto;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Crear el marcador para el partido entre Estudiantes ('E') y CB Granada ('C')
        MarcadorBaloncesto partido = new MarcadorBaloncesto("Estudiantes", "CB Granada");

        // Registrar las canastas usando 'E' para Estudiantes y 'C' para CB Granada
        partido.anotarCanasta('E', 2);  // Estudiantes anota 2 puntos
        partido.anotarCanasta('C', 3);  // CB Granada anota 3 puntos
        partido.anotarCanasta('E', 2);  // Estudiantes anota 2 puntos
        partido.anotarCanasta('C', 2);  // CB Granada anota 2 puntos
        partido.anotarCanasta('C', 3);  // CB Granada anota 3 puntos
        partido.anotarCanasta('E', 1);  // Estudiantes anota 1 punto
        partido.anotarCanasta('E', 1);  // Estudiantes anota 1 punto
        partido.anotarCanasta('C', 2);  // CB Granada anota 2 puntos

        // Mostrar el nombre de los equipos y los puntos
        System.out.println("Equipo 1: " + partido.getNombreLocal() + " - Puntos: " + partido.getPuntosLocal());
        System.out.println("Equipo 2: " + partido.getNombreVisitante() + " - Puntos: " + partido.getPuntosVisitante());

        // Mostrar el equipo que va ganando y el que va perdiendo
        if (partido.getPuntosLocal() > partido.getPuntosVisitante()) {
            System.out.println("Ganando: " + partido.getNombreLocal());
            System.out.println("Perdiendo: " + partido.getNombreVisitante());
        } else if (partido.getPuntosVisitante() > partido.getPuntosLocal()) {
            System.out.println("Ganando: " + partido.getNombreVisitante());
            System.out.println("Perdiendo: " + partido.getNombreLocal());
        } else {
            System.out.println("El partido está empatado.");
        }
    }
}
