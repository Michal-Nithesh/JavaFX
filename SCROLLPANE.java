package CONTROLS;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class SCROLLPANE extends Application
{
@Override
public void start(Stage primaryStage)
{
// setting the title of application
primaryStage.setTitle("ScrollPane Vertical");
// Create a ScrollPane
ScrollPane scrollPane = new ScrollPane();
VBox vBox=new VBox();
// Setting the content to the ScrollPane
scrollPane.setContent(vBox);
// Always show vertical scroll bar for scrolling
scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
scrollPane.setHbarPolicy(ScrollBarPolicy.NEVER);
//adding scroll pane to the scene
Scene scene = new Scene(scrollPane,200,300);
primaryStage.setScene(scene);
//showing the output
primaryStage.show();
}
public static void main(String[] args)
{
//invoking main method from JVM
launch(args);
}
}
