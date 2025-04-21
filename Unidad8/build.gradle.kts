plugins {
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

application{
    mainClass="daw.tema8.ejercicio3" //clase donde va a estar nuestro metodo main
}

javafx{
    modules("javafx.controls","javafx.fxml") //componentes de javafx
    //el primer metodo son los botones y el segundo para las vistas
    version="21"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}