package daw.tema8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejemplo1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btnMostrar=new Button("Mostrar mensaje");
        btnMostrar.setOnAction(evt -> {
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Hola mundo");
            alert.show();
        });
        StackPane panel=new StackPane(btnMostrar);
        Scene escena=new Scene(panel,200,100);
        primaryStage.setScene(escena);
        primaryStage.setTitle("Programa hola mundo");
        primaryStage.show();
    }
}
