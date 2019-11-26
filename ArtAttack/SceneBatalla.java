import java.util.Scanner;
import javafx.scene.control.TextField;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.control.Button;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class SceneBatalla extends Scene implements Serializable{
    private Main main;
    private BorderPane bp=new BorderPane();
    private Label pregunta= new Label("");
    private Label l4;
    private VBox vb= new VBox();
    private Heroe h;
    private Personaje p;
    private HBox hb= new HBox();
    private Label finalBatalla= new Label("WOOOO \n GANASTE");
    private TextField tf;
    private int op,x,y,v;
    private ComboBox atacar;
    private Scene mapa1;
    public SceneBatalla(Heroe h, Personaje p, int x, int y, Main main){
        super (new BorderPane(),900,900);
        this.main=main;
        this.h=h;
        this.p=p;
        this.x=x;
        this.y=y;
        VBox vb = new VBox();
        Label titulof= new Label("1  ...  2  ...  3  ...              FIGHT");
        titulof.getStyleClass().add("battle");
        //titulof.setPrefSize(900,50);
        v=p.getHp();
        inicio();
        Label hl=h.getImg();
        Label pl=p.getImg();
        Label vs= new Label("   VS   "); 
        vs.getStyleClass().add("vs");

		vb.getChildren().addAll(hl,pl,vs);
        bp.setStyle("-fx-background-image:url('assets/box.jpg'); -fx-background-size: stretch;");

        bp.setCenter(hb);
        bp.setLeft(vb);
        bp.setTop(titulof);
        super.setRoot(bp);
    }
    public void punch(String punch){
        switch(punch){
			case "Ataque con Habilidad":
				pregunta.setText("Con que habilidad quieres atacar? ");
                vb.getChildren().clear();
                vb.getChildren().add(pregunta);
                ComboBox habilidad= new ComboBox<>();
				for(int i=0;i<h.getHabilidades().length;i++){
					habilidad.getItems().add((i+1)+" "+h.getHabilidades()[i]+" ["+h.getHabilidades()[i].getHabilidadP()+"] ");
				}
                vb.getChildren().add(habilidad);
                bp.setCenter(vb);
                setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if(ke.getCode() == KeyCode.ENTER) { 
                    String hab= (String) habilidad.getValue();                                                                  
                    op= Character.getNumericValue(hab.charAt(0));
			            h.atacar(p,h.getHabilidades()[op-1]);
                        p.atacar(h);
                        vb.getChildren().clear();
                        imprimirVida();
                }   
            }
        });
				break;
			case "Usar objeto":
				pregunta.setText("Que quieres hacer ");
                vb.getChildren().add(pregunta);
				for(int i=0;i<h.getMochila().length;i++){
					if(h.getMochila()[i]!=null){
						l4= new Label((i+1)+" "+h.getMochila()[i].getNombreObjeto()+" ["+h.getMochila()[i].getObPunto()+"] ");
                        vb.getChildren().add(l4);
					}else{
						l4= new Label((i+1)+" Nada" );
                        vb.getChildren().add(l4);
					}
				}
                Button regresar= new Button("Regresar");
                regresar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                    public void handle(MouseEvent e){ 
                        vb.getChildren().clear();
                        inicio();
                    }
                });
                tf=new TextField();
                vb.getChildren().addAll(tf, regresar);
                bp.setCenter(vb);
                try{setOnKeyPressed(new EventHandler<KeyEvent>() {
                    public void handle(KeyEvent ke) {
                        if(ke.getCode() == KeyCode.ENTER) {                                               
                            op= Integer.parseInt(tf.getText());
			                h.atacar(p,h.getMochila()[op-1],(op-1));
                            p.atacar(h);
                            vb.getChildren().clear();
                            imprimirVida();
                        }
                    }   
                    });}catch(ArrayIndexOutOfBoundsException e){
                                pregunta.setText("Pierdes tu turno");
                                p.atacar(h);
                                imprimirVida();
                            }  
				break;	
			default:
				pregunta.setText("Pierdes tu turno");
                p.atacar(h);
                imprimirVida();  
		}    
    }
    public void inicio(){
        Label elataque= new Label("Elige tu ataque");
        elataque.getStyleClass().add("l1");
        Button nor = new Button("Casual");
        nor.getStyleClass().add("butnor");
        nor.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){ 
                h.atacar(p,1); 
                p.atacar(h);
                vb.getChildren().clear();
                imprimirVida();
            }
        });
        Button fue = new Button("Fuerte");
        fue.getStyleClass().add("fuer");
        fue.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){ 
                h.atacar(p,2); 
                p.atacar(h);
                vb.getChildren().clear();
                imprimirVida();
            }
        });
        HBox golpes=new HBox();
        golpes.getChildren().addAll(nor,fue);
        golpes.setSpacing(40);
        atacar= new ComboBox<>();
        atacar.getItems().add("Habilidad");
        atacar.getItems().add("Objeto");
        atacar.getStyleClass().add("combo");
        vb.getChildren().addAll(elataque,golpes,atacar);
		hb.getChildren().add(vb);
        hb.getChildren().remove(pregunta);
        bp.setCenter(hb);
        setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if(ke.getCode() == KeyCode.ENTER) {                
                    String opcion= (String) atacar.getValue();
                    hb.getChildren().clear();
                    punch(opcion);
                }
            }
        });
    }
    public void imprimirVida(){
        Label vida = new Label(h.toString());
        vida.getStyleClass().add("hp");
        Label vidae = new Label(p.toString());
        vidae.getStyleClass().add("hpEne");
        vb.getChildren().addAll(vida, vidae);
        bp.setCenter(vb);
        
        if(p.getHp()>0&&h.getHp()>0){
            inicio();
        }else if(p.getHp()<=0){
            vb.getChildren().add(finalBatalla);
            vb.setSpacing(40);
            finalBatalla.getStyleClass().add("finB");
            bp.setCenter(vb);
            Button finalizar = new Button("regresar");
            vb.getChildren().add(finalizar);
            finalizar.getStyleClass().add("end");       
            finalizar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){ 
                main.setScene4(0,0,false,false,false,false,false);
            }
        });

            setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                    if(ke.getCode() == KeyCode.ENTER) {                                               
                        String malo=p.getTipo();
                        switch(malo){
                            case "Estrella":                               
                                main.setScene4(0,0,false,false,false,false,false);
                            break;
                            case "Sombra":
                                main.setScene3(x,y,false,false,true,false,false);
                            break;
                            case "Maestro":
                                main.setSceneFinal();
                            break;
                            case "Muro":
                                main.setSceneMuro(x,y,false,false,true,false,false);
                            break;
                            default: System.out.println("no ");
                            break;
                        }
                    }   
                }
            });
            }else if(h.getHp()<=0){
                finalBatalla.setText("no ganaste");
                vb.getChildren().add(finalBatalla);
                bp.setCenter(vb);
                h.setHp(100);
    			p.setHp(v);
                main.fight(p,x,y);
            }

    }   
}