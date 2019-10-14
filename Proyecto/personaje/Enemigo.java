public class Enemigo extends Personaje{
	private String tipo;
	public Enemigo(String tipo, int hp,  int ataque, int defensa, int sp){
		super(hp,ataque,defensa,sp);
		this.tipo=tipo;
	}

	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public String getTipo(){
		return tipo;
	}

	public void imprime(){
		System.out.println("Enemigo: "+tipo+ " Vida: "+getHp()+" Ataque: "+getAtaque()+" Defensa: "+getDefensa());
	}
}