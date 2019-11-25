import java.util.Scanner;
import javafx.scene.control.Label;
public abstract class Heroe extends Personaje{
	
	private Habilidad[] habilidades;
	private Objeto[] mochila;
	private int punch;
	private int vidas=3;


	public Heroe(String tipo, int hp, int sp, int ataque, int defensa, int punch){
		super(tipo, hp, sp, ataque, defensa);
		mochila= new Objeto[5];
		this.punch=punch;
	}
	

	public Habilidad[] getHabilidades(){
		return habilidades;
	}

	public void setHabilidad(Habilidad[] habilidades){
		this.habilidades=habilidades;
	}

	public Objeto[] getMochila(){
		return mochila;
	}

	public void addObjetoMochila(Objeto o, int index){
		mochila[index]=o;
	}
	public void removeObjetoMochila(int index){
		mochila[index]=null;
	}

	public String imprimeInventario(){
		String resultado="Mochila: [";
		for(int i=0; i<mochila.length; i++){
			if(mochila[i]!=null){
				resultado=resultado+" "+mochila[i].getNombreObjeto()+" "+mochila[i].getObPunto()+",";
			}
			else{
				resultado=resultado+"Está vacio ";
			}
		}

		resultado=resultado+"]";
		return resultado;
	}


	public String verHabilidades(){
		String resultado="Tus Habilidades: [";
		for(int i=0;i<habilidades.length;i++){

			resultado= resultado+" Habilidad:  "
				+habilidades[i].getNombreH()
				+" Damage:  "+ habilidades[i].getHabilidadP()+",";				

		}
		resultado= resultado+"]";
		return resultado;
	}
	public void atacar(Personaje enemigo, int i){
		switch(i){
			case 1:
			super.atacar(enemigo);
			break;
			default:
			if(getSp()>=2){enemigo.setHp(enemigo.getHp()-(punch-enemigo.getDefensa())); 
			setSp(getSp()-2);
			}else{
				System.out.println("No puedes hacer eso, no hay SP.");
			}
			break;
		}
		
	}
	public void atacar(Personaje enemigo, Objeto objeto,int index){
		if(getSp()>=objeto.getSpMenos()){
			if(objeto.getClass()==Arma.class){
			enemigo.setHp(enemigo.getHp()-(objeto.getObPunto()+getAtaque()-enemigo.getDefensa()));
			setSp(getSp()-objeto.getSpMenos());
			removeObjetoMochila(index);
			}else{
				setHp(getHp()+enemigo.getAtaque()-getDefensa());
				enemigo.setHp(enemigo.getHp()-(enemigo.getAtaque()));
				setSp(getSp()-objeto.getSpMenos());
				removeObjetoMochila(index);
			}
			}else{
			System.out.println("No puedes.");
			
		}
	}
	public void atacar(Personaje enemigo, Habilidad habilidades){
		if(getSp()>=10){
		enemigo.setHp(enemigo.getHp()-(habilidades.getHabilidadP()-enemigo.getDefensa()));
		setSp(getSp()-5); 
		}else{
			System.out.println("No tienes suficiente energía");
		}
	}
	public int getVidas(){
		return vidas;
	}
	public void setVidas(int vidas){
		this.vidas=vidas;
	}	
}