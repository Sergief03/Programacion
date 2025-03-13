package clases;

public enum Formato {
    TEXTO, HTML, JSON, XML, MD, YAML;

    public boolean humanReadable(){
        return this == TEXTO || this == MD || this == YAML;
    }
}
