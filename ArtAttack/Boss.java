public class Boss extends Personaje{
	private int ataqueBoss=0;

    public Boss(String nombre, int hp, int sp, int ataque, int defensa,int ataqueBoss){
		super(nombre,hp,sp,ataque,defensa);
        this.ataqueBoss=ataqueBoss;
	}
    public void atacar(Heroe heroe){
        int x=(int) Math.floor(Math.random()*5);
        if((x==3)&&(getSp()>4)){
            System.out.println("Ataque especial de Boss");
            heroe.setHp(heroe.getHp()-(ataqueBoss-heroe.getDefensa()));
            setSp(getSp()-5);
        }else{
            System.out.println("Ataque normal de Boss");
            super.atacar(heroe);
        }
    }
}