import java.util.Optional;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.layout.VBox;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.event.EventHandler;
public class Stats extends Scene{
    private BorderPane bp= new BorderPane();
    private Heroe heroe;

    public Stats(Main main){
        super(new BorderPane(),1024,700);
        bp.setStyle("-fx-background-image:url('assets/paint.png'); -fx-background-size: stretch;");
        try{Label titulo= new Label("Tus stats son: no me salio :(");
        Button end = new Button("regresar");
        end.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){               
                main.setScene3(0,0,false,false,false,false,false);
            }
        });
        VBox sta=new VBox();
        sta.getChildren().addAll(titulo,end);
        bp.setCenter(sta);
        super.setRoot(bp);}
        catch(Exception e){

        }
    }
}