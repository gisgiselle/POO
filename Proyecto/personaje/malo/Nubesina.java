package personaje.malo;
import personaje.*;

public class Nubesina extends Malo{

	 public Nubesina(){
	 		super("Nubesina", 50, 10, 5);

			AtaqueEspecial[] ataquesEspeciales = new ataqueEspecial[3];
			ataquesEspeciales[0] = new AtaqueEspecial("Lluvia Salvaje",10);
			ataquesEspeciales[1] = new AtaqueEspecial("Neblinosis",5);
			ataquesEspeciales[2] = new AtaqueEspecial("Rayo Emprendedor",10);

			Habilidad[] habilidades= new Habilidad[3];
			habilidades[0] = new Habilidad("Lluvia acida",10);
			habilidades[1] = new Habilidad("Tornado",5);
			habilidades[2] = new Habilidad("Hericane",7);



	 }
}