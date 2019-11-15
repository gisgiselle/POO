package personaje.Heroe.Mochila.ObjetoHp;
import personaje.*;
import mochila.*;
public class BesitoDeMama extends ObjetoHp{
	
	public BesitoDeMama(){
		super("Besito de Mamá", 25);
	}
	public  double heal(){
		return(hp + puntos);
}