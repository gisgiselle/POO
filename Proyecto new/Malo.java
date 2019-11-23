

public abstract class Malo extends Personaje implements AccionesMalo {
		private AtaqueEspecial[] ataquesEspeciales; 
		private Habilidad[] habilidades;




		public Malo(String tipo,String nombre, int hp, int ataque, int defensa){
			super(tipo,nombre, hp, ataque, defensa);


		}	

			public AtaqueEspecial[] getAtaquesEspeciales(){
				return ataquesEspeciales;
			}
			public void setAtaquesEspeciales(ataqueEspecial[] ataquesEspeciales){
					this.ataquesEspeciales= ataquesEspeciales;
			}
			public Habilidad[] getHabilidades(){
					return habilidades;
			}
			public void setHabilidades(Habilidad[] habilidades){
					this.habilidades=habilidades;
			}
		
					
}
