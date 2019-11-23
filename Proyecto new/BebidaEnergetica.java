public class BebidaEnergetica extends ObjetoSp{
	
	public BebidaEnergetica(){
		super("Bebida Energética", 10);
	}

	public  double recoverSp(){
		Main main = new Main();
		return((main.getTipo()).getSp() + puntos);
	}
}