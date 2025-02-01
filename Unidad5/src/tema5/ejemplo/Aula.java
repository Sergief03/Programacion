package tema5.ejemplo;

public class Aula {
    public String nombre;
    public String profesor;
    public String[][] asientos;
    public int area;
    public int numeroAsientos;

    public Aula(String n,String p,int numeroFilas,int numeroColumnas){
        this.nombre= n==null? "Aula sin determinar":n;
        this.profesor=p==null? "Profesor sin determinar":p;
        numeroColumnas=numeroColumnas<0? 5:numeroColumnas;
        numeroFilas=numeroFilas<0? 5:numeroFilas;
        this.asientos=new String[numeroFilas][numeroColumnas];
        this.area=numeroFilas*numeroColumnas+10;
        this.numeroAsientos=numeroFilas*numeroColumnas;
    }

    public Aula(String n, String p){
        this(n,p,3,2);
        for(int i=0;i<asientos.length;i++){
            for (int j=0;j<asientos[i].length;j++){
                asientos[i][j]="Menganito";
            }
        }
    }

    public Aula(int nf,int nc,int i,int j){
        this(null,null,nf,nc);
        if (i<asientos.length&&(i>=0&&j>=0)&&j<asientos[i].length){
            asientos[i][j]="Menganito";
        }
    }
}
