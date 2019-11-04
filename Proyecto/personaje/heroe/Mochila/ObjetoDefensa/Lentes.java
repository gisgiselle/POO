import mochila.*;
import personaje.*;
public class Lentes extends ObjetoDefensa{
	
	public Lentes(){
		super("Lentes", 7);
	}
	public  double protect(){
		return(defensa + puntos);
}