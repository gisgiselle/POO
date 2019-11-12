public class ResultadoIVA{
	private double resultadoIVA;
	public ResultadoIVA(String s, String s2){
		resultadoIVA=Integer.parseInt(s)*Integer.parseInt(s2)*0.16;

	}
		public double getResultadoIVA(){
			return resultadoIVA;
		}

		public void setResultadoIVA(double resultadoIVA){
			this.resultadoIVA=resultadoIVA;
		}

}