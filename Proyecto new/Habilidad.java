
public class Habilidad{
	private String nombreHabilidad;
	private int puntosEspeciales;

	public Habilidad(String nombreHabilidad, int puntosEspeciales){
		super(String nombreHabilidad, int puntosEspeciales);
		this.nombreHabilidad=nombreHabilidad;
		this.puntosEspeciales=puntosEspeciales;
	}

	public setNombreHabilidad(String nombreHabilidad){
		this.nombreHabilidad=nombreHabilidad;

	}
	public String getNombreHabilidad(){
		return nombreHabilidad;
	}
	public setPuntosEspeciales(int puntosEspeciales){
		this.puntosEspeciales=puntosEspeciales;
	}
	public getPuntosEspeciales(){
		return puntosEspeciales;
	}
}