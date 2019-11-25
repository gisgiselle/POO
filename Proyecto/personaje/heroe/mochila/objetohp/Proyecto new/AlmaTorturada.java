

public class AlmaTorturada extends Malo{

	 public AlmaTorturada(){
	 		super("grito","AlmaTorturada", 100, 25, 10);


	 		AtaqueEspecial[] ataquesEspeciales = new ataqueEspecial[3];
			ataquesEspeciales[0] = new AtaqueEspecial("Neurohit",7);
			ataquesEspeciales[1] = new AtaqueEspecial("Grito supersonico",10);
			ataquesEspeciales[2] = new AtaqueEspecial("Sangra Timpanos",10);


			Habilidad[] habilidades= new Habilidad[2];
			habilidades[0] = new Habilidad("Grito agudo",10);
			habilidades[1] = new Habilidad("Lluvia de lagrimas",5);
			

	 }
}