package personaje.Heroe.Mochila.ObjetoHp;
import personaje.*;
import mochila.*;
public class Curita extends ObjetoHp{
	
	public Curita(){
		super("Curita", 10);
	}
	public  double heal(){
		return(hp + puntos);
}