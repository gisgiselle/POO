

public class Ricky extends Heroe{

	public Ricky(){
		super("tanque","Ricky",250,10,10,15);
		Habilidad[] habilidades= new Habilidad[4];
		habilidades[0] = new Habilidad("Déficit de Atención",15);
		habilidades[1] = new Habilidad("Hiperactividad",8);
		habilidades[2] = new Habilidad("Pellizcar",4);
		habilidades[3]= new Habilidad("Atacar agujetas", 13);

	}
	public void atacar(Personaje malo){
		System.out.println("Ataque normal de Ricky");
		malo.setHp(malo.getHp()-(malo.getAtaque()-malo.getDefensa()));
	}

		public void atacar(Boss boss){
		System.out.println("Ataque normal de Chucho");
	boss.setHp(boss.getHp()-(boss.getAtaque()-boss.getDefensa()));	}
}