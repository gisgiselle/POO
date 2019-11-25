

public class Grito extends Boss{
	public Grito(){
		super("grito","Grito", 350, 40, 25);
Habilidad[] habilidades= new Habilidad[4];
		habilidades[0] = new Habilidad("Grito ensordecedor",20);
		habilidades[1] = new Habilidad("Clonacion",10);
		habilidades[2] = new Habilidad("Minimizacion",15);
		habilidades[3]= new Habilidad("Eco", 22);

}
	
}