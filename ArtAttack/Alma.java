import javafx.scene.control.Label;
public class Alma extends Personaje{
    private Label img= new Label("");
    public Alma(){
        super("Alma Torturada",40,10,4,3);
        img.setPrefSize(300,300);
        img.setStyle("-fx-background-image:url('assets/sombra.jpg'); -fx-background-size: stretch;");
        super.setImg(img);
    }
}