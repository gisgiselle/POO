import javafx.scene.control.Label;
public class Chucho extends Heroe{
    private Label img= new Label("");
    public Chucho(){
        super("Chucho", 100,30,8,10,15);
        Habilidad[] habilidad=new Habilidad[4];
        habilidad[0]=new Habilidad("LLorar",30);
        habilidad[1]=new Habilidad("Grito rompetimpanos",20);
        habilidad[2]=new Habilidad("Risa letal",25);
        habilidad[3]=new Habilidad("cinta asesina",20);
        
        super.setHabilidad(habilidad);
        img.setPrefSize(500,300);
        img.setStyle("-fx-background-image:url('assets/chucho.jpg'); -fx-background-size: stretch;");
        super.setImg(img);
    }
    

   public void ataqueHeroe(Personaje enemigo){
   	System.out.println("Ataque de Chucho");
   	enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
   }

}