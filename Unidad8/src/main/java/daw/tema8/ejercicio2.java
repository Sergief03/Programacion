package daw.tema8;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class ejercicio2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label=new Label("Escribe un numero: ");
        TextField textField=new TextField();
        Button button=new Button("Aceptar");
        button.setOnAction(v->{
            String num= textField.getText();
            Alert alert;
            if (num.matches("^[1-9]$")){
                alert=new Alert(Alert.AlertType.INFORMATION,"El cuadrado del numero es: "+Math.pow(Integer.parseInt(num),2));
            }else {
                alert=new Alert(Alert.AlertType.ERROR,"Se debe de introducir un numero");
            }
            alert.show();
        });

        VBox vBox=new VBox(label,textField,button);
        Scene scene=new Scene(vBox,400,400);

        primaryStage.setTitle("Ejercicio 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
