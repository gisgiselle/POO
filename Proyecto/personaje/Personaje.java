public class Personaje{
	
	private int hp, ataque, defensa, sp;


	public Personaje(int hp, int ataque, int defensa, int sp){
		this.hp=hp;
		this.ataque=ataque;
		this.defensa=defensa;
		this.sp=sp;
	}

	public int getHp(){
		return hp;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	public int getAtaque(){
		return ataque;
	}
	public void setAtaque(int ataque){
		this.ataque=ataque;
	}
	public int getDefensa(){
		return hp;
	}
	public void setDefensa(int defensa){
		this.defensa=defensa;
	}
	public int getSp(){
		return sp;
	}
	public void setSp(int sp){
		this.sp=sp;
	}

	public void atacar(Personaje enemigo){
		System.out.println("Atacando ");
		enemigo.setHp(enemigo.getHp()-ataque);
	}

	public void imprime(){
		System.out.println("Personaje Vida: "+hp+" Ataque: "+ataque+" Defensa: "+defensa);
	}
}
