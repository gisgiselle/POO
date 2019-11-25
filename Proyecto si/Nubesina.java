

public class Nubesina extends Malo{

	 public Nubesina(){
	 		super("noche","Nubesina", 50, 10, 5);

			AtaqueEspecial[] ataquesEspeciales = new AtaqueEspecial[3];
			ataquesEspeciales[0] = new AtaqueEspecial("Lluvia Salvaje",10);
			ataquesEspeciales[1] = new AtaqueEspecial("Neblinosis",5);
			ataquesEspeciales[2] = new AtaqueEspecial("Rayo Emprendedor",10);

			Habilidad[] habilidades= new Habilidad[3];
			habilidades[0] = new Habilidad("Lluvia acida",10);
			habilidades[1] = new Habilidad("Tornado",5);
			habilidades[2] = new Habilidad("Hericane",7);

	 }

	public void atacarHeroe(Heroe heroe){
		System.out.println("Ataque normal de Sombra");
		heroe.setHp(heroe.getHp()-(heroe.getAtaque()-heroe.getDefensa()));
	}
}