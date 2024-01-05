package controls;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class ToggleButtonExperiments extends Application 
{
public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle("HBox Experiment 1");
ToggleButton toggleButton1 = new ToggleButton("Left");
ToggleButton toggleButton2 = new ToggleButton("Right");
ToggleButton toggleButton3 = new ToggleButton("Up");
ToggleButton toggleButton4 = new ToggleButton("Down");
ToggleGroup toggleGroup = new ToggleGroup();
toggleButton1.setToggleGroup(toggleGroup);
toggleButton2.setToggleGroup(toggleGroup);
toggleButton3.setToggleGroup(toggleGroup);
toggleButton4.setToggleGroup(toggleGroup);

HBox hbox = new HBox(toggleButton1, toggleButton2, toggleButton3, toggleButton4);
Scene scene = new Scene(hbox, 200, 100);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}
