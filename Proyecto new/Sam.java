  


public class Sam extends Heroe{

	public Sam(){
		super("dps","Sam",100,50,30,20);
		Habilidad[] habilidades= new Habilidad[4];
		habilidades[0] = new Habilidad("Aventada de tenis",16);
		habilidades[1] = new Habilidad("Ojitos tiernos",20);
		habilidades[2] = new Habilidad("Acusar con mamá",29);
		habilidades[3]= new Habilidad("Estudio", 22);

	}
	public void atacar(Personaje malo){
		System.out.println("Ataque normal de Sam");
		malo.setHp(malo.getHp()-(malo.getAtaque()-malo.getDefensa()));	}
			public void atacar(Boss boss){
		System.out.println("Ataque normal de Chucho");
	boss.setHp(boss.getHp()-(boss.getAtaque()-boss.getDefensa()));	}
	
}