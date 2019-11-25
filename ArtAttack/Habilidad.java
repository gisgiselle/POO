public class Habilidad {
	private String nombreH; 
	private int punH; 

	public Habilidad(String nombreH, int punH){

		this.nombreH=nombreH; 
		this.punH=punH; 
	}

	public String getNombreH(){
		return nombreH;
	}

	public int getHabilidadP(){
		return punH;
	}
}