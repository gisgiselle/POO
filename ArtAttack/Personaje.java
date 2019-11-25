import javafx.scene.control.Label;
public class Personaje{

	private int hp;
	private String tipo;
	private int ataque;
	private int defensa;
	private int sp;
	private Label img;
	

	public Personaje(String tipo, int hp, int sp, int ataque,int defensa){
		this.defensa=defensa;
		this.sp=sp;		
		this.tipo=tipo;
		this.hp=hp;
		this.ataque=ataque;

	}
	
	public void setTipo(String nombre){
		this.tipo=tipo;
	}

	public String getTipo(){
		return tipo;
	}

	public void setHp(int hp){
		this.hp=hp;
	}

	public int getHp(){
		return hp;
	}

	public void setAtaque(int ataque){
		this.ataque=ataque;
	}

	public int getAtaque(){
		return ataque;
	}

	public void setDefensa(int defensa){
		this.defensa=defensa;
	}
	public int getDefensa(){
		return defensa;
	}
	public int getSp(){
		return sp;
	}
	public void setSp(int energia){
		this.sp=sp;
	}

	public String toString(){
		return "Personaje: "+tipo+" HP: "+hp+" ataque: "+ataque+" defensa: "+defensa+" Sp: "+sp;
	}
	public void atacar(Personaje enemigo){
        enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
    }
	public Label getImg(){
		return img;
	}
	public void setImg(Label img){
		this.img=img;
	}

}