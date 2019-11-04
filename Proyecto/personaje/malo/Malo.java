
package personaje.Malo;
import personaje.*;



public abstract class Malo extends Personaje implements AccionesMalo {
		private AtaqueEspecial[] ataquesEspeciales; 
		private Habilidad[] habilidades;

		public Malo(String nombre, int hp, int ataque, int defensa ){
			super(nombre, hp, ataque, defensa);
			this.tipo= tipo;

		}	
			public ataqueEspecial[] getAtaquesEspeciales(){
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
