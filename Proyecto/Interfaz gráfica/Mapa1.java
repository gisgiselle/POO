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

public class Mapa1 extends MapaPlan implements Serializable{
    private Heore h;
    private int mochila,sE,sHp;
   
    public Mapa(Heroe h, Main main, int i, int j, Personaje malo, Boss boss, int mochila,int sHp,int sE,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){
       
       super(h, main,4,6,8,5,8,8,i,j,malo,boss,morral,sHp,sE,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);
       this.h=h;  
       this.mochila=mochila;    
       this.sE=sE;
       this.sHp=sHp; 
    }

    public void Arma(int mochila){
        this.mochila=mochila;
        Arma pincel= new Arma("Pincel",15,7);
        h.addObjetoToMochila(pincel,mochila);
        mochila++;
        super.setMochila1(mochila);
    }
    public void Defensa(int mochila){
        this.mochila=mochila;
        Condimento cuaderno= new Defensa("cuaderno",20,5);
        h.addObjetoToMochila(cuaderno,mochila);
        mochila++;
        super.setMochila1(mochila);
    }
}