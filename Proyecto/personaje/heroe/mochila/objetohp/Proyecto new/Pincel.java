
public class Pincel extends Arma{

	public Pincel(){
		super("Pincel", 2);
	}
	public  double damage(){
		Main main = new Main();
		return((main.getTipo()).getHp() - puntos);
	}
	
}