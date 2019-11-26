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
public class Final extends Scene{
    private BorderPane bp= new BorderPane();

    public Final(Main main){
        super(new BorderPane(),1024,700);
        Label titulo= new Label("Yay");
        Button end = new Button("CERRAR");
        end.getStyleClass().add("end");
        
        VBox nfk=new VBox();
        nfk.getChildren().addAll(titulo);
        bp.setCenter(nfk);
        super.setRoot(bp);
    }
}