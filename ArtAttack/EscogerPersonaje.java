import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import java.util.Optional;
import javafx.stage.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.event.EventHandler;
public class EscogerPersonaje extends Scene{

    private HBox hb;

    public EscogerPersonaje(Main main){
        super(new HBox(),1000,1000);
        Button chucho= new Button("Chucho");
        chucho.setPrefSize(330,1000);
        chucho.setStyle("-fx-background-image:url('assets/chucho.jpg');-fx-background-size: stretch;");
        chucho.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){   
              Heroe heroe= new Chucho();
              main.setHeroe(heroe);                 
              main.setScene3(0,0,false,false,false,false,false);         
            }
        });
        Button nina= new Button("Nina");
        nina.setPrefSize(330,1000);
        nina.setStyle("-fx-background-image:url('assets/nina.jpg');-fx-background-size: stretch;");
        nina.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){ 
                Heroe heroe = new Nina(); 
                main.setHeroe(heroe);             
                main.setScene3(0,0,false,false,false,false,false);
            }
        });
        
        hb = new HBox(nina,chucho);
        super.setRoot(hb);
    }
}