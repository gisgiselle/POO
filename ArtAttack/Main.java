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

public class Main extends Application{
    private Scene intro = new Inicio(this);
    private Scene personaje= new EscogerPersonaje(this);
    private Scene mapa1,mapa2,mapa3,mapa4,ff,m;
    private Stage mainStage;
    private Heroe heroe;
    private SceneBatalla sb;
    private BorderPane ultimo;

    public static void main(String[]args){
        launch(args);
    }
    public void start(Stage primaryStage){
        mainStage=primaryStage;
        mainStage.setTitle("Art Attack");
        mainStage.setScene(intro);
        intro.getStylesheets().add("Styles.css");
        mainStage.show();
        
    }
    public void save(Scene sc){
        try{
            FileOutputStream fout = new FileOutputStream("arch.atm");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(sc);
            oos.close();
        }catch(IOException ex){
        } 
    }
    public void setScene2(){
        mainStage.setScene(personaje);    
    }
    public void setScene3(int x, int y,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){
        if(x==9&&y==9){setScene4(0,0,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);   
        }else{
            Personaje malo= new Estrella(); 
            Boss boss= new VanGogh();
            mapa1 = new Mapa1(heroe, this,x,y,malo,boss,0,7,3,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);
            mainStage.setScene(mapa1);                     
            save(mapa1);
        }
    }
    
    public void setScene4(int xx, int yy,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){
        Personaje malo= new Alma(); 
        Boss boss= new Grito();
        mapa2 = new Mapa2(heroe,this,xx,yy,malo,boss,2,5,4,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);
        save(mapa2);
        mainStage.setScene(mapa2);
    }
    public void setSceneMuro(int x3, int y3,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){
        Personaje malo= new Muro(); 
        Boss boss= new Grito();
        mapa3 = new Mapa3(heroe,this,x3,y3,malo,boss,6,5,5,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);
        save(mapa3);
        mainStage.setScene(mapa3);   
    }     
   /*
    public void setSceneFinal(){
        ff = new Final(this);
        mainStage.setScene(ff);
        save(ff);
    } */
    public void setHeroe(Heroe heroe){
        this.heroe=heroe;
    }
    public Heroe getHeroe(){
        return heroe;
    }
    public void fight(Personaje p, int xx1, int yy1){
        sb= new SceneBatalla(heroe,p,xx1,yy1,this);
        mainStage.setScene(sb);
    }
   
    public Scene mostrar(){
        try{
			File selectedFile = new File("arch.atm");
			FileInputStream fin = new FileInputStream(selectedFile);
			ObjectInputStream ois = new ObjectInputStream(fin);
			m=(Scene) ois.readObject();
	    }catch(IOException ex){
			ex.printStackTrace();
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
        return m;
    }
    

    
}