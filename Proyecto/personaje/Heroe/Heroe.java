public class Heroe extends Personaje{
	private String nombre; 

	public Heroe(String nombre, int hp, int ataque, int defensa, int sp){
		super(hp, ataque, defensa, sp);
		this.nombre=nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}

	public void imprime(){
		System.out.println("Heroe: "+nombre+" Hp: "+getHp()+" Ataque: "+getAtaque()+" Defensa: "+getDefensa());
	}
}	

