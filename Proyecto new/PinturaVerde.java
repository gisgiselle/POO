
public class PinturaVerde extends Arma{

	public PinturaVerde(){
		super("Pintura Verde", 3);
	}
	public  double damage(){
		Casilla casilla = new Casilla();
		return(puntos-(casilla.getHeroe()).getHp());
	}	
	
}