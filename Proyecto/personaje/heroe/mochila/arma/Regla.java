package personaje.heroe.mochila.arma;
import mochila.*
public class Regla extends Arma{

	public Regla(){
		super("Regla", 2.3);
	}
	public  double damage(){
		return(ataque*puntos);
	
}