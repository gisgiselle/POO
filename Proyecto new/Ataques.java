public interface Ataques{
	
	public void atacar(Personaje malo);
	public void atacar(Personaje malo, Habilidad habilidad);
	public void atacar(Personaje malo, Objeto objeto);
	public void atacar(Boss boss);
}