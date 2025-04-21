package daw.tema8;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class ejercicio3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label=new Label("El raton esta fuera");

        label.setPrefSize(200,100);
        label.setBorder(Border.stroke(Paint.valueOf("red")));

        label.setOnMouseEntered(evt->{
            label.setText("El raton esta dentro");
        });
        label.setOnMouseExited(evt->{
            label.setText("El raton esta fuera");
        });

        VBox vBox=new VBox(label);
        Scene scene=new Scene(vBox,400,400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Ejercicio 3");
        primaryStage.show();
    }
}
