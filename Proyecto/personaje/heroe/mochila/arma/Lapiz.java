package personaje.heroe.mochila.arma;
import mochila.*
public class Lapiz extends Arma{

	public Lapiz(){
		super("Lapiz", .7);
	}
	public  double damage(){
		return(ataque*puntos);
	
}