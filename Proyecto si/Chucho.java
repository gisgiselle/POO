
public class Chucho extends Heroe{

	public Chucho(){
		super("Bueno","Chucho",200,30,10,20);
		Habilidad[] habilidades= new Habilidad[4];
		habilidades[0] = new Habilidad("Risa ruidosa",20);
		habilidades[1] = new Habilidad("Burla",10);
		habilidades[2] = new Habilidad("Berrinche",15);
		habilidades[3]= new Habilidad("Escondidillas", 22);

	}

	public void atacar(Personaje malo){
		System.out.println("Ataque normal de Chucho");
	malo.setHp(malo.getHp()-(malo.getAtaque()-malo.getDefensa()));	}

	public void atacar(Boss boss){
		System.out.println("Ataque normal de Chucho");
	boss.setHp(boss.getHp()-(boss.getAtaque()-boss.getDefensa()));	}
}