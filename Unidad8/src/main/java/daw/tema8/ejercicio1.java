package daw.tema8;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ejercicio1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label etiqueta = new Label("El botón no ha sido pulsado");

        Button botonAceptar = new Button("Aceptar");
        Button botonReset = new Button("Reset");

        botonReset.setDisable(true);

        botonAceptar.setOnAction(e -> {
            etiqueta.setText("El botón ha sido pulsado");
            botonAceptar.setDisable(true);
            botonReset.setDisable(false);
        });

        botonReset.setOnAction(e -> {
            etiqueta.setText("El botón no ha sido pulsado");
            botonAceptar.setDisable(false);
            botonReset.setDisable(true);
        });

        VBox root = new VBox(10, etiqueta, botonAceptar, botonReset);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Ejercicio Botones");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
