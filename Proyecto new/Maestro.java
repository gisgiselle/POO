

public class Maestro extends Boss {
public Maestro(){
		super("Maestro", 350, 35 ,30 );

		Habilidad[] habilidades= new Habilidad[4];
		habilidades[0] = new Habilidad("Regaño",20);
		habilidades[1] = new Habilidad("Castigo",10);
		habilidades[2] = new Habilidad("TareaExtra",15);
		habilidades[3]= new Habilidad("Expulsion", 22);

} 
}