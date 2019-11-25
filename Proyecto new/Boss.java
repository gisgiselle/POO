


public class Boss extends Personaje{

private Habilidad[] habilidades;


public Boss(String tipo, String nombre, int hp, int ataque, int defensa){
		super(tipo, nombre, hp, ataque, defensa);

}

public Habilidad[] getHabilidades(){
		return habilidades;
	}
public void setHabilidades(Habilidad[] habilidades){
		this.habilidades=habilidades;
	} 
    public void atacar(Heroe h){
        int x=(int) Math.floor(Math.random()*5);
        if((x==3)&&(getEnergia()>4)){
            System.out.println("Ataque especial de Boss");
            h.setHp(h.getHp()-(ataqueE-h.getDefensa()));
            setEnergia(getEnergia()-5);
        }else{
            System.out.println("Ataque normal de Boss");
            super.atacar(h);
        }
    }



		
}