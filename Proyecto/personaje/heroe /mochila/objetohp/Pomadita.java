package personaje.Heroe.Mochila.ObjetoHp;
import personaje.*;
import mochila.*;
public class Pomadita extends ObjetoHp{
	
	public Pomadita(){
		super("Pomadita", 15);
	}
	public  double heal(){
		return(hp + puntos);
}