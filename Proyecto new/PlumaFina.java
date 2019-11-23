
public class PlumaFina extends Arma{

	public PlumaFina(){
		super("Pluma Fina", 1);
	}
	public  double damage(){
		Casilla casilla = new Casilla();
		return(puntos-(casilla.getHeroe()).getHp());
	}
}