package personaje;

public abstract class Personaje21{
	String nombre; 
	private int hp, ataque, defensa;

	public Personaje21(String nombre, int hp, int ataque, int defensa){
		this.nombre=nombre;
		this.hp=hp;
		this.ataque=ataque;
		this.defensa=defensa;
	}

	public abstract void pelea();
	
}