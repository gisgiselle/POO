public class Notas extends ObjetoSp{
	
	public Notas(){
		super("Notas", 10);
	}
	public  double recoverSp(){
		Casilla casilla = new Casilla();
		return((casilla.getHeroe()).getSp() + puntos);
	}
}