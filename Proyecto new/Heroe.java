
public abstract class Heroe extends Personaje implements Ataques{
	private Habilidad[] habilidades;
	private int sp;
	private int x, y, numVidas;
	private int punch;
	private Objeto[] mochila;

	public Heroe(String tipo,String nombre, int hp, int ataque, int defensa, int poderEspecial){
		super(tipo,nombre,hp,ataque,defensa);
		this.x=x;
		this.y=y;
	} 
	public Habilidad[] getHabilidades(){
		return habilidades;
	}
	public void setHabilidades(Habilidad[] habilidades){
		this.habilidades=habilidades;
	}
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setMochila(Objeto[] mochila){
		this.mochila=mochila;
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
	}
	public void setSp(int sp){
		this.sp=sp;
	}
	public int getSp(){
		return sp;
	}
	public String imprimeHabilidad(){
		String resultado="Habilidades: ";
		for(int i=0;i<habilidades.length;i++){
			resultado=resultado+"Habilidad: " + habilidad[i].getNombre()+ "puntos: "+ habilidad[i].getPuntosEspeciales()+",";
		}
		resultado=resultado;
		return resultado;
	}
public void atacar(Boss m, int i){
		switch(i){
			case 1:
			super.atacar(m);
			break;
			default:
			if(getSp()>=3){m.setHp(m.getHp()-(punch-m.getDefensa())); 
			setSp(getSp()-3);
			}else{
				System.out.println("No tienes suficiente energía");
			}
			break;
		}
		
	}
	public void atacar(Boss m, Objeto a,int index){
		if(getSp()>=a.getMenosE()){
			if(a.getClass()==Objeto.class){
			m.setHp(m.getHp()-(a.getPuntosO()+getAtaque()-m.getDefensa()));
			setSp(getSp()-a.getMenosE());
			removeObjetoFromMochila(index);
			}else{
				setHp(getHp()+m.getAtaque()-getDefensa());
				m.setHp(m.getHp()-(m.getAtaque()));
				setSp(getSp()-a.getMenosE());
				removeObjetoFromMochila(index);
			}
			}else{
			System.out.println("UPS, no tienes suficiente energía, pierdes tú turno");
			
		}
	}
	public void atacar(Boss b, Habilidad h){
		if(setSp()>=3){
		b.setHp(b.getHp()-(h.getPuntosEspeciales()-b.getDefensa()));
		setSp(getSp()-5); 
		}else{
			System.out.println("No tienes suficiente energía");
		}
	}

	public int getNumVidas(){
		return numVidas;
	}

	public void setNumVidas(int numVidas){
		this.numVidas=numVidas;
	}

}

