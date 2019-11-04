package personaje.heroe.mochila.arma;
import mochila.*
public class PlumaFina extends Arma{

	public PlumaFina(){
		super("Pluma Fina", 1.8);
	}
	public  double damage(){
		return(ataque*puntos);
}