public abstract class Objeto implements Material{
	private String nombre;
	 private int puntosO;
	 private int menosE;

	public Objeto(String nombre, int puntosO,int menosE){
		this.nombre=nombre;
		this.puntosO=puntosO;
		this.menosE=menosE;
	}

	public void setNombreO(String nombre){
		this.nombre=nombre;
	}

	public String getNombreO(){
		return nombre;
	}
	public void setPuntosO(int puntos){
		this.puntos=puntos;
	}

	public int getPuntosO(){
		return puntos;
	}	
	public int getMenosE(){
		return menosE;
	}
	//public abstract equiparObjeto();

}