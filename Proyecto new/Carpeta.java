
public class Carpeta extends ObjetoDefensa{
	
	public Carpeta(){
		super("Carpeta", 15);
	}
	public  double protect(){
		return(defensa + puntos);
	}
}