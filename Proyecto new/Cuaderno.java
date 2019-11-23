
public class Cuaderno extends ObjetoDefensa{
	
	public Cuaderno(){
		super("Cuaderno", 13);
	}
	public  double protect(){
		Main main = new Main();
		return((main.getTipo()).getDefensa() + puntos);
	}
}