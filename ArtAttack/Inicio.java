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
import java.io.Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class Inicio extends Scene implements Serializable{
    private BorderPane bp= new BorderPane();
    private MapaBase m;

    public Inicio(Main main){
        super(new BorderPane(),1004,700);
        Label titulo= new Label("Art Attack");
        bp.setStyle("-fx-background-image:url('assets/paint.png'); -fx-background-size: stretch;");
        titulo.getStyleClass().add("titInicio");
        Label historia= new Label("Después de meses de esperar emocionado el viaje escolar al museo más hermoso,\n al fin ha llegado el día. Lo que no sabes, es que el maestro Podrick Prater \n "+
            "(llamado por tus amigos  Mr. Mean Rat por su peculiares orejas y dientes masivos)\n tiene diferentes planes para ustedes." 
            +" Al llegar al museo, descubren que está completamente vacío. \n Emocionados, corren a ver sus pinturas favoritas, dejando atrás a Mr. Mean Rat. "
        +"\nDespiertas en un lugar extraño, todo es azul, con una textura peculiar,\n huele a algo distintivo ¿Es óleo? \n");
        historia.getStyleClass().add("hist");
        Button iniciar= new Button("Nueva");
        Button continuar= new Button("Continuar");
        iniciar.setPrefSize(300,50);
        iniciar.getStyleClass().add("iniciar");
        continuar.setPrefSize(300,50);
        continuar.getStyleClass().add("continuar");
        HBox hb= new HBox();
        hb.getChildren().addAll(continuar,iniciar);
        hb.setSpacing(500);
        bp.setBottom(hb);
        bp.setAlignment(hb,Pos.BOTTOM_LEFT);
        iniciar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){               
                main.setScene2();
            }
        });
        continuar.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
				public void handle(MouseEvent e){
					main.mostrar();
				}
			}
		);
        VBox his=new VBox();
        his.getChildren().addAll(titulo,historia);
        bp.setCenter(his);
        his.setStyle("-fx-alignment: center; -fx-padding: 30px;");
        titulo.setStyle("-fx-alignment: top-center;");
        super.setRoot(bp);
    }
}