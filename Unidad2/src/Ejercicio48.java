import bpc.daw.objetos.MarcadorMejorado;

public class Ejercicio48 {
    public static void main(String[] args) {
        MarcadorMejorado marcadorMejorado=new MarcadorMejorado("Estudiantes", "CB Granada");
        marcadorMejorado.anotarCanasta(marcadorMejorado.CANASTA_LOCAL,marcadorMejorado.NORMAL);
        marcadorMejorado.anotarCanasta(marcadorMejorado.CANASTA_VISITANTE,marcadorMejorado.TRIPLE);
        marcadorMejorado.anotarCanasta(marcadorMejorado.CANASTA_LOCAL,marcadorMejorado.NORMAL);
        marcadorMejorado.anotarCanasta(marcadorMejorado.CANASTA_VISITANTE,marcadorMejorado.NORMAL);
        marcadorMejorado.anotarCanasta(marcadorMejorado.CANASTA_VISITANTE,marcadorMejorado.TRIPLE);
        marcadorMejorado.anotarCanasta(marcadorMejorado.CANASTA_LOCAL,marcadorMejorado.TIRO_LIBRE);
        marcadorMejorado.anotarCanasta(marcadorMejorado.CANASTA_LOCAL,marcadorMejorado.TIRO_LIBRE);
        marcadorMejorado.anotarCanasta(marcadorMejorado.CANASTA_VISITANTE,marcadorMejorado.NORMAL);

        System.out.println(marcadorMejorado.getNombreLocal()+" "+marcadorMejorado.getPuntosLocal()+"\n"+
                marcadorMejorado.getNombreVisitante()+" "+marcadorMejorado.getPuntosVisitante()+"\nVa ganando "+marcadorMejorado.getNombreEquipoGanador()+
                "\nVa peridiendo "+marcadorMejorado.getNombreEquipoPerdedor());
    }
}
