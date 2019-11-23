
public class Pincel extends Arma{

	public Pincel(){
		super("Pincel", 2);
	}
	public  double damage(){
				Casilla casilla = new Casilla();

		return(puntos-(casilla.getHeroe()).getHp());
	}
	
}