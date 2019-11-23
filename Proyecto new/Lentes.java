
public class Lentes extends ObjetoDefensa{
	
	public Lentes(){
		super("Lentes", 7);
	}
	public  double protect(){
		Casilla casilla = new Casilla();
		return((casilla.getHeroe()).getDefensa() + puntos);
	}
}