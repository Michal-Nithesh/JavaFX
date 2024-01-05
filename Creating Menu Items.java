package Menues;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class MENUITEMS extends Application
{

@Override
public void start(Stage primaryStage)
{
try
{
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
//Let us add Menu Items for File Menu
MenuItem New=new MenuItem("New");
MenuItem OpenFile=new MenuItem("Open File...");
MenuItem OpenProjects=new MenuItem("Open Projects From File

Systems...");

MenuItem RecentFiles=new MenuItem("Recent Files");
MenuItem Save=new MenuItem("Save");
//Map the Menu Items to the File Menu
File.getItems().add(New);
File.getItems().add(OpenFile);
File.getItems().add(OpenProjects);
File.getItems().add(RecentFiles);
File.getItems().add(Save);

// Create a Layout and add the menu bar to the Layout

BorderPane root=new BorderPane();
root.setTop(main_menu);
// we need to add this Layout to the Scene
Scene sc=new Scene(root);
primaryStage.setScene(sc);
primaryStage.setWidth(500);
primaryStage.setHeight(500);
primaryStage.show();

}
catch(Exception e)
{

e.printStackTrace();

}
}
public static void main(String[] args)
{
launch(args);
}
}
