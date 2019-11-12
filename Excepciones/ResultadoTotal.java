public class ResultadoTotal{
		private double resultadoTotal;
		public  ResultadoTotal(String string, String string2){
			resultadoTotal=Integer.parseInt(string)*Integer.parseInt(string2);
		}
		public double getResultadoTotal(){
			return resultadoTotal;
		}

		public void setResultadoTotal(double resultadoTotal){
			this.resultadoTotal=resultadoTotal;
		}



	}

