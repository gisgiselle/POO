
public class VanGogh extends Boss{
	
	public VanGogh(){
		super("Van Gogh", 250, 40, 25);

Habilidad[] habilidades= new Habilidad[4];
		habilidades[0] = new Habilidad("Pinturazo",20);
		habilidades[1] = new Habilidad("Abstraccion",10);
		habilidades[2] = new Habilidad("Bastonazo",15);
		habilidades[3]= new Habilidad("Revitalizado Artistico", 22);

}
}