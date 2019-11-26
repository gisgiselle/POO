import javafx.scene.control.Label;
public class Estrella extends Personaje{
    private Label img= new Label("");
    public Estrella(){
        super("Estrella",30,1,4,0);
        img.setPrefSize(200,150);
        img.setStyle("-fx-background-image:url('assets/star.jpg'); -fx-background-size: stretch;");
        super.setImg(img);
    }
}