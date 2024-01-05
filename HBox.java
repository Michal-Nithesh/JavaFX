package LAYOUTS;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class HORIZONTAL extends Application {
@Override
public void start(Stage primaryStage) {
try
{
Button btn1 = new Button("1");
Button btn2 = new Button("2");
Button btn3 = new Button("3");
Button btn4 = new Button("4");
HBox root = new HBox();
Scene scene = new Scene(root,200,200);
root.getChildren().addAll(btn1,btn2,btn3,btn4);
root.setSpacing(40);
primaryStage.setScene(scene);
primaryStage.setHeight(800);
primaryStage.setWidth(500);
primaryStage.show();
}
catch(Exception e)
{
e.printStackTrace();
}
}
public static void main(String[] args) {
launch(args);
}
}
