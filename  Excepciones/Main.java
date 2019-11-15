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
	private int resultadoSub, resultadoIva, totalTotal;
	private TextField nombreTxt, skuTxt, precioTxt, cantidadTxt;
	private TextArea textArea;

		Carrito carrito= new Carrito();
	Label sub = new Label("Subtotal: ");
		Label iva = new Label("IVA: ");
		Label tot = new Label("Total: ");

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

		
		vbox2.getChildren().add(sub);
		vbox2.getChildren().add(iva);
		vbox2.getChildren().add(tot);
		

		primaryStage.setScene(sc);
		primaryStage.setTitle("Compra");
		primaryStage.show();

	}


	public class AgregarHandler implements EventHandler <MouseEvent>{
		int posicion=0;
		public void handle(MouseEvent e){
			

				Producto p = new Producto(nombreTxt.getText(),
				skuTxt.getText(), Integer.parseInt(cantidadTxt.getText()), 
				Integer.parseInt(precioTxt.getText()));

				carrito.addProducto(new Producto(p.getNombre(),p.getSku(),
				p.getCantidad(),p.getPrecio()),posicion);
				posicion++;

				textArea.setText("Nombre: \n"+nombreTxt.getText()+"\n SKU:\n"+skuTxt.getText()+"\n Cantidad\n"
					+cantidadTxt.getText()+"\n Precio\n"+precioTxt.getText());
				carrito.calcularSubtotal();
				}
		}

	public class CalcularHandler implements EventHandler <MouseEvent>{
		int posicion = 0;
		public void handle(MouseEvent e){
			Producto p = new Producto(nombreTxt.getText(),
				skuTxt.getText(), Integer.parseInt(cantidadTxt.getText()), 
				Integer.parseInt(precioTxt.getText()));

				textArea.setText("Nombre: \n"+nombreTxt.getText()+"\n SKU:\n"+skuTxt.getText()+"\n Cantidad\n"
					+cantidadTxt.getText()+"\n Precio\n"+precioTxt.getText());
				sub.setText("Subtotal: " + String.valueOf(carrito.calcularSubtotal()));
				iva.setText(String.valueOf(carrito.calcularTotalIVA()));
				tot.setText(String.valueOf(carrito.calcularSubtotal()+ carrito.calcularTotalIVA()));
				}

		}

	}
