package personaje;

public abstract class Personaje{
	String nombre; 
	private int hp, ataque, defensa;

	public Personaje(String nombre, int hp, int ataque, int defensa){
		this.nombre=nombre;
		this.hp=hp;
		this.ataque=ataque;
		this.defensa=defensa;
	}

	public abstract void pelea();
	
}