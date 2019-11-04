  
import personaje.heroe.*;
import personaje.malo.*;
import personaje.boss.*;
import personaje.*;
import javafx.application.Application;
import javafx.stage.*;
import ui.*;
import javafx.scene.Group;
public class Main extends Application{
	public Heroe h;	
	public static void main(String args[]){
		Application.launch(args);

		public void setHeroe(Heroe heroe){
		this.heroe=heroe;
	}

	public Heroe getHeroe(){
		return heroe;
	}

	Heroe chucho = new Heroe();
	
	}

	public void start(Stage primaryStage){
		primaryStage.setTitle("");
		primaryStage.setWidth(800);
		primaryStage.setHeight(800);
		primaryStage.show();
		Group gp= new Group();
	}


	

}
