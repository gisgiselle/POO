import javafx.scene.control.Label;
public class Ricky extends Heroe{
    private Label img= new Label("");
    public Ricky(){
        super("Ricky", 100,10,5,30,50);
        Habilidad[] habilidad=new Habilidad[4];
        habilidad[0]=new Habilidad("blablalba",30);
        habilidad[1]=new Habilidad("estilo",20);
        habilidad[2]=new Habilidad("cool",25);
        habilidad[3]=new Habilidad("look asesino",20);
        
        super.setHabilidad(habilidad);
        img.setPrefSize(500,300);
        img.setStyle("-fx-background-image:url('assets/ricky.png'); -fx-background-size: stretch;");
        super.setImg(img);
    }
    

   public void ataqueHeroe(Personaje enemigo){
   	System.out.println("Ataque de Ricky");
   	enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
   }

}