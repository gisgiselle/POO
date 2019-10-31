package personaje.heroe;
import personaje.*;

public class Chucho extends Heroe{

	public Chucho(){
		super("Chucho",200,30,10,20);
		Habilidad[] habilidades= new Habilidad[4];
		habilidades[0] = new Habilidad("Risa ruidosa",20);
		habilidades[1] = new Habilidad("Burla",10);
		habilidades[2] = new Habilidad("Berrinche",15);
		habilidades[3]= new Habilidad("Escondidillas", 22);

	}

	public void atacar(Personaje malo){
		System.out.println("Ataque normal de Chucho");
		enemigo.setHp(enemigo.getHp()-(getAtaque()-malo.getDefensa()));
	}
}