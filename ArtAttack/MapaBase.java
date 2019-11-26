import java.util.Optional;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import java.io.Serializable;

public abstract class MapaBase extends Scene implements Serializable{
    private GridPane m1= new GridPane();
    private BorderPane m2= new BorderPane();
    private Button c,vacio;
    private Button esPersonaje= new Button();
    private Button [][] casilla= new Button[10][10];
    private Main main;
    private int i,j,b1,b2,a1,a2,d1,d2,primeraVez,primeraVez2,sSp,sHp;
    private Heroe heroe;
    private String nom, inventario;
    private Button continuar;
    private HBox abajo;
    private int mochila;
    private boolean encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia;
    private Personaje malo; 
    private Boss boss;

    public void SumarHP(int sHp){
        heroe.setHp(heroe.getHp()+ sHp);
    }
    public void SumarSp(int sSp){
        heroe.setSp(heroe.getSp()+ sSp);
    }
    
    public abstract void Arma(int arm);
    public abstract void ObjetoDefensa(int def);

   
    public MapaBase(Heroe heroe, Main main,int b1, int b2, int a1, int a2, int d1, int d2, int i, int j, Personaje malo, Boss boss,int mochila,int sHp,int sSp,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){

       super(new GridPane(),800,900);
       this.main=main;
       this.heroe=heroe;
       this.b1=b1;
       this.b2=b2;
       this.a1=a1;
       this.a2=a2;
       this.d1=d1;
       this.d2=d2;
       this.i=i;
       this.j=j;
       this.mochila=mochila;
       this.malo=malo;
       this.boss=boss;     
       this.sSp=sSp;
       this.sHp=sHp; 
       nom=heroe.getTipo();
       primeraVez=i;
       primeraVez2=j;
        switch (nom){
            case "Chucho":
                esPersonaje.setStyle("-fx-background-image:url('assets/chucho.png'); -fx-background-color: transparent; -fx-background-size: stretch;");break;
            case "Nina":
                esPersonaje.setStyle("-fx-background-image:url('assets/nina.png');  -fx-background-color: transparent;-fx-background-size: stretch;");break;
            case "Ricky":
                esPersonaje.setStyle("-fx-background-image:url('assets/ricky.png'); -fx-background-color: transparent; -fx-background-size: stretch;");break;
            default:
                esPersonaje.setStyle("-fx-background-image:url('assets/chucho.png'); -fx-background-color: transparent; -fx-background-size: stretch;");break;
        }
       esPersonaje.setPrefSize(90,90);
       pintar(); 
       Button verInventario= new Button("Mochila");
       verInventario.setPrefSize(150,50);
       verInventario.getStyleClass().add("mochila");
       verInventario.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){               
                inventario=heroe.imprimeInventario();
                m2.setBottom(abajo);
            }
        });
       Button stats= new Button("Stats");
       stats.setPrefSize(150,50);
       stats.getStyleClass().add("stats");
       stats.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){               
                 main.setStats();
            }
        });
        m2.setCenter(m1);
        abajo= new HBox();
        abajo.getChildren().addAll(verInventario,stats);
        abajo.setSpacing(40);
        m2.setBottom(abajo);
        m2.setStyle("-fx-background-image:url('assets/starry.png');");
        super.setRoot(m2);
    }
    public void pintar(){
    Button signo = new Button();
    signo.setStyle("-fx-background-image:url('assets/dot.png');");
        for(int a = 0; a < 10; a++){
            for(int b=0;b<10;b++){
                c =new Button(" ");
                c.setPrefSize(80, 80);
                if(a==i&&b==j){
                        casilla[a][b]=esPersonaje;
                }else if(((a==a1)&&(b==a2))&&(encontroArma==false)){    
                        c.setStyle("-fx-background-image:url('assets/pincel.png');  -fx-background-color: transparent; -fx-background-size: stretch;");
                        casilla[a][b]=c;
                }else if(((a==d1)&&(b==d2))&&(encontroDefensa==false)){    
                        c.setStyle("-fx-background-image:url('assets/cuaderno.png');  -fx-background-color: transparent; -fx-background-size: stretch;");
                        casilla[a][b]=c;
                }else if(((a==b1)&&(b==b2))&&(entroPelea==false)){    
                        c.setStyle("-fx-background-image:url('assets/sur.png'); -fx-background-color: transparent; -fx-background-size: stretch;");
                        casilla[a][b]=c;
                }else if(((a==sHp)&&(b==sHp))&&(agarroVida==false)){             
                        c.setStyle("-fx-background-image:url('assets/heart.png'); -fx-background-color: transparent; -fx-background-size: stretch;");
                        casilla[a][b]=c;
                }else if(((a==sSp)&&(b==sSp))&&(agarroEnergia==false)){             
                        c.setStyle("-fx-background-image:url('assets/energy.png');-fx-background-color: transparent; -fx-background-size: stretch;");
                        casilla[a][b]=c;
                }else{
                    c.setStyle("-fx-background-color: transparent;");
                    casilla[a][b]=c; 
                }
                m1.add(casilla[a][b],a,b);
                moverse(casilla[a][b],b1,b2,a1,a2,d1,d2);
                
            }
        }
    }
    public void moverse(Button m, int b1, int b2, int a1, int a2, int d1, int d2){       
        m.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                try{
                    switch (ke.getCode()) { 
                        case UP: j--;  
                            casilla[i][j+1].setStyle("-fx-background-image:none;-fx-background-color: transparent;");
                            casilla[i][j+1].setText(" ");break;
                        case RIGHT: i++;
                            casilla[i-1][j].setStyle("-fx-background-image:none;-fx-background-color: transparent;");
                            casilla[i-1][j].setText(" ");break; 
                        case DOWN:  j++;
                            casilla[i][j-1].setStyle("-fx-background-image:none;-fx-background-color: transparent;");
                            casilla[i][j-1].setText(" ");break;  
                        case LEFT:  i--;
                            casilla[i+1][j].setStyle("-fx-background-image:none;-fx-background-color: transparent;");
                            casilla[i+1][j].setText(" ");break;
                            }
                    switch (nom){
                        case "Chucho":
                            casilla[i][j].setStyle("-fx-background-image:url('assets/chucho.png'); -fx-background-color: transparent;-fx-background-size: stretch;");break;
                        case "Ricky":
                            casilla[i][j].setStyle("-fx-background-image:url('assets/ricky.png'); -fx-background-color: transparent;-fx-background-size: stretch;");break; 
                        case "Nina":
                            casilla[i][j].setStyle("-fx-background-image:url('assets/nina.png'); -fx-background-color: transparent;-fx-background-size: stretch;");break;
                        default:
                            casilla[i][j].setStyle("-fx-background-image:url('assets/chucho.png'); -fx-background-color: transparent;-fx-background-size: stretch;");break;
                    }
                    casilla[i][j].setText(nom);
                    if((i==9)&&(j==9)){
                        main.fight(boss,9,9);
                    }
                    if((primeraVez==0)&&(primeraVez2==0)){
                        if(((i==sHp)&&(j==sHp))&&(agarroVida==false)){             
                            SumarHP(sHp);
                            m2.setBottom(abajo);
                            agarroVida=true;
                        }
                        if(((i==sSp)&&(j==sSp))&&(agarroEnergia==false)){             
                            SumarSp(sSp);
                            m2.setBottom(abajo);
                            agarroEnergia=true;
                        }
                        if(((i==b1)&&(j==b2))&&(entroPelea==false)){             
                            main.fight(malo,i,j);
                            entroPelea=true;
                        }
                        if(((i==a1)&&(j==a2))&&(encontroArma==false)){
                            Arma(mochila);
                            inventario=heroe.imprimeInventario();
                            m2.setBottom(abajo);
                            encontroArma=true;
                        }
                        if(((i==d1)&&(j==d2))&&(encontroDefensa==false)){
                            ObjetoDefensa(mochila);
                            inventario=heroe.imprimeInventario();
                            m2.setBottom(abajo);
                            encontroDefensa=true;
                        }
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("No puedes pasar");
                    if(i>=10){i=9;}
                    if(i<=-1){i=0;}
                    if(j>=10){j=9;}
                    if(j<=-1){j=0;}
                    switch (nom){
             case "Chucho":
                casilla[i][j].setStyle("-fx-background-image:url('assets/chucho.png'); -fx-background-size: stretch;");break;
             case "Nina":
                casilla[i][j].setStyle("-fx-background-image:url('assets/nina.png'); -fx-background-size: stretch;");break;
             case "Ricky":
                casilla[i][j].setStyle("-fx-background-image:url('assets/ricky.png'); -fx-background-size: stretch;");break;
             default:
                casilla[i][j].setStyle("-fx-background-image:url('assets/chucho.png'); -fx-background-size: stretch;");break;
        }
                }
            }
        }); 
    }  
    public void setMochila(int mochila){
        this.mochila=mochila;
    }
    public int getMochila(){
        return mochila;
    }

}