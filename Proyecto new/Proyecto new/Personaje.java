

public abstract class Personaje{
	
	private String nombre, tipo; 
	private int hp, ataque, defensa;
	//private Label img;

	public Personaje(String tipo, String nombre, int hp, int ataque, int defensa){
		this.nombre=nombre;
		this.hp=hp;
		this.ataque=ataque;
		this.defensa=defensa;
		//this.img= img;
	}


	public void setNombre(String nombre){
		this.nombre= nombre;
	}
	public String getNombre(){
			return nombre;
	}
	public void setHp(int hp){
					this.hp= hp;


	}
	
	public int getHp(){
				return hp;

	}
	public void setDefensa(int defensa){
			this.defensa= defensa;

	}
	
	public int getDefensa(){
				return defensa;

	}
	public void setAtaque(int ataque){
		

	this.ataque= ataque;

	}
	
	public int getAtaque(){
		return ataque;

	}
	//	public Label getImg(){
		//return img;
	//}
	//public void setImg(Label img){
		//this.img=img;
	//}
	public String getTipo(){
			Heroe heroe = new Heroe();
			heroe.toString();
			return  heroe;
	}
	public void setTipo(String tipo){
					this.tipo= tipo;


	}

	//public abstract void pelea();
	
}