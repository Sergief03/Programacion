public class Ejercicio39 {
    public static void main(String[] args) {
        System.out.println("Infromacion sobre elm ordenador\n- Sistema operativo: "+System.getProperty("os.name")+
                "\n- Version del sistema operativo: "+System.getProperty("os.version")+
                "\n- Arquitectura del sistema operativo: "+System.getProperty("os.arch")+
                "\n- Usuario actual: "+System.getProperty("user.name")+
                "\n- Carpeta de archivos temporales: "+System.getProperty("java.io.tmpdir"));
    }
}
