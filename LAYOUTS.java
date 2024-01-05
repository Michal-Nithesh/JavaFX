package LAYOUTS;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class FLOWPANE extends Application
{

@Override
public void start(Stage primaryStage) throws Exception
{
Button btn1 = new Button("1");
Button btn2 = new Button("2");
Button btn3 = new Button("3");
Button btn4 = new Button("4");
Button btn5 = new Button("5");
Button btn6 = new Button("6");
Button btn7 = new Button("7");
Button btn8 = new Button("8");
Button btn9 = new Button("9");
Button btn10 = new Button("10");
Button btn11 = new Button("11");
Button btn12 = new Button("12");
FlowPane root = new FlowPane();
Scene scene = new Scene(root,100,100);
root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12);
root.setVgap(6);
root.setHgap(5);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args)
{
launch(args);
}
}
