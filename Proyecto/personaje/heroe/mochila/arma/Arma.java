package personaje.heroe.mochila.arma;
import mochila.*
public abstract class Arma extends Objeto{
	public Arma(String nombre, int puntos){
		super(nombre,puntos);
	}

	public abstract double damage();
}