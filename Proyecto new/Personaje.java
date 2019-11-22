

public abstract class Personaje{
	private String nombre; 
	private int hp, ataque, defensa;

	public Personaje(String nombre, int hp, int ataque, int defensa){
		this.nombre=nombre;
		this.hp=hp;
		this.ataque=ataque;
		this.defensa=defensa;
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


	//public abstract void pelea();
	
}