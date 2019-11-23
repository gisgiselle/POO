public class MotivacionDeMama extends ObjetoSp{
	
	public MotivacionDeMama(){
		super("Motivación de Mamá", 10);
	}
	public  double recoverSp(){
		Casilla casilla = new Casilla();
		return((casilla.getHeroe()).getSp() + puntos);
	}
}