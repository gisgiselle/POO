
public class Pomadita extends ObjetoHp{
	
	public Pomadita(){
		super("Pomadita", 15);
	}
	public double heal(){
		Casilla casilla = new Casilla();
		return((casilla.getHeroe()).getHp() + puntos);
	}
}