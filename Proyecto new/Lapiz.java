
public class Lapiz extends Arma{

	public Lapiz(){
		super("Lapiz", 7);
	}
	public  double damage(){
		Casilla casilla = new Casilla();
		return(puntos-(casilla.getHeroe()).getHp());
	}	
}