import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;

public class Main15 extends Application{

		
public void start(Stage primaryStage){

	 Group g= new Group(); 
	 Scene sc = new Scene(g);
	 GridPane gp = new GridPane();
	 BorderPane bp = new BorderPane();

	

    primaryStage.show();
    primaryStage.setWidth(300);
    primaryStage.setHeight(350);
    primaryStage.setScene(sc);




 Button b1= new Button("1");
	 b1.getStyleClass().add("greyButton");
     b1.setPrefSize(50, 50);
}


public static void main(String[] args){
	Application.launch(args);
}





}

