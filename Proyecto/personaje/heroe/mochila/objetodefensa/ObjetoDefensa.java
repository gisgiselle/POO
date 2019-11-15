package personaje.Heroe.Mochila.ObjetoDefensa;
import mochila.*;
import personaje.*;
public abstract class ObjetoDefensa extends Objeto{
	public ObjetoDefensa(String nombre, int puntos){
		super(nombre,puntos);
	}
	public abstract double protect();
}