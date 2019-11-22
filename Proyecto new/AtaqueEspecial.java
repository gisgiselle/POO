public class AtaqueEspecial{
		private String nombreAtaqueespecial;
		private int puntosAtaqueE;

		public AtaqueEspecial(String nombreAtaqueespecial, int puntosAtaqueE){
		this.nombreAtaqueespecial=nombreAtaqueespecial;
		this.puntosAtaqueE=puntosAtaqueE;
	}

	public void setNombreAtaqueespecial(String nombreAtaqueespecial){
		this.nombreAtaqueespecial=nombreAtaqueespecial;

	}
	public String getNombreAtaqueespecial(){
		return nombreAtaqueespecial;
	}
	public void setPuntosAtaqueE(int puntosAtaqueE){
		this.puntosAtaqueE=puntosAtaqueE;
	}
	public int getPuntosAtaqueE(){
		return puntosAtaqueE;
	}
}