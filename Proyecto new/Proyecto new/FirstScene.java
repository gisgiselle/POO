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
public class FirstScene extends Scene implements Serializable{
    private BorderPane bp= new BorderPane();
    private MapaBase m;

    public FirstScene(Main main){
        super(new BorderPane(),1024,700);
        Label titulo= new Label("Art Attack");
        Label historia= new Label("Después de meses de esperar emocionado el viaje escolar al museo más hermoso, al fin ha llegado el día. Lo que no sabes, es que el maestro Podrick Prater (llamado por tus amigos  Mr. Mean Rat por su peculiares orejas y dientes masivos) tiene diferentes planes para ustedes. Al llegar al museo, descubren que está completamente vacío. Emocionados, corren a ver sus pinturas favoritas, dejando atrás a Mr. Mean Rat. ves tu pintura favorita, radiante de colores y la tentación te llena para tocar la pintura, entonces todo oscurece. Estas dentro de la pintura");


        Button iniciar= new Button("NUEVA PARTIDA");
        Button continuar= new Button("CONTINUAR PARTIDA");
        iniciar.setPrefSize(512,50);
        iniciar.setStyle("-fx-background-color:red;");
        continuar.setPrefSize(512,50);
        continuar.setStyle("-fx-background-color:green");
        HBox boton= new HBox();
        boton.getChildren().addAll(continuar,iniciar);
        bp.setBottom(boton);
        bp.setAlignment(boton,Pos.BOTTOM_CENTER);
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
        bp.setStyle("-fx-background-image:url('assets/museo.jpg'); -fx-background-size: stretch;");
        his.setStyle("-fx-alignment: center; -fx-padding: 30px;");
        titulo.setStyle("-fx-alignment: top-center;");
        super.setRoot(bp);
    }
}