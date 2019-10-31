public abstract class ObjetoDefensa extends Objeto{
	public ObjetoDefensa(String nombre, int puntos){
		super(nombre,puntos);
	}
	public abstract double protect();
}