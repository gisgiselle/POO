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

public class Mapa2 extends MapaBase implements Serializable{
    private Heore h;
    private int mochila,sE,sHp;
   
    public Mapa2(Heroe h, Main main, int i, int j, Personaje malo, Boss boss, int mochila,int sHp,int sE,boolean encontroArma,boolean encontroDefensa,boolean entroPelea,boolean agarroVida,boolean agarroEnergia){
       
       super(h,main,4,6,8,5,8,8,i,j,malo,boss,mochila,sHp,sE,encontroArma,encontroDefensa,entroPelea,agarroVida,agarroEnergia);
       this.h=h;  
       this.mochila=mochila;    
       this.sE=sE;
       this.sHp=sHp; 
    }

    public void CosoHp(int mochila){
        this.mochila=mochila;
        ObjetoHp mama= new ObjetoHp("Motivación de mamá",30,10);
        h.addObjetoToMochila(mama,mochila);
        mochila++;
        super.setMochila1(mochila);
    }
    public void Arma(int mochila){
        this.mochila=mochila;
        Arma lapiz= new Arma("lapiz",5,3);
        h.addObjetoToMochila(lapiz,mochila);
        mochila++;
        super.setMochila1(mochila);
    }
    public void Defensa(int mochila){
        this.mochila=mochila;
        ObjetoDefensa chamarra= new ObjetoDefensa("chamarra",10,5);
        h.addObjetoToMochila(chamarra,mochila);
        mochila++;
        super.setMochila1(mochila);
    }
}