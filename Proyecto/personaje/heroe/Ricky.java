package personaje.heroe;
import personaje.*;

public class Ricky extends Heroe{

	public Ricky(){
		super("Ricky",250,10,10,15);
		Habilidad[] habilidades= new Habilidad[4];
		habilidades[0] = new Habilidad("Déficit de Atención",15);
		habilidades[1] = new Habilidad("Hiperactividad",8);
		habilidades[2] = new Habilidad("Pellizcar",4);
		habilidades[3]= new Habilidad("Atacar agujetas", 13);

	}
	public void atacar(Personaje malo){
		System.out.println("Ataque normal de Ricky");
		enemigo.setHp(enemigo.getHp()-(getAtaque()-malo.getDefensa()));
	}
}