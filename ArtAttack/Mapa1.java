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

public class Mapa1 extends MapaBase implements Serializable{
    private Heroe h;
    private int mochila,sSp,sHp;
   
    public Mapa1(Heroe h, Main main, int i, int j, Personaje malo, Boss boss, int mochila,int sHp,int sSp,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){
       
       super(h, main,4,6,8,5,8,8,i,j,malo,boss,mochila,sHp,sSp,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);
       this.h=h;  
       this.mochila=mochila;    
       this.sSp=sSp;
       this.sHp=sHp; 
    }

    public void Arma(int mochila){
        this.mochila=mochila;
        Objeto objj= new Arma("Pincel",14,7);
        h.addObjetoMochila(objj,2);
        mochila++;
        super.setMochila(mochila);
    }
    public void ObjetoDefensa(int mochila){
        this.mochila=mochila;
        Objeto ccosososcoos= new ObjetoDefensa("Cuaderno",20,5);
        h.addObjetoMochila(ccosososcoos,3);
        mochila++;
        super.setMochila(mochila);
    }
}