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
    private Scene intro = new FirstScene(this);
    private Scene ePersonaje= new EscogerPersonaje(this);
    private Scene mapa1,mapa2,mapa3,mapa4,mapaF,m;
    private Stage mainStage;
    private Heroe h;
    private SceneBatalla sb;
    private BorderPane u;

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
        public Heroe getTipo(){
            return h;
    }

    public void setTipo(Heroe h){
        this.h=h;
    }
    public void guardar(Scene sc){
    try{
        FileOutputStream fout = new FileOutputStream("mapa.atm");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(sc);
        oos.close();
    }catch(IOException ex){

        } 
}
    public void setScene2(){
        mainStage.setScene(ePersonaje);    
    }
    public void setScene3(int x, int y,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){
        if(x==9&&y==9){setScene4(0,0,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);   
        }else{
        Personaje malo= new EstrellitaDeLaMuerte(); 
        Boss boss= new VanGogh();
        Mapa1 mapa1 = new Mapa1(h, this,x,y,malo,boss,0,7,3,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);
        mainStage.setScene(mapa1);                     
        guardar(mapa1);
  
        }  
    }
    public Scene mostrar(){
        try{
            File selectedFile = new File("mapa.atm");
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
     public void setScene4(int xx, int yy,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){
        Personaje malo= new Sombra(); 
        Boss boss= new Grito();
        Mapa2 mapa2 = new Mapa2(h,this,xx,yy,malo,boss,2,5,4,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);
        guardar(mapa2);
        mainStage.setScene(mapa2);
    }
}
   