public class Main{
	public static void main(String args[]){

		Heroe h= new Heroe("Niño 1", 100, 10, 3,50);
		Enemigo e= new Enemigo("Estrellita de la Muerte", 50, 10, 2, 3);

		h.imprime();
		h.atacar(e);
		e.imprime();
		e.atacar(h);
		h.imprime();
	}
}