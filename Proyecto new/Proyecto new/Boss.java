


public abstract class Boss extends Personaje{

private Habilidad[] habilidades;


public Boss(String tipo, String nombre, int hp, int ataque, int defensa){
		super(tipo, nombre, hp, ataque, defensa);

}

public Habilidad[] getHabilidades(){
		return habilidades;
	}
public void setHabilidades(Habilidad[] habilidades){
		this.habilidades=habilidades;
	}



		
}