package Menues;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
public class Main extends Application {
@Override
public void start(Stage primaryStage) {
try {
//how to create menu in JavaFx
//Let us now create a Menu bar
MenuBar main_menu=new MenuBar();
Menu File=new Menu("File");
Menu Edit=new Menu("Edit");
Menu Source=new Menu("Source");
Menu Refactor=new Menu("Refactor");
// Mapping all the menu objects to menu bar
main_menu.getMenus().add(File);
main_menu.getMenus().add(Edit);
main_menu.getMenus().add(Source);
main_menu.getMenus().add(Refactor);

// Create a Layout and add the menu bar to the Layout

BorderPane root=new BorderPane();
root.setTop(main_menu);
//we need to add this Layout to the Scene
Scene sc=new Scene(root);
primaryStage.setScene(sc);
primaryStage.setWidth(500);
primaryStage.setHeight(500);
primaryStage.show();
} catch(Exception e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
launch(args);
}
}
