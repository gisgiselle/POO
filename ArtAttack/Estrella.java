import javafx.scene.control.Label;
public class Estrella extends Personaje{
    private Label img= new Label("");
    public Estrella(){
        super("Estrella",10,1,4,0);
        img.setPrefSize(300,300);
        img.setStyle("-fx-background-image:url('assets/star.jpg'); -fx-background-size: stretch;");
        super.setImg(img);
    }
}