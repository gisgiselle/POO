
public class Carpeta extends ObjetoDefensa{
	
	public Carpeta(){
		super("Carpeta", 15);
	}
	public  double protect(){
		Main main = new Main();
		return((main.getTipo()).getDefensa() + puntos);
	}
}