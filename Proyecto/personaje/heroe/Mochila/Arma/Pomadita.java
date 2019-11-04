package personaje.heroe.mochila.arma;
import mochila.*
public class Pomadita extends ObjetoHp{
	
	public Pomadita(){
		super("Pomadita", 15);
	}
	public  double heal(){
		return(hp + puntos);
}