
public class Cuaderno extends ObjetoDefensa{
	
	public Cuaderno(){
		super("Cuaderno", 13);
	}
	public  double protect(){
		return(defensa + puntos);
	}
}