
public class JuguitoDeArtista extends ObjetoHp{
	
	public JuguitoDeArtista(){
		super("Juguito de Artista", 13);
	}
	public  double protect(){
		Casilla casilla = new Casilla();
		return((casilla.getHeroe()).getHp() + puntos);
	}
}