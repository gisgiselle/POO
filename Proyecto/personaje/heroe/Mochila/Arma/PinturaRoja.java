package personaje.heroe.mochila.arma;
import mochila.*
public class PinturaRoja extends Arma{

	public PinturaRoja(){
		super("Pintura Roja", 1.2);
	}
	public  double damage(){
		return(ataque*puntos);
	
}