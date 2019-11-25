import javafx.scene.control.Label;
public class Nina extends Heroe{
    private Label img= new Label("");
    public Nina(){
        super("Nina", 200,20,5,3,15);
        Habilidad[] habilidad=new Habilidad[4];
        habilidad[0]=new Habilidad("LLorar",30);
        habilidad[1]=new Habilidad("Grito rompetimpanos",20);
        habilidad[2]=new Habilidad("Risa letal",25);
        habilidad[3]=new Habilidad("cinta asesina",20);
        
        super.setHabilidad(habilidad);
        img.setPrefSize(500,300);
        img.setStyle("-fx-background-image:url('assets/nina.jpg'); -fx-background-size: stretch;");
        super.setImg(img);
    }
    

   public void ataqueHeroe(Personaje enemigo){
   	System.out.println("Ataque de Nina");
   	enemigo.setHp(enemigo.getHp()-(getAtaque()-enemigo.getDefensa()));
   }

}