
public class Pomadita extends ObjetoHp{
	
	public Pomadita(){
		super("Pomadita", 15);
	}
	public double heal(){
		Main main = new Main();
		return((main.getTipo()).getHp() + puntos);
	}
}