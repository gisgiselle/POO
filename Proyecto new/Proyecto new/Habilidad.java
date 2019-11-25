
public class Habilidad{
	private String nombreHabilidad;
	private int puntosEspeciales;

	public Habilidad(String nombreHabilidad, int puntosEspeciales){
		this.nombreHabilidad=nombreHabilidad;
		this.puntosEspeciales=puntosEspeciales;
	}

	public void setNombreHabilidad(String nombreHabilidad){
		this.nombreHabilidad=nombreHabilidad;

	}
	public String getNombreHabilidad(){
		return nombreHabilidad;
	}
	public void setPuntosEspeciales(int puntosEspeciales){
		this.puntosEspeciales=puntosEspeciales;
	}
	public int getPuntosEspeciales(){
		return puntosEspeciales;
	}
}