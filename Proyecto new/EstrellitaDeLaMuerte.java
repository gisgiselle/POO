

public class EstrellitaDeLaMuerte extends Malo{

	 public EstrellitaDeLaMuerte(){
	 		super("EstrellitaDeLaMuerte", 50, 15, 5);

	 		AtaqueEspecial[] ataquesEspeciales = new AtaqueEspecial[3];
			ataquesEspeciales[0] = new AtaqueEspecial("Brillo Letal",10);
			ataquesEspeciales[1] = new AtaqueEspecial("Estrellita, donde estas",3);
			ataquesEspeciales[2] = new AtaqueEspecial("Hi-Five",8);

			Habilidad[] habilidades= new Habilidad[3];
			habilidades[0] = new Habilidad("Explosion estelar",10);
			habilidades[1] = new Habilidad("Destello",10);
			habilidades[2] = new Habilidad("Lluvia de estrellas",7);
	 }
	 public void atacarHeroe(Heroe heroe){
	 	System.out.println("Ataque de la estrella");
	heroe.setHp(heroe.getHp()-(heroe.getAtaque()-heroe.getDefensa()));
	 }
}