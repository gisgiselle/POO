
public class PlumaFina extends Arma{

	public PlumaFina(){
		super("Pluma Fina", 1);
	}
	public  double damage(){
		Main main = new Main();
		return((main.getTipo()).getHp() - puntos);
	}
}