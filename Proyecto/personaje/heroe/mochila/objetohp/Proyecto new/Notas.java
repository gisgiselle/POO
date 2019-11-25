public class Notas extends ObjetoSp{
	
	public Notas(){
		super("Notas", 10);
	}
	public  double recoverSp(){
		Main main = new Main();
		return((main.getTipo()).getSp() + puntos);
	}
}