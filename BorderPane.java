package LAYOUTS;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class BORDERPANE extends Application
{
@Override
public void start(Stage primaryStage) throws Exception
{
Button btn1 = new Button("1");
Button btn2 = new Button("2");
Button btn3 = new Button("3");
BorderPane root = new BorderPane();
root.setBottom(btn1);
root.setCenter(btn2);
root.setTop(btn3);
Scene scene = new Scene(root);
primaryStage.setScene(scene);
primaryStage.setWidth(500);
primaryStage.setHeight(500);
primaryStage.show();
}
public static void main(String[] args)
{
launch(args);
}
}
