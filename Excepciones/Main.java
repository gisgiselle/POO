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
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Main extends Application{
	private int resultadoSub, resultadoIva, resultadoTot;
	private TextField nombreTxt, skuTxt, precioTxt, cantidadTxt;
	private TextArea textArea;
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
		sc.getStylesheets().add("Styles.css");

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
		
		textArea = new TextArea();
		textArea.setEditable(false);
		vbox2.getChildren().add(textArea);


		primaryStage.setScene(sc);
		primaryStage.setTitle("Compra");
		primaryStage.show();

	}


	public class AgregarHandler implements EventHandler <MouseEvent>{
		public void handle(MouseEvent e){
			
			try{
				 textArea.setText("Nombre \n " + nombreTxt.getText()+ "\n SKU: \n"+ skuTxt.getText()+ "\n Cantidad: \n"+cantidadTxt.getText()+"\n Precio: \n"+precioTxt.getText());
			}
			catch(Exception t){
				System.out.println(t.getMessage());
				t.printStackTrace();
			}
		}
	}


	public class CalcularHandler implements EventHandler <MouseEvent>{
		public void handle(MouseEvent e){
			try{
				Producto precio = new Producto(precioTxt.getText());
				Producto cantidad = new Producto(cantidadTxt.getText());
				ResultadoSub resultado = new ResultadoSub(cantidadTxt.getText(), precioTxt.getText());
				int resultadoSub=resultado.getResultadoSub();
				ResultadoIVA resultadoI = new ResultadoIVA(cantidadTxt.getText(), precioTxt.getText());
				double resultadoIVA=resultadoI.getResultadoIVA();
				ResultadoTotal resultadoT = new ResultadoTotal(cantidadTxt.getText(), precioTxt.getText());
				double resultadoTotal=resultadoT.getResultadoTotal()+resultadoI.getResultadoIVA();
				textArea.setText("Subtotal: \n" +resultadoSub+ "\n" +"IVA : \n"+resultadoIVA +"\n Total: \n" +resultadoTotal);
				}

			catch(NegativaException n){
				System.out.println(n.getMessage());
				precioTxt.textProperty().addListener(new ChangeListener<String>() {
			//obliga a poner valores positivos, no deja poner el signo negativo
	    		@Override
		    	public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		        	if (!newValue.matches("\\d*")) {
		            	precioTxt.setText(newValue.replaceAll("[^\\d]", ""));
					}
				}
				});
				cantidadTxt.textProperty().addListener(new ChangeListener<String>() {
	    		@Override
		    	public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		        	if (!newValue.matches("\\d*")) {
		            	cantidadTxt.setText(newValue.replaceAll("[^\\d]", ""));
		            }
		        }
		   	 	});
			}	
		}
	}
}



