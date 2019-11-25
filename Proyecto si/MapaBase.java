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
    private Button personaje= new Button();
    private Button [][] casilla= new Button[10][10];
    private Main main;
    private int i,j,b1,b2,a1,a2,d1,d2,primeraVez,primeraVez2,sE,sHp;
    private Heroe h;
    private String nom, inv;
    private Button seguir;
    private HBox abajo;
    private int mochila;
    private boolean encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia;
    private Personaje malo; 
    private Boss boss;
    private Label bienvenido= new Label("Bienvenido al mapa");

   
    public MapaBase(Heroe h,  Main main,int b1, int b2, int a1, int a2, int d1, int d2, int i, int j, Personaje malo, Boss boss,int mochila,int sHp,int sE,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){

       super(new GridPane(),800,900);
       this.main=main;
       this.h=h;
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
       this.sE=sE;
       this.sHp=sHp; 
       nom=main.getTipo();
       //mensaje.setPrefSize(600,50);
       primeraVez=i;
       primeraVez2=j;
       //mensaje.setStyle("-fx-background-color:white;");
        switch (nom){
            case "Chucho":
                personaje.setStyle("-fx-background-image:url('assets/chucho.jpg'); -fx-background-size: stretch;");break;
            case "Nina":
                personaje.setStyle("-fx-background-image:url('assets/nina.jpg'); -fx-background-size: stretch;");break;
            case "Ricky":
                personaje.setStyle("-fx-background-image:url('assets/ricky.jpg'); -fx-background-size: stretch;");break;
            case "Sam":
                personaje.setStyle("-fx-background-image:url('assets/sam.jpg'); -fx-background-size: stretch;");break;
            default:
                personaje.setStyle("-fx-background-image:url('assets/chucho.jpg'); -fx-background-size: stretch;");break;
        }
       personaje.setPrefSize(90,90);
       especial(); 
       Button pushInv= new Button("Ver Inventario");
       pushInv.setPrefSize(150,50);
       pushInv.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){               
                String inventario=h.imprimeInventario();
               // mensaje.setText(inventario);
                m2.setBottom(abajo);
            }
        });
       Button stats= new Button("Stats");
       stats.setPrefSize(150,50);
       stats.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
            public void handle(MouseEvent e){               
                //mensaje.setText(h.toString());
                m2.setBottom(abajo);
            }
        });
        m2.setCenter(m1);
        abajo= new HBox();
        abajo.setStyle("fx-background-color:white");
        abajo.getChildren().addAll(pushInv,stats);
        m2.setBottom(abajo);
        m2.setStyle("-fx-background-image:url('assets/starry.png'); -fx-background-size: stretch;");
        super.setRoot(m2);
    }
    public void especial(){
    Button z = new Button();
    z.setStyle("-fx-background-image:url('assets/myst.jpg');");
        for(int a=0;a<10;a++){
            for(int b=0;b<10;b++){
                c =new Button(" ");
                c.setPrefSize(80, 80);
                if(a==i&&b==j){
                        casilla[a][b]=personaje;
                }else if(((a==a1)&&(b==a2))&&(encontroArma==false)){    
                        c.setStyle("-fx-background-image:url('assets/pincel.jpg'); -fx-background-size: stretch;");
                        casilla[a][b]=c;
                }else if(((a==d1)&&(b==d2))&&(encontroDefensa==false)){    
                        c.setStyle("-fx-background-image:url('assets/cuaderno.jpg'); -fx-background-size: stretch;");
                        casilla[a][b]=c;
                }else if(((a==b1)&&(b==b2))&&(entroPelea==false)){    
                        c.setStyle("-fx-background-image:url('assets/vs.jpg'); -fx-background-size: stretch;");
                        casilla[a][b]=c;
                }else if(((a==sHp)&&(b==sHp))&&(agarroVida==false)){             
                        c.setStyle("-fx-background-image:url('assets/heart.jpg'); -fx-background-color: transparent; -fx-background-size: stretch;");
                        casilla[a][b]=c;
                }else if(((a==sE)&&(b==sE))&&(agarroEnergia==false)){             
                        c.setStyle("-fx-background-image:url('assets/energyDrink.jpg');-fx-background-color: transparent; -fx-background-size: stretch;");
                        casilla[a][b]=c;
                }else{
                    c.setStyle("-fx-background-color: transparent;");
                    casilla[a][b]=c; 
                }
                m1.add(casilla[a][b],a,b);
                control(casilla[a][b],b1,b2,a1,a2,d1,d2);
                
            }
        }
    }
    public void control(Button c, int b1, int b2, int a1, int a2, int d1, int d2){       
        c.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent cm) {
                try{
                    switch (cm.getCode()) { 
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
                            casilla[i][j].setStyle("-fx-background-image:url('assets/chucho.jpg');-fx-background-size: stretch;");break;
                        case "Nina":
                            casilla[i][j].setStyle("-fx-background-image:url('assets/nina.jpg');-fx-background-size: stretch;");break;
                        case "Ricky":
                            casilla[i][j].setStyle("-fx-background-image:url('assets/ricky.jpg');-fx-background-size: stretch;");break;
                        case "Sam":
                            casilla[i][j].setStyle("-fx-background-image:url('assets/sam.jpg');-fx-background-size: stretch;");break; 
                        default:
                            casilla[i][j].setStyle("-fx-background-image:url('assets/chucho.jpg');-fx-background-size: stretch;");break;
                    }
                    casilla[i][j].setText(nom);
                    if((i==9)&&(j==9)){
                        h.atacar(boss);
                    }
                    if((primeraVez==0)&&(primeraVez2==0)){
                        if(((i==sHp)&&(j==sHp))&&(agarroVida==false)){             
                            h.setHp(sHp);
                            //mensaje.setText(h.toString());
                            m2.setBottom(abajo);
                            agarroVida=true;
                        }
                        if(((i==sE)&&(j==sE))&&(agarroEnergia==false)){             
                            h.setSp(sE);
                            //mensaje.setText(taquito.toString());
                            m2.setBottom(abajo);
                            agarroEnergia=true;
                        }
                        if(((i==b1)&&(j==b2))&&(entroPelea==false)){             
                            h.atacar(malo);
                            entroPelea=true;
                        }
                        if(((i==a1)&&(j==a2))&&(encontroArma==false)){
                             Arma arma =new Arma("popo", 10);
                             h.addObjetoToMochila(arma, 1);
                           String inventario=h.imprimeInventario();
                            //mensaje.setText("Es un arma "+inventario);
                            m2.setBottom(abajo);
                            encontroArma=true;
                        }
                        if(((i==d1)&&(j==d2))&&(encontroDefensa==false)){
                            ObjetoDefensa obD = new ObjetoDefensa("defensa", 2);
                            h.addObjetoToMochila(obD, 2);
                            String inventario=h.imprimeInventario();
                            //mensaje.setText("Es un objeto de defensa "+inventario);
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
                casilla[i][j].setStyle("-fx-background-image:url('assets/chucho.jpg'); -fx-background-size: stretch;");break;
            case "Nina":
                casilla[i][j].setStyle("-fx-background-image:url('assets/nina.jpg'); -fx-background-size: stretch;");break;
            case "Ricky":
                casilla[i][j].setStyle("-fx-background-image:url('assets/ricky.jpg'); -fx-background-size: stretch;");break;
            case "Sam":
                casilla[i][j].setStyle("-fx-background-image:url('assets/sam.jpg'); -fx-background-size: stretch;");break;       
            default:
                casilla[i][j].setStyle("-fx-background-image:url('assets/chucho.jpg'); -fx-background-size: stretch;");break;
        }
                }
            }
        }); 
    }  
    public void setMochila1(int mochila){
        this.mochila=mochila;
    }
    public int getMochila1(){
        return mochila;
    }
    public void AddHP(int sumHp){h.setHp(h.getHp()+sumHp);}
    public void AddSp(int sumSp){h.setSp(h.getSp()+sumSp);}
    public abstract void Arma(int x);
    public abstract void Defensa(int y);
}