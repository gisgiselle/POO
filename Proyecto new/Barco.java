

public class Barco extends Malo{

	 public Barco(){
	 		super("Barco", 100, 25, 15);
			
			ataqueEspecial[] ataquesEspeciales = new ataqueEspecial[3];
			ataquesEspeciales[0] = new AtaqueEspecial("Canon",10);
			ataquesEspeciales[1] = new AtaqueEspecial("Fireball",5);
			ataquesEspeciales[2] = new AtaqueEspecial("Harpoon",10);


			Habilidad[] habilidades= new Habilidad[4];
			habilidades[0] = new Habilidad("Lanza Agua",5);
			habilidades[1] = new Habilidad("Choque",10);
			

	 }
}