public class BebidaEnergetica extends ObjetoSp{
	
	public BebidaEnergetica(){
		super("Bebida Energética", 10);
	}

	public  double recoverSp(){
		return(sp + puntos);
	}
}