
public class PinturaVerde extends Arma{

	public PinturaVerde(){
		super("Pintura Verde", 3);
	}
	public  double damage(){
		Main main = new Main();
		return((main.getTipo()).getHp() - puntos);
	}	
	
}