package CONTROLS;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class TEXTFIELD extends Application
{
public static void main(String[] args)
{
launch(args);
}
@Override
public void start(Stage primaryStage) throws Exception {
// TODO Auto-generated method stub
TextField tf1=new TextField();
PasswordField pass=new PasswordField();
Button b = new Button("Submit");
VBox root=new VBox();
root.getChildren().addAll(tf1,pass,b);
Scene scene=new Scene(root,300,200);
primaryStage.setScene(scene);
primaryStage.setTitle("Text Field Example");
primaryStage.show();
}
}
