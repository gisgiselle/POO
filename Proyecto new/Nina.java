

public class Nina extends Heroe{

	public Nina(){
		super("Nina",150,40,20,30);
		Habilidad[] habilidades= new Habilidad[4];
		habilidades[0] = new Habilidad("baia baia",15);
		habilidades[1] = new Habilidad("Ternura",20);
		habilidades[2] = new Habilidad("Cachetada",5);
		habilidades[3]= new Habilidad("Baba", 10);

	}
	public void atacar(Personaje malo){
		System.out.println("Ataque normal de Nina");
	malo.setHp(malo.getHp()-(malo.getAtaque()-malo.getDefensa()));
	}
	public void atacar(Boss boss){
		System.out.println("Ataque normal de Chucho");
	boss.setHp(boss.getHp()-(boss.getAtaque()-boss.getDefensa()));	}
}