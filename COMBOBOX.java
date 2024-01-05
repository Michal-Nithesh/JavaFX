package CONTROLS;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class COMBOBOX extends Application
{
@Override
public void start(Stage primaryStage) throws Exception
{
primaryStage.setTitle("ComboBox Experiment 1");
ComboBox<String> comboBox = new ComboBox<String>();
comboBox.getItems().add("Choice 1");
comboBox.getItems().add("Choice 2");
comboBox.getItems().add("Choice 3");
HBox hbox = new HBox(comboBox);
Scene scene = new Scene(hbox, 200, 120);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}
