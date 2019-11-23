
public class Chamarra extends ObjetoDefensa{
	
	public Chamarra(){
		super("Chamarra", 10);
	}
	public  double protect(){
		Main main = new Main();
		return((main.getTipo()).getDefensa() + puntos);
	}
}