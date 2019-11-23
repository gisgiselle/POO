

public class Sombra extends Malo{

	 public Sombra(){
	 		super("grito","Sombra", 100, 5, 15);
	 		
	 		AtaqueEspecial[] ataquesEspeciales = new AtaqueEspecial[3];
			ataquesEspeciales[0] = new AtaqueEspecial("Suspiro",10);
			ataquesEspeciales[1] = new AtaqueEspecial("Obscuridad total",8);
			ataquesEspeciales[2] = new AtaqueEspecial("Spiral",4);

		
			Habilidad[] habilidades= new Habilidad[2];
			habilidades[0] = new Habilidad("Invisibilidad",7);
			habilidades[1] = new Habilidad("Suspiro",10);

			}
			public void atacarHeroe(Heroe heroe){
				System.out.println("Ataque normal de Sombra");
				heroe.setHp(heroe.getHp()-(heroe.getAtaque()-heroe.getDefensa()));
	 }
}