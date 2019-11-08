import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextArea;
import javafx.scene.Scene;

public class Main extends Application{
	private Label resultadoSub, resultadoIva, resultadoTot;
	private TextField nombreTxt, skuTxt, precioTxt, cantidadTxt;
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage){
		VBox vbox = new VBox();
		GridPane gridp = new GridPane();
		VBox vbox2 = new VBox();	
		HBox hb = new HBox();
		Group gp = new Group(hb);
		gp.getChildren().add(vbox);
		hb.getChildren().add(vbox);
		hb.getChildren().add(vbox2);

		Scene sc= new Scene(gp);


		vbox.getChildren().add(new Label("Nombre"));
		nombreTxt= new TextField();
		vbox.getChildren().add(nombreTxt);
		
		vbox.getChildren().add(new Label("SKU"));
		skuTxt= new TextField();
		vbox.getChildren().add(skuTxt);
	
		vbox.getChildren().add(new Label("Cantidad"));
		cantidadTxt= new TextField();
		vbox.getChildren().add(cantidadTxt);
		
		vbox.getChildren().add(new Label("Precio"));
		precioTxt= new TextField();
		vbox.getChildren().add(precioTxt);
		
		Button bAgregar= new Button("Agregar");
		vbox.getChildren().add(bAgregar);
		
		Button bCalcular= new Button("Calcular");
		vbox.getChildren().add(bCalcular);	
		

		bAgregar.addEventHandler(MouseEvent.MOUSE_CLICKED, new 	AgregarHandler());
		bCalcular.addEventHandler(MouseEvent.MOUSE_CLICKED, new CalcularHandler());
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		vbox2.getChildren().add(textArea);

		primaryStage.setScene(sc);
		primaryStage.setTitle("Compra");
		primaryStage.show();

	}

	public class AgregarHandler implements EventHandler <MouseEvent>{
		public void handle(MouseEvent e){

		}
	}
	public class CalcularHandler implements EventHandler <MouseEvent>{
	public void handle(MouseEvent e){
		
	}
}
}