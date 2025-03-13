package clases;

public enum Tamaño {
    PEQUEÑO, MEDIANO, GRANDE;
    public static Tamaño getTamaño(int alto, int ancho){
        int area=ancho*ancho;
        Tamaño tamaño=null;

        if (area<786432&&area>0){
            tamaño=Tamaño.PEQUEÑO;
        } else if (area<=2073600) {
            tamaño=Tamaño.MEDIANO;
        }else if (area>2073600){
            tamaño=Tamaño.GRANDE;
        }
        return tamaño;
    }
}
