
public class BesitoDeMama extends ObjetoHp{
	
	public BesitoDeMama(){
		super("Besito de Mamá", 25);
	}
	public  double protect(){
		Casilla casilla = new Casilla();
		return((casilla.getHeroe()).getHp() + puntos);
	}
}