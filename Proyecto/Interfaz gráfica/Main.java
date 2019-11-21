
import personaje.*;
import java.util.Optional;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.Group;
public class Main extends Application{

    private Scene intro = new Intro(this);
    private Scene Personaje= new EscogerPersonaje(this);
    private Scene mapa1,mapa2,mapa3,mapa4,mapaF,m;
    private Stage mainStage;
    private Heroe heroe;
    private SceneBatalla sb;
    private BorderPane u;

	public static void main(String args[]){
		Application.launch(args);

		
	}

	

	public void start(Stage primaryStage){
		
        mainStage=primaryStage;
        mainStage.setTitle("Art Attack");
        mainStage.setScene(intro);
        intro.getStylesheets().add("Styles.css");
        mainStage.show();
        
	}
    public void setScene2(){
        mainStage.setScene(Personaje);    
    }
    public void setScene3(int x, int y,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){
        if(x==9&&y==9){setScene4(0,0,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);   
        }else{
            Personaje malo= new EstrellitaDeLaMuerte(); 
            Boss boss= new VanGogh();
            mapa = new Mapa(h, this,x,y,malo,boss,0,7,3,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);
            mainStage.setScene(mapa);                     
            guardar(mapa);
        }
}