public class MotivacionDeMama extends ObjetoSp{
	
	public MotivacionDeMama(){
		super("Motivación de Mamá", 10);
	}
	public  double recoverSp(){
		Main main = new Main();
		return((main.getTipo()).getSp() + puntos);
	}
}