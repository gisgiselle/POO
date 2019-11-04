package personaje; 


//clase abstracta porque implementa una interface

public abstract class Heroe extends Personaje implements Ataques{
	private Habilidad[] habilidades;
	private int x, y; 
	private Objeto[] mochila;
	private String poderEspecial;
	private int xp;

	public Heroe(String nombre, int hp, int ataque, int defensa, int poderEspecial, int xp){
		super(nombre,hp,ataque,defensa);
		this.x=x;
		this.y=y;
		this.poderEspecial= poderEspecial;
		this.xp=xp;


	}

	public Habilidad[] getHabilidades(){
		return habilidades;
	}
	public void setHabilidades(Habilidad[] habilidades){
		this.habilidades=habilidades;
	}
	public int[] getX(){
		return x;
	}
	public void setX(int x){
		this.x=x;
	}
	public int[] getY(){
		return y;
	}
	public void setY(int y){
		this.y= y;
	}
	public String poderEspecial(){
		return poderEspecial;
	}
	public void poderEspecial(String poderEspecial){
		this.poderEspecial= poderEspecial;
	}
	public void setMochila(Objeto[] mochila){

	}
	public Objeto[] getMochila(){
		return mochila;
	}
	public void addObjetoToMochila(Objeto o, int index){
		mochila[index]=o;
	}

	public void removeObjetoFromMochila(int index){
		mochila[index]=null;
	}
	public String imprimeInventario(){
	String resultado="Mochila: [";
	for(int i=0;i<mochila.length;i++){
		if(mochila[i]!=null){
		resultado= resultado+" Objeto: "
			+mochila[i].getNombre()
			+" puntos: "+ mochila[i].getPuntos()+",";				
		}else{
			resultado= resultado+" Vacío ,";					
		}
	}
	resultado= resultado+"]";
	return resultado;

	public String imprimeHabilidad(){
		String resultado="Habilidades: ";
		for(int i=0;i<habilidades.length;i++){
			resultado=resultado+"Habilidad: " + habilidad[i].getNombre()+ "puntos: "+ habilidad[i].getPuntosEspeciales()+",";
		}
		resultado=resultado;
		return resultado;
	}
	public void atacar(Personaje malo, Habilidad habilidad){
		malo.setHp(malo.getHp()-(habilidad.getPuntosEspeciales()-malo.getDefensa()));
	}
	public void atacar(Personaje malo, Objeto objeto){
		malo.setHp(malo.getHp()-(objeto.getPuntos()-malo.getDefensa()));
	}
	public void setHabilidades(Habilidad[] habilidades){
		this.habilidades=habilidades;
	}
	public Habilidad[] getHabilidades(){
		return habilidades;
	}
}