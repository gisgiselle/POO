
public class Lapiz extends Arma{

	public Lapiz(){
		super("Lapiz", 7);
	}
	public  double damage(){
		Main main = new Main();
		return((main.getTipo()).getHp() - puntos);
	}	
}