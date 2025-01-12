public class Ejercicio29 {
    public static void main(String[] args) {
        String[] nombre={"Pepe", "Ana", "Juan", "Roberta"};
        String[] asignaturas={"Programacion", "Base de datos", "Sistemas", "IPE"};
        int [][] notas={
                {9,5,4,3},
                {4,8,6,5},
                {2,5,10,2},
                {10,10,10,9}
        };

        System.out.println("Nota media de los alumnos: ");

        for (int i=0;i< nombre.length;i++){
            int sumaNotas=0;
            for (int j=0;j<notas[i].length;j++){
                sumaNotas+=notas[i][j];
            }
            System.out.println(nombre[i]+": "+(double)sumaNotas/notas[i].length);
        }


    }
}
