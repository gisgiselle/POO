  

public class Curita extends ObjetoHp{
	
	public Curita(){
		super("Curita", 10);
	}
	public  double heal(){
		Main main = new Main();
		return((main.getTipo()).getHp() + puntos);
	}
}