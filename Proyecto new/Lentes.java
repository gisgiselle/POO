
public class Lentes extends ObjetoDefensa{
	
	public Lentes(){
		super("Lentes", 7);
	}
	public  double protect(){
		Main main = new Main();
		return((main.getTipo()).getDefensa() + puntos);
	}
}