
public class Chamarra extends ObjetoDefensa{
	
	public Chamarra(){
		super("Chamarra", 10);
	}
	public  double protect(){
		return(defensa + puntos);
	}
}