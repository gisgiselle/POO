
public class JuguitoDeArtista extends ObjetoHp{
	
	public JuguitoDeArtista(){
		super("Juguito de Artista", 13);
	}
	public  double protect(){
		Main main = new Main();
		return((main.getTipo()).getHp() + puntos);
	}
}