
public class Regla extends Arma{

	public Regla(){
		super("Regla", 2);
	}
	public  double damage(){
		Main main = new Main();
		return((main.getTipo()).getHp() - puntos);
	}
}
	
