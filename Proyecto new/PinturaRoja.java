
public class PinturaRoja extends Arma{

	public PinturaRoja(){
		super("Pintura Roja", 1);
	}
	public  double damage(){
		Casilla casilla = new Casilla();
		return(puntos-(casilla.getHeroe()).getHp());
	}
	
}