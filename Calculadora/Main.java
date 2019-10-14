import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.input.MouseEvent;

import javafx.scene.Scene;




public class Main extends Application{
	private double resultadoDob=0.0;
	private Label resultado;
	private boolean isFirstClick=false;
	private String lastOperation="";
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage){

		//Border pane
		
		BorderPane bp= new BorderPane();
		Scene sc= new Scene(bp);
		HBox hb= new HBox();


		sc.getStylesheets().add("Styles.css");


		GridPane gp= new GridPane();

		Button button1= new Button("1");
		button1.getStyleClass().add("greyButton");
		button1.setPrefSize(50, 50);
		button1.setId("1");
		button1.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		gp.add(button1,0,3);

		Button button2= new Button("2");
		button2.getStyleClass().add("greyButton");
		button2.setPrefSize(50, 50);
		button2.setId("2");
		button2.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		gp.add(button2,1,3);

		Button button3= new Button("3");
		button3.setPrefSize(50, 50);
		button3.getStyleClass().add("greyButton");
		button3.setId("3");
		button3.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		gp.add(button3,2,3);

		Button button4= new Button("4");
		button4.getStyleClass().add("greyButton");
		button4.setPrefSize(50, 50);
		button4.setId("4");
		button4.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		gp.add(button4,0,2);

		Button button5= new Button("5");
		button5.getStyleClass().add("greyButton");
		button5.setPrefSize(50, 50);
		button5.setId("5");
		button5.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		gp.add(button5,1,2);

		Button button6= new Button("6");
		button6.getStyleClass().add("greyButton");
		button6.setPrefSize(50, 50);
		button6.setId("6");
		button6.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		gp.add(button6,2,2);

		Button button7= new Button("7");
		button7.getStyleClass().add("greyButton");
		button7.setPrefSize(50, 50);
		button7.setId("7");
		button7.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());
		gp.add(button7,0,1);

		Button button8= new Button("8");
		button8.getStyleClass().add("greyButton");
		button8.setPrefSize(50, 50);
		button8.setId("8");
		button8.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		gp.add(button8,1,1);

		Button button9= new Button("9");
		button9.getStyleClass().add("greyButton");
		button9.setPrefSize(50, 50);
		button9.setId("9");
		button9.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		gp.add(button9,2,1);

		Button button0= new Button("0");
		button0.getStyleClass().add("greyButton");
		button0.setPrefSize(50, 50);
		button0.setId("0");
		button0.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		
		gp.add(button0, 0, 4, 2, 1);
		button0.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

		Button buttonAc= new Button("AC");
		buttonAc.getStyleClass().add("lessGreyButton");
		buttonAc.setPrefSize(50, 50);
		buttonAc.setId("");
		buttonAc.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraOperacionHandler());		
		gp.add(buttonAc,0,0);	

		Button buttonp= new Button(".");
		buttonp.getStyleClass().add("greyButton");
		buttonp.setPrefSize(50, 50);
		buttonp.setId(".");
		buttonp.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraHandler());		
		gp.add(buttonp,2,4);

		Button buttonCh= new Button("+/-");
		buttonCh.getStyleClass().add("lessGreyButton");
		buttonCh.setPrefSize(50, 50);
		buttonCh.setId("+/-");
		buttonCh.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraOperacionHandler());		
		gp.add(buttonCh,1,0);

		Button buttonPor= new Button("%");
		buttonPor.getStyleClass().add("lessGreyButton");
		buttonPor.setPrefSize(50, 50);
		buttonPor.setId("%");
		buttonPor.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraOperacionHandler());		
		gp.add(buttonPor,2,0);

		Button buttonPlus= new Button("+");
		buttonPlus.getStyleClass().add("orangeButton");
		buttonPlus.setPrefSize(50, 50);
		buttonPlus.setId("+");
		buttonPlus.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraOperacionHandler());		
		gp.add(buttonPlus,3,3);	

		Button buttonLess= new Button("-");
		buttonLess.getStyleClass().add("orangeButton");
		buttonLess.setPrefSize(50, 50);
		buttonLess.setId("-");
		buttonLess.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraOperacionHandler());		
		gp.add(buttonLess,3,2);	

		Button buttonAdd= new Button("x");
		buttonAdd.getStyleClass().add("orangeButton");
		buttonAdd.setPrefSize(50, 50);
		buttonAdd.setId("x");
		buttonAdd.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraOperacionHandler());		
		gp.add(buttonAdd,3,1);

		Button buttonDiv= new Button("/");
		buttonDiv.getStyleClass().add("orangeButton");
		buttonDiv.setPrefSize(50, 50);
		buttonDiv.setId("/");
		buttonDiv.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraOperacionHandler());		
		gp.add(buttonDiv,3,0);


		Button buttonEqual= new Button("=");
		buttonEqual.getStyleClass().add("orangeButton");
		buttonEqual.setPrefSize(50, 50);
		buttonEqual.setId("=");
		buttonEqual.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonCalculadoraResultadoHandler());		
		gp.add(buttonEqual,3,4);				
		gp.setHgap(10);
		gp.setVgap(10);

		resultado=new Label(resultadoDob+"");
		bp.setTop(resultado);
		bp.setCenter(gp);	
		bp.setAlignment(resultado,Pos.TOP_RIGHT);			
	
		primaryStage.setScene(sc);
		primaryStage.setTitle("Calculadora");
		primaryStage.show();
	}

	public class BotonCalculadoraHandler implements EventHandler<MouseEvent>{
		public void handle(MouseEvent e){
			if(!isFirstClick){
				resultado.setText("");
				isFirstClick=true;
			}
			Control c= (Control)e.getSource();
			resultado.setText(resultado.getText()+c.getId());
			System.out.println(c.getId());
		}
	}
	public class BotonCalculadoraOperacionHandler implements EventHandler<MouseEvent>{
		public void handle(MouseEvent e){
			Control c= (Control)e.getSource();
			switch(c.getId()){
				case "+":
					lastOperation="+";
					resultadoDob=Double.parseDouble(resultado.getText());
					resultado.setText("0.0");
					isFirstClick=false;
					break;
				case "-":
					lastOperation="-";
					resultadoDob=Double.parseDouble(resultado.getText());
					resultado.setText("0.0");
					isFirstClick=false;
					break;
				case "x":
					lastOperation="x";
					resultadoDob=Double.parseDouble(resultado.getText());
					resultado.setText("0.0");
					isFirstClick=false;
					break;	
				case "/":
					lastOperation="/";
					resultadoDob=Double.parseDouble(resultado.getText());
					resultado.setText("0.0");
					isFirstClick=false;
					break;
				case "":
					lastOperation="";
					resultadoDob=Double.parseDouble(resultado.getText());
					resultado.setText("0.0");
					isFirstClick=false;
					break;	
				case "+/-":
					resultadoDob=Double.parseDouble(resultado.getText())*(-1.0);
					resultado.setText(resultadoDob+"");
					isFirstClick=false;
					break;
				case "%":
					resultadoDob=Double.parseDouble(resultado.getText())*0.01;
					resultado.setText(resultadoDob+"");
					isFirstClick=false;
					break;		
			}
		}
	}	
	public class BotonCalculadoraResultadoHandler implements EventHandler<MouseEvent>{
		public void handle(MouseEvent e){
			switch(lastOperation){
				case "+":
					resultadoDob=resultadoDob+Double.parseDouble(resultado.getText());
					resultado.setText(resultadoDob+"");
					break;
				case "-":
					resultadoDob=resultadoDob-Double.parseDouble(resultado.getText());
					resultado.setText(resultadoDob+"");
					break;
				case "x":
					resultadoDob=resultadoDob*Double.parseDouble(resultado.getText());
					resultado.setText(resultadoDob+"");
					break;
				case "/":
					resultadoDob=resultadoDob/Double.parseDouble(resultado.getText());
					resultado.setText(resultadoDob+"");
					break;										
			}
		}
	}		
}