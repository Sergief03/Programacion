package clases;

public record Mensaje(String remitente, String mensaje, boolean leido, Formato tipo) {
    public Mensaje {
        if (mensaje.contains(";")){
            throw new IllegalArgumentException("El mensaje no puede contener puntpo y coma");
        }
    }

    public Mensaje(String remitente, String mensaje){
        this(remitente,mensaje,false,Formato.TEXTO);
    }

    public Mensaje leer(){
        return new Mensaje(this.remitente,this.mensaje,true,this.tipo);
    }

    public String getLineaCSV(){
        return this.remitente+";"+this.mensaje+";"+this.leido+";"+this.tipo.ordinal();
    }

}
