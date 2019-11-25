
public class PinturaRoja extends Arma{

	public PinturaRoja(){
		super("Pintura Roja", 1);
	}
	public  double damage(){
		Main main = new Main();
		return((main.getTipo()).getHp() - puntos);
	}
	
}