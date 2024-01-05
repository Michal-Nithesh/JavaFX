package LAYOUTS;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GRIDPANE extends Application
{
@Override
public void start(Stage primaryStage) throws Exception
{
Button btn1 = new Button("1");
Button btn2 = new Button("2");
Button btn3 = new Button("3");
GridPane root = new GridPane();
root.add(btn1, 0, 0);
root.add(btn2, 1, 1);
root.add(btn3, 2, 2);
Scene scene = new Scene(root);
root.setGridLinesVisible(false);
root.setVgap(10);
root.setHgap(10);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args)
{
launch();
}
}
