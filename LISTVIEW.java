package CONTROLS;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class LISTVIEW extends Application
{
public void start(Stage primaryStage) throws Exception
{
primaryStage.setTitle("ListView Experiment 1");
ListView<String> listView = new ListView<String>();
listView.getItems().add("Item 1");
listView.getItems().add("Item 2");
listView.getItems().add("Item 3");
HBox hbox = new HBox(listView);
Scene scene = new Scene(hbox, 300, 120);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args)
{
launch(args);
}
}
