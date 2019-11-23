
public class BesitoDeMama extends ObjetoHp{
	
	public BesitoDeMama(){
		super("Besito de Mamá", 25);
	}
	public  double protect(){
		Main main = new Main();
		return((main.getTipo()).getHp() + puntos);
	}
}