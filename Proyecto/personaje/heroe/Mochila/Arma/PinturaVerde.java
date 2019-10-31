public class PinturaVerde extends Arma{

	public PinturaVerde(){
		super("Pintura Verde", .3);
	}
	public  double damage(){
		return(ataque*puntos);
	
}