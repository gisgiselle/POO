package personaje 


public abstract class Malo extends Personaje{
		private String tipo;

		public Malo(String nombre, int hp, int ataque, int defensa, int sp){
			super(nombre, hp, ataque, defensa, sp);
			this.tipo= tipo;
		}		

		public String getTipo(){

			 	 return tipo; 
		}
		public void setTipo(String tipo){

				this.tipo= tipo;

		}
}
