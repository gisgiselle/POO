  
public abstract class ObjetoHp extends Objeto{
	public ObjetoHp(String nombre, int puntos){
		super(nombre,puntos);
	}
	public abstract double heal();
}