public class ResultadoSub{
		private int resultadoSub;
		public  ResultadoSub(String string, String string2){
			resultadoSub=Integer.parseInt(string)*Integer.parseInt(string2);
		}
		public int getResultadoSub(){
			return resultadoSub;
		}

		public void setResultadoSub(int resultadoSub){
			this.resultadoSub=resultadoSub;
		}
	}

