public class AtaqueEspecial{
		private String nombreAtaqueespecial;
		private int puntosAtaqueE;

		public AtaqueEspecial(){
		super(String nombreAtaqueespecial, int puntosAtaqueE);
		this.nombreAtaqueespecial=nombreAtaqueespecial;
		this.puntosAtaqueE=puntosAtaqueE;
	}

	public setNombreAtaqueespecial(String nombreAtaqueespecial){
		this.nombreAtaqueespecial=nombreAtaqueespecial;

	}
	public String getNombreAtaqueespecial(){
		return nombreAtaqueespecial;
	}
	public setPuntosAtaqueE(int puntosAtaqueE){
		this.puntosAtaqueE=puntosAtaqueE;
	}
	public getPuntosAtaqueE(){
		return puntosAtaqueE;
	}
}