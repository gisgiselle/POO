package personaje.Heroe.Mochila.ObjetoHp;
import personaje.*;
import mochila.*;
public class JuguitoDeArtista extends ObjetoHp{
	
	public JuguitoDeArtista(){
		super("Juguito de Artista", 13);
	}
	public  double heal(){
		return(hp + puntos);
}